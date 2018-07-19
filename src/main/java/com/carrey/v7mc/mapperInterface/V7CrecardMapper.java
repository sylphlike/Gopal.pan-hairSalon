package com.carrey.v7mc.mapperInterface;

import com.carrey.v7mc.po.V7Crecard;
import com.carrey.v7mc.po.V7CrecardExample;
import com.carrey.v7mc.queryVo.MemberQVo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface V7CrecardMapper {
    int countByExample(V7CrecardExample example);

    int deleteByExample(V7CrecardExample example);

    int deleteByPrimaryKey(String id);

    int insert(V7Crecard record);

    int insertSelective(V7Crecard record);

    List<V7Crecard> selectByExample(V7CrecardExample example);

    V7Crecard selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") V7Crecard record, @Param("example") V7CrecardExample example);

    int updateByExample(@Param("record") V7Crecard record, @Param("example") V7CrecardExample example);

    int updateByPrimaryKeySelective(V7Crecard record);

    int updateByPrimaryKey(V7Crecard record);

	int getTotalAmount(MemberQVo queryVo);

	List<V7Crecard> getPageData(MemberQVo queryVo);
}