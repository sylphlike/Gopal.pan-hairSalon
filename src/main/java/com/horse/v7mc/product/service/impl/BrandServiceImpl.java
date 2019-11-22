package com.horse.v7mc.product.service.impl;

import java.util.Date;
import java.util.List;

import com.horse.v7mc.mapperInterface.V7BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horse.v7mc.common.Constant;
import com.horse.v7mc.common.exception.SysException;
import com.horse.v7mc.po.V7Brand;
import com.horse.v7mc.product.service.BrandService;
import com.horse.v7mc.queryVo.BrandQVo;
import com.horse.v7mc.util.UUIDUtils;

@Service
public class BrandServiceImpl implements BrandService{
	@Autowired
	private V7BrandMapper brandMapper;
	
	
	
	@Override
	public void insert(V7Brand bard) throws SysException {
		bard.setId(UUIDUtils.getUUID());
		bard.setV7BStatus(Constant.GENERAL_TYPE_ENABLE);
		bard.setV7BCrateTime(new Date());
		brandMapper.insert(bard);
	}



	@Override
	public List<V7Brand> getPageData(BrandQVo bardVo) {
		return brandMapper.getPageData(bardVo);
	}



	@Override
	public int getTotalAmount(BrandQVo bardVo) {
	 return brandMapper.getTotalAmount(bardVo);
	}



	@Override
	public V7Brand selectByKey(String id) {
		return brandMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateBrandStatus(V7Brand bard) {
		brandMapper.updateBrandStatus(bard);
	}

	@Override
	public void updateBrand(V7Brand brand) {
		brandMapper.updateByPrimaryKeySelective(brand);
		
	}

	@Override
	public List<V7Brand> search4Ehcache() {
		 return brandMapper.search4Ehcache();
	}



	@Override
	public V7Brand checkUniqueness(String inName) {
		return brandMapper.checkUniqueness(inName);
	}



}
