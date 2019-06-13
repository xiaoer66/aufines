package com.aufine.service;

import com.aufine.bean.AjaxResponseBody;
import com.aufine.entity.CustomerInfo;

import java.util.List;

public interface CustomerInfoService {

    /**
     * contact模块将表单插入数据
     * @param customerInfo
     * @return
     */
    AjaxResponseBody insertCustomer(CustomerInfo customerInfo);

    /**
     * 查询所有的customer信息
     * @return
     */
    List<CustomerInfo> selectAllCustomerInfo();

}
