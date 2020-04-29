package com.mct.cisco.status.controller;

import com.webex.mct.CommonWrapper.model.ServerFullStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {

    @RequestMapping("/get")
    public ServerFullStatus getStatus(){
        return new ServerFullStatus();
    }

}
