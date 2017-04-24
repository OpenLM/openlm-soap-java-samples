package com.openlm.core.soap;

import org.datacontract.schemas._2004._07.openlm_server_services.LoginFormSettingsRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.LoginFormSettingsResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.UserAuthenticationRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.UserAuthenticationResponse;
import services.server.openlm.AdminAPI;
import services.server.openlm.IAdminAPI;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.MalformedURLException;
import java.net.URL;

public class OpenLMCoreConnector extends Service {
    //It's a good practice to use full package name for ObjectFactory declaration, because there are many cases when you need to
    //use multiple ObjectFactory classes from different packages
    private static final org.datacontract.schemas._2004._07.openlm_server_services.ObjectFactory objectFactory = new org.datacontract.schemas._2004._07.openlm_server_services.ObjectFactory();

    public final IAdminAPI soapAPI;

    private final IAdminAPI soapAPIDelegate;

    private final String host;
    private final int port;
    private final String login;
    private final String password;

    private volatile String sessionId;
    private volatile boolean authRequired;

    public OpenLMCoreConnector(String host, int port, String login, String password) {
        super(AdminAPI.class.getResource("/AdminAPI.wsdl"), new QName("OpenLM.Server.Services", "AdminAPI"));
        this.soapAPIDelegate = getAdminAPI();
        this.host = host;
        this.port = port;
        this.login = login;
        this.password = password;
        initSoapAPI();
        this.soapAPI = (IAdminAPI) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class[]{IAdminAPI.class},
                this::invokeWithRetry);

    }

    private Object invokeWithRetry(Object o, Method method, Object[] objects) throws Throwable {
        try {
            return validateSessionAndInvoke(method, objects);
        } catch (InvocationTargetException e) {
            if(isAuthFailure(e)){
                //Drop session and retry
                sessionId = null;
                authRequired = true;
                return validateSessionAndInvoke(method, objects);
            } else {
                throw e;
            }
        }
    }

    private Object validateSessionAndInvoke(Method method, Object[] objects) throws IllegalAccessException, InvocationTargetException {
        validateSessionId();
        return method.invoke(soapAPIDelegate, objects);
    }

    private boolean isAuthFailure(InvocationTargetException e) {
        String message = e.getTargetException().getMessage();
        return (message.contains("Session")
                && (message.contains("does not exist") || message.contains("expired")))
                || (message.contains("User")
                && (message.contains("expired") || message.contains("invalid")));
    }

    @WebEndpoint(name = "basicHttpBindingConfiguration_IAdminAPI")
    public IAdminAPI getAdminAPI() {
        return super.getPort(new QName("OpenLM.Server.Services", "basicHttpBindingConfiguration_IAdminAPI"), IAdminAPI.class);
    }

    private void initSoapAPI() {
        try {
            URL soapURL = new URL("http", host, port, "/OpenLM.Server.Services/AdminAPI");
            ((BindingProvider) soapAPI)
                    .getRequestContext()
                    .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, soapURL.toExternalForm());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    private void validateSessionId() {
        if (this.sessionId == null && authRequired) {
            this.authRequired = authRequired();
            this.sessionId = !this.authRequired ? null : performAuth(login, password);
        }
    }

    private String performAuth(String user, String password) {
        UserAuthenticationRequest request = new UserAuthenticationRequest();
        request.setUserName(objectFactory.createUserAuthenticationRequestUserName(user));
        request.setPassword(objectFactory.createUserAuthenticationRequestPassword(password));
        UserAuthenticationResponse response = this.soapAPI.performUserAuthentication(request);
        return response.getSessionID().getValue();
    }

    private boolean authRequired() {
        LoginFormSettingsRequest request = new LoginFormSettingsRequest();
        LoginFormSettingsResponse loginFormSettings = this.soapAPI.getLoginFormSettings(request);
        return loginFormSettings.isUserAuthenticationRequired();
    }


}
