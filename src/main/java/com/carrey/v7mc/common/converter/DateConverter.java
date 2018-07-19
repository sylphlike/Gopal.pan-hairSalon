package com.carrey.v7mc.common.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.springframework.core.convert.converter.Converter;

/**
 * 
 * @author 		carrey(潘冰)
 * @Email  		15923508369@163.com
 * @Date   		2016年5月8日下午6:52:09
 * @version		v 1.0.1
 * @description 日期转换器
 */
public class DateConverter implements Converter<String,Date> {

	@Override
	public Date convert(String source) {
		if(StringUtils.isEmpty(source)){
			return null;
		}
		String eL = "[0-9]{4}-[0-9]{2}-[0-9]{2}";
		Pattern p = Pattern.compile(eL);
		Matcher m = p.matcher(source);
		boolean dateFlag = m.matches();
		if(dateFlag){
			//实现 将日期串转成日期类型(格式是yyyy-MM-dd HH:mm:ss)
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			try {
				//转成直接返回
				return simpleDateFormat.parse(source);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			//实现 将日期串转成日期类型(格式是yyyy-MM-dd HH:mm:ss)
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			try {
				//转成直接返回
				return simpleDateFormat.parse(source);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//如果参数绑定失败返回null
		return null;
	}

}
