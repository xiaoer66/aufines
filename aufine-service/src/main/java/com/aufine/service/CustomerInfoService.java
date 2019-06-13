package com.aufine.service;

import com.aufine.bean.AjaxResponseBody;
import com.aufine.entity.CustomerInfo;

public interface CustomerInfoService {

    AjaxResponseBody insertCustomer(CustomerInfo customerInfo);
}
