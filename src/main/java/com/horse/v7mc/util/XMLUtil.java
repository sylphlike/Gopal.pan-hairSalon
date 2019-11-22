package com.horse.v7mc.util;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * 
 * @author 		carrey(潘冰)
 * @Email  		15923508369@163.com
 * @Date   		2016年4月30日下午6:54:05
 * @version		v 1.0.1
 * @description XML文件工具类
 */
public class XMLUtil {
	private static Logger log = Logger.getLogger(XMLUtil.class);
	
	/**
	 * 获取统一日志配置文件
	 * @return
	 */
	public static Map<String,Map<String, String>> readUniversalLog(){
		Map<String,Map<String, String>> universalLogMap = new HashMap<String, Map<String, String>>();
		
		InputStream inputStream = XMLUtil.class.getClassLoader().getResourceAsStream("/sysConfig/universalLog.xml");
		
		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read(inputStream);
			inputStream.close();
			//得到根节点
			Element root = document.getRootElement().element("universalLogs");
			Iterator contentsIterator = root.elements().iterator();
			while(contentsIterator.hasNext()){
				Element contentIterator = (Element) contentsIterator.next();
				String moduleName = contentIterator.getName();
				Iterator delContent = contentIterator.elements().iterator();
				Map<String, String> map = new HashMap<String, String>();
				while(delContent.hasNext()){
					Element delText = (Element) delContent.next();
					map.put(delText.getName(), delText.getTextTrim());
				}
				universalLogMap.put(moduleName, map);
				
			}
		} catch (Exception e) {
			log.info("读取XML配置文件是异常！");
		}
		return universalLogMap;
	}
	
	/**
	 * 获取会员卡折扣数据
	 * @return
	 */
	public static Map<String,Map<String, Double>> readCashierDiscount(){
		Map<String,Map<String, Double>> discount = new HashMap<String, Map<String, Double>>();
		
		InputStream inputStream = XMLUtil.class.getClassLoader().getResourceAsStream("/sysConfig/cashierDiscount.xml");
		
		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read(inputStream);
			inputStream.close();
			//得到根节点
			Element root = document.getRootElement().element("cashiers");
			Iterator contentsIterator = root.elements().iterator();
			while(contentsIterator.hasNext()){
				Element contentIterator = (Element) contentsIterator.next();
				String moduleName = contentIterator.getName();
				Iterator delContent = contentIterator.elements().iterator();
				Map<String, Double> map = new HashMap<String, Double>();
				while(delContent.hasNext()){
					Element delText = (Element) delContent.next();
					map.put(delText.getName(), Double.valueOf(delText.getTextTrim()));
				}
				discount.put(moduleName, map);
				
			}
		} catch (Exception e) {
			log.info("读取XML配置文件是异常！");
		}
		
		return discount;
	}
	
	/**
	 * 获取消费项目配置数据
	 * @return
	 */
	public static Map<String,List<String>> readConsumptionProject(){
		Map<String,List<String>> consumptionMap = new HashMap<String, List<String>>();
		
		InputStream inputStream = XMLUtil.class.getClassLoader().getResourceAsStream("/sysConfig/consumptionProject.xml");
		
		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read(inputStream);
			inputStream.close();
			//得到根节点
			Element root = document.getRootElement().element("cashiers");
			Iterator contentsIterator = root.elements().iterator();
			while(contentsIterator.hasNext()){
				Element contentIterator = (Element) contentsIterator.next();
				String moduleName = contentIterator.getName();
				Iterator delContent = contentIterator.elements().iterator();
				List<String> temp = new ArrayList<String>();
				while(delContent.hasNext()){
					Element delText = (Element) delContent.next();
					temp.add(delText.getTextTrim());
				}
				consumptionMap.put(moduleName, temp);
				
			}
		} catch (Exception e) {
			log.info("读取XML配置文件是异常！");
		}
		return consumptionMap;
	}
	
	
	/**
	 * 读取发型师洗吹、剪发价格配置
	 * @return
	 */
	public static Map<String,Map<String, String>> readHaircutterPrice(){
		Map<String,Map<String, String>> haircuttertPriceMap = new HashMap<String, Map<String, String>>();
		
		InputStream inputStream = XMLUtil.class.getClassLoader().getResourceAsStream("/sysConfig/haircutterPrice.xml");
		
		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read(inputStream);
			inputStream.close();
			//得到根节点
			Element root = document.getRootElement().element("haircuttrtPrice");
			Iterator contentsIterator = root.elements().iterator();
			while(contentsIterator.hasNext()){
				Element contentIterator = (Element) contentsIterator.next();
				String moduleName = contentIterator.getName();
				Iterator delContent = contentIterator.elements().iterator();
				Map<String, String> map = new HashMap<String, String>();
				while(delContent.hasNext()){
					Element delText = (Element) delContent.next();
					map.put(delText.getName(), delText.getTextTrim());
				}
				haircuttertPriceMap.put(moduleName, map);
				
			}
		} catch (Exception e) {
			log.info("读取XML配置文件是异常！");
		}
		return haircuttertPriceMap;
	}
	
	
	
	/**
	 * 获取记次卡配置项
	 * @return
	 */
	public static Map<String,List<String>> readRecordCard(){
		Map<String,List<String>> recordCardMap = new HashMap<String, List<String>>();
		
		InputStream inputStream = XMLUtil.class.getClassLoader().getResourceAsStream("/sysConfig/recordCard.xml");
		
		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read(inputStream);
			inputStream.close();
			//得到根节点
			Element root = document.getRootElement().element("recordCards");
			Iterator contentsIterator = root.elements().iterator();
			while(contentsIterator.hasNext()){
				Element contentIterator = (Element) contentsIterator.next();
				String moduleName = contentIterator.getName();
				Iterator delContent = contentIterator.elements().iterator();
				List<String> temp = new ArrayList<String>();
				while(delContent.hasNext()){
					Element delText = (Element) delContent.next();
					temp.add(delText.getTextTrim());
				}
				recordCardMap.put(moduleName, temp);
				
			}
		} catch (Exception e) {
			log.info("读取XML配置文件是异常！");
		}
		return recordCardMap;
	}
	
	/**
	 * 获取加价产品数据
	 * @return
	 */
	public static ArrayList<String> readRaiseAmount() {
		ArrayList<String> raiseAmount = new ArrayList<String>();		
		InputStream inputStream = XMLUtil.class.getClassLoader().getResourceAsStream("/sysConfig/raiseAmount.xml");
		
		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read(inputStream);
			inputStream.close();
			//得到根节点
			Element root = document.getRootElement().element("raiseAmounts");
			Iterator contentsIterator = root.elements().iterator();
			while(contentsIterator.hasNext()){
				Element contentIterator = (Element) contentsIterator.next();
				Iterator delContent = contentIterator.elements().iterator();
				while(delContent.hasNext()){
					Element delText = (Element) delContent.next();
					raiseAmount.add(delText.getTextTrim());
				}
				
			}
		} catch (Exception e) {
			log.info("读取XML配置文件是异常！");
		}
		return raiseAmount;
	}
	
	
	/**
	 * 薪水提成率，配置文件
	 * @return
	 */
	public static Map<String, String> readsalaryPerentage() {
		Map<String, String> map = new HashMap<String, String>();		
		InputStream inputStream = XMLUtil.class.getClassLoader().getResourceAsStream("/sysConfig/salaryPercentage.xml");
		
		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read(inputStream);
			inputStream.close();
			//得到根节点
			Element root = document.getRootElement().element("salaryPercentages");
			Iterator contentsIterator = root.elements().iterator();
			while(contentsIterator.hasNext()){
				Element contentIterator = (Element) contentsIterator.next();
				Iterator delContent = contentIterator.elements().iterator();
				while(delContent.hasNext()){
					Element delText = (Element) delContent.next();
					map.put(delText.getName(), delText.getTextTrim());
				}
				
			}
		} catch (Exception e) {
			log.info("读取XML配置文件是异常！");
		}
		return map;
	}
	
	
	
	
	//++++++++++++++++++++++++++++++++++++++++++++系统编号 begin++++++++++++++++++++++++++++++++++++
	/**
	 * 获取系统编号
	 * @param sequenceType 编号类型，传入参数为sysSequence.xml配置文件中的节点名称
	 * @return
	 */
	public static String  getSequence(String sequenceType){
		String sequence = "";
		try {
			String path = Thread.currentThread().getContextClassLoader().getResource("/").getPath();
			SAXReader reader = new SAXReader();
			Document document = reader.read(path+"/sysConfig/sysSequence.xml"); 
			//得到根节点
			Element root = document.getRootElement().element(sequenceType);
			sequence = root.getTextTrim();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sequence;
	}
	
	/**
	 * 更新系统编号
	 * @param l 修改后的系统编号
	 * @param sequenceType 编号类型，传入参数为sysSequence.xml配置文件中的节点名称
	 */
	public static void updateconfig(long l,String sequenceType){
		try {
			String path = Thread.currentThread().getContextClassLoader().getResource("/").getPath();
			SAXReader reader = new SAXReader();
			Document document = reader.read(path+"/sysConfig/sysSequence.xml"); 
		
			//得到根节点
			Element root = document.getRootElement().element(sequenceType);
			root.setText(String.valueOf(l));

		     //得到格式化回写文件
		     OutputFormat format = OutputFormat.createPrettyPrint();
		     //回写文件
		     try {
		    	
		    	XMLWriter writer  = new XMLWriter(new FileOutputStream(path+"/sysConfig/sysSequence.xml"),format);
				writer.write(document);
				writer.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	//++++++++++++++++++++++++++++++++++++++++++++系统编号 end++++++++++++++++++++++++++++++++++++


}
