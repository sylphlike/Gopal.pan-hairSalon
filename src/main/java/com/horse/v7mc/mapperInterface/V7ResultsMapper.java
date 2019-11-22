package com.horse.v7mc.mapperInterface;

import com.horse.v7mc.po.V7Results;
import com.horse.v7mc.po.V7ResultsExample;
import com.horse.v7mc.queryVo.ResultsQVo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface V7ResultsMapper {
    int countByExample(V7ResultsExample example);

    int deleteByExample(V7ResultsExample example);

    int deleteByPrimaryKey(String id);

    int insert(V7Results record);

    int insertSelective(V7Results record);

    List<V7Results> selectByExample(V7ResultsExample example);

    V7Results selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") V7Results record, @Param("example") V7ResultsExample example);

    int updateByExample(@Param("record") V7Results record, @Param("example") V7ResultsExample example);

    int updateByPrimaryKeySelective(V7Results record);

    int updateByPrimaryKey(V7Results record);

	int getTotalAmount(ResultsQVo queryVo);

	List<V7Results> getPageData(ResultsQVo queryVo);

	void addfirstData(List<V7Results> results);

	/**
	 * 获取统计月份中已存在的数据
	 * @param currentDate
	 * @return
	 */
	List<V7Results> searchCurrentMonth(String currentDate);

	/**
	 * 累加每月的业绩
	 * @param reslist
	 */
	void addResultsData(List<V7Results> reslist);

	/**
	 * 月薪水计算调度
	 * @param lastMonth
	 * @return 
	 */
	List<V7Results> monthSalary(String lastMonth);
}