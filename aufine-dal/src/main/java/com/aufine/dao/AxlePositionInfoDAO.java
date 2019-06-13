package com.aufine.dao;

import com.aufine.entity.AxlePositionInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * AxlePositionInfoDAO继承基类
 */
@Mapper
@Repository
public interface AxlePositionInfoDAO extends MyBatisBaseDao<AxlePositionInfo, Integer> {
}