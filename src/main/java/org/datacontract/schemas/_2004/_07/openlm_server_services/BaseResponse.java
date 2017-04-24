
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.openlm_server.ExportContentType;
import org.datacontract.schemas._2004._07.openlm_server_services_datacontracts.RouterGroupsResponse;
import org.datacontract.schemas._2004._07.openlm_server_services_datacontracts.RouterMonitoringResponse;


/**
 * <p>Java class for BaseResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Error" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}Error" minOccurs="0"/>
 *         &lt;element name="ExportContentType" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums}ExportContentType" minOccurs="0"/>
 *         &lt;element name="ExportString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BaseResponse", propOrder = {
    "error",
    "exportContentType",
    "exportString",
    "saasToken"
})
@XmlSeeAlso({
    RouterGroupsResponse.class,
    RouterMonitoringResponse.class,
    AlertRuleConditionDefinitionsResponse.class,
    UploadLicenseFileResponse.class,
    LicenseServersResponse.class,
    EmailSMSSettingsResponse.class,
    LogsUploadingBaseResponse.class,
    AddLicenseInfoResponse.class,
    LDAPResetSyncResponse.class,
    LicenseTypesResponse.class,
    LicensesProcurementResponse.class,
    GetUnmanagedVendorResponse.class,
    TrustedAuthenticationConfigurationResponse.class,
    GetProjectsUsageResponse.class,
    PackageLicensesResponse.class,
    AlertsRulesResponse.class,
    DownloadLmFileResponse.class,
    AddUnmanagedVendorResponse.class,
    FileFetchStatusResponse.class,
    FeatureUsageStatusResponse.class,
    AlertRuleResponse.class,
    SystemMessagesResponse.class,
    AddLicenseUsageResponse.class,
    AgentProcedureTmplResponse.class,
    CurrentlyConsumedLicensesResponse.class,
    UpdateFileFetchConfigResponse.class,
    OpenLMLicenseOverviewResponse.class,
    LoginFormSettingsResponse.class,
    AlertRuleComponentsResponse.class,
    GetFileFetchConfigResponse.class,
    GroupNamesResponse.class,
    MonitoredProcessesResponse.class,
    LicensesActivityResponse.class,
    LMFilesResponse.class,
    OptFileFeatureValidKeywordsResponse.class,
    LicenseUsageReportResponse.class,
    UserAuthenticationResponse.class,
    LicensesResponse.class,
    AlertDescriptionResponse.class
})
public class BaseResponse {

    @XmlElementRef(name = "Error", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Error> error;
    @XmlElement(name = "ExportContentType")
    @XmlSchemaType(name = "string")
    protected ExportContentType exportContentType;
    @XmlElementRef(name = "ExportString", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exportString;
    @XmlElementRef(name = "SaasToken", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> saasToken;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Error }{@code >}
     *     
     */
    public JAXBElement<Error> getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Error }{@code >}
     *     
     */
    public void setError(JAXBElement<Error> value) {
        this.error = value;
    }

    /**
     * Gets the value of the exportContentType property.
     * 
     * @return
     *     possible object is
     *     {@link ExportContentType }
     *     
     */
    public ExportContentType getExportContentType() {
        return exportContentType;
    }

    /**
     * Sets the value of the exportContentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportContentType }
     *     
     */
    public void setExportContentType(ExportContentType value) {
        this.exportContentType = value;
    }

    /**
     * Gets the value of the exportString property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExportString() {
        return exportString;
    }

    /**
     * Sets the value of the exportString property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExportString(JAXBElement<String> value) {
        this.exportString = value;
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
