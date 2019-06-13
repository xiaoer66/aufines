package com.aufine.dao;

import com.aufine.entity.AttachmentInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * AttachmentInfoDAO继承基类
 */
@Mapper
@Repository
public interface AttachmentInfoDAO extends MyBatisBaseDao<AttachmentInfo, Integer> {
}