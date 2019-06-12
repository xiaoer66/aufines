package com.aufine.dao;

import com.aufine.bean.PermissionRoleBean;
import com.aufine.entity.PermissionInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * PermissionInfoDAO继承基类
 */
@Mapper
@Repository
public interface PermissionInfoDAO extends MyBatisBaseDao<PermissionInfo, Integer> {
    List<PermissionRoleBean> getAllPermission();
}