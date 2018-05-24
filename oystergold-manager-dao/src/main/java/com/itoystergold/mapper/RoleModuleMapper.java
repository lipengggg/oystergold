package com.itoystergold.mapper;

import com.itoystergold.pojo.RoleModule;
import com.itoystergold.pojo.RoleModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleModuleMapper {
    int countByExample(RoleModuleExample example);

    int deleteByExample(RoleModuleExample example);

    int insert(RoleModule record);

    int insertSelective(RoleModule record);

    List<RoleModule> selectByExample(RoleModuleExample example);

    int updateByExampleSelective(@Param("record") RoleModule record, @Param("example") RoleModuleExample example);

    int updateByExample(@Param("record") RoleModule record, @Param("example") RoleModuleExample example);
}