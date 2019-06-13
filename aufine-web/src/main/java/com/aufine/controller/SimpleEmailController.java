package com.aufine.controller;

import com.aufine.utils.SendMailText;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleEmailController {

    @RequestMapping("/send/email")

    public void email() {
        SendMailText s = new SendMailText();
        //s.SendEmail();
    }
}
