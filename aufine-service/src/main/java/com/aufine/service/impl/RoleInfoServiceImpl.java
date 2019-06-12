package com.aufine.service.impl;

import com.aufine.dao.RoleInfoDAO;
import com.aufine.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class RoleInfoServiceImpl implements RoleInfoService {
    @Autowired
    RoleInfoDAO roleInfoDAO;

    @Override
    public List<HashMap<String,Object>> getRoleInfoByUserID(HashMap<String,Object> paramsMap) {
        return roleInfoDAO.getRoleInfoByUserID(paramsMap);
    }
}
