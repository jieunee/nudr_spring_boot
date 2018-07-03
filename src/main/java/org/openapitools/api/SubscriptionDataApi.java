/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.3).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.AccessAndMobilitySubscriptionData;
import org.openapitools.model.Amf3GppAccessRegistration;
import org.openapitools.model.AmfNon3GppAccessRegistration;
import org.openapitools.model.AuthenticationData;
import org.openapitools.model.EeSubscription;
import java.util.List;
import org.openapitools.model.PatchItem;
import org.openapitools.model.PpData;
import org.openapitools.model.ProblemDetails;
import org.openapitools.model.SdmSubscription;
import org.openapitools.model.SessionManagementSubscriptionData;
import org.openapitools.model.SmfRegList;
import org.openapitools.model.SmfRegistration;
import org.openapitools.model.SmfSelectionSubscriptionData;
import org.openapitools.model.SmsManagementSubscriptionData;
import org.openapitools.model.SmsSubscriptionData;
import org.openapitools.model.SubscriptionDataSubscriptions;
import org.openapitools.model.VarSnssai;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

@Validated
@Api(value = "subscription-data", description = "the subscription-data API")
public interface SubscriptionDataApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "To modify the AMF context data of a UE using 3gpp access in the UDR", nickname = "amfContext3gpp", notes = "", tags={ "AMF 3GPP Access Registration (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response to a valid request"),
        @ApiResponse(code = 403, message = "modification is rejected", response = ProblemDetails.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/context-data/amf-3gpp-access",
        produces = { "application/problem+json" }, 
        consumes = { "application/json-patch+json" },
        method = RequestMethod.PATCH)
    default ResponseEntity<Void> amfContext3gpp(@ApiParam(value = "UE id",required=true) @PathVariable("ueId") String ueId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody List<PatchItem> patchItem) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "To modify the AMF context data of a UE using non 3gpp access in the UDR", nickname = "amfContextNon3gpp", notes = "", tags={ "AMF Non-3GPP Access Registration (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response to a valid request"),
        @ApiResponse(code = 403, message = "modification is rejected", response = ProblemDetails.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/context-data/amf-non-3gpp-access",
        produces = { "application/problem+json" }, 
        consumes = { "application/json-patch+json" },
        method = RequestMethod.PATCH)
    default ResponseEntity<Void> amfContextNon3gpp(@ApiParam(value = "UE id",required=true) @PathVariable("ueId") String ueId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody List<PatchItem> patchItem) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "To store the AMF context data of a UE using 3gpp access in the UDR", nickname = "createAmfContext3gpp", notes = "", tags={ "AMF 3GPP Access Registration (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Upon success, an empty response body shall be returned"),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/context-data/amf-3gpp-access",
        produces = { "application/problem+json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> createAmfContext3gpp(@ApiParam(value = "UE id",required=true) @PathVariable("ueId") String ueId,@ApiParam(value = ""  )  @Valid @RequestBody Amf3GppAccessRegistration amf3GppAccessRegistration) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "To store the AMF context data of a UE using non-3gpp access in the UDR", nickname = "createAmfContextNon3gpp", notes = "", tags={ "AMF Non-3GPP Access Registration (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Upon success, an empty response body shall be returned"),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/context-data/amf-non-3gpp-access",
        produces = { "application/problem+json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> createAmfContextNon3gpp(@ApiParam(value = "UE id",required=true) @PathVariable("ueId") String ueId,@ApiParam(value = ""  )  @Valid @RequestBody AmfNon3GppAccessRegistration amfNon3GppAccessRegistration) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Create individual EE subscription", nickname = "createEeSubscriptions", notes = "", response = EeSubscription.class, tags={ "Event Exposure Subscriptions (Collection)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response to a valid request", response = EeSubscription.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/context-data/ee-subscriptions",
        produces = { "application/json","application/problem+json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<EeSubscription> createEeSubscriptions(@ApiParam(value = "UE ID",required=true) @PathVariable("ueId") String ueId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody EeSubscription eeSubscription) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"monitoringConfiguration\" : {    \"key\" : {      \"reportingOptions\" : { }    }  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Create individual sdm subscription", nickname = "createSdmSubscriptions", notes = "", response = SdmSubscription.class, tags={ "SDM Subscriptions (Collection)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response to a valid request", response = SdmSubscription.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/context-data/sdm-subscriptions",
        produces = { "application/json","application/problem+json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<SdmSubscription> createSdmSubscriptions(@ApiParam(value = "UE ID",required=true) @PathVariable("ueId") String ueId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody SdmSubscription sdmSubscription) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"monitoredResourceUris\" : [ null, null ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "To create an individual SMF context data of a UE in the UDR", nickname = "createSmfContextNon3gpp", notes = "", tags={ "SMF Registration (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Upon success, a response body containing a representation of the created Individual SmfRegistration resource shall be returned"),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/context-data/smf-registrations/{pduSessionId}",
        produces = { "application/problem+json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> createSmfContextNon3gpp(@ApiParam(value = "UE id",required=true) @PathVariable("ueId") String ueId,@ApiParam(value = "PDU session id",required=true) @PathVariable("pduSessionId") Integer pduSessionId,@ApiParam(value = ""  )  @Valid @RequestBody SmfRegistration smfRegistration) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "To remove an individual SMF context data of a UE the UDR", nickname = "deleteSmfContext", notes = "", tags={ "SMF Registration (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Upon success, an empty response body shall be returned."),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/context-data/smf-registrations/{pduSessionId}",
        produces = { "application/problem+json" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteSmfContext(@ApiParam(value = "UE id",required=true) @PathVariable("ueId") String ueId,@ApiParam(value = "PDU session id",required=true) @PathVariable("pduSessionId") String pduSessionId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Read the profile of a given UE", nickname = "getppData", notes = "", response = PpData.class, tags={ "Parameter Provision (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response to a valid request", response = PpData.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ProblemDetails.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/pp-data",
        produces = { "application/json","application/problem+json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<PpData> getppData(@ApiParam(value = "pp data for a UE",required=true) @PathVariable("ueId") String ueId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"communicationCharacteristics\" : {    \"ppSubsRegTimer\" : { },    \"ppActiveTime\" : { }  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "modify the authentication data of a UE", nickname = "modifyAuthData", notes = "", tags={ "Authentication Data (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response to a valid request"),
        @ApiResponse(code = 403, message = "modification is rejected", response = ProblemDetails.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/authentication-data",
        produces = { "application/problem+json" }, 
        consumes = { "application/json-patch+json" },
        method = RequestMethod.PATCH)
    default ResponseEntity<Void> modifyAuthData(@ApiParam(value = "UE id",required=true) @PathVariable("ueId") String ueId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody List<PatchItem> patchItem) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Retrieves the access and mobility subscription data of a UE", nickname = "queryAmData", notes = "", response = AccessAndMobilitySubscriptionData.class, tags={ "Access And Mobility Subscription Data (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response to a valid request", response = AccessAndMobilitySubscriptionData.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/{servingPlmnId}/provisioned-data/am-data",
        produces = { "application/json","application/problem+json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<AccessAndMobilitySubscriptionData> queryAmData(@ApiParam(value = "UE id",required=true) @PathVariable("ueId") String ueId,@ApiParam(value = "PLMN ID",required=true) @PathVariable("servingPlmnId") String servingPlmnId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"subscribedUeAmbr\" : { },  \"coreNetworkTypeRestrictions\" : [ null, null ],  \"areaRestrictions\" : [ {    \"areaInformation\" : {      \"areaCodes\" : [ \"areaCodes\", \"areaCodes\" ],      \"tacs\" : [ null, null ],      \"maxNumderTAs\" : 0    },    \"ratTypes\" : [ null, null ]  }, {    \"areaInformation\" : {      \"areaCodes\" : [ \"areaCodes\", \"areaCodes\" ],      \"tacs\" : [ null, null ],      \"maxNumderTAs\" : 0    },    \"ratTypes\" : [ null, null ]  } ],  \"ladnInformation\" : [ null, null ],  \"nssai\" : {    \"defaultSingleNssais\" : [ {      \"sd\" : \"sd\"    }, {      \"sd\" : \"sd\"    }, {      \"sd\" : \"sd\"    }, {      \"sd\" : \"sd\"    }, {      \"sd\" : \"sd\"    }, {      \"sd\" : \"sd\"    }, {      \"sd\" : \"sd\"    }, {      \"sd\" : \"sd\"    } ],    \"singleNssais\" : [ {      \"sd\" : \"sd\"    }, {      \"sd\" : \"sd\"    } ]  },  \"gpsis\" : [ null, null ],  \"ratRestrictions\" : [ null, null ],  \"internalGroupIds\" : [ null, null ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Retrieves the AMF context data of a UE using 3gpp access", nickname = "queryAmfContext3gpp", notes = "", response = Amf3GppAccessRegistration.class, tags={ "AMF 3GPP Access Registration (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response to a valid request", response = Amf3GppAccessRegistration.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/context-data/amf-3gpp-access",
        produces = { "application/json","application/problem+json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Amf3GppAccessRegistration> queryAmfContext3gpp(@ApiParam(value = "UE id",required=true) @PathVariable("ueId") String ueId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{ }");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Retrieves the AMF context data of a UE using non-3gpp access", nickname = "queryAmfContextNon3gpp", notes = "", response = AmfNon3GppAccessRegistration.class, tags={ "AMF Non-3GPP Access Registration (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response to a valid request", response = AmfNon3GppAccessRegistration.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/context-data/amf-non-3gpp-access",
        produces = { "application/json","application/problem+json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<AmfNon3GppAccessRegistration> queryAmfContextNon3gpp(@ApiParam(value = "UE id",required=true) @PathVariable("ueId") String ueId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{ }");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Retrieves the authentication data of a UE", nickname = "queryAuthData", notes = "", response = AuthenticationData.class, tags={ "Authentication Data (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response to a valid request", response = AuthenticationData.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/authentication-data",
        produces = { "application/json","application/problem+json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<AuthenticationData> queryAuthData(@ApiParam(value = "UE id",required=true) @PathVariable("ueId") String ueId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"sequenceNumber\" : 0,  \"permanentKey\" : \"permanentKey\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Retrieves the Session Management subscription data of a UE", nickname = "querySmData", notes = "", response = SessionManagementSubscriptionData.class, tags={ "Session Management Subscription Data", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response to a valid request", response = SessionManagementSubscriptionData.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{supi}/{servingPlmnId}/provisioned-data/sm-data",
        produces = { "application/json","application/problem+json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<SessionManagementSubscriptionData> querySmData(@ApiParam(value = "SUPI",required=true) @PathVariable("supi") String supi,@ApiParam(value = "PLMN ID",required=true) @PathVariable("servingPlmnId") String servingPlmnId,@ApiParam(value = "single NSSAI") @Valid @RequestParam(value = "singleNssai", required = false) VarSnssai singleNssai,@ApiParam(value = "DNN") @Valid @RequestParam(value = "dnn", required = false) String dnn) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"dnnConfiguration\" : {    \"key\" : {      \"sessionAmbr\" : { },      \"5gQosProfile\" : {        \"arp\" : { }      },      \"sscModes\" : {        \"allowedSscModes\" : [ null, null ]      },      \"pduSessionTypes\" : {        \"allowedSessionTypes\" : [ null, null ]      },      \"staticIpAddress\" : { }    }  },  \"singleNssai\" : {    \"sd\" : \"sd\"  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Retrieves the SMF registration list of a UE", nickname = "querySmfRegList", notes = "", response = SmfRegList.class, tags={ "SMF Registrations (Collection)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response to a valid request", response = SmfRegList.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/context-data/smf-registrations",
        produces = { "application/json","application/problem+json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<SmfRegList> querySmfRegList(@ApiParam(value = "UE id",required=true) @PathVariable("ueId") String ueId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "null");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Retrieves the individual SMF registration of a UE", nickname = "querySmfRegistration", notes = "", response = SmfRegistration.class, tags={ "SMF Registration (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response to a valid request", response = SmfRegistration.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/context-data/smf-registrations/{pduSessionId}",
        produces = { "application/json","application/problem+json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<SmfRegistration> querySmfRegistration(@ApiParam(value = "UE id",required=true) @PathVariable("ueId") String ueId,@ApiParam(value = "PDU session id",required=true) @PathVariable("pduSessionId") String pduSessionId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{ }");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Retrieves the SMF selection subscription data of a UE", nickname = "querySmfSelectData", notes = "", response = SmfSelectionSubscriptionData.class, tags={ "SMF Selection Subscription Data (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response to a valid request", response = SmfSelectionSubscriptionData.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/{servingPlmnId}/provisioned-data/smf-selection-subscription-data",
        produces = { "application/json","application/problem+json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<SmfSelectionSubscriptionData> querySmfSelectData(@ApiParam(value = "UE id",required=true) @PathVariable("ueId") String ueId,@ApiParam(value = "PLMN ID",required=true) @PathVariable("servingPlmnId") String servingPlmnId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"subscribedSnssaiInfo\" : [ {    \"dnnInfos\" : [ { }, { } ],    \"singleNssai\" : {      \"sd\" : \"sd\"    }  }, {    \"dnnInfos\" : [ { }, { } ],    \"singleNssai\" : {      \"sd\" : \"sd\"    }  } ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Retrieves the SMS subscription data of a UE", nickname = "querySmsData", notes = "", response = SmsSubscriptionData.class, tags={ "SMS Subscription Data (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response to a valid request", response = SmsSubscriptionData.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/{servingPlmnId}/provisioned-data/sms-data",
        produces = { "application/json","application/problem+json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<SmsSubscriptionData> querySmsData(@ApiParam(value = "UE id",required=true) @PathVariable("ueId") String ueId,@ApiParam(value = "PLMN ID",required=true) @PathVariable("servingPlmnId") String servingPlmnId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{ }");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Retrieves the SMS management subscription data of a UE", nickname = "querySmsMngData", notes = "", response = SmsManagementSubscriptionData.class, tags={ "SMS Management Subscription Data (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response to a valid request", response = SmsManagementSubscriptionData.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/{servingPlmnId}/provisioned-data/sms-mng-data",
        produces = { "application/json","application/problem+json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<SmsManagementSubscriptionData> querySmsMngData(@ApiParam(value = "UE id",required=true) @PathVariable("ueId") String ueId,@ApiParam(value = "PLMN ID",required=true) @PathVariable("servingPlmnId") String servingPlmnId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"moSmsBarringAll\" : true,  \"mtSmsBarringRoaming\" : true,  \"mtSmsSubscribed\" : true,  \"moSmsBarringRoaming\" : true,  \"mtSmsBarringAll\" : true,  \"moSmsSubscribed\" : true}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Retrieves the ee subscriptions of a UE", nickname = "queryeesubscriptions", notes = "", response = EeSubscription.class, responseContainer = "List", tags={ "Event Exposure Subscriptions (Collection)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response to a valid request", response = EeSubscription.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/context-data/ee-subscriptions",
        produces = { "application/json","application/problem+json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<EeSubscription>> queryeesubscriptions(@ApiParam(value = "UE id",required=true) @PathVariable("ueId") String ueId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"monitoringConfiguration\" : {    \"key\" : {      \"reportingOptions\" : { }    }  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Retrieves the sdm subscriptions of a UE", nickname = "querysdmsubscriptions", notes = "", response = SdmSubscription.class, responseContainer = "List", tags={ "SDM Subscriptions (Collection)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response to a valid request", response = SdmSubscription.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/context-data/sdm-subscriptions",
        produces = { "application/json","application/problem+json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<SdmSubscription>> querysdmsubscriptions(@ApiParam(value = "UE id",required=true) @PathVariable("ueId") String ueId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"monitoredResourceUris\" : [ null, null ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Deletes a eeSubscription", nickname = "removeeeSubscriptions", notes = "", tags={ "Event Exposure Subscription (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response to a successful subscription removal") })
    @RequestMapping(value = "/subscription-data/{ueId}/context-data/ee-subscriptions/{subsId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> removeeeSubscriptions(@ApiParam(value = "",required=true) @PathVariable("ueId") String ueId,@ApiParam(value = "Unique ID of the subscription to remove",required=true) @PathVariable("subsId") String subsId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Deletes a sdmsubscriptions", nickname = "removesdmSubscriptions", notes = "", tags={ "SDM Subscription (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response to a successful subscription removal") })
    @RequestMapping(value = "/subscription-data/{ueId}/context-data/sdm-subscriptions/{subsId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> removesdmSubscriptions(@ApiParam(value = "",required=true) @PathVariable("ueId") String ueId,@ApiParam(value = "Unique ID of the subscription to remove",required=true) @PathVariable("subsId") String subsId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Deletes a subscriptionDataSubscriptions", nickname = "removesubscriptionDataSubscriptions", notes = "", tags={ "Subs To Notify (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response to a successful subscription removal") })
    @RequestMapping(value = "/subscription-data/subs-to-Notify/{subsId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> removesubscriptionDataSubscriptions(@ApiParam(value = "Unique ID of the subscription to remove",required=true) @PathVariable("subsId") String subsId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Subscription data subscriptions", nickname = "subscriptionDataSubscriptions", notes = "", response = SubscriptionDataSubscriptions.class, tags={ "Subs To Nofify (Collection)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response to a valid request", response = SubscriptionDataSubscriptions.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/subs-to-notify",
        produces = { "application/json","application/problem+json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<SubscriptionDataSubscriptions> subscriptionDataSubscriptions(@ApiParam(value = "UE ID",required=true) @PathVariable("ueId") String ueId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody SubscriptionDataSubscriptions subscriptionDataSubscriptions) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"ueId\" : \"ueId\",  \"monitoredResourceUri\" : [ null, null ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Stores an individual ee subscriptions of a UE", nickname = "updateEesubscriptions", notes = "", tags={ "Event Exposure Subscription (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Upon success, an empty response body shall be returned"),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/context-data/ee-subscriptions/{subsId}",
        produces = { "application/problem+json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> updateEesubscriptions(@ApiParam(value = "",required=true) @PathVariable("ueId") String ueId,@ApiParam(value = "",required=true) @PathVariable("subsId") String subsId,@ApiParam(value = ""  )  @Valid @RequestBody EeSubscription eeSubscription) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Stores an individual sdm subscriptions of a UE", nickname = "updatesdmsubscriptions", notes = "", tags={ "SDM Subscription (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Upon success, an empty response body shall be returned"),
        @ApiResponse(code = 200, message = "Unexpected error", response = ProblemDetails.class) })
    @RequestMapping(value = "/subscription-data/{ueId}/context-data/sdm-subscriptions/{subsId}",
        produces = { "application/problem+json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> updatesdmsubscriptions(@ApiParam(value = "",required=true) @PathVariable("ueId") String ueId,@ApiParam(value = "",required=true) @PathVariable("subsId") String subsId,@ApiParam(value = ""  )  @Valid @RequestBody SdmSubscription sdmSubscription) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
