package com.horse.v7mc.mapperInterface;

import java.util.List;

import com.horse.v7mc.po.V7Reception;
import org.apache.ibatis.annotations.Param;

import com.horse.v7mc.queryVo.CashierQVo;

public interface V7ReceptionMapper {

    int deleteByPrimaryKey(String id);

    int insert(V7Reception record);

    int insertSelective(V7Reception record);


    V7Reception selectByPrimaryKey(String id);


    int updateByPrimaryKeySelective(V7Reception record);

    int updateByPrimaryKey(V7Reception record);

	int getTotalAmount(CashierQVo queryVo);

	List<V7Reception> getPageData(CashierQVo queryVo);

	/**
	 * 项目业绩日统计
	 * @param id
	 * @param currentDate
	 * @param positionNum
	 * @return
	 */
	Double busResults(@Param("id")String id,  @Param("positionNum")int positionNum, 
			@Param("strartStr")String strartStr,@Param("endStr")String endStr);

	/**
	 * 洗剪吹卡业绩次数
	 * @param id
	 * @param positionNum
	 * @param strartStr
	 * @param endStr
	 * @return
	 */
	Integer blowcutwash(@Param("id")String id,  @Param("positionNum")int positionNum, 
			@Param("strartStr")String strartStr,@Param("endStr")String endStr);

	/**
	 * 洗吹卡业绩次数
	 * @param id
	 * @param positionNum
	 * @param strartStr
	 * @param endStr
	 * @return
	 */
	Integer blowwash(@Param("id")String id,  @Param("positionNum")int positionNum, 
			@Param("strartStr")String strartStr,@Param("endStr")String endStr);

	/**
	 * 外卖业绩
	 * @param id
	 * @param strartStr
	 * @param endStr
	 * @return
	 */
	Double outResults(@Param("id")String id,@Param("strartStr")String strartStr,@Param("endStr")String endStr);

	/**
	 * 加价产品业绩
	 * @param id
	 * @param positionNum
	 * @param strartStr
	 * @param endStr
	 * @return
	 */
	Double raiseResults(@Param("id")String id,  @Param("positionNum")int positionNum, 
			@Param("strartStr")String strartStr,@Param("endStr")String endStr);
	
}