package com.kievstar.controller;

import com.kievstar.service.MMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ReceiveMMSController {

    @Autowired
    MMSService mmsService;

}
