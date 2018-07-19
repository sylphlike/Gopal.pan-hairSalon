package com.carrey.v7mc.common.log;


import java.util.Date;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carrey.v7mc.common.Constant;
import com.carrey.v7mc.mapperInterface.V7UniversalLogMapper;
import com.carrey.v7mc.po.V7UniversalLog;
import com.carrey.v7mc.system.ehcache.BaseEhcacheManager;
import com.carrey.v7mc.util.GetClientInfo;
import com.carrey.v7mc.util.UUIDUtils;

/**
 * 
 * @author 		carrey(潘冰)
 * @Email  		15923508369@163.com
 * @Date   		2016年5月19日下午1:48:01
 * @version		v 1.0.1
 * @description 统一日志记录service
 */
@Service
@SuppressWarnings("all")
public class UniversalLogService {
	
	@Autowired
	private V7UniversalLogMapper logMapper;
	
	/**
	 * 统一日志记录
	 * @param fullPath 访问全路径
	 * @param params   请求参数
	 * @param status   请求状态
	 * @param operUser 操作人
	 * @param request 
	 */
	public void recordLog(String fullPath,String params,int status,String operUser, HttpServletRequest request){
		V7UniversalLog universalLog = new V7UniversalLog();
		universalLog.setId(UUIDUtils.getUUID());
		
		universalLog.setV7UFeaturePath(fullPath);
		universalLog.setV7URequestParam(params);
		universalLog.setV7URequestPcname(GetClientInfo.getHostName());
		universalLog.setV7URequestIp(GetClientInfo.getIpAddr(request));
		universalLog.setV7URequestUser(operUser);
		universalLog.setV7URequestTime(new Date());
		if(status >= 500){
			universalLog.setV7URequestResult("失败");
		}else
			universalLog.setV7URequestResult("成功");
		
		// request获取的路径/v7mc/member/addMember.action

		//获得模块跟路径
		int index =fullPath.indexOf("/");
		index = fullPath.indexOf("/", index+1);
		String modulePath = fullPath.substring(index+1,fullPath.lastIndexOf("/") );
		//获取功能路径
		String  featurePath = fullPath.substring(fullPath.lastIndexOf("/")+1, fullPath.length()-7);
		
		Map<String, String> features = (Map<String, String>) BaseEhcacheManager.get(Constant.EHC_UNIVERSALLOG_NAME, modulePath);
		Set<String> keySet = features.keySet();
		int temp = 0;
		for (String key : keySet) {
			if(modulePath.equals(key)){
				universalLog.setV7UModuleName(features.get(key));
				++temp;
			}
			if(featurePath.equals(key)){
				universalLog.setV7UFeatureName(features.get(key));
				++temp;
			}
			if(2 == temp){break;}
		}
		logMapper.insert(universalLog);
		
	}
	
}
