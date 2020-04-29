package com.mct.cisco.statusconsumer.controller;

import com.mct.cisco.statusconsumer.feign.StatusService;
import com.webex.mct.CommonWrapper.model.ServerFullStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class StatusController {

    @Autowired
    private StatusService statusService;

    @RequestMapping("/status")
    public ServerFullStatus getFullStatus() {
        return statusService.queryStatus();
    }
}
