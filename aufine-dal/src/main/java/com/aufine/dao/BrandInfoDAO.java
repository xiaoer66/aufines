package com.aufine.dao;

import com.aufine.entity.BrandInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * BrandInfoDAO继承基类
 */
@Mapper
@Repository
public interface BrandInfoDAO extends MyBatisBaseDao<BrandInfo, Integer> {
}