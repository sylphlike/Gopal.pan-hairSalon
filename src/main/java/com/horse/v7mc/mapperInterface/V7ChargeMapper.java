package com.horse.v7mc.mapperInterface;

import java.util.List;

import com.horse.v7mc.po.V7ChargeExample;
import org.apache.ibatis.annotations.Param;

import com.horse.v7mc.po.V7Charge;
import com.horse.v7mc.queryVo.ChargeQVo;

public interface V7ChargeMapper {
    int countByExample(V7ChargeExample example);

    int deleteByExample(V7ChargeExample example);

    int deleteByPrimaryKey(String id);

    int insert(V7Charge record);

    int insertSelective(V7Charge record);

    List<V7Charge> selectByExample(V7ChargeExample example);

    V7Charge selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") V7Charge record, @Param("example") V7ChargeExample example);

    int updateByExample(@Param("record") V7Charge record, @Param("example") V7ChargeExample example);

    int updateByPrimaryKeySelective(V7Charge record);

    int updateByPrimaryKey(V7Charge record);

	int getTotalAmount(ChargeQVo queryVo);

	List<V7Charge> getPageData(ChargeQVo queryVo);

	/**
	 * 统计薪水生成月份下员工的扣款金额
	 * @param v7rEid
	 * @param startDay
	 * @param lastDay
	 * @return
	 */
	Double getChargeMoney(@Param("v7EName")String v7EName, @Param("startDay")String startDay, @Param("lastDay")String lastDay);
}