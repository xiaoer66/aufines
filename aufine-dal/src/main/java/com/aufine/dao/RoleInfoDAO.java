package com.aufine.dao;

import com.aufine.entity.RoleInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * RoleInfoDAO继承基类
 */
@Mapper
@Repository
public interface RoleInfoDAO extends MyBatisBaseDao<RoleInfo, Integer> {
    List<HashMap<String,Object>> getRoleInfoByUserID(HashMap<String, Object> paramsMap);
}