package com.horse.v7mc.mapperInterface;

import com.horse.v7mc.po.V7Card;
import com.horse.v7mc.po.V7CardExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface V7CardMapper {
    int countByExample(V7CardExample example);

    int deleteByExample(V7CardExample example);

    int deleteByPrimaryKey(String id);

    int insert(V7Card record);

    int insertSelective(V7Card record);

    List<V7Card> selectByExample(V7CardExample example);

    V7Card selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") V7Card record, @Param("example") V7CardExample example);

    int updateByExample(@Param("record") V7Card record, @Param("example") V7CardExample example);

    int updateByPrimaryKeySelective(V7Card record);

    int updateByPrimaryKey(V7Card record);
}