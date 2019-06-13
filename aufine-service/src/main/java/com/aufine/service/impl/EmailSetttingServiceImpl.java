package com.aufine.service.impl;


import com.aufine.dao.EmailSettingDAO;
import com.aufine.entity.EmailSetting;
import com.aufine.service.EmailSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSetttingServiceImpl implements EmailSettingService {

    @Autowired
    private EmailSettingDAO emailSettingDAO;

    @Override
    public EmailSetting getEmailSetting(Integer id) {
        return emailSettingDAO.selectByPrimaryKey(id);
    }
}
