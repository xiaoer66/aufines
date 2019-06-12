package com.aufine.dao;

import com.aufine.entity.TyreInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * TyreInfoDAO继承基类
 */
@Mapper
@Repository
public interface TyreInfoDAO extends MyBatisBaseDao<TyreInfo, Integer> {
}