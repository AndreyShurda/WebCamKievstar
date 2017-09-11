package com.kievstar.controller;

import com.kievstar.service.SMSService;
import com.kievstar.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SendSMSController {

    @Autowired
    SMSService smsService;

    @Autowired
    SubscriberService subscriberService;

}
