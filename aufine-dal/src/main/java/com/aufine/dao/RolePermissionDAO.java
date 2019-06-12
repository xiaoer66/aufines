package com.aufine.dao;

import com.aufine.entity.RolePermission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * RolePermissionDAO继承基类
 */
@Mapper
@Repository
public interface RolePermissionDAO extends MyBatisBaseDao<RolePermission, Integer> {
}