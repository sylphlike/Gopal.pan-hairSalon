package com.horse.v7mc.mapperInterface;

import java.util.List;

import com.horse.v7mc.po.V7StoreOutExample;
import org.apache.ibatis.annotations.Param;

import com.horse.v7mc.po.V7StoreOut;
import com.horse.v7mc.queryVo.StoreQVo;

public interface V7StoreOutMapper {
    int countByExample(V7StoreOutExample example);

    int deleteByExample(V7StoreOutExample example);

    int deleteByPrimaryKey(String id);

    int insert(V7StoreOut record);

    int insertSelective(V7StoreOut record);

    List<V7StoreOut> selectByExampleWithBLOBs(V7StoreOutExample example);

    List<V7StoreOut> selectByExample(V7StoreOutExample example);

    V7StoreOut selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") V7StoreOut record, @Param("example") V7StoreOutExample example);

    int updateByExampleWithBLOBs(@Param("record") V7StoreOut record, @Param("example") V7StoreOutExample example);

    int updateByExample(@Param("record") V7StoreOut record, @Param("example") V7StoreOutExample example);

    int updateByPrimaryKeySelective(V7StoreOut record);

    int updateByPrimaryKeyWithBLOBs(V7StoreOut record);

    int updateByPrimaryKey(V7StoreOut record);

	int getTotalAmount(StoreQVo queryVo);

	List<V7StoreOut> getPageData(StoreQVo queryVo);

	List<V7StoreOut> productReport(@Param("startTime")String startTime, @Param("endTime")String endTime);
}