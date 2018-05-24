package com.itoystergold.mapper;

import com.itoystergold.pojo.RoleUserP;
import com.itoystergold.pojo.RoleUserPExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleUserPMapper {
    int countByExample(RoleUserPExample example);

    int deleteByExample(RoleUserPExample example);

    int insert(RoleUserP record);

    int insertSelective(RoleUserP record);

    List<RoleUserP> selectByExample(RoleUserPExample example);

    int updateByExampleSelective(@Param("record") RoleUserP record, @Param("example") RoleUserPExample example);

    int updateByExample(@Param("record") RoleUserP record, @Param("example") RoleUserPExample example);
}