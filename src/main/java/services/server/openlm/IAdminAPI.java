
package services.server.openlm;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.datacontract.schemas._2004._07.openlm_server.CurrentlyConsumedLicensesRequest;
import org.datacontract.schemas._2004._07.openlm_server.LicenseInfoRequest;
import org.datacontract.schemas._2004._07.openlm_server.LicensesActivityRequest;
import org.datacontract.schemas._2004._07.openlm_server.LicensesProcurementRequest;
import org.datacontract.schemas._2004._07.openlm_server.PackageLicensesRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.AddLicenseInfoRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.AddLicenseInfoResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.AddLicenseUsageRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.AddLicenseUsageResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.AddUnmanagedVendorResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.AgentProcedureTmplRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.AgentProcedureTmplResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.AlertDescriptionRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.AlertDescriptionResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.AlertRuleComponentsRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.AlertRuleComponentsResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.AlertRuleConditionDefinitionsResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.AlertRuleRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.AlertRuleResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.AlertsRulesResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.BaseRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.ClearCleanupProcessesRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.CurrentlyConsumedLicensesResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.DownloadLmFileRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.DownloadLmFileResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.EmailSMSSettingsResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.EmailSettingsRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.FeatureUsageStatusRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.FeatureUsageStatusResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.FileFetchStatusRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.FileFetchStatusResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.GetFileFetchConfigResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.GetLicenseServersRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.GetLmFilesRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.GetProjectsUsageRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.GetProjectsUsageResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.GetUnmanagedVendorRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.GetUnmanagedVendorResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.GroupNamesRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.GroupNamesResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.LDAPResetSyncRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.LDAPResetSyncResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.LMFilesResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.LicenseServersResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.LicenseTypesResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.LicenseUsageReportRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.LicenseUsageReportResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.LicensesActivityResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.LicensesProcurementResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.LicensesResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.LoginFormSettingsRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.LoginFormSettingsResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.LogsUploadingBaseResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.LogsUploadingEndRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.LogsUploadingKeepAliveRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.LogsUploadingStartRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.LogsUploadingStartResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.MonitoredProcessesResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.OpenLMLicenseOverviewResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.OptFileContentRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.OptFileFeatureValidKeywordsRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.OptFileFeatureValidKeywordsResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.PackageLicensesResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.SetFullLoggingRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.SetLMServerFullLoggingRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.SetProjectToUsageSessionByFeatureRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.SetProjectToUsageSessionByProcessRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.SystemMessagesResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.TestSmsSettingsRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.TrustedAuthenticationConfigurationRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.TrustedAuthenticationConfigurationResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.UnmanagedProcessVendorRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.UpdateAlertRuleComponentsDataRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.UpdateCheckoutPolicyRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.UpdateEmailSMSSettingsDataRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.UpdateFileFetchConfigRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.UpdateFileFetchConfigResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.UploadLicenseFileRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.UploadLicenseFileResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.UserAuthenticationRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.UserAuthenticationResponse;
import org.datacontract.schemas._2004._07.openlm_server_services_datacontracts.ExportRouteInstructionsRequest;
import org.datacontract.schemas._2004._07.openlm_server_services_datacontracts.ImportRouteInstructionsRequest;
import org.datacontract.schemas._2004._07.openlm_server_services_datacontracts.RouterGroupsRequest;
import org.datacontract.schemas._2004._07.openlm_server_services_datacontracts.RouterGroupsResponse;
import org.datacontract.schemas._2004._07.openlm_server_services_datacontracts.RouterMonitoringRequest;
import org.datacontract.schemas._2004._07.openlm_server_services_datacontracts.RouterMonitoringResponse;
import org.datacontract.schemas._2004._07.openlm_server_services_datacontracts.UpdateRouterGroupsAndComponentsRequest;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IAdminAPI", targetNamespace = "OpenLM.Server.Services")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory.class,
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    org.datacontract.schemas._2004._07.openlm_licensemanager_openlmshared.ObjectFactory.class,
    org.datacontract.schemas._2004._07.openlm_licensemanager_shared.ObjectFactory.class,
    org.datacontract.schemas._2004._07.openlm_server.ObjectFactory.class,
    org.datacontract.schemas._2004._07.openlm_server_dal.ObjectFactory.class,
    org.datacontract.schemas._2004._07.openlm_server_services.ObjectFactory.class,
    org.datacontract.schemas._2004._07.openlm_server_services_datacontracts.ObjectFactory.class,
    org.datacontract.schemas._2004._07.openlm_shared.ObjectFactory.class,
    org.datacontract.schemas._2004._07.openlm_shared_public.ObjectFactory.class,
    org.datacontract.schemas._2004._07.system_collections.ObjectFactory.class,
    services.server.openlm.ObjectFactory.class
})
public interface IAdminAPI {


    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.LoginFormSettingsResponse
     */
    @WebMethod(operationName = "GetLoginFormSettings", action = "OpenLM.Server.Services/IAdminAPI/GetLoginFormSettings")
    @WebResult(name = "GetLoginFormSettingsResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetLoginFormSettings", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetLoginFormSettings")
    @ResponseWrapper(localName = "GetLoginFormSettingsResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetLoginFormSettingsResponse")
    public LoginFormSettingsResponse getLoginFormSettings(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        LoginFormSettingsRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.UserAuthenticationResponse
     */
    @WebMethod(operationName = "PerformUserAuthentication", action = "OpenLM.Server.Services/IAdminAPI/PerformUserAuthentication")
    @WebResult(name = "PerformUserAuthenticationResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "PerformUserAuthentication", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.PerformUserAuthentication")
    @ResponseWrapper(localName = "PerformUserAuthenticationResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.PerformUserAuthenticationResponse")
    public UserAuthenticationResponse performUserAuthentication(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        UserAuthenticationRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.CurrentlyConsumedLicensesResponse
     */
    @WebMethod(operationName = "GetCurrentlyConsumedLicenses", action = "OpenLM.Server.Services/IAdminAPI/GetCurrentlyConsumedLicenses")
    @WebResult(name = "GetCurrentlyConsumedLicensesResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetCurrentlyConsumedLicenses", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetCurrentlyConsumedLicenses")
    @ResponseWrapper(localName = "GetCurrentlyConsumedLicensesResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetCurrentlyConsumedLicensesResponse")
    public CurrentlyConsumedLicensesResponse getCurrentlyConsumedLicenses(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        CurrentlyConsumedLicensesRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.LicenseServersResponse
     */
    @WebMethod(operationName = "GetLicenseServers", action = "OpenLM.Server.Services/IAdminAPI/GetLicenseServers")
    @WebResult(name = "GetLicenseServersResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetLicenseServers", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetLicenseServers")
    @ResponseWrapper(localName = "GetLicenseServersResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetLicenseServersResponse")
    public LicenseServersResponse getLicenseServers(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        GetLicenseServersRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.LicensesResponse
     */
    @WebMethod(operationName = "GetLicenses", action = "OpenLM.Server.Services/IAdminAPI/GetLicenses")
    @WebResult(name = "GetLicensesResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetLicenses", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetLicenses")
    @ResponseWrapper(localName = "GetLicensesResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetLicensesResponse")
    public LicensesResponse getLicenses(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        LicenseInfoRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.PackageLicensesResponse
     */
    @WebMethod(operationName = "GetPackageLicenses", action = "OpenLM.Server.Services/IAdminAPI/GetPackageLicenses")
    @WebResult(name = "GetPackageLicensesResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetPackageLicenses", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetPackageLicenses")
    @ResponseWrapper(localName = "GetPackageLicensesResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetPackageLicensesResponse")
    public PackageLicensesResponse getPackageLicenses(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        PackageLicensesRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.LicensesActivityResponse
     */
    @WebMethod(operationName = "GetLicensesActivity", action = "OpenLM.Server.Services/IAdminAPI/GetLicensesActivity")
    @WebResult(name = "GetLicensesActivityResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetLicensesActivity", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetLicensesActivity")
    @ResponseWrapper(localName = "GetLicensesActivityResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetLicensesActivityResponse")
    public LicensesActivityResponse getLicensesActivity(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        LicensesActivityRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.LicensesProcurementResponse
     */
    @WebMethod(operationName = "GetLicensesProcurement", action = "OpenLM.Server.Services/IAdminAPI/GetLicensesProcurement")
    @WebResult(name = "GetLicensesProcurementResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetLicensesProcurement", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetLicensesProcurement")
    @ResponseWrapper(localName = "GetLicensesProcurementResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetLicensesProcurementResponse")
    public LicensesProcurementResponse getLicensesProcurement(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        LicensesProcurementRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.FeatureUsageStatusResponse
     */
    @WebMethod(operationName = "GetFeatureUsageStatus", action = "OpenLM.Server.Services/IAdminAPI/GetFeatureUsageStatus")
    @WebResult(name = "GetFeatureUsageStatusResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetFeatureUsageStatus", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetFeatureUsageStatus")
    @ResponseWrapper(localName = "GetFeatureUsageStatusResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetFeatureUsageStatusResponse")
    public FeatureUsageStatusResponse getFeatureUsageStatus(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        FeatureUsageStatusRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.AlertsRulesResponse
     */
    @WebMethod(operationName = "GetAlertsRules", action = "OpenLM.Server.Services/IAdminAPI/GetAlertsRules")
    @WebResult(name = "GetAlertsRulesResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetAlertsRules", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetAlertsRules")
    @ResponseWrapper(localName = "GetAlertsRulesResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetAlertsRulesResponse")
    public AlertsRulesResponse getAlertsRules(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        BaseRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.AlertRuleResponse
     */
    @WebMethod(operationName = "AddAlertRule", action = "OpenLM.Server.Services/IAdminAPI/AddAlertRule")
    @WebResult(name = "AddAlertRuleResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "AddAlertRule", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.AddAlertRule")
    @ResponseWrapper(localName = "AddAlertRuleResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.AddAlertRuleResponse")
    public AlertRuleResponse addAlertRule(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        AlertRuleRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse
     */
    @WebMethod(operationName = "UpdateAlertRule", action = "OpenLM.Server.Services/IAdminAPI/UpdateAlertRule")
    @WebResult(name = "UpdateAlertRuleResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "UpdateAlertRule", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.UpdateAlertRule")
    @ResponseWrapper(localName = "UpdateAlertRuleResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.UpdateAlertRuleResponse")
    public BaseResponse updateAlertRule(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        AlertRuleRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse
     */
    @WebMethod(operationName = "DeleteAlertRule", action = "OpenLM.Server.Services/IAdminAPI/DeleteAlertRule")
    @WebResult(name = "DeleteAlertRuleResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "DeleteAlertRule", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.DeleteAlertRule")
    @ResponseWrapper(localName = "DeleteAlertRuleResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.DeleteAlertRuleResponse")
    public BaseResponse deleteAlertRule(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        AlertRuleRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.AlertRuleComponentsResponse
     */
    @WebMethod(operationName = "GetAlertRuleComponents", action = "OpenLM.Server.Services/IAdminAPI/GetAlertRuleComponents")
    @WebResult(name = "GetAlertRuleComponentsResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetAlertRuleComponents", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetAlertRuleComponents")
    @ResponseWrapper(localName = "GetAlertRuleComponentsResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetAlertRuleComponentsResponse")
    public AlertRuleComponentsResponse getAlertRuleComponents(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        AlertRuleComponentsRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse
     */
    @WebMethod(operationName = "UpdateAlertRuleComponents", action = "OpenLM.Server.Services/IAdminAPI/UpdateAlertRuleComponents")
    @WebResult(name = "UpdateAlertRuleComponentsResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "UpdateAlertRuleComponents", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.UpdateAlertRuleComponents")
    @ResponseWrapper(localName = "UpdateAlertRuleComponentsResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.UpdateAlertRuleComponentsResponse")
    public BaseResponse updateAlertRuleComponents(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        UpdateAlertRuleComponentsDataRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.AlertRuleConditionDefinitionsResponse
     */
    @WebMethod(operationName = "GetAlertRuleConditionDefinitions", action = "OpenLM.Server.Services/IAdminAPI/GetAlertRuleConditionDefinitions")
    @WebResult(name = "GetAlertRuleConditionDefinitionsResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetAlertRuleConditionDefinitions", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetAlertRuleConditionDefinitions")
    @ResponseWrapper(localName = "GetAlertRuleConditionDefinitionsResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetAlertRuleConditionDefinitionsResponse")
    public AlertRuleConditionDefinitionsResponse getAlertRuleConditionDefinitions(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        BaseRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.EmailSMSSettingsResponse
     */
    @WebMethod(operationName = "GetEmailSMSSettings", action = "OpenLM.Server.Services/IAdminAPI/GetEmailSMSSettings")
    @WebResult(name = "GetEmailSMSSettingsResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetEmailSMSSettings", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetEmailSMSSettings")
    @ResponseWrapper(localName = "GetEmailSMSSettingsResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetEmailSMSSettingsResponse")
    public EmailSMSSettingsResponse getEmailSMSSettings(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        BaseRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse
     */
    @WebMethod(operationName = "UpdateEmailSMSSettings", action = "OpenLM.Server.Services/IAdminAPI/UpdateEmailSMSSettings")
    @WebResult(name = "UpdateEmailSMSSettingsResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "UpdateEmailSMSSettings", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.UpdateEmailSMSSettings")
    @ResponseWrapper(localName = "UpdateEmailSMSSettingsResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.UpdateEmailSMSSettingsResponse")
    public BaseResponse updateEmailSMSSettings(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        UpdateEmailSMSSettingsDataRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse
     */
    @WebMethod(operationName = "TestEmailSettings", action = "OpenLM.Server.Services/IAdminAPI/TestEmailSettings")
    @WebResult(name = "TestEmailSettingsResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "TestEmailSettings", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.TestEmailSettings")
    @ResponseWrapper(localName = "TestEmailSettingsResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.TestEmailSettingsResponse")
    public BaseResponse testEmailSettings(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        EmailSettingsRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse
     */
    @WebMethod(operationName = "TestSMSSettings", action = "OpenLM.Server.Services/IAdminAPI/TestSMSSettings")
    @WebResult(name = "TestSMSSettingsResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "TestSMSSettings", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.TestSMSSettings")
    @ResponseWrapper(localName = "TestSMSSettingsResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.TestSMSSettingsResponse")
    public BaseResponse testSMSSettings(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        TestSmsSettingsRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.AlertDescriptionResponse
     */
    @WebMethod(operationName = "GetAlertDescription", action = "OpenLM.Server.Services/IAdminAPI/GetAlertDescription")
    @WebResult(name = "GetAlertDescriptionResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetAlertDescription", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetAlertDescription")
    @ResponseWrapper(localName = "GetAlertDescriptionResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetAlertDescriptionResponse")
    public AlertDescriptionResponse getAlertDescription(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        AlertDescriptionRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.SystemMessagesResponse
     */
    @WebMethod(operationName = "GetSystemMessages", action = "OpenLM.Server.Services/IAdminAPI/GetSystemMessages")
    @WebResult(name = "GetSystemMessagesResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetSystemMessages", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetSystemMessages")
    @ResponseWrapper(localName = "GetSystemMessagesResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetSystemMessagesResponse")
    public SystemMessagesResponse getSystemMessages(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        BaseRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.GetUnmanagedVendorResponse
     */
    @WebMethod(operationName = "GetUnmanagedVendor", action = "OpenLM.Server.Services/IAdminAPI/GetUnmanagedVendor")
    @WebResult(name = "GetUnmanagedVendorResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetUnmanagedVendor", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetUnmanagedVendor")
    @ResponseWrapper(localName = "GetUnmanagedVendorResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetUnmanagedVendorResponse")
    public GetUnmanagedVendorResponse getUnmanagedVendor(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        GetUnmanagedVendorRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.AddUnmanagedVendorResponse
     */
    @WebMethod(operationName = "AddUnmanagedVendor", action = "OpenLM.Server.Services/IAdminAPI/AddUnmanagedVendor")
    @WebResult(name = "AddUnmanagedVendorResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "AddUnmanagedVendor", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.AddUnmanagedVendor")
    @ResponseWrapper(localName = "AddUnmanagedVendorResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.AddUnmanagedVendorResponse")
    public AddUnmanagedVendorResponse addUnmanagedVendor(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        UnmanagedProcessVendorRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse
     */
    @WebMethod(operationName = "DeleteUnmanagedProcessVendor", action = "OpenLM.Server.Services/IAdminAPI/DeleteUnmanagedProcessVendor")
    @WebResult(name = "DeleteUnmanagedProcessVendorResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "DeleteUnmanagedProcessVendor", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.DeleteUnmanagedProcessVendor")
    @ResponseWrapper(localName = "DeleteUnmanagedProcessVendorResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.DeleteUnmanagedProcessVendorResponse")
    public BaseResponse deleteUnmanagedProcessVendor(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        UnmanagedProcessVendorRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.OpenLMLicenseOverviewResponse
     */
    @WebMethod(operationName = "GetOpenLMLicenseOverview", action = "OpenLM.Server.Services/IAdminAPI/GetOpenLMLicenseOverview")
    @WebResult(name = "GetOpenLMLicenseOverviewResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetOpenLMLicenseOverview", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetOpenLMLicenseOverview")
    @ResponseWrapper(localName = "GetOpenLMLicenseOverviewResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetOpenLMLicenseOverviewResponse")
    public OpenLMLicenseOverviewResponse getOpenLMLicenseOverview(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        BaseRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.LMFilesResponse
     */
    @WebMethod(operationName = "GetFileFetchAvailableLicenseManagerFiles", action = "OpenLM.Server.Services/IAdminAPI/GetFileFetchAvailableLicenseManagerFiles")
    @WebResult(name = "GetFileFetchAvailableLicenseManagerFilesResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetFileFetchAvailableLicenseManagerFiles", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetFileFetchAvailableLicenseManagerFiles")
    @ResponseWrapper(localName = "GetFileFetchAvailableLicenseManagerFilesResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetFileFetchAvailableLicenseManagerFilesResponse")
    public LMFilesResponse getFileFetchAvailableLicenseManagerFiles(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        GetLmFilesRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.DownloadLmFileResponse
     */
    @WebMethod(operationName = "FileFetchSpecificFile", action = "OpenLM.Server.Services/IAdminAPI/FileFetchSpecificFile")
    @WebResult(name = "FileFetchSpecificFileResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "FileFetchSpecificFile", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.FileFetchSpecificFile")
    @ResponseWrapper(localName = "FileFetchSpecificFileResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.FileFetchSpecificFileResponse")
    public DownloadLmFileResponse fileFetchSpecificFile(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        DownloadLmFileRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.FileFetchStatusResponse
     */
    @WebMethod(operationName = "GetFileFetchFetchingStatus", action = "OpenLM.Server.Services/IAdminAPI/GetFileFetchFetchingStatus")
    @WebResult(name = "GetFileFetchFetchingStatusResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetFileFetchFetchingStatus", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetFileFetchFetchingStatus")
    @ResponseWrapper(localName = "GetFileFetchFetchingStatusResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetFileFetchFetchingStatusResponse")
    public FileFetchStatusResponse getFileFetchFetchingStatus(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        FileFetchStatusRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.GetFileFetchConfigResponse
     */
    @WebMethod(operationName = "GetFileFetchConfig", action = "OpenLM.Server.Services/IAdminAPI/GetFileFetchConfig")
    @WebResult(name = "GetFileFetchConfigResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetFileFetchConfig", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetFileFetchConfig")
    @ResponseWrapper(localName = "GetFileFetchConfigResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetFileFetchConfigResponse")
    public GetFileFetchConfigResponse getFileFetchConfig(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        BaseRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.UpdateFileFetchConfigResponse
     */
    @WebMethod(operationName = "UpdateFileFetchConfig", action = "OpenLM.Server.Services/IAdminAPI/UpdateFileFetchConfig")
    @WebResult(name = "UpdateFileFetchConfigResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "UpdateFileFetchConfig", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.UpdateFileFetchConfig")
    @ResponseWrapper(localName = "UpdateFileFetchConfigResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.UpdateFileFetchConfigResponse")
    public UpdateFileFetchConfigResponse updateFileFetchConfig(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        UpdateFileFetchConfigRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.UploadLicenseFileResponse
     */
    @WebMethod(operationName = "UploadLicenseFile", action = "OpenLM.Server.Services/IAdminAPI/UploadLicenseFile")
    @WebResult(name = "UploadLicenseFileResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "UploadLicenseFile", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.UploadLicenseFile")
    @ResponseWrapper(localName = "UploadLicenseFileResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.UploadLicenseFileResponse")
    public UploadLicenseFileResponse uploadLicenseFile(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        UploadLicenseFileRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.LDAPResetSyncResponse
     */
    @WebMethod(operationName = "LdapResetSync", action = "OpenLM.Server.Services/IAdminAPI/LdapResetSync")
    @WebResult(name = "LdapResetSyncResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "LdapResetSync", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.LdapResetSync")
    @ResponseWrapper(localName = "LdapResetSyncResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.LdapResetSyncResponse")
    public LDAPResetSyncResponse ldapResetSync(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        LDAPResetSyncRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.LicenseUsageReportResponse
     */
    @WebMethod(operationName = "GetLicenseUsageReport", action = "OpenLM.Server.Services/IAdminAPI/GetLicenseUsageReport")
    @WebResult(name = "GetLicenseUsageReportResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetLicenseUsageReport", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetLicenseUsageReport")
    @ResponseWrapper(localName = "GetLicenseUsageReportResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetLicenseUsageReportResponse")
    public LicenseUsageReportResponse getLicenseUsageReport(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        LicenseUsageReportRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.GroupNamesResponse
     */
    @WebMethod(operationName = "GetGroupsNames", action = "OpenLM.Server.Services/IAdminAPI/GetGroupsNames")
    @WebResult(name = "GetGroupsNamesResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetGroupsNames", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetGroupsNames")
    @ResponseWrapper(localName = "GetGroupsNamesResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetGroupsNamesResponse")
    public GroupNamesResponse getGroupsNames(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        GroupNamesRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.LogsUploadingStartResponse
     */
    @WebMethod(operationName = "StartLogsUploading", action = "OpenLM.Server.Services/IAdminAPI/StartLogsUploading")
    @WebResult(name = "StartLogsUploadingResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "StartLogsUploading", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.StartLogsUploading")
    @ResponseWrapper(localName = "StartLogsUploadingResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.StartLogsUploadingResponse")
    public LogsUploadingStartResponse startLogsUploading(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        LogsUploadingStartRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.LogsUploadingBaseResponse
     */
    @WebMethod(operationName = "EndLogsUploading", action = "OpenLM.Server.Services/IAdminAPI/EndLogsUploading")
    @WebResult(name = "EndLogsUploadingResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "EndLogsUploading", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.EndLogsUploading")
    @ResponseWrapper(localName = "EndLogsUploadingResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.EndLogsUploadingResponse")
    public LogsUploadingBaseResponse endLogsUploading(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        LogsUploadingEndRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.LogsUploadingBaseResponse
     */
    @WebMethod(operationName = "LogsUploaderKeepAlive", action = "OpenLM.Server.Services/IAdminAPI/LogsUploaderKeepAlive")
    @WebResult(name = "LogsUploaderKeepAliveResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "LogsUploaderKeepAlive", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.LogsUploaderKeepAlive")
    @ResponseWrapper(localName = "LogsUploaderKeepAliveResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.LogsUploaderKeepAliveResponse")
    public LogsUploadingBaseResponse logsUploaderKeepAlive(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        LogsUploadingKeepAliveRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.AddLicenseInfoResponse
     */
    @WebMethod(operationName = "AddLicenseInfo", action = "OpenLM.Server.Services/IAdminAPI/AddLicenseInfo")
    @WebResult(name = "AddLicenseInfoResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "AddLicenseInfo", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.AddLicenseInfo")
    @ResponseWrapper(localName = "AddLicenseInfoResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.AddLicenseInfoResponse")
    public AddLicenseInfoResponse addLicenseInfo(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        AddLicenseInfoRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.AddLicenseUsageResponse
     */
    @WebMethod(operationName = "AddLicenseUsage", action = "OpenLM.Server.Services/IAdminAPI/AddLicenseUsage")
    @WebResult(name = "AddLicenseUsageResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "AddLicenseUsage", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.AddLicenseUsage")
    @ResponseWrapper(localName = "AddLicenseUsageResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.AddLicenseUsageResponse")
    public AddLicenseUsageResponse addLicenseUsage(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        AddLicenseUsageRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.OptFileFeatureValidKeywordsResponse
     */
    @WebMethod(operationName = "GetOptFileFeatureValidKeywords", action = "OpenLM.Server.Services/IAdminAPI/GetOptFileFeatureValidKeywords")
    @WebResult(name = "GetOptFileFeatureValidKeywordsResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetOptFileFeatureValidKeywords", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetOptFileFeatureValidKeywords")
    @ResponseWrapper(localName = "GetOptFileFeatureValidKeywordsResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetOptFileFeatureValidKeywordsResponse")
    public OptFileFeatureValidKeywordsResponse getOptFileFeatureValidKeywords(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        OptFileFeatureValidKeywordsRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse
     */
    @WebMethod(operationName = "GetOptFileContent", action = "OpenLM.Server.Services/IAdminAPI/GetOptFileContent")
    @WebResult(name = "GetOptFileContentResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetOptFileContent", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetOptFileContent")
    @ResponseWrapper(localName = "GetOptFileContentResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetOptFileContentResponse")
    public BaseResponse getOptFileContent(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        OptFileContentRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.LicenseTypesResponse
     */
    @WebMethod(operationName = "GetLicenseTypes", action = "OpenLM.Server.Services/IAdminAPI/GetLicenseTypes")
    @WebResult(name = "GetLicenseTypesResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetLicenseTypes", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetLicenseTypes")
    @ResponseWrapper(localName = "GetLicenseTypesResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetLicenseTypesResponse")
    public LicenseTypesResponse getLicenseTypes(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        BaseRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse
     */
    @WebMethod(operationName = "SetFullLogging", action = "OpenLM.Server.Services/IAdminAPI/SetFullLogging")
    @WebResult(name = "SetFullLoggingResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "SetFullLogging", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.SetFullLogging")
    @ResponseWrapper(localName = "SetFullLoggingResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.SetFullLoggingResponse")
    public BaseResponse setFullLogging(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        SetFullLoggingRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse
     */
    @WebMethod(operationName = "SetLMServerFullLogging", action = "OpenLM.Server.Services/IAdminAPI/SetLMServerFullLogging")
    @WebResult(name = "SetLMServerFullLoggingResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "SetLMServerFullLogging", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.SetLMServerFullLogging")
    @ResponseWrapper(localName = "SetLMServerFullLoggingResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.SetLMServerFullLoggingResponse")
    public BaseResponse setLMServerFullLogging(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        SetLMServerFullLoggingRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse
     */
    @WebMethod(operationName = "SetProjectToUsageSessionByProcess", action = "OpenLM.Server.Services/IAdminAPI/SetProjectToUsageSessionByProcess")
    @WebResult(name = "SetProjectToUsageSessionByProcessResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "SetProjectToUsageSessionByProcess", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.SetProjectToUsageSessionByProcess")
    @ResponseWrapper(localName = "SetProjectToUsageSessionByProcessResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.SetProjectToUsageSessionByProcessResponse")
    public BaseResponse setProjectToUsageSessionByProcess(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        SetProjectToUsageSessionByProcessRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse
     */
    @WebMethod(operationName = "SetProjectToUsageSessionByFeature", action = "OpenLM.Server.Services/IAdminAPI/SetProjectToUsageSessionByFeature")
    @WebResult(name = "SetProjectToUsageSessionByFeatureResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "SetProjectToUsageSessionByFeature", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.SetProjectToUsageSessionByFeature")
    @ResponseWrapper(localName = "SetProjectToUsageSessionByFeatureResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.SetProjectToUsageSessionByFeatureResponse")
    public BaseResponse setProjectToUsageSessionByFeature(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        SetProjectToUsageSessionByFeatureRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.GetProjectsUsageResponse
     */
    @WebMethod(operationName = "GetProjectsUsage", action = "OpenLM.Server.Services/IAdminAPI/GetProjectsUsage")
    @WebResult(name = "GetProjectsUsageResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetProjectsUsage", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetProjectsUsage")
    @ResponseWrapper(localName = "GetProjectsUsageResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetProjectsUsageResponse")
    public GetProjectsUsageResponse getProjectsUsage(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        GetProjectsUsageRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services_datacontracts.RouterGroupsResponse
     */
    @WebMethod(operationName = "GetRouterGroups", action = "OpenLM.Server.Services/IAdminAPI/GetRouterGroups")
    @WebResult(name = "GetRouterGroupsResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetRouterGroups", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetRouterGroups")
    @ResponseWrapper(localName = "GetRouterGroupsResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetRouterGroupsResponse")
    public RouterGroupsResponse getRouterGroups(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        RouterGroupsRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse
     */
    @WebMethod(operationName = "UpdateRouterGroupsAndComponents", action = "OpenLM.Server.Services/IAdminAPI/UpdateRouterGroupsAndComponents")
    @WebResult(name = "UpdateRouterGroupsAndComponentsResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "UpdateRouterGroupsAndComponents", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.UpdateRouterGroupsAndComponents")
    @ResponseWrapper(localName = "UpdateRouterGroupsAndComponentsResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.UpdateRouterGroupsAndComponentsResponse")
    public BaseResponse updateRouterGroupsAndComponents(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        UpdateRouterGroupsAndComponentsRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services_datacontracts.RouterMonitoringResponse
     */
    @WebMethod(operationName = "GetRouterMonitoring", action = "OpenLM.Server.Services/IAdminAPI/GetRouterMonitoring")
    @WebResult(name = "GetRouterMonitoringResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetRouterMonitoring", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetRouterMonitoring")
    @ResponseWrapper(localName = "GetRouterMonitoringResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetRouterMonitoringResponse")
    public RouterMonitoringResponse getRouterMonitoring(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        RouterMonitoringRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse
     */
    @WebMethod(operationName = "ExportRouteInstructions", action = "OpenLM.Server.Services/IAdminAPI/ExportRouteInstructions")
    @WebResult(name = "ExportRouteInstructionsResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "ExportRouteInstructions", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.ExportRouteInstructions")
    @ResponseWrapper(localName = "ExportRouteInstructionsResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.ExportRouteInstructionsResponse")
    public BaseResponse exportRouteInstructions(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        ExportRouteInstructionsRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse
     */
    @WebMethod(operationName = "ImportRouteInstructions", action = "OpenLM.Server.Services/IAdminAPI/ImportRouteInstructions")
    @WebResult(name = "ImportRouteInstructionsResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "ImportRouteInstructions", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.ImportRouteInstructions")
    @ResponseWrapper(localName = "ImportRouteInstructionsResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.ImportRouteInstructionsResponse")
    public BaseResponse importRouteInstructions(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        ImportRouteInstructionsRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.MonitoredProcessesResponse
     */
    @WebMethod(operationName = "MonitoredProcessGetNames", action = "OpenLM.Server.Services/IAdminAPI/MonitoredProcessGetNames")
    @WebResult(name = "MonitoredProcessGetNamesResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "MonitoredProcessGetNames", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.MonitoredProcessGetNames")
    @ResponseWrapper(localName = "MonitoredProcessGetNamesResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.MonitoredProcessGetNamesResponse")
    public MonitoredProcessesResponse monitoredProcessGetNames(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        BaseRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.AgentProcedureTmplResponse
     */
    @WebMethod(operationName = "AgentProcedureTmplGetList", action = "OpenLM.Server.Services/IAdminAPI/AgentProcedureTmplGetList")
    @WebResult(name = "AgentProcedureTmplGetListResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "AgentProcedureTmplGetList", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.AgentProcedureTmplGetList")
    @ResponseWrapper(localName = "AgentProcedureTmplGetListResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.AgentProcedureTmplGetListResponse")
    public AgentProcedureTmplResponse agentProcedureTmplGetList(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        BaseRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse
     */
    @WebMethod(operationName = "AgentProcedureTmplCreate", action = "OpenLM.Server.Services/IAdminAPI/AgentProcedureTmplCreate")
    @WebResult(name = "AgentProcedureTmplCreateResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "AgentProcedureTmplCreate", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.AgentProcedureTmplCreate")
    @ResponseWrapper(localName = "AgentProcedureTmplCreateResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.AgentProcedureTmplCreateResponse")
    public BaseResponse agentProcedureTmplCreate(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        AgentProcedureTmplRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse
     */
    @WebMethod(operationName = "AgentProcedureTmplDelete", action = "OpenLM.Server.Services/IAdminAPI/AgentProcedureTmplDelete")
    @WebResult(name = "AgentProcedureTmplDeleteResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "AgentProcedureTmplDelete", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.AgentProcedureTmplDelete")
    @ResponseWrapper(localName = "AgentProcedureTmplDeleteResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.AgentProcedureTmplDeleteResponse")
    public BaseResponse agentProcedureTmplDelete(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        AgentProcedureTmplRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse
     */
    @WebMethod(operationName = "AgentProcedureTmplUpdate", action = "OpenLM.Server.Services/IAdminAPI/AgentProcedureTmplUpdate")
    @WebResult(name = "AgentProcedureTmplUpdateResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "AgentProcedureTmplUpdate", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.AgentProcedureTmplUpdate")
    @ResponseWrapper(localName = "AgentProcedureTmplUpdateResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.AgentProcedureTmplUpdateResponse")
    public BaseResponse agentProcedureTmplUpdate(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        AgentProcedureTmplRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse
     */
    @WebMethod(operationName = "ClearCleanupProcesses", action = "OpenLM.Server.Services/IAdminAPI/ClearCleanupProcesses")
    @WebResult(name = "ClearCleanupProcessesResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "ClearCleanupProcesses", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.ClearCleanupProcesses")
    @ResponseWrapper(localName = "ClearCleanupProcessesResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.ClearCleanupProcessesResponse")
    public BaseResponse clearCleanupProcesses(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        ClearCleanupProcessesRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse
     */
    @WebMethod(operationName = "UpdateCheckoutPolicy", action = "OpenLM.Server.Services/IAdminAPI/UpdateCheckoutPolicy")
    @WebResult(name = "UpdateCheckoutPolicyResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "UpdateCheckoutPolicy", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.UpdateCheckoutPolicy")
    @ResponseWrapper(localName = "UpdateCheckoutPolicyResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.UpdateCheckoutPolicyResponse")
    public BaseResponse updateCheckoutPolicy(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        UpdateCheckoutPolicyRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.TrustedAuthenticationConfigurationResponse
     */
    @WebMethod(operationName = "GetTrustedAuthenticationConfiguration", action = "OpenLM.Server.Services/IAdminAPI/GetTrustedAuthenticationConfiguration")
    @WebResult(name = "GetTrustedAuthenticationConfigurationResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "GetTrustedAuthenticationConfiguration", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetTrustedAuthenticationConfiguration")
    @ResponseWrapper(localName = "GetTrustedAuthenticationConfigurationResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.GetTrustedAuthenticationConfigurationResponse")
    public TrustedAuthenticationConfigurationResponse getTrustedAuthenticationConfiguration(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        BaseRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.openlm_server_services.BaseResponse
     */
    @WebMethod(operationName = "UpdateTrustedAuthenticationConfiguration", action = "OpenLM.Server.Services/IAdminAPI/UpdateTrustedAuthenticationConfiguration")
    @WebResult(name = "UpdateTrustedAuthenticationConfigurationResult", targetNamespace = "OpenLM.Server.Services")
    @RequestWrapper(localName = "UpdateTrustedAuthenticationConfiguration", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.UpdateTrustedAuthenticationConfiguration")
    @ResponseWrapper(localName = "UpdateTrustedAuthenticationConfigurationResponse", targetNamespace = "OpenLM.Server.Services", className = "services.server.openlm.UpdateTrustedAuthenticationConfigurationResponse")
    public BaseResponse updateTrustedAuthenticationConfiguration(
        @WebParam(name = "request", targetNamespace = "OpenLM.Server.Services")
        TrustedAuthenticationConfigurationRequest request);

}
