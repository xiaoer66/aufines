package com.aufine.dao;

import com.aufine.entity.CustomerInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * CustomerInfoDAO继承基类
 */
@Mapper
@Repository
public interface CustomerInfoDAO extends MyBatisBaseDao<CustomerInfo, Integer> {

    List<CustomerInfo> selectAllCustomerInfo();

}