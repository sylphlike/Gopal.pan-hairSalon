package com.carrey.v7mc.mapperInterface;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.carrey.v7mc.po.V7Brand;
import com.carrey.v7mc.po.V7BrandExample;
import com.carrey.v7mc.po.V7Employee;
import com.carrey.v7mc.queryVo.BrandQVo;

public interface V7BrandMapper {
    int countByExample(V7BrandExample example);

    int deleteByExample(V7BrandExample example);

    int deleteByPrimaryKey(String id);

    int insert(V7Brand record);

    int insertSelective(V7Brand record);

    List<V7Brand> selectByExample(V7BrandExample example);

    V7Brand selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") V7Brand record, @Param("example") V7BrandExample example);

    int updateByExample(@Param("record") V7Brand record, @Param("example") V7BrandExample example);

    int updateByPrimaryKeySelective(V7Brand record);

    int updateByPrimaryKey(V7Brand record);
    
    int getTotalAmount(BrandQVo bardVo);
    
    List<V7Brand> getPageData(BrandQVo bardVo);
    
	void updateBrandStatus(V7Brand record);

	List<V7Brand> search4Ehcache();

	V7Brand checkUniqueness(String inName);
}