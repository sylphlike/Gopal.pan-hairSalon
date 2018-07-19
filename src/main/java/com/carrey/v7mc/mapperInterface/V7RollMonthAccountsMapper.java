package com.carrey.v7mc.mapperInterface;

import com.carrey.v7mc.po.V7RollMonthAccounts;
import com.carrey.v7mc.po.V7RollMonthAccountsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface V7RollMonthAccountsMapper {
    int countByExample(V7RollMonthAccountsExample example);

    int deleteByExample(V7RollMonthAccountsExample example);

    int deleteByPrimaryKey(String id);

    int insert(V7RollMonthAccounts record);

    int insertSelective(V7RollMonthAccounts record);

    List<V7RollMonthAccounts> selectByExample(V7RollMonthAccountsExample example);

    V7RollMonthAccounts selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") V7RollMonthAccounts record, @Param("example") V7RollMonthAccountsExample example);

    int updateByExample(@Param("record") V7RollMonthAccounts record, @Param("example") V7RollMonthAccountsExample example);

    int updateByPrimaryKeySelective(V7RollMonthAccounts record);

    int updateByPrimaryKey(V7RollMonthAccounts record);

	V7RollMonthAccounts queryChart(String searchDate);
}