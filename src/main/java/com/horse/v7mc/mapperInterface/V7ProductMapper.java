package com.horse.v7mc.mapperInterface;

import com.horse.v7mc.po.V7Brand;
import com.horse.v7mc.po.V7Product;
import com.horse.v7mc.po.V7ProductExample;
import com.horse.v7mc.queryVo.ProductQVo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface V7ProductMapper {
    int countByExample(V7ProductExample example);

    int deleteByExample(V7ProductExample example);

    int deleteByPrimaryKey(String id);

    int insert(V7Product record);

    int insertSelective(V7Product record);

    List<V7Product> selectByExample(V7ProductExample example);

    V7Product selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") V7Product record, @Param("example") V7ProductExample example);

    int updateByExample(@Param("record") V7Product record, @Param("example") V7ProductExample example);

    int updateByPrimaryKeySelective(V7Product record);

    int updateByPrimaryKey(V7Product record);

	int getTotalAmount(ProductQVo queryVo);

	List<V7Product> getPageData(ProductQVo queryVo);

	List<V7Brand> search4Ehcache();

	V7Product checkUniqueness(String inName);
}