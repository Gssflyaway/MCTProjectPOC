package com.mct.cisco.statusconsumer.hystrix;

import com.mct.cisco.statusconsumer.feign.StatusService;
import com.webex.mct.CommonWrapper.model.ServerFullStatus;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class StatusFallback implements FallbackFactory<StatusService> {

    @Override
    public StatusService create(Throwable throwable) {
        return () -> {
            ServerFullStatus serverFullStatus = new ServerFullStatus();
            serverFullStatus.setAgentId(1111);
            return serverFullStatus;
        };
    }
}
