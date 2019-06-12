package com.aufine.dao;

import com.aufine.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * UserRoleDAO继承基类
 */
@Mapper
@Repository
public interface UserRoleDAO extends MyBatisBaseDao<UserRole, Integer> {
}