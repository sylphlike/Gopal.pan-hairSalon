package com.carrey.v7mc.cashier.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carrey.v7mc.cashier.service.CashierService;
import com.carrey.v7mc.common.Constant;
import com.carrey.v7mc.common.exception.SysException;
import com.carrey.v7mc.mapperInterface.V7CardMapper;
import com.carrey.v7mc.mapperInterface.V7CrecardMapper;
import com.carrey.v7mc.mapperInterface.V7ProductMapper;
import com.carrey.v7mc.mapperInterface.V7ReceptionMapper;
import com.carrey.v7mc.mapperInterface.V7StoreOutMapper;
import com.carrey.v7mc.mapperInterface.V7StoreQuantityMapper;
import com.carrey.v7mc.po.V7Card;
import com.carrey.v7mc.po.V7Crecard;
import com.carrey.v7mc.po.V7Product;
import com.carrey.v7mc.po.V7Reception;
import com.carrey.v7mc.po.V7StoreOut;
import com.carrey.v7mc.po.V7StoreQuantity;
import com.carrey.v7mc.queryVo.CashierQVo;
import com.carrey.v7mc.system.ehcache.BaseEhcacheManager;
import com.carrey.v7mc.util.UUIDUtils;

@Service
@SuppressWarnings("unchecked")
public class CashierServiceImpl implements CashierService {
	private Logger log = Logger.getLogger(CashierServiceImpl.class);
	
	@Autowired
	private V7ReceptionMapper receptionMapper;
	@Autowired
	private V7StoreQuantityMapper quantityMapper;
	@Autowired
	private V7CardMapper cardMapper;
	@Autowired
	private V7CrecardMapper crecardMapper;
	@Autowired
	private V7ProductMapper productMapper;
	@Autowired
	private V7StoreOutMapper outMapper;

	@Override
	public void addCashier(V7Reception reception,String operuser ,String v7rRaiseamount) throws SysException {
		
		reception = pretreatmentData(reception,v7rRaiseamount);
		// 1 获取结单消费方式校验必要数据是否为空
		int consumption = reception.getV7RConsumption();
		if("".equals(consumption) || 0 == consumption){
			throw new SysException("nullCashier_提交的结单数据不完整！");
		}
		
		/**消费类型 1洗吹,2 洗剪吹,3烫发，4染发,5烫染发,6烫染护,7护发*/
		Integer consumeType = reception.getV7RConsumetype();
		if("".equals(consumeType) || -1 == consumeType || 0 == consumeType  || null == consumeType){
			throw new SysException("nullCashier_提交的结单数据不完整！");
		}
		Boolean flag = true;

		// 根据消费方式对数据空校验
		switch (consumption) {
			case 1: //VIP 卡
				if("".equals(reception.getV7RMemberid())|| null ==reception.getV7RMemberid()){flag = false;}
				if("".equals(reception.getV7RCardid())|| null ==reception.getV7RCardid()){flag = false;}
				if("".equals(reception.getV7RUsecardtype())|| null ==reception.getV7RUsecardtype()){flag = false;}
				
				flag =  consumeTypeNullCheck(consumeType,reception);
				if(!flag){throw new SysException("nullCashier_提交的结单数据不完整");}
				break;
			case 2: //对冲卡
				if("".equals(reception.getV7RMemberid())|| null ==reception.getV7RMemberid()){flag = false;}
				if("".equals(reception.getV7RCardid())|| null ==reception.getV7RCardid()){flag = false;}
				if("".equals(reception.getV7RUsecardtype())|| null ==reception.getV7RUsecardtype()){flag = false;}
				
				flag =  consumeTypeNullCheck(consumeType,reception);
				if(!flag){throw new SysException("nullCashier_提交的结单数据不完整");}
				break;
			case 3: //洗吹卡
				if("".equals(reception.getV7RMemberid())|| null ==reception.getV7RMemberid()){flag = false;}
				if("".equals(reception.getV7RCardid())|| null ==reception.getV7RCardid()){flag = false;}
				if("".equals(reception.getV7RUsecardtype())|| null ==reception.getV7RUsecardtype()){flag = false;}
				
				flag =  consumeTypeNullCheck(consumeType,reception);
				if(!flag){throw new SysException("nullCashier_提交的结单数据不完整");}
				break;
			case 4: //洗剪吹卡
				if("".equals(reception.getV7RMemberid())|| null ==reception.getV7RMemberid()){flag = false;}
				if("".equals(reception.getV7RCardid())|| null ==reception.getV7RCardid()){flag = false;}
				if("".equals(reception.getV7RUsecardtype())|| null ==reception.getV7RUsecardtype()){flag = false;}
				
				flag =  consumeTypeNullCheck(consumeType,reception);
				if(!flag){throw new SysException("nullCashier_提交的结单数据不完整");}
				break;
			case 5: //现金
				flag =  consumeTypeNullCheck(consumeType,reception);
				if(!flag){throw new SysException("nullCashier_提交的结单数据不完整");}
				break;
		}
		
		// 3结单--通用数据
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		reception.setId(UUIDUtils.getUUID());
		reception.setV7RNum(sdf.format(new Date()));           //流水号
		//操作人数据
		reception.setV7RStatementUser(operuser);
		reception.setV7RStatementDate(new Date());
		// 3.1 现金结账
		if( 5 == consumption){
			if(1 == consumeType){reception.setV7RBlowwash(reception.getV7RSumcostprice());}
			if(2 == consumeType){reception.setV7RBlowcutwash(reception.getV7RSumcostprice());}
			
			if(null != reception.getV7RDiscountrate() && !"".equals(reception.getV7RDiscountrate())){
				Double payCash = reception.getV7RSumcostprice() *reception.getV7RDiscountrate();
				String tempPayCash= String.valueOf(reception.getV7RDiscountprice());
				tempPayCash = tempPayCash.substring(0, tempPayCash.lastIndexOf("."));
				log.info("页面传入的折后价为："+reception.getV7RDiscountprice() +">>>>后台计算的折后价为："+payCash+">>>>后台舍弃小数点后的数据为："+tempPayCash );
				if(String.valueOf(payCash).startsWith(tempPayCash)){
					//针对现金结账舍弃小数点后的数据
					String temp = String.valueOf(payCash).substring(0,String.valueOf(payCash).lastIndexOf("."));
					reception.setV7RPaycash(Double.valueOf(temp));
					reception.setV7RDiscountprice(Double.valueOf(temp));
				}else {
					throw new SysException("dataCashier_前台折扣与后台折扣计算值不一致!");
				}
			}else{
				reception.setV7RPaycash(reception.getV7RSumcostprice());
				reception.setV7RDiscountprice(reception.getV7RSumcostprice());
			}
			 
			//外卖减库存
			if(!"-1".equals(reception.getV7RProductid()) && null != reception.getV7RProductid()){
				takeout(reception.getV7RProductid(),reception.getV7RSaleCount(),reception.getV7RSaleProammount(),operuser);
				reception.setV7RSaleTotalprice(reception.getV7RSaleCount() * reception.getV7RSaleProammount());
			}
			receptionMapper.insertSelective(reception);
			
		}else if (4 == consumption){
			//3.2洗剪吹卡 结账
			Integer temp = reception.getV7RConsumetype();
			if(temp != 2){
				throw new SysException("dataCashier_洗剪吹卡只能用于洗剪吹项目上!");
			}
			V7Card v7Card = cardMapper.selectByPrimaryKey(reception.getV7RCardid());
			if(reception.getV7RRecordnum() > v7Card.getV7CSurplusAmount()){
				 throw new SysException("dataCashier_划卡次数大于卡余额次数!");
			}
			v7Card.setV7CSurplusAmount( v7Card.getV7CSurplusAmount() - reception.getV7RRecordnum());
			if(v7Card.getV7CSurplusAmount() == 0){
				v7Card.setV7CStatus(2);
			}
			cardMapper.updateByPrimaryKeySelective(v7Card);
			V7Crecard crecard = setV7Crecard(reception);
			crecardMapper.insertSelective(crecard);
			
			receptionMapper.insertSelective(reception);
		}else if (3 == consumption){
			//3.3洗吹卡结账
			Integer temp = reception.getV7RConsumetype();
			if(temp != 1){
				throw new SysException("dataCashier_洗吹卡只能用于洗吹项目上!");
			}
			V7Card v7Card = cardMapper.selectByPrimaryKey(reception.getV7RCardid());
			if(reception.getV7RRecordnum() > v7Card.getV7CSurplusAmount()){
				 throw new SysException("dataCashier_划卡次数大于卡余额次数!");
			}
			v7Card.setV7CSurplusAmount( v7Card.getV7CSurplusAmount() - reception.getV7RRecordnum());
			if(v7Card.getV7CSurplusAmount() == 0){
				v7Card.setV7CStatus(2);
			}
			cardMapper.updateByPrimaryKeySelective(v7Card);
			V7Crecard crecard = setV7Crecard(reception);
			crecardMapper.insertSelective(crecard);
			receptionMapper.insertSelective(reception);
		}else if(2 == consumption){
			//3.4 对冲卡结账
			if(1 == consumeType){reception.setV7RBlowwash(reception.getV7RSumcostprice());}
			if(2 == consumeType){reception.setV7RBlowcutwash(reception.getV7RSumcostprice());}
			
			Map<String, Double>  hedgingCard = (Map<String, Double>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CARD_DISCOUNT, "hedgingCard");
			Double sumcostprice = reception.getV7RSumcostprice(); 
			Double temp = sumcostprice * hedgingCard.get("generalDiscount");
			if(!String.valueOf(temp).startsWith((String.valueOf(reception.getV7RPaycash4hedging())))){
				 throw new SysException("dataCashier_页面计算折扣与后台不一致!");
			}
			
			V7Card v7Card = cardMapper.selectByPrimaryKey(reception.getV7RCardid());
			if(temp > v7Card.getV7CSurplusAmount()){
				 throw new SysException("dataCashier_卡余额不足!");
			}
			v7Card.setV7CSurplusAmount( v7Card.getV7CSurplusAmount() - temp);
			if(v7Card.getV7CSurplusAmount() == 0){
				v7Card.setV7CStatus(2);
			}
			
			//外卖减库存
			if(!"-1".equals(reception.getV7RProductid()) && null != reception.getV7RProductid()){
				takeout(reception.getV7RProductid(),reception.getV7RSaleCount(),reception.getV7RSaleProammount(),operuser);
				reception.setV7RSaleTotalprice(reception.getV7RSaleCount() * reception.getV7RSaleProammount());
			}
			cardMapper.updateByPrimaryKeySelective(v7Card);
			V7Crecard crecard = setV7Crecard(reception);
			crecardMapper.insertSelective(crecard);
			receptionMapper.insertSelective(reception);
		}else if( 1== consumption){
			//3.5 VIP卡结账
			//外卖减库存
			if(!"-1".equals(reception.getV7RProductid()) && null != reception.getV7RProductid()){
				takeout(reception.getV7RProductid(),reception.getV7RSaleCount(),reception.getV7RSaleProammount(),operuser);
				reception.setV7RSaleTotalprice(reception.getV7RSaleCount() * reception.getV7RSaleProammount());
			}
			
			//3.5.1 金卡结账
			if(1 == reception.getV7RUsecardtype()){
				Map<String, Double>  generalEhcacheData = (Map<String, Double>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CARD_DISCOUNT, "goldCard");
				generalConsumeType(consumeType,reception,generalEhcacheData);
			}
			//3.5.2 银卡结账
			if(2 == reception.getV7RUsecardtype()){
				Map<String, Double>  generalEhcacheData = (Map<String, Double>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CARD_DISCOUNT, "silverCard");
				generalConsumeType(consumeType,reception,generalEhcacheData);		
			}
			//3.5.3 普卡结账
			if(3 == reception.getV7RUsecardtype()){
				Map<String, Double>  generalEhcacheData = (Map<String, Double>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CARD_DISCOUNT, "classicCard");
				generalConsumeType(consumeType,reception,generalEhcacheData);
			}
			
		}
		
	}

	/**
	 *  VIP卡通用消费类型数据校验(前台计算结构也后台计算结果对比)
	 * @param consumeType
	 * @param reception
	 * @param generalEhcacheData
	 * @throws SysException
	 */
	private void generalConsumeType(int consumeType, V7Reception reception, Map<String, Double> generalEhcacheData) throws SysException {
		if(1 == consumeType ){ // 洗吹
			reception.setV7RBlowwash(reception.getV7RSumcostprice());
			Double temp = reception.getV7RSumcostprice() * generalEhcacheData.get("blowWash");
			if(!String.valueOf(temp).startsWith((String.valueOf(reception.getV7RDiscountprice())))){
				throw new SysException("dataCashier_页面计算折扣与后台不一致!");
			}
			generalDataOper(reception);
		}else if(2 == consumeType){ //洗剪吹
			reception.setV7RBlowcutwash(reception.getV7RSumcostprice());
			Double temp = reception.getV7RSumcostprice() * generalEhcacheData.get("blowCutWash");
			if(!String.valueOf(temp).startsWith((String.valueOf(reception.getV7RDiscountprice())))){
				throw new SysException("dataCashier_页面计算折扣与后台不一致!");
			}
			generalDataOper(reception);
		}else if( 3== consumeType){// 烫发
			Double temp = reception.getV7RSumcostprice() * generalEhcacheData.get("perm");
			if(!String.valueOf(temp).startsWith((String.valueOf(reception.getV7RDiscountprice())))){
				throw new SysException("dataCashier_页面计算折扣与后台不一致!");
			}
			generalDataOper(reception);
		} else if(4 == consumeType){ // 染发
			Double temp = reception.getV7RSumcostprice() * generalEhcacheData.get("dyeHair");
			if(!String.valueOf(temp).startsWith((String.valueOf(reception.getV7RDiscountprice())))){
				throw new SysException("dataCashier_页面计算折扣与后台不一致!");
			}
			generalDataOper(reception);
		}else if(5 == consumeType){ // 烫染发
			String strPerm = reception.getV7RPermcostprice().substring(reception.getV7RPermcostprice().lastIndexOf("-")+1, reception.getV7RPermcostprice().length());
			Double tempPerm = Double.valueOf(strPerm) * generalEhcacheData.get("perm");
			
			String strDyeHair = reception.getV7RDyehaircostprice().substring(reception.getV7RDyehaircostprice().lastIndexOf("-")+1, reception.getV7RDyehaircostprice().length());
			Double tempDyeHair = Double.valueOf(strDyeHair) * generalEhcacheData.get("dyeHair");
			Double temp = tempPerm + tempDyeHair;
			if(!String.valueOf(temp).startsWith((String.valueOf(reception.getV7RDiscountprice())))){
				throw new SysException("dataCashier_页面计算折扣与后台不一致!");
			}
			generalDataOper(reception);
		}else if(6 == consumeType){ // 烫染护发  欧莱雅烫发-998
			String strPerm = reception.getV7RPermcostprice().substring(reception.getV7RPermcostprice().lastIndexOf("-")+1, reception.getV7RPermcostprice().length());
			Double tempPerm = Double.valueOf(strPerm) * generalEhcacheData.get("perm");
			
			String strDyeHair = reception.getV7RDyehaircostprice().substring(reception.getV7RDyehaircostprice().lastIndexOf("-")+1, reception.getV7RDyehaircostprice().length());
			Double tempDyeHair = Double.valueOf(strDyeHair) * generalEhcacheData.get("dyeHair");
			
			String strConditioner = reception.getV7RConditionercostprice().substring(reception.getV7RConditionercostprice().lastIndexOf("-")+1, reception.getV7RConditionercostprice().length());
			Double tempConditioner = Double.valueOf(strConditioner) * generalEhcacheData.get("conditioner");
			Double temp = tempPerm + tempDyeHair + tempConditioner;
			if(!String.valueOf(temp).startsWith((String.valueOf(reception.getV7RDiscountprice())))){
				throw new SysException("dataCashier_页面计算折扣与后台不一致!");
			}
			generalDataOper(reception);
		}else if(7 == consumeType){ // 护发
			Double temp = reception.getV7RSumcostprice() * generalEhcacheData.get("conditioner");
			if(!String.valueOf(temp).startsWith((String.valueOf(reception.getV7RDiscountprice())))){
				throw new SysException("dataCashier_页面计算折扣与后台不一致!");
			}
			generalDataOper(reception);
		}
		
	}

	/**
	 * VIP卡通用数据库操作
	 * 包括：校验会员使用的会员卡余额是否足够，插入会员卡操作记录表，插入前台结单数据
	 * @param reception 
	 * @throws SysException 
	 */
	private void generalDataOper(V7Reception reception) throws SysException {
		checkCardBalanceAndUpdate(reception);
		V7Crecard crecard = setV7Crecard(reception);
		crecardMapper.insertSelective(crecard);
		receptionMapper.insertSelective(reception);
	}

	/**
	 * VIP卡卡余额校验和卡扣款运算更新数据库
	 * @param reception
	 * @return 
	 * @throws SysException 
	 */
	private void checkCardBalanceAndUpdate(V7Reception reception) throws SysException {
		V7Card v7Card = cardMapper.selectByPrimaryKey(reception.getV7RCardid());
		//消费类型金额，加价产品金额， 外卖产品金额
		Double discountprice = reception.getV7RDiscountprice();
		if( null != reception.getV7RRaiseamount()){
			discountprice += reception.getV7RRaiseamount();
		}
		if(null != reception.getV7RProductid()){
			discountprice +=(reception.getV7RSaleProammount() * reception.getV7RSaleCount());
		}
		if(discountprice > v7Card.getV7CSurplusAmount()){
			 throw new SysException("dataCashier_卡余额不足!");
		}
		v7Card.setV7CSurplusAmount( v7Card.getV7CSurplusAmount() - discountprice);
		
		cardMapper.updateByPrimaryKeySelective(v7Card);
	}

	/**
	 * 会员卡操作记录数据
	 * @param reception
	 * @return
	 */
	private V7Crecard setV7Crecard(V7Reception reception){
		V7Crecard crecard = new V7Crecard();
		crecard.setId(UUIDUtils.getUUID());
		crecard.setV7ROtype(Constant.GENERAL_OPER_TYPE_STRING_TWO);
		crecard.setV7PkCard(reception.getV7RCardid());
		V7Card v7Card = cardMapper.selectByPrimaryKey(reception.getV7RCardid());
		crecard.setV7RCardtype(v7Card.getV7CType());
		if( 3== reception.getV7RConsumption() || 4 == reception.getV7RConsumption()){
			// 洗吹卡， 洗剪吹卡
			crecard.setV7ROmoney(Double.valueOf(reception.getV7RRecordnum()));
		}else if(2 == reception.getV7RConsumption()){
			//对冲卡
			Double discountprice = reception.getV7RPaycash4hedging();
			if(null != reception.getV7RRaiseamount() ){
				discountprice += reception.getV7RRaiseamount();
			}
			if(null != reception.getV7RProductid()){
				discountprice +=(reception.getV7RSaleProammount() * reception.getV7RSaleCount());
			}
			crecard.setV7ROmoney(discountprice);
		}else {
			//VIP卡
			Double discountprice = reception.getV7RDiscountprice();
			if(null != reception.getV7RRaiseamount()  ){
				discountprice += reception.getV7RRaiseamount();
			}
			if(null != reception.getV7RProductid()){
				discountprice +=(reception.getV7RSaleProammount() * reception.getV7RSaleCount());
			}
			crecard.setV7ROmoney(discountprice);
		}
		crecard.setV7ROperUser(reception.getV7RStatementUser());
		crecard.setV7ROperTime(new Date());
		return crecard;
	}

	/**
	 * 结单时有外卖减库存，更新出库表
	 * @param v7rProductid
	 * @param saleCount 
	 * @param salePrice 
	 * @param operuser 
	 * @throws SysException 
	 */
	private void takeout(String v7rProductid, Integer saleCount, Double salePrice, String operuser) throws SysException {
		V7StoreQuantity quantity = quantityMapper.selectByProductId(v7rProductid);
		if(quantity.getV7SCount() >= saleCount){
			quantity.setV7SCount(quantity.getV7SCount() - saleCount);
		}else {
			throw new SysException("dataCashier_产品库存不足!");
		}
		quantityMapper.updateByPrimaryKeySelective(quantity);
		
		//添加出库记录
		V7Product product = productMapper.selectByPrimaryKey(v7rProductid);
		
		V7StoreOut storeOut = new V7StoreOut();
		storeOut.setId(UUIDUtils.getUUID());
		storeOut.setV7PkProduct(product.getId());
		storeOut.setV7PkStoreQuantity(quantity.getId());
		storeOut.setV7SOutType(Constant.GENERAL_OPER_TYPE_INTEGER_ONE);
		storeOut.setV7SBrand(product.getV7PBrand());
		storeOut.setV7SType(product.getV7PType());
		storeOut.setV7SName(product.getV7PName());
		storeOut.setV7SUnit(product.getV7PUnit());
		storeOut.setV7SStandard(product.getV7PStandard());
		storeOut.setV7SPrice(salePrice);
		storeOut.setV7SCount(saleCount);
		storeOut.setV7SPriceCount(salePrice * saleCount);
		storeOut.setV7SOperUser(operuser);
		storeOut.setV7SOperTime(new Date());
		
		outMapper.insertSelective(storeOut);
		
	}



	/**
	 *  根据消费类型校验该消费类型下的消费项是否填写,同时校验发型师，技师
	 * @param consumeType  消费类型 1洗吹,2 洗剪吹,3烫发，4染发,5烫染发,6烫染护,7护发
	 * @param reception
	 * @return
	 */
	private Boolean consumeTypeNullCheck(int consumeType,V7Reception reception) {
		//校验通用数据
		if("".equals(reception.getV7RHairstylist()) || null == reception.getV7RHairstylist()){return false;}
		if("".equals(reception.getV7RTechnician()) || null == reception.getV7RTechnician()){return false;}
		
		if(1 == consumeType ||  2 == consumeType ){
			if("".equals(reception.getV7RSumcostprice())|| null == reception.getV7RSumcostprice()){return false;}
		}
		if(3 == consumeType ){
			if("-1".equals(reception.getV7RPermcostprice())|| null == reception.getV7RPermcostprice()){return false;}
		}
		if(4 == consumeType ){
			if("-1".equals(reception.getV7RDyehaircostprice())|| null == reception.getV7RDyehaircostprice()){return false;}
		}
		if(5 == consumeType ){
			if("-1".equals(reception.getV7RPermcostprice())|| null == reception.getV7RPermcostprice()){return false;}
			if("-1".equals(reception.getV7RDyehaircostprice())|| null == reception.getV7RDyehaircostprice()){return false;}
		}
		if(6 == consumeType ){
			if("-1".equals(reception.getV7RPermcostprice())|| null == reception.getV7RPermcostprice()){return false;}
			if("-1".equals(reception.getV7RDyehaircostprice())|| null == reception.getV7RDyehaircostprice()){return false;}
			if("-1".equals(reception.getV7RConditionercostprice())|| null == reception.getV7RConditionercostprice()){return false;}
		}
		if(7 == consumeType ){
			if("-1".equals(reception.getV7RConditionercostprice())|| null == reception.getV7RConditionercostprice()){return false;}
		}
		return true;
	}

	/**
	 * 预处理页面传入的参数 (处理前台使用下拉框 默认的选择值时，传到后台的值为-1 转换成  NULL 或"")
	 * @param reception
	 * @param v7rRaiseamount 
	 * @return
	 */
	private V7Reception pretreatmentData(V7Reception reception, String v7rRaiseamount) {
		String[] temp = v7rRaiseamount.split(",");
		for (String singleRaise : temp) {
			if(!"-1".equals(singleRaise)){
				reception.setV7RRaiseamount(Double.parseDouble(singleRaise));
				break;
			}else {
				reception.setV7RRaiseamount(null);
			}
		}
		
		if(-1 == reception.getV7RConsumetype()){reception.setV7RConsumetype(null);}
		if("-1".equals(reception.getV7RPermcostprice())){reception.setV7RPermcostprice(null);}
		if("-1".equals(reception.getV7RDyehaircostprice())){reception.setV7RDyehaircostprice(null);}
		if("-1".equals(reception.getV7RConditionercostprice())){reception.setV7RConditionercostprice(null);}
		if("-1".equals(reception.getV7RAssistant())){reception.setV7RAssistant(null);}
		if("-1".equals(reception.getV7RProductid())){reception.setV7RProductid(null);}
		if("-1".equals(reception.getV7RSaleUser())){reception.setV7RSaleUser(null);}
		
		return reception;
	}

	@Override
	public int getTotalAmount(CashierQVo queryVo) {
		return receptionMapper.getTotalAmount(queryVo);
	}

	@Override
	public List<V7Reception> getPageData(CashierQVo queryVo) {
		return receptionMapper.getPageData(queryVo);
	}


}
