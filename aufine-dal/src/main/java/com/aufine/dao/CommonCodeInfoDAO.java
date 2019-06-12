package com.aufine.dao;

import com.aufine.entity.CommonCodeInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * CommonCodeInfoDAO继承基类
 */
@Mapper
@Repository
public interface CommonCodeInfoDAO extends MyBatisBaseDao<CommonCodeInfo, Integer> {
}