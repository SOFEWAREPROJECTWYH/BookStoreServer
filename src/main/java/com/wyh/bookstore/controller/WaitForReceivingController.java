package com.wyh.bookstore.controller;

import com.wyh.bookstore.entity.ToSend;
import com.wyh.bookstore.entity.WaitForReceiving;
import com.wyh.bookstore.service.ToSendService;
import com.wyh.bookstore.service.WaitForReceivingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@ResponseBody
@RestController
public class WaitForReceivingController {
    @Autowired
    private WaitForReceivingService waitForReceivingService;
    @RequestMapping(value = "/waitforreceiving",method = RequestMethod.GET)
    public List<WaitForReceiving> getToSendInfo(){
        List<WaitForReceiving> waitForReceivingList =waitForReceivingService.getWaitForReceivingInfo();
        return waitForReceivingList;
    }
}
