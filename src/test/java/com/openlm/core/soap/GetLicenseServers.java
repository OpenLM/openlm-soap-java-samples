package com.openlm.core.soap;

import org.datacontract.schemas._2004._07.openlm_server.ArrayOfLicenseServerHostDetails;
import org.datacontract.schemas._2004._07.openlm_server.ArrayOfLicenseServerStatistics;
import org.datacontract.schemas._2004._07.openlm_server.LicenseServerHostDetails;
import org.datacontract.schemas._2004._07.openlm_server.LicenseServerStatistics;
import org.datacontract.schemas._2004._07.openlm_server_services.GetLicenseServersRequest;
import org.datacontract.schemas._2004._07.openlm_server_services.LicenseServersResponse;
import org.datacontract.schemas._2004._07.openlm_server_services.ObjectFactory;
import org.junit.Test;

import javax.xml.bind.JAXBElement;
import java.util.List;

public class GetLicenseServers {

    @Test
    public void getLicenseServers(){
        OpenLMCoreConnector connector = new OpenLMCoreConnector("localhost", 7020, null, null);

        GetLicenseServersRequest request = prepareRequest();
        LicenseServersResponse response = connector.soapAPI.getLicenseServers(request);
        processResponse(response);
    }

    private void processResponse(LicenseServersResponse response) {
        JAXBElement<ArrayOfLicenseServerStatistics> element = response.getServers();
        if(!element.isNil()){
            ArrayOfLicenseServerStatistics array = element.getValue();
            List<LicenseServerStatistics> servers = array.getLicenseServerStatistics();
            for (LicenseServerStatistics stats : servers) {
                JAXBElement<ArrayOfLicenseServerHostDetails> hostElements = stats.getHosts();
                ArrayOfLicenseServerHostDetails hostArray = hostElements.getValue();
                List<LicenseServerHostDetails> hostsDetails = hostArray.getLicenseServerHostDetails();
                for (LicenseServerHostDetails hostDetails : hostsDetails) {
                    System.out.print(hostDetails.getHostName().getValue());
                    System.out.print(":");
                    System.out.print(hostDetails.getPort().intValue());
                    System.out.println();
                }
            }
        }
    }

    private GetLicenseServersRequest prepareRequest() {
        ObjectFactory objectFactory = new ObjectFactory();
        GetLicenseServersRequest request = objectFactory.createGetLicenseServersRequest();
        request.setIncludeDeleted(true);
        request.setIncludeDisabled(true);
        return request;
    }
}
