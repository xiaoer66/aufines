package com.aufine.service.impl;

import com.aufine.dao.UserInfoDAO;
import com.aufine.entity.UserInfo;
import com.aufine.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoDAO userInfoDAO;

    @Override
    public UserInfo getUserInfoByUserName(String userName) {
        return userInfoDAO.getUserInfoByUserName(userName);
    }
}
