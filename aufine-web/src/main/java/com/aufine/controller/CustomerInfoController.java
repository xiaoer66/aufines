package com.aufine.controller;

import com.aufine.bean.AjaxResponseBody;
import com.aufine.entity.CustomerInfo;
import com.aufine.service.CustomerInfoService;
import com.aufine.service.impl.CustomerInfoImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Optional;

import static org.springframework.util.ObjectUtils.*;

@RestController
public class CustomerInfoController {
    private final static Logger logger = LoggerFactory.getLogger(CustomerInfoController.class);

    @Autowired
    private CustomerInfoService customerInfoService;

    @RequestMapping(value = "/customer/insertform",method = RequestMethod.POST)
    public AjaxResponseBody insertCustomerInfo(@Valid @ModelAttribute CustomerInfo customerInfo){
        AjaxResponseBody  ajaxResponseBody = new AjaxResponseBody();
        try {
            ajaxResponseBody = customerInfoService.insertCustomer(customerInfo);
            return ajaxResponseBody;
        } catch (Exception e) {
            logger.debug(e.getMessage());
            ajaxResponseBody.setResult(e.getMessage());
            return ajaxResponseBody;
        }

    }





    }

