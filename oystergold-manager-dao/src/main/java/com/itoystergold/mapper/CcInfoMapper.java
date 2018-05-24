package com.itoystergold.mapper;

import com.itoystergold.pojo.CcInfo;
import com.itoystergold.pojo.CcInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CcInfoMapper {
    int countByExample(CcInfoExample example);

    int deleteByExample(CcInfoExample example);

    int deleteByPrimaryKey(String cid);

    int insert(CcInfo record);

    int insertSelective(CcInfo record);

    List<CcInfo> selectByExample(CcInfoExample example);

    CcInfo selectByPrimaryKey(String cid);

    int updateByExampleSelective(@Param("record") CcInfo record, @Param("example") CcInfoExample example);

    int updateByExample(@Param("record") CcInfo record, @Param("example") CcInfoExample example);

    int updateByPrimaryKeySelective(CcInfo record);

    int updateByPrimaryKey(CcInfo record);
}