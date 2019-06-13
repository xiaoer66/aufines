package com.aufine.dao;

import com.aufine.entity.EmailSetting;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * EmailSettingDAO继承基类
 */
@Mapper
@Repository
public interface EmailSettingDAO extends MyBatisBaseDao<EmailSetting, Integer> {
}