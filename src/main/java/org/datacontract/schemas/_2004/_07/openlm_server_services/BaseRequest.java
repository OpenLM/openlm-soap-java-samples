
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.openlm_server.CurrentlyConsumedLicensesRequest;
import org.datacontract.schemas._2004._07.openlm_server.LicenseInfoRequest;
import org.datacontract.schemas._2004._07.openlm_server.LicensesActivityRequest;
import org.datacontract.schemas._2004._07.openlm_server.LicensesProcurementRequest;
import org.datacontract.schemas._2004._07.openlm_server.PackageLicensesRequest;
import org.datacontract.schemas._2004._07.openlm_server_services_datacontracts.ExportRouteInstructionsRequest;
import org.datacontract.schemas._2004._07.openlm_server_services_datacontracts.ImportRouteInstructionsRequest;
import org.datacontract.schemas._2004._07.openlm_server_services_datacontracts.RouterGroupsRequest;
import org.datacontract.schemas._2004._07.openlm_server_services_datacontracts.RouterMonitoringRequest;
import org.datacontract.schemas._2004._07.openlm_server_services_datacontracts.UpdateRouterGroupsAndComponentsRequest;


/**
 * <p>Java class for BaseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseInfo" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}RequestBaseInfo" minOccurs="0"/>
 *         &lt;element name="SaasToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRequest", propOrder = {
    "baseInfo",
    "saasToken"
})
@XmlSeeAlso({
    CurrentlyConsumedLicensesRequest.class,
    LicenseInfoRequest.class,
    PackageLicensesRequest.class,
    LicensesProcurementRequest.class,
    LicensesActivityRequest.class,
    UpdateRouterGroupsAndComponentsRequest.class,
    RouterGroupsRequest.class,
    ImportRouteInstructionsRequest.class,
    RouterMonitoringRequest.class,
    ExportRouteInstructionsRequest.class,
    AlertDescriptionRequest.class,
    UpdateEmailSMSSettingsDataRequest.class,
    AgentProcedureTmplRequest.class,
    LoginFormSettingsRequest.class,
    EmailSettingsRequest.class,
    GetProjectsUsageRequest.class,
    OptFileContentRequest.class,
    OptFileFeatureValidKeywordsRequest.class,
    GetUnmanagedVendorRequest.class,
    UploadLicenseFileRequest.class,
    GetLmFilesRequest.class,
    UpdateAlertRuleComponentsDataRequest.class,
    AddLicenseInfoRequest.class,
    UpdateFileFetchConfigRequest.class,
    FileFetchStatusRequest.class,
    GroupNamesRequest.class,
    SetFullLoggingRequest.class,
    AlertRuleRequest.class,
    DownloadLmFileRequest.class,
    LicenseUsageReportRequest.class,
    LDAPResetSyncRequest.class,
    FeatureUsageStatusRequest.class,
    AlertRuleComponentsRequest.class,
    UserAuthenticationRequest.class,
    GetLicenseServersRequest.class,
    AddLicenseUsageRequest.class,
    ClearCleanupProcessesRequest.class,
    UpdateCheckoutPolicyRequest.class,
    TrustedAuthenticationConfigurationRequest.class,
    SetLMServerFullLoggingRequest.class,
    SetProjectToUsageSessionRequest.class,
    LogsUploadingBaseRequest.class,
    SMSSettingsRequest.class
})
public class BaseRequest {

    @XmlElementRef(name = "BaseInfo", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestBaseInfo> baseInfo;
    @XmlElementRef(name = "SaasToken", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> saasToken;

    /**
     * Gets the value of the baseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RequestBaseInfo }{@code >}
     *     
     */
    public JAXBElement<RequestBaseInfo> getBaseInfo() {
        return baseInfo;
    }

    /**
     * Sets the value of the baseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RequestBaseInfo }{@code >}
     *     
     */
    public void setBaseInfo(JAXBElement<RequestBaseInfo> value) {
        this.baseInfo = value;
    }

    /**
     * Gets the value of the saasToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSaasToken() {
        return saasToken;
    }

    /**
     * Sets the value of the saasToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSaasToken(JAXBElement<String> value) {
        this.saasToken = value;
    }

}
