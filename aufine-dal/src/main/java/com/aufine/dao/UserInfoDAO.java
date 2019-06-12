package com.aufine.dao;

import com.aufine.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * UserInfoDAO继承基类
 */
@Mapper
@Repository
public interface UserInfoDAO extends MyBatisBaseDao<UserInfo, Integer> {
    UserInfo getUserInfoByUserName(String userName);
}