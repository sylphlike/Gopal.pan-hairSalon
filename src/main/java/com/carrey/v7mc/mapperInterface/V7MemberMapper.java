package com.carrey.v7mc.mapperInterface;

import com.carrey.v7mc.po.V7Member;
import com.carrey.v7mc.po.V7MemberExample;
import com.carrey.v7mc.queryVo.MemberQVo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface V7MemberMapper {
    int countByExample(V7MemberExample example);

    int deleteByExample(V7MemberExample example);

    int deleteByPrimaryKey(String id);

    int insert(V7Member record);

    int insertSelective(V7Member record);

    List<V7Member> selectByExample(V7MemberExample example);

    V7Member selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") V7Member record, @Param("example") V7MemberExample example);

    int updateByExample(@Param("record") V7Member record, @Param("example") V7MemberExample example);

    int updateByPrimaryKeySelective(V7Member record);

    int updateByPrimaryKey(V7Member record);

	int getTotalAmount(MemberQVo queryVo);

	List<V7Member> getPageData(MemberQVo queryVo);

	List<V7Member> searchByCondition(MemberQVo queryVo);

	List<V7Member> selectByKeyMemberCard(String id);

	void updateByKeyMemberStatus(String id,Integer integer);

	void updateByKeyMemberStatus(V7Member v7Member);

	void updateMemberStatus(V7Member member);

	V7Member checkUniqueness(String inName);

	V7Member checkUniquenessPhone(String inName);
	
	
}