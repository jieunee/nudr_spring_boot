package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AccessAndMobilitySubscriptionData;
import org.openapitools.model.Amf3GppAccessRegistration;
import org.openapitools.model.AmfNon3GppAccessRegistration;
import org.openapitools.model.EeSubscription;
import org.openapitools.model.OperatorSpecificDataContainer;
import org.openapitools.model.PpData;
import org.openapitools.model.SessionManagementSubscriptionData;
import org.openapitools.model.SmfSelectionSubscriptionData;
import org.openapitools.model.SmsManagementSubscriptionData;
import org.openapitools.model.SmsSubscriptionData;
import org.openapitools.model.SmsfRegistration;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DataChangeNotify
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class DataChangeNotify   {
  @JsonProperty("originalCallbackReference")
  private String originalCallbackReference = null;

  @JsonProperty("accessAndMobilitySubscriptionData")
  private AccessAndMobilitySubscriptionData accessAndMobilitySubscriptionData = null;

  @JsonProperty("smfSelectionSubscriptionData")
  private SmfSelectionSubscriptionData smfSelectionSubscriptionData = null;

  @JsonProperty("sessionManagementSubscriptionData")
  private SessionManagementSubscriptionData sessionManagementSubscriptionData = null;

  @JsonProperty("amf3GppAccessRegistration")
  private Amf3GppAccessRegistration amf3GppAccessRegistration = null;

  @JsonProperty("amfNon3GppAccessRegistration")
  private AmfNon3GppAccessRegistration amfNon3GppAccessRegistration = null;

  @JsonProperty("operatorSpecificData")
  private OperatorSpecificDataContainer operatorSpecificData = null;

  @JsonProperty("smsManagementSubscriptionData")
  private SmsManagementSubscriptionData smsManagementSubscriptionData = null;

  @JsonProperty("smsf3GppAccessRegistration")
  private SmsfRegistration smsf3GppAccessRegistration = null;

  @JsonProperty("smsfNon3GppAccessRegistration")
  private SmsfRegistration smsfNon3GppAccessRegistration = null;

  @JsonProperty("eeSubscriptions")
  private EeSubscription eeSubscriptions = null;

  @JsonProperty("provisionedParamenterData")
  private PpData provisionedParamenterData = null;

  @JsonProperty("smsSubscriptionData")
  private SmsSubscriptionData smsSubscriptionData = null;

  public DataChangeNotify originalCallbackReference(String originalCallbackReference) {
    this.originalCallbackReference = originalCallbackReference;
    return this;
  }

  /**
   * Get originalCallbackReference
   * @return originalCallbackReference
  **/
  @ApiModelProperty(value = "")


  public String getOriginalCallbackReference() {
    return originalCallbackReference;
  }

  public void setOriginalCallbackReference(String originalCallbackReference) {
    this.originalCallbackReference = originalCallbackReference;
  }

  public DataChangeNotify accessAndMobilitySubscriptionData(AccessAndMobilitySubscriptionData accessAndMobilitySubscriptionData) {
    this.accessAndMobilitySubscriptionData = accessAndMobilitySubscriptionData;
    return this;
  }

  /**
   * Get accessAndMobilitySubscriptionData
   * @return accessAndMobilitySubscriptionData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccessAndMobilitySubscriptionData getAccessAndMobilitySubscriptionData() {
    return accessAndMobilitySubscriptionData;
  }

  public void setAccessAndMobilitySubscriptionData(AccessAndMobilitySubscriptionData accessAndMobilitySubscriptionData) {
    this.accessAndMobilitySubscriptionData = accessAndMobilitySubscriptionData;
  }

  public DataChangeNotify smfSelectionSubscriptionData(SmfSelectionSubscriptionData smfSelectionSubscriptionData) {
    this.smfSelectionSubscriptionData = smfSelectionSubscriptionData;
    return this;
  }

  /**
   * Get smfSelectionSubscriptionData
   * @return smfSelectionSubscriptionData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SmfSelectionSubscriptionData getSmfSelectionSubscriptionData() {
    return smfSelectionSubscriptionData;
  }

  public void setSmfSelectionSubscriptionData(SmfSelectionSubscriptionData smfSelectionSubscriptionData) {
    this.smfSelectionSubscriptionData = smfSelectionSubscriptionData;
  }

  public DataChangeNotify sessionManagementSubscriptionData(SessionManagementSubscriptionData sessionManagementSubscriptionData) {
    this.sessionManagementSubscriptionData = sessionManagementSubscriptionData;
    return this;
  }

  /**
   * Get sessionManagementSubscriptionData
   * @return sessionManagementSubscriptionData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SessionManagementSubscriptionData getSessionManagementSubscriptionData() {
    return sessionManagementSubscriptionData;
  }

  public void setSessionManagementSubscriptionData(SessionManagementSubscriptionData sessionManagementSubscriptionData) {
    this.sessionManagementSubscriptionData = sessionManagementSubscriptionData;
  }

  public DataChangeNotify amf3GppAccessRegistration(Amf3GppAccessRegistration amf3GppAccessRegistration) {
    this.amf3GppAccessRegistration = amf3GppAccessRegistration;
    return this;
  }

  /**
   * Get amf3GppAccessRegistration
   * @return amf3GppAccessRegistration
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amf3GppAccessRegistration getAmf3GppAccessRegistration() {
    return amf3GppAccessRegistration;
  }

  public void setAmf3GppAccessRegistration(Amf3GppAccessRegistration amf3GppAccessRegistration) {
    this.amf3GppAccessRegistration = amf3GppAccessRegistration;
  }

  public DataChangeNotify amfNon3GppAccessRegistration(AmfNon3GppAccessRegistration amfNon3GppAccessRegistration) {
    this.amfNon3GppAccessRegistration = amfNon3GppAccessRegistration;
    return this;
  }

  /**
   * Get amfNon3GppAccessRegistration
   * @return amfNon3GppAccessRegistration
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AmfNon3GppAccessRegistration getAmfNon3GppAccessRegistration() {
    return amfNon3GppAccessRegistration;
  }

  public void setAmfNon3GppAccessRegistration(AmfNon3GppAccessRegistration amfNon3GppAccessRegistration) {
    this.amfNon3GppAccessRegistration = amfNon3GppAccessRegistration;
  }

  public DataChangeNotify operatorSpecificData(OperatorSpecificDataContainer operatorSpecificData) {
    this.operatorSpecificData = operatorSpecificData;
    return this;
  }

  /**
   * Get operatorSpecificData
   * @return operatorSpecificData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperatorSpecificDataContainer getOperatorSpecificData() {
    return operatorSpecificData;
  }

  public void setOperatorSpecificData(OperatorSpecificDataContainer operatorSpecificData) {
    this.operatorSpecificData = operatorSpecificData;
  }

  public DataChangeNotify smsManagementSubscriptionData(SmsManagementSubscriptionData smsManagementSubscriptionData) {
    this.smsManagementSubscriptionData = smsManagementSubscriptionData;
    return this;
  }

  /**
   * Get smsManagementSubscriptionData
   * @return smsManagementSubscriptionData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SmsManagementSubscriptionData getSmsManagementSubscriptionData() {
    return smsManagementSubscriptionData;
  }

  public void setSmsManagementSubscriptionData(SmsManagementSubscriptionData smsManagementSubscriptionData) {
    this.smsManagementSubscriptionData = smsManagementSubscriptionData;
  }

  public DataChangeNotify smsf3GppAccessRegistration(SmsfRegistration smsf3GppAccessRegistration) {
    this.smsf3GppAccessRegistration = smsf3GppAccessRegistration;
    return this;
  }

  /**
   * Get smsf3GppAccessRegistration
   * @return smsf3GppAccessRegistration
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SmsfRegistration getSmsf3GppAccessRegistration() {
    return smsf3GppAccessRegistration;
  }

  public void setSmsf3GppAccessRegistration(SmsfRegistration smsf3GppAccessRegistration) {
    this.smsf3GppAccessRegistration = smsf3GppAccessRegistration;
  }

  public DataChangeNotify smsfNon3GppAccessRegistration(SmsfRegistration smsfNon3GppAccessRegistration) {
    this.smsfNon3GppAccessRegistration = smsfNon3GppAccessRegistration;
    return this;
  }

  /**
   * Get smsfNon3GppAccessRegistration
   * @return smsfNon3GppAccessRegistration
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SmsfRegistration getSmsfNon3GppAccessRegistration() {
    return smsfNon3GppAccessRegistration;
  }

  public void setSmsfNon3GppAccessRegistration(SmsfRegistration smsfNon3GppAccessRegistration) {
    this.smsfNon3GppAccessRegistration = smsfNon3GppAccessRegistration;
  }

  public DataChangeNotify eeSubscriptions(EeSubscription eeSubscriptions) {
    this.eeSubscriptions = eeSubscriptions;
    return this;
  }

  /**
   * Get eeSubscriptions
   * @return eeSubscriptions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EeSubscription getEeSubscriptions() {
    return eeSubscriptions;
  }

  public void setEeSubscriptions(EeSubscription eeSubscriptions) {
    this.eeSubscriptions = eeSubscriptions;
  }

  public DataChangeNotify provisionedParamenterData(PpData provisionedParamenterData) {
    this.provisionedParamenterData = provisionedParamenterData;
    return this;
  }

  /**
   * Get provisionedParamenterData
   * @return provisionedParamenterData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PpData getProvisionedParamenterData() {
    return provisionedParamenterData;
  }

  public void setProvisionedParamenterData(PpData provisionedParamenterData) {
    this.provisionedParamenterData = provisionedParamenterData;
  }

  public DataChangeNotify smsSubscriptionData(SmsSubscriptionData smsSubscriptionData) {
    this.smsSubscriptionData = smsSubscriptionData;
    return this;
  }

  /**
   * Get smsSubscriptionData
   * @return smsSubscriptionData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SmsSubscriptionData getSmsSubscriptionData() {
    return smsSubscriptionData;
  }

  public void setSmsSubscriptionData(SmsSubscriptionData smsSubscriptionData) {
    this.smsSubscriptionData = smsSubscriptionData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataChangeNotify dataChangeNotify = (DataChangeNotify) o;
    return Objects.equals(this.originalCallbackReference, dataChangeNotify.originalCallbackReference) &&
        Objects.equals(this.accessAndMobilitySubscriptionData, dataChangeNotify.accessAndMobilitySubscriptionData) &&
        Objects.equals(this.smfSelectionSubscriptionData, dataChangeNotify.smfSelectionSubscriptionData) &&
        Objects.equals(this.sessionManagementSubscriptionData, dataChangeNotify.sessionManagementSubscriptionData) &&
        Objects.equals(this.amf3GppAccessRegistration, dataChangeNotify.amf3GppAccessRegistration) &&
        Objects.equals(this.amfNon3GppAccessRegistration, dataChangeNotify.amfNon3GppAccessRegistration) &&
        Objects.equals(this.operatorSpecificData, dataChangeNotify.operatorSpecificData) &&
        Objects.equals(this.smsManagementSubscriptionData, dataChangeNotify.smsManagementSubscriptionData) &&
        Objects.equals(this.smsf3GppAccessRegistration, dataChangeNotify.smsf3GppAccessRegistration) &&
        Objects.equals(this.smsfNon3GppAccessRegistration, dataChangeNotify.smsfNon3GppAccessRegistration) &&
        Objects.equals(this.eeSubscriptions, dataChangeNotify.eeSubscriptions) &&
        Objects.equals(this.provisionedParamenterData, dataChangeNotify.provisionedParamenterData) &&
        Objects.equals(this.smsSubscriptionData, dataChangeNotify.smsSubscriptionData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalCallbackReference, accessAndMobilitySubscriptionData, smfSelectionSubscriptionData, sessionManagementSubscriptionData, amf3GppAccessRegistration, amfNon3GppAccessRegistration, operatorSpecificData, smsManagementSubscriptionData, smsf3GppAccessRegistration, smsfNon3GppAccessRegistration, eeSubscriptions, provisionedParamenterData, smsSubscriptionData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataChangeNotify {\n");
    
    sb.append("    originalCallbackReference: ").append(toIndentedString(originalCallbackReference)).append("\n");
    sb.append("    accessAndMobilitySubscriptionData: ").append(toIndentedString(accessAndMobilitySubscriptionData)).append("\n");
    sb.append("    smfSelectionSubscriptionData: ").append(toIndentedString(smfSelectionSubscriptionData)).append("\n");
    sb.append("    sessionManagementSubscriptionData: ").append(toIndentedString(sessionManagementSubscriptionData)).append("\n");
    sb.append("    amf3GppAccessRegistration: ").append(toIndentedString(amf3GppAccessRegistration)).append("\n");
    sb.append("    amfNon3GppAccessRegistration: ").append(toIndentedString(amfNon3GppAccessRegistration)).append("\n");
    sb.append("    operatorSpecificData: ").append(toIndentedString(operatorSpecificData)).append("\n");
    sb.append("    smsManagementSubscriptionData: ").append(toIndentedString(smsManagementSubscriptionData)).append("\n");
    sb.append("    smsf3GppAccessRegistration: ").append(toIndentedString(smsf3GppAccessRegistration)).append("\n");
    sb.append("    smsfNon3GppAccessRegistration: ").append(toIndentedString(smsfNon3GppAccessRegistration)).append("\n");
    sb.append("    eeSubscriptions: ").append(toIndentedString(eeSubscriptions)).append("\n");
    sb.append("    provisionedParamenterData: ").append(toIndentedString(provisionedParamenterData)).append("\n");
    sb.append("    smsSubscriptionData: ").append(toIndentedString(smsSubscriptionData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

