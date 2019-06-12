package com.aufine.service.impl;

import com.aufine.bean.PermissionRoleBean;
import com.aufine.dao.PermissionInfoDAO;
import com.aufine.service.PermissionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionInfoServiceImpl implements PermissionInfoService {

    @Autowired
    PermissionInfoDAO permissionInfoDAO;

    @Override
    public  List<PermissionRoleBean> getAllPermission() {
        return permissionInfoDAO.getAllPermission();
    }
}
