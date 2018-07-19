package com.carrey.v7mc.mapperInterface;

import com.carrey.v7mc.po.V7Salary;
import com.carrey.v7mc.po.V7SalaryExample;
import com.carrey.v7mc.queryVo.SalaryQvo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface V7SalaryMapper {
    int countByExample(V7SalaryExample example);

    int deleteByExample(V7SalaryExample example);

    int deleteByPrimaryKey(String id);

    int insert(V7Salary record);

    int insertSelective(V7Salary record);

    List<V7Salary> selectByExample(V7SalaryExample example);

    V7Salary selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") V7Salary record, @Param("example") V7SalaryExample example);

    int updateByExample(@Param("record") V7Salary record, @Param("example") V7SalaryExample example);

    int updateByPrimaryKeySelective(V7Salary record);

    int updateByPrimaryKey(V7Salary record);

	int getTotalAmount(SalaryQvo queryVo);

	List<V7Salary> getPageData(SalaryQvo queryVo);

	void addData(List<V7Salary> salaryList);
}