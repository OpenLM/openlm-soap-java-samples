package com.openlm.core.soap;

import org.datacontract.schemas._2004._07.openlm_server.CurrentlyConsumedLicensesRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.CurrentlyConsumedLicensesResponse;
import org.junit.Test;

import javax.xml.bind.JAXBElement;

public class GetCurrentConsumedLicenses {

    @Test
    public void getLicenseServers(){
        OpenLMCoreConnector connector = new OpenLMCoreConnector("localhost", 7020, null, null);

        CurrentlyConsumedLicensesRequest request = prepareRequest();
        CurrentlyConsumedLicensesResponse response = connector.soapAPI.getCurrentlyConsumedLicenses(request);
        processResponse(response);
    }

    private void processResponse(CurrentlyConsumedLicensesResponse response) {
    }

    private CurrentlyConsumedLicensesRequest prepareRequest() {
        org.datacontract.schemas._2004._07.openlm_server.ObjectFactory objectFactory = new org.datacontract.schemas._2004._07.openlm_server.ObjectFactory();
        CurrentlyConsumedLicensesRequest request = objectFactory.createCurrentlyConsumedLicensesRequest();

        JAXBElement<String> serverName = objectFactory.createCurrentlyConsumedLicenseServerName("serverName");
        request.setServerName(serverName);

        return request;
    }
}
