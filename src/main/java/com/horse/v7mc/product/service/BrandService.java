package com.horse.v7mc.product.service;

import java.util.List;

import com.horse.v7mc.common.exception.SysException;
import com.horse.v7mc.po.V7Brand;
import com.horse.v7mc.queryVo.BrandQVo;

public interface BrandService {
	
	/**
	 * 添加品牌
	 * @param bard
	 * @throws SysException
	 */
	public void insert(V7Brand bard) throws SysException;
	
	/**
	 * 分页
	 * @param bardVo
	 * @return
	 */
	public List<V7Brand> getPageData(BrandQVo bardVo);
	
	
	public int getTotalAmount(BrandQVo bardVo);
	
	/**
	 * 根据id查询品牌
	 * @param id
	 * @return
	 */
	public V7Brand selectByKey(String id);
	
	/**
	 * 更改品牌状态
	 * @param bard
	 */
	public void updateBrandStatus(V7Brand brand);

	/**
	 * 修改品牌
	 * @param brand
	 */
	public void updateBrand(V7Brand brand);

	/**
	 * 供缓存使用
	 * @return
	 */
	public List<V7Brand> search4Ehcache();

	/**
	 * 重复名称校验
	 * @param inName
	 * @return
	 */
	public V7Brand checkUniqueness(String inName);
	
	 
}
