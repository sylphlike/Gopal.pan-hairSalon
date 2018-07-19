package com.carrey.v7mc.mapperInterface;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.carrey.v7mc.po.V7StoreIn;
import com.carrey.v7mc.po.V7StoreInExample;
import com.carrey.v7mc.po.V7StoreOut;
import com.carrey.v7mc.queryVo.StoreQVo;

public interface V7StoreInMapper {
    int countByExample(V7StoreInExample example);

    int deleteByExample(V7StoreInExample example);

    int deleteByPrimaryKey(String id);

    int insert(V7StoreIn record);

    int insertSelective(V7StoreIn record);

    List<V7StoreIn> selectByExampleWithBLOBs(V7StoreInExample example);

    List<V7StoreIn> selectByExample(V7StoreInExample example);

    V7StoreIn selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") V7StoreIn record, @Param("example") V7StoreInExample example);

    int updateByExampleWithBLOBs(@Param("record") V7StoreIn record, @Param("example") V7StoreInExample example);

    int updateByExample(@Param("record") V7StoreIn record, @Param("example") V7StoreInExample example);

    int updateByPrimaryKeySelective(V7StoreIn record);

    int updateByPrimaryKeyWithBLOBs(V7StoreIn record);

    int updateByPrimaryKey(V7StoreIn record);

	int getTotalAmount(StoreQVo queryVo);

	List<V7StoreIn> getPageData(StoreQVo queryVo);

	/**
	 * 获取历史入库最高价格
	 * @param id
	 * @return
	 */
	double selectMaxInPrice(String id);

	List<V7StoreIn> productReport(@Param("startTime")String startTime, @Param("endTime")String endTime);
}