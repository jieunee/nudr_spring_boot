package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Ambr;
import org.openapitools.model.AreaRestriction;
import org.openapitools.model.CoreNetworkType;
import org.openapitools.model.Nssai;
import org.openapitools.model.RatType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccessAndMobilitySubscriptionData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class AccessAndMobilitySubscriptionData   {
  @JsonProperty("supportedFeatures")
  private String supportedFeatures = null;

  @JsonProperty("gpsis")
  @Valid
  private List<String> gpsis = null;

  @JsonProperty("internalGroupIds")
  @Valid
  private List<String> internalGroupIds = null;

  @JsonProperty("subscribedUeAmbr")
  private Ambr subscribedUeAmbr = null;

  @JsonProperty("nssai")
  private Nssai nssai = null;

  @JsonProperty("ratRestrictions")
  @Valid
  private List<RatType> ratRestrictions = null;

  @JsonProperty("areaRestrictions")
  @Valid
  private List<AreaRestriction> areaRestrictions = null;

  @JsonProperty("coreNetworkTypeRestrictions")
  @Valid
  private List<CoreNetworkType> coreNetworkTypeRestrictions = null;

  @JsonProperty("rfspIndex")
  private Integer rfspIndex = null;

  @JsonProperty("subsRegTimer")
  private Integer subsRegTimer = null;

  @JsonProperty("ueUsageType")
  private Integer ueUsageType = null;

  @JsonProperty("ladnInformation")
  @Valid
  private List<String> ladnInformation = null;

  @JsonProperty("mpsPriority")
  private Boolean mpsPriority = null;

  @JsonProperty("activeTime")
  private Integer activeTime = null;

  @JsonProperty("dlPacketCount")
  private Integer dlPacketCount = null;

  public AccessAndMobilitySubscriptionData supportedFeatures(String supportedFeatures) {
    this.supportedFeatures = supportedFeatures;
    return this;
  }

  /**
   * Get supportedFeatures
   * @return supportedFeatures
  **/
  @ApiModelProperty(value = "")


  public String getSupportedFeatures() {
    return supportedFeatures;
  }

  public void setSupportedFeatures(String supportedFeatures) {
    this.supportedFeatures = supportedFeatures;
  }

  public AccessAndMobilitySubscriptionData gpsis(List<String> gpsis) {
    this.gpsis = gpsis;
    return this;
  }

  public AccessAndMobilitySubscriptionData addGpsisItem(String gpsisItem) {
    if (this.gpsis == null) {
      this.gpsis = new ArrayList<>();
    }
    this.gpsis.add(gpsisItem);
    return this;
  }

  /**
   * Get gpsis
   * @return gpsis
  **/
  @ApiModelProperty(value = "")


  public List<String> getGpsis() {
    return gpsis;
  }

  public void setGpsis(List<String> gpsis) {
    this.gpsis = gpsis;
  }

  public AccessAndMobilitySubscriptionData internalGroupIds(List<String> internalGroupIds) {
    this.internalGroupIds = internalGroupIds;
    return this;
  }

  public AccessAndMobilitySubscriptionData addInternalGroupIdsItem(String internalGroupIdsItem) {
    if (this.internalGroupIds == null) {
      this.internalGroupIds = new ArrayList<>();
    }
    this.internalGroupIds.add(internalGroupIdsItem);
    return this;
  }

  /**
   * Get internalGroupIds
   * @return internalGroupIds
  **/
  @ApiModelProperty(value = "")


  public List<String> getInternalGroupIds() {
    return internalGroupIds;
  }

  public void setInternalGroupIds(List<String> internalGroupIds) {
    this.internalGroupIds = internalGroupIds;
  }

  public AccessAndMobilitySubscriptionData subscribedUeAmbr(Ambr subscribedUeAmbr) {
    this.subscribedUeAmbr = subscribedUeAmbr;
    return this;
  }

  /**
   * Get subscribedUeAmbr
   * @return subscribedUeAmbr
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Ambr getSubscribedUeAmbr() {
    return subscribedUeAmbr;
  }

  public void setSubscribedUeAmbr(Ambr subscribedUeAmbr) {
    this.subscribedUeAmbr = subscribedUeAmbr;
  }

  public AccessAndMobilitySubscriptionData nssai(Nssai nssai) {
    this.nssai = nssai;
    return this;
  }

  /**
   * Get nssai
   * @return nssai
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Nssai getNssai() {
    return nssai;
  }

  public void setNssai(Nssai nssai) {
    this.nssai = nssai;
  }

  public AccessAndMobilitySubscriptionData ratRestrictions(List<RatType> ratRestrictions) {
    this.ratRestrictions = ratRestrictions;
    return this;
  }

  public AccessAndMobilitySubscriptionData addRatRestrictionsItem(RatType ratRestrictionsItem) {
    if (this.ratRestrictions == null) {
      this.ratRestrictions = new ArrayList<>();
    }
    this.ratRestrictions.add(ratRestrictionsItem);
    return this;
  }

  /**
   * Get ratRestrictions
   * @return ratRestrictions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RatType> getRatRestrictions() {
    return ratRestrictions;
  }

  public void setRatRestrictions(List<RatType> ratRestrictions) {
    this.ratRestrictions = ratRestrictions;
  }

  public AccessAndMobilitySubscriptionData areaRestrictions(List<AreaRestriction> areaRestrictions) {
    this.areaRestrictions = areaRestrictions;
    return this;
  }

  public AccessAndMobilitySubscriptionData addAreaRestrictionsItem(AreaRestriction areaRestrictionsItem) {
    if (this.areaRestrictions == null) {
      this.areaRestrictions = new ArrayList<>();
    }
    this.areaRestrictions.add(areaRestrictionsItem);
    return this;
  }

  /**
   * Get areaRestrictions
   * @return areaRestrictions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AreaRestriction> getAreaRestrictions() {
    return areaRestrictions;
  }

  public void setAreaRestrictions(List<AreaRestriction> areaRestrictions) {
    this.areaRestrictions = areaRestrictions;
  }

  public AccessAndMobilitySubscriptionData coreNetworkTypeRestrictions(List<CoreNetworkType> coreNetworkTypeRestrictions) {
    this.coreNetworkTypeRestrictions = coreNetworkTypeRestrictions;
    return this;
  }

  public AccessAndMobilitySubscriptionData addCoreNetworkTypeRestrictionsItem(CoreNetworkType coreNetworkTypeRestrictionsItem) {
    if (this.coreNetworkTypeRestrictions == null) {
      this.coreNetworkTypeRestrictions = new ArrayList<>();
    }
    this.coreNetworkTypeRestrictions.add(coreNetworkTypeRestrictionsItem);
    return this;
  }

  /**
   * Get coreNetworkTypeRestrictions
   * @return coreNetworkTypeRestrictions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CoreNetworkType> getCoreNetworkTypeRestrictions() {
    return coreNetworkTypeRestrictions;
  }

  public void setCoreNetworkTypeRestrictions(List<CoreNetworkType> coreNetworkTypeRestrictions) {
    this.coreNetworkTypeRestrictions = coreNetworkTypeRestrictions;
  }

  public AccessAndMobilitySubscriptionData rfspIndex(Integer rfspIndex) {
    this.rfspIndex = rfspIndex;
    return this;
  }

  /**
   * Get rfspIndex
   * @return rfspIndex
  **/
  @ApiModelProperty(value = "")


  public Integer getRfspIndex() {
    return rfspIndex;
  }

  public void setRfspIndex(Integer rfspIndex) {
    this.rfspIndex = rfspIndex;
  }

  public AccessAndMobilitySubscriptionData subsRegTimer(Integer subsRegTimer) {
    this.subsRegTimer = subsRegTimer;
    return this;
  }

  /**
   * Get subsRegTimer
   * @return subsRegTimer
  **/
  @ApiModelProperty(value = "")


  public Integer getSubsRegTimer() {
    return subsRegTimer;
  }

  public void setSubsRegTimer(Integer subsRegTimer) {
    this.subsRegTimer = subsRegTimer;
  }

  public AccessAndMobilitySubscriptionData ueUsageType(Integer ueUsageType) {
    this.ueUsageType = ueUsageType;
    return this;
  }

  /**
   * Get ueUsageType
   * @return ueUsageType
  **/
  @ApiModelProperty(value = "")


  public Integer getUeUsageType() {
    return ueUsageType;
  }

  public void setUeUsageType(Integer ueUsageType) {
    this.ueUsageType = ueUsageType;
  }

  public AccessAndMobilitySubscriptionData ladnInformation(List<String> ladnInformation) {
    this.ladnInformation = ladnInformation;
    return this;
  }

  public AccessAndMobilitySubscriptionData addLadnInformationItem(String ladnInformationItem) {
    if (this.ladnInformation == null) {
      this.ladnInformation = new ArrayList<>();
    }
    this.ladnInformation.add(ladnInformationItem);
    return this;
  }

  /**
   * Get ladnInformation
   * @return ladnInformation
  **/
  @ApiModelProperty(value = "")


  public List<String> getLadnInformation() {
    return ladnInformation;
  }

  public void setLadnInformation(List<String> ladnInformation) {
    this.ladnInformation = ladnInformation;
  }

  public AccessAndMobilitySubscriptionData mpsPriority(Boolean mpsPriority) {
    this.mpsPriority = mpsPriority;
    return this;
  }

  /**
   * Get mpsPriority
   * @return mpsPriority
  **/
  @ApiModelProperty(value = "")


  public Boolean getMpsPriority() {
    return mpsPriority;
  }

  public void setMpsPriority(Boolean mpsPriority) {
    this.mpsPriority = mpsPriority;
  }

  public AccessAndMobilitySubscriptionData activeTime(Integer activeTime) {
    this.activeTime = activeTime;
    return this;
  }

  /**
   * Get activeTime
   * @return activeTime
  **/
  @ApiModelProperty(value = "")


  public Integer getActiveTime() {
    return activeTime;
  }

  public void setActiveTime(Integer activeTime) {
    this.activeTime = activeTime;
  }

  public AccessAndMobilitySubscriptionData dlPacketCount(Integer dlPacketCount) {
    this.dlPacketCount = dlPacketCount;
    return this;
  }

  /**
   * Get dlPacketCount
   * @return dlPacketCount
  **/
  @ApiModelProperty(value = "")


  public Integer getDlPacketCount() {
    return dlPacketCount;
  }

  public void setDlPacketCount(Integer dlPacketCount) {
    this.dlPacketCount = dlPacketCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessAndMobilitySubscriptionData accessAndMobilitySubscriptionData = (AccessAndMobilitySubscriptionData) o;
    return Objects.equals(this.supportedFeatures, accessAndMobilitySubscriptionData.supportedFeatures) &&
        Objects.equals(this.gpsis, accessAndMobilitySubscriptionData.gpsis) &&
        Objects.equals(this.internalGroupIds, accessAndMobilitySubscriptionData.internalGroupIds) &&
        Objects.equals(this.subscribedUeAmbr, accessAndMobilitySubscriptionData.subscribedUeAmbr) &&
        Objects.equals(this.nssai, accessAndMobilitySubscriptionData.nssai) &&
        Objects.equals(this.ratRestrictions, accessAndMobilitySubscriptionData.ratRestrictions) &&
        Objects.equals(this.areaRestrictions, accessAndMobilitySubscriptionData.areaRestrictions) &&
        Objects.equals(this.coreNetworkTypeRestrictions, accessAndMobilitySubscriptionData.coreNetworkTypeRestrictions) &&
        Objects.equals(this.rfspIndex, accessAndMobilitySubscriptionData.rfspIndex) &&
        Objects.equals(this.subsRegTimer, accessAndMobilitySubscriptionData.subsRegTimer) &&
        Objects.equals(this.ueUsageType, accessAndMobilitySubscriptionData.ueUsageType) &&
        Objects.equals(this.ladnInformation, accessAndMobilitySubscriptionData.ladnInformation) &&
        Objects.equals(this.mpsPriority, accessAndMobilitySubscriptionData.mpsPriority) &&
        Objects.equals(this.activeTime, accessAndMobilitySubscriptionData.activeTime) &&
        Objects.equals(this.dlPacketCount, accessAndMobilitySubscriptionData.dlPacketCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedFeatures, gpsis, internalGroupIds, subscribedUeAmbr, nssai, ratRestrictions, areaRestrictions, coreNetworkTypeRestrictions, rfspIndex, subsRegTimer, ueUsageType, ladnInformation, mpsPriority, activeTime, dlPacketCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessAndMobilitySubscriptionData {\n");
    
    sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
    sb.append("    gpsis: ").append(toIndentedString(gpsis)).append("\n");
    sb.append("    internalGroupIds: ").append(toIndentedString(internalGroupIds)).append("\n");
    sb.append("    subscribedUeAmbr: ").append(toIndentedString(subscribedUeAmbr)).append("\n");
    sb.append("    nssai: ").append(toIndentedString(nssai)).append("\n");
    sb.append("    ratRestrictions: ").append(toIndentedString(ratRestrictions)).append("\n");
    sb.append("    areaRestrictions: ").append(toIndentedString(areaRestrictions)).append("\n");
    sb.append("    coreNetworkTypeRestrictions: ").append(toIndentedString(coreNetworkTypeRestrictions)).append("\n");
    sb.append("    rfspIndex: ").append(toIndentedString(rfspIndex)).append("\n");
    sb.append("    subsRegTimer: ").append(toIndentedString(subsRegTimer)).append("\n");
    sb.append("    ueUsageType: ").append(toIndentedString(ueUsageType)).append("\n");
    sb.append("    ladnInformation: ").append(toIndentedString(ladnInformation)).append("\n");
    sb.append("    mpsPriority: ").append(toIndentedString(mpsPriority)).append("\n");
    sb.append("    activeTime: ").append(toIndentedString(activeTime)).append("\n");
    sb.append("    dlPacketCount: ").append(toIndentedString(dlPacketCount)).append("\n");
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

