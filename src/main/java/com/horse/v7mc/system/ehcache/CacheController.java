package com.horse.v7mc.system.ehcache;

import com.horse.v7mc.common.Constant;
import net.sf.ehcache.Cache;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author carrey(潘林森)
 * @Email 15923508369@163.com 
 * @Date 2015年10月24日下午4:02:58
 * @version v 1.0.1
 * @description 缓存管理
 */
@Controller
@RequestMapping("ehcache")
@SuppressWarnings("all")
public class CacheController {
	private Logger log = Logger.getLogger(CacheController.class);

	/**
	 * 获取系统所有缓存名称，状态，个数
	 * @param model
	 * @return
	 */
	@RequestMapping("/ehcacheList")
	public String cacheList(CacheModel cacheModel, Model model) {

		//获取缓存基本数值
		List<CacheModel> caches = new ArrayList<CacheModel>();
		String[] cacheNameArr = BaseEhcacheManager.getCacheName();
		for (String cacheName : cacheNameArr) {
			CacheModel cache = new CacheModel();
			cache.setCacheName(cacheName);
			cache.setStatus(BaseEhcacheManager.getStatus(cacheName));
			cache.setCacheElementCount(String.valueOf(BaseEhcacheManager.getElementSize(cacheName)));
			cache.setMemoryStoreCount(String.valueOf(BaseEhcacheManager.getElementMemorySize(cacheName)));
			cache.setDiskStoreCount(String.valueOf(BaseEhcacheManager.getElementDiskSize(cacheName)));
			cache.setCacheDataCount(BaseEhcacheManager.getElementDataCount(cacheName));

			caches.add(cache);

		}


		int recordCount = caches.size();
		cacheModel.setRecordCount(recordCount);
		cacheModel.setBeginPageIndex((cacheModel.getCurrentPage() - 1) * cacheModel.getPageSize());
		cacheModel.setEndPageIndex(cacheModel.getCurrentPage() * cacheModel.getPageSize());
		cacheModel.setPageCount((cacheModel.getRecordCount() + cacheModel.getPageSize() - 1) / cacheModel.getPageSize());

		List<CacheModel> cachesResult = new ArrayList<CacheModel>();
		if (cacheModel.getCurrentPage() < cacheModel.getPageCount()) {
			for (int i = cacheModel.getBeginPageIndex(); i < cacheModel.getEndPageIndex(); i++) {
				cachesResult.add(caches.get(i));
			}

		} else {
			for (int i = cacheModel.getBeginPageIndex(); i < caches.size(); i++) {
				cachesResult.add(caches.get(i));
			}

		}

		cacheModel.setRecoredList(cachesResult);
		model.addAttribute(Constant.CONTROlLER_RETURN_ATTRNAME, cacheModel);
		return "system/ehcache-list";
	}

	/**
	 * 刷新指定缓存
	 * @param cacheNames 缓存名称数组
	 * @param model
	 * @return
	 */
	@RequestMapping("/reLoad")
	public String reLoad(String cacheName, Model model) {
	
		Cache cache = BaseEhcacheManager.getCache(cacheName);
		List cacheKey = cache.getKeys();
		// 删除指定缓存名称下的内容
		for (Object key : cacheKey) { cache.remove(key); }
		
	
		/**
		 *重新加载此类缓存 接口级的缓存则需重新调用接口， 数据库级的缓存则重新查询数据库， 文件级别的则重新载入文件
		 * 
		 */
	
		return "redirect:ehcacheList.action";
	}
}
