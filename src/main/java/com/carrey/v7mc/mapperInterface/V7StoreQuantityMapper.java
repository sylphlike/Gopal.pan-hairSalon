package com.carrey.v7mc.mapperInterface;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.carrey.v7mc.po.V7Product;
import com.carrey.v7mc.po.V7StoreQuantity;
import com.carrey.v7mc.po.V7StoreQuantityExample;
import com.carrey.v7mc.queryVo.StoreQVo;

public interface V7StoreQuantityMapper {
    int countByExample(V7StoreQuantityExample example);

    int deleteByExample(V7StoreQuantityExample example);

    int deleteByPrimaryKey(String id);

    int insert(V7StoreQuantity record);

    int insertSelective(V7StoreQuantity record);

    List<V7StoreQuantity> selectByExample(V7StoreQuantityExample example);

    V7StoreQuantity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") V7StoreQuantity record, @Param("example") V7StoreQuantityExample example);

    int updateByExample(@Param("record") V7StoreQuantity record, @Param("example") V7StoreQuantityExample example);

    int updateByPrimaryKeySelective(V7StoreQuantity record);

    int updateByPrimaryKey(V7StoreQuantity record);

    /**
     * 获取库存表中是否存在该类型产品
     * @param v7Product
     * @return
     */
	V7StoreQuantity selectExistQuantity(V7Product v7Product);

	int getTotalAmount(StoreQVo queryVo);

	List<V7StoreQuantity> getPageData(StoreQVo queryVo);

	/**
	 * 模糊匹配产品信息
	 * @param term
	 * @return
	 */
	List<V7StoreQuantity> selectStoreProduct(String term);

	/**
	 * 获取指定产品的库存量
	 * @param term
	 * @return
	 */
	V7StoreQuantity selectStoreProductCount(String term);

	/**
	 * 定值获取产品信息
	 * @param v7sName
	 * @return
	 */
	V7StoreQuantity selectEqualsStoreProduct(String v7sName);

	/**
	 * 根据产品ID获取库存数据
	 * @param v7rProductid
	 * @return
	 */
	V7StoreQuantity selectByProductId(String v7rProductid);

}