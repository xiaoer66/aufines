package com.aufine.service;

import com.aufine.bean.AjaxResponseBody;
import com.aufine.entity.CustomerInfo;

import java.util.List;

public interface CustomerInfoService {

    AjaxResponseBody insertCustomer(CustomerInfo customerInfo);

    List<CustomerInfo> customerInfo(String email,String phone);
}
