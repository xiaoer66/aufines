package com.aufine.dao;

import com.aufine.entity.SeriesInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * SeriesInfoDAO继承基类
 */
@Mapper
@Repository
public interface SeriesInfoDAO extends MyBatisBaseDao<SeriesInfo, SeriesInfo> {
}