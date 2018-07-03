package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

@Controller
@RequestMapping("${openapi.uDRDataRepositoryServiceForSubscriberData.base-path:/nudr-dr/v1}")
public class SubscriberDataApiController implements SubscriberDataApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SubscriberDataApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
