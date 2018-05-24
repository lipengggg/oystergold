package com.itoystergold.mapper;

import com.itoystergold.pojo.AccountRevenue;
import com.itoystergold.pojo.AccountRevenueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountRevenueMapper {
    int countByExample(AccountRevenueExample example);

    int deleteByExample(AccountRevenueExample example);

    int deleteByPrimaryKey(String aid);

    int insert(AccountRevenue record);

    int insertSelective(AccountRevenue record);

    List<AccountRevenue> selectByExample(AccountRevenueExample example);

    AccountRevenue selectByPrimaryKey(String aid);

    int updateByExampleSelective(@Param("record") AccountRevenue record, @Param("example") AccountRevenueExample example);

    int updateByExample(@Param("record") AccountRevenue record, @Param("example") AccountRevenueExample example);

    int updateByPrimaryKeySelective(AccountRevenue record);

    int updateByPrimaryKey(AccountRevenue record);
}