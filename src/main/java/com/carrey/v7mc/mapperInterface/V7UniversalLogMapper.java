package com.carrey.v7mc.mapperInterface;

import com.carrey.v7mc.po.V7UniversalLog;
import com.carrey.v7mc.po.V7UniversalLogExample;
import com.carrey.v7mc.queryVo.UniversalQVo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface V7UniversalLogMapper {
    int countByExample(V7UniversalLogExample example);

    int deleteByExample(V7UniversalLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(V7UniversalLog record);

    int insertSelective(V7UniversalLog record);

    List<V7UniversalLog> selectByExampleWithBLOBs(V7UniversalLogExample example);

    List<V7UniversalLog> selectByExample(V7UniversalLogExample example);

    V7UniversalLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") V7UniversalLog record, @Param("example") V7UniversalLogExample example);

    int updateByExampleWithBLOBs(@Param("record") V7UniversalLog record, @Param("example") V7UniversalLogExample example);

    int updateByExample(@Param("record") V7UniversalLog record, @Param("example") V7UniversalLogExample example);

    int updateByPrimaryKeySelective(V7UniversalLog record);

    int updateByPrimaryKeyWithBLOBs(V7UniversalLog record);

    int updateByPrimaryKey(V7UniversalLog record);

	int getTotalAmount(UniversalQVo queryVo);

	List<V7UniversalLog> getPageData(UniversalQVo queryVo);
}