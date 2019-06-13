package com.aufine.service.impl;

import com.aufine.bean.AjaxResponseBody;
import com.aufine.dao.CustomerInfoDAO;
import com.aufine.entity.CustomerInfo;
import com.aufine.service.CustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class CustomerInfoImpl implements CustomerInfoService {
    private final static Logger logger = LoggerFactory.getLogger(CustomerInfoImpl.class);

    @Autowired
    private CustomerInfoDAO customerInfoDAO;

    @Override
    public AjaxResponseBody insertCustomer(CustomerInfo customerInfo) {
        AjaxResponseBody ajaxResponseBody = new AjaxResponseBody();
        try {
            customerInfoDAO.insert(customerInfo);
            ajaxResponseBody.setResult("success");
        } catch (Exception e) {
            logger.debug(e.getMessage());
            e.printStackTrace();
            ajaxResponseBody.setResult("failure");
            ajaxResponseBody.setMsg(e.getMessage());
        }
        return ajaxResponseBody;
    }
}
