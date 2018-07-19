package com.carrey.v7mc.system.ehcache;

import com.carrey.v7mc.common.pageBean.PageBean;



/**
 * 
 * @author 		carrey(潘林森)
 * @Email  		15923508369@163.com
 * @Date   		2015年10月24日下午4:13:33
 * @version		v 1.0.1
 * @description 缓存信息统计对象
 */
public class CacheModel extends PageBean{
	
	//缓存名
	private String cacheName;
	//状态
	private String status;
	//缓存个数
	private String cacheElementCount;
	//缓存个数中总数据量
	private int cacheDataCount;
	//存储在内存中的个数
	private String memoryStoreCount;
	//存储在磁盘中的个数
	private String diskStoreCount;
	
	//查询条件
	private String cacheQueryName;

	
	
	public String getCacheName() {
		return cacheName;
	}

	public void setCacheName(String cacheName) {
		this.cacheName = cacheName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCacheElementCount() {
		return cacheElementCount;
	}

	public void setCacheElementCount(String cacheElementCount) {
		this.cacheElementCount = cacheElementCount;
	}

	
	public int getCacheDataCount() {
		return cacheDataCount;
	}

	public void setCacheDataCount(int cacheDataCount) {
		this.cacheDataCount = cacheDataCount;
	}

	public String getMemoryStoreCount() {
		return memoryStoreCount;
	}

	public void setMemoryStoreCount(String memoryStoreCount) {
		this.memoryStoreCount = memoryStoreCount;
	}

	public String getDiskStoreCount() {
		return diskStoreCount;
	}

	public void setDiskStoreCount(String diskStoreCount) {
		this.diskStoreCount = diskStoreCount;
	}

	public String getCacheQueryName() {
		return cacheQueryName;
	}

	public void setCacheQueryName(String cacheQueryName) {
		this.cacheQueryName = cacheQueryName;
	}
	
	
	
	

}
