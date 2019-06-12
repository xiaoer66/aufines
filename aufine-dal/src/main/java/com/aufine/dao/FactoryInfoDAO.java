package com.aufine.dao;

import com.aufine.entity.FactoryInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * FactoryInfoDAO继承基类
 */
@Mapper
@Repository
public interface FactoryInfoDAO extends MyBatisBaseDao<FactoryInfo, Integer> {
}