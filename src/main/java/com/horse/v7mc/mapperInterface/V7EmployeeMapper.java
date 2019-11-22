package com.horse.v7mc.mapperInterface;

import java.util.List;

import com.horse.v7mc.po.V7Employee;
import org.apache.ibatis.annotations.Param;

import com.horse.v7mc.po.V7EmployeeExample;
import com.horse.v7mc.queryVo.EmployeeQVo;

public interface V7EmployeeMapper {
    int countByExample(V7EmployeeExample example);

    int deleteByExample(V7EmployeeExample example);

    int deleteByPrimaryKey(String id);

    int insert(V7Employee record);

    int insertSelective(V7Employee record);

    List<V7Employee> selectByExample(V7EmployeeExample example);

    V7Employee selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") V7Employee record, @Param("example") V7EmployeeExample example);

    int updateByExample(@Param("record") V7Employee record, @Param("example") V7EmployeeExample example);

    int updateByPrimaryKeySelective(V7Employee record);

    int updateByPrimaryKey(V7Employee record);

	int getTotalAmount(EmployeeQVo queryVo);

	List<V7Employee> getPageData(EmployeeQVo queryVo);

	V7Employee loginIn(V7Employee employee);

	List<V7Employee> search4Ehcache();

	V7Employee checkUniqueness(String inName);

	List<V7Employee> search4Results();

	V7Employee checkUniquenessPhone(String inName);
}