package com.horse.v7mc.mapperInterface;

import com.horse.v7mc.po.V7HandleCard;
import com.horse.v7mc.po.V7HandleCardExample;
import com.horse.v7mc.po.V7RollDayAccounts;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface V7HandleCardMapper {
    int countByExample(V7HandleCardExample example);

    int deleteByExample(V7HandleCardExample example);

    int deleteByPrimaryKey(String id);

    int insert(V7HandleCard record);

    int insertSelective(V7HandleCard record);

    List<V7HandleCard> selectByExample(V7HandleCardExample example);

    V7HandleCard selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") V7HandleCard record, @Param("example") V7HandleCardExample example);

    int updateByExample(@Param("record") V7HandleCard record, @Param("example") V7HandleCardExample example);

    int updateByPrimaryKeySelective(V7HandleCard record);

    int updateByPrimaryKey(V7HandleCard record);

	V7RollDayAccounts rollDay4handle(@Param("startDate")String startStr, @Param("endDate")String endStr);

	/**
	 * 办卡日业绩
	 * @param id
	 * @param strartStr
	 * @param endStr
	 * @return
	 */
	Double tTransResults(@Param("id")String id, @Param("strartStr")String strartStr, @Param("endStr")String endStr);
}