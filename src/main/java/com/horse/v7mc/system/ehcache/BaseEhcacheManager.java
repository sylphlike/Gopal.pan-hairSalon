package com.horse.v7mc.system.ehcache;

import com.horse.v7mc.common.Constant;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheException;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import org.apache.log4j.Logger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * 
 * @author 		carrey(潘林森)
 * @Email  		15923508369@163.com / panlinsen@ultrapower.com.cn
 * @Date   		2015年10月19日上午9:53:49
 * @version		v 1.0.1
 * @description Ehcache 缓存管理总类
 */
@SuppressWarnings("all")
public class BaseEhcacheManager {

	private static Logger log  = Logger.getLogger(BaseEhcacheManager.class);
	private static CacheManager cacheManager;
	
	static{
		try{
	        if(cacheManager==null)  
	        	//使用默认配置文件创建CacheManager 此文件应在 资源包根路径下 本工程在 config/ehcache.xml 
	        	cacheManager = CacheManager.create();
		}catch(CacheException e){
			log.info("初始化缓存管理失败。。。");
		}
	}
	
	/**
	 * 给指定缓存添加Element
	 * @param cacheName
	 * @param key
	 * @param value
	 */
	public static void put(String cacheName, Serializable key, Serializable value) {
		Cache cache = getCache(cacheName);
	
		if(cache!=null){
			try {   
                cache.remove(key);   
                Element elem = new Element(key, value);   
                cache.put(elem);   
            } catch (Exception e) {   
            	log.info("添加缓存("+cacheName+") of "+key+" 失败！");
            }   
		}else {
			log.info("缓存中不存在名称为："+cacheName+"的缓存，请核查缓存配置文件！");
		}
	}   
    
	/**
	 * 给指定缓存添加Element
	 * @param cacheName
	 * @param key
	 * @param value
	 */
	public static void put(String cacheName, Object key, Object value) {
		Cache cache = getCache(cacheName);
		if(cache!=null){
			try {   
                cache.remove(key);   
                Element elem = new Element(key, value);   
                cache.put(elem);   
            } catch (Exception e) {   
            	log.info("添加缓存("+cacheName+") of "+key+" 失败！");
            }   
		}else {
			log.info("缓存中不存在名称为："+cacheName+"的缓存，请核查缓存配置文件！");
		}
	}
	
	/**  
     * 从缓存中获取元素  
     * @param cachename  
     * @param key  
     * @return  
     */  
    public static Serializable get(String cachename, Serializable key){   
        Cache cache = getCache(cachename);   
        if(cache!=null){
            try {   
                Element element = cache.get(key);   
                if(element!=null && !cache.isExpired(element))// isExpired 是否过期
                    return element.getValue();   
            } catch (Exception e) {   
            	log.info("获取缓存("+cachename+") of "+key+" 失败！");
            }   
        } else{
        	log.info("缓存中不存在名称为："+cachename+"的缓存，请核查缓存配置文件！");
        } 
        return null;   
    }   
    
	/**
	 * 从缓存中获取元素
	 * @param cacheName
	 * @param key
	 * @return
	 */
	public static Object get(String cacheName, Object key) {
		Cache cache = getCache(cacheName);
		if(cache!=null){
			try{
				Element element = cache.get(key);
				if(element!=null && !cache.isExpired(element))
					return element.getObjectValue();
			}catch(Exception e){
				log.info("获取缓存("+cacheName+") of "+key+" 失败！");
			}
		}
		return null;
	}
       
	/**
	 * 删除指定缓存
	 * @param cacheName
	 */
	public static void removeCache(String cacheName){
		if(cacheManager!=null)
			cacheManager.removeCache(cacheName);
	}
	
	/**
	 * 删除缓存中指定的Element
	 * @param cacheName
	 * @param object
	 * @throws CacheException
	 */
	public static void removeElement(String cacheName, Object object) throws CacheException {
		Cache cache = getCache(cacheName);
		if(cache!=null)
			cache.remove(object);
	} 
	
	/**
	 * 获取缓存集合
	 * @return
	 */
	public static String[] getCacheName(){
		if(cacheManager!=null){
			return cacheManager.getCacheNames();
		}else{ 
			return null;
		}
	}
	

	
	/**
	 * 指定名称是否被缓存
	 * @param cacheName
	 * @return
	 */
	public static  boolean isCached(String cacheName) {
		boolean flag = true;
		Cache cache = getCache(cacheName);
		if(cache == null || cache.getKeys().size() == 0){
			flag = false;
		}
		return flag;
	}
	
    /**
	 * 获取指定名称的缓存
	 * @param cachename
	 * @return
	 * @throws IllegalStateException
	 */
	public static Cache getCache(String cachename) throws IllegalStateException{
		if(cacheManager!=null){
			return cacheManager.getCache(cachename);
		}else{
			return null;
		}
	}
	
	/**
	 * 获取指定缓存Element集合
	 * @param cacheName
	 * @return
	 * @throws CacheException
	 */
	public static List getAllElementByCacheName(String cacheName) throws CacheException{
		Cache cache = cacheManager.getCache(cacheName);
		List<String> keys = cache.getKeys();
		List list = new ArrayList();
		for (String key : keys) {
			list.add(get(cacheName, key));
		}
		return list;
	}
	
	
	/**  
     * 获取缓存名下的所有数据总数，根据缓存名获取
     * @param cachename  
     * @param key  
     * @return  
     */  
    public static int getElementDataCount(String cachename){ 
    	int tempCount = 0;
    	Cache cache = getCache(cachename); 
    	List keys = cache.getKeys();
    	if(cachename.equals(Constant.EHC_UNIVERSALLOG_NAME) || cachename.equals(Constant.EHC_GLOBAL_CARD_DISCOUNT)
    			|| cachename.equals(Constant.EHC_GLOBAL_HAIRCUTTRT_PRICE)){
    		//统一日志 , 卡折扣,发型师洗吹、剪发价格配置
	        for (int i = 0; i < keys.size(); i++) {
	        	 Element element = cache.get(keys.get(i));   
	        	 if(element!=null && !cache.isExpired(element)) {
					Map<String, String>  temp = (Map<String, String>) element.getValue();
					Set<String> keySet = temp.keySet();
					tempCount += keySet.size();
				}   
			}
    	} else {
    		//系统全局缓存 (员工数据,品牌数据,产品)
    		for (int i = 0; i < keys.size(); i++) {
    			Element element = cache.get(keys.get(i));   
 	        	if(element!=null && !cache.isExpired(element)) {
 	        		List<Object> employee =  (List<Object>) element.getValue();
 					tempCount += employee.size();
 				}   
 			}
    	}
    	return tempCount;   
       
    }   
	
	
	/**
	 * 获取指定缓存的Element数量
	 * @param cacheName
	 * @return
	 */
	public static int getElementSize(String cacheName){
		Cache cCache = getCache(cacheName);
		return cCache.getSize();
	}
	
	/**
	 * 获取指定缓存在内存中的Element数量
	 * @param cacheName
	 * @return
	 */
	public static long getElementMemorySize(String cacheName){
		Cache cCache = getCache(cacheName);
		return cCache.getMemoryStoreSize();
	}
	
	/**
	 * 获取指定缓存的状态
	 * @param cacheName
	 * @return
	 */
	public static String getStatus(String cacheName){
		Cache cCache = getCache(cacheName);
		return cCache.getStatus().toString();
	}
	
	/**
	 * 获取指定缓存在磁盘中的Element数量
	 * @param cacheName
	 * @return
	 */
	public static long getElementDiskSize(String cacheName){
		Cache cCache = getCache(cacheName);
		return cCache.getDiskStoreSize();
	}
	
    /**  
     * 获取缓存中的信息  
     * @param cache  
     * @param key  
     * @return  
     * @throws IllegalStateException  
     * @throws CacheException  
     */  
    public static Element getElement(String cacheName, Serializable key) throws IllegalStateException, CacheException{   
        Cache cCache = getCache(cacheName);
        return cCache.get(key);   
    }  
    
    /**
     * 删除指定缓存
     * @param cacheName
     */
    public static void clear(String cacheName){
    	if(cacheManager!=null)
    		cacheManager.removeCache(cacheName);
    }
    
	/**
	 * 清空所有缓存
	 */
	public static void clear(){
		if(cacheManager!=null)
			cacheManager.clearAll();
	}
	
    /**  
     * 停止缓存管理器  
     */  
    public static void shutdown(){   
        if(cacheManager!=null)   
        	cacheManager.shutdown();   
    }  
}

