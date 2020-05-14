package com.mct.cisco.statusconsumer.feign;

import com.mct.cisco.statusconsumer.hystrix.StatusFallback;
import com.webex.mct.CommonWrapper.model.ServerFullStatus;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "status", fallbackFactory = StatusFallback.class)
@RequestMapping("/status")
public interface StatusService {

    @RequestMapping("/get")
    ServerFullStatus queryStatus();
}
