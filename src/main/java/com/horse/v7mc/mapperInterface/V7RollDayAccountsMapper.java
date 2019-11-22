package com.horse.v7mc.mapperInterface;

import java.util.Date;
import java.util.List;

import com.horse.v7mc.po.V7RollMonthAccounts;
import org.apache.ibatis.annotations.Param;

import com.horse.v7mc.po.V7RollDayAccounts;
import com.horse.v7mc.po.V7RollDayAccountsExample;
import com.horse.v7mc.queryVo.RollDayAccountsQVo;

public interface V7RollDayAccountsMapper {
    int countByExample(V7RollDayAccountsExample example);

    int deleteByExample(V7RollDayAccountsExample example);

    int deleteByPrimaryKey(String id);

    int insert(V7RollDayAccounts record);

    int insertSelective(V7RollDayAccounts record);

    List<V7RollDayAccounts> selectByExample(V7RollDayAccountsExample example);

    V7RollDayAccounts selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") V7RollDayAccounts record, @Param("example") V7RollDayAccountsExample example);

    int updateByExample(@Param("record") V7RollDayAccounts record, @Param("example") V7RollDayAccountsExample example);

    int updateByPrimaryKeySelective(V7RollDayAccounts record);

    int updateByPrimaryKey(V7RollDayAccounts record);

	int getTotalAmount(RollDayAccountsQVo queryVo);

	List<V7RollDayAccounts> getPageData(RollDayAccountsQVo queryVo);

	Integer queryIsRoll(String isRoll);

	V7RollDayAccounts rollDay4Rec(@Param("startDate") String startDate,@Param("endDate") String endDate);

	V7RollDayAccounts queryChart(Date charDate);

	/**
	 * 月运营数据统计调度
	 * @param lastMonth
	 * @return
	 */
	V7RollMonthAccounts monthAccountsSchedule(String lastMonth);

	V7RollDayAccounts businessReport();
}