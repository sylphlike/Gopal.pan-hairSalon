package com.carrey.v7mc.financial.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carrey.v7mc.financial.service.ChargeService;
import com.carrey.v7mc.mapperInterface.V7ChargeMapper;
import com.carrey.v7mc.po.V7Charge;
import com.carrey.v7mc.po.V7Employee;
import com.carrey.v7mc.queryVo.ChargeQVo;
import com.carrey.v7mc.util.UUIDUtils;

@Service
public class ChargeServiceImpl implements ChargeService {

	@Autowired
	private V7ChargeMapper chargeMapper;
	
	@Override
	public void addCharge(V7Charge charge,V7Employee emp) {
		
		String[] position = emp.getV7EPosition().split(",");
		String tempPosition = "";
		for (String string : position) {
			switch (string) {
				case "1":
					tempPosition +="经理,";
					break;
				case "2":
					tempPosition +="股东,";			
					break;
				case "3":
					tempPosition +="技术总监,";
					break;
				case "4":
					tempPosition +="首席发型师,";
					break;
				case "5":
					tempPosition +="高级发型师,";
					break;
				case "6":
					tempPosition +="发型师,";
					break;
				case "7":
					tempPosition +="技师,";
					break;
				case "8":
					tempPosition +="助理,";
					break;
				case "9":
					tempPosition +="前台,";
					break;
				case "10":
					tempPosition +="其它,";
					break;
			}
		}
		tempPosition = tempPosition.substring(0, tempPosition.length() -1);
		charge.setV7CMnum(emp.getV7ENum());
		charge.setV7CName(emp.getV7EName());
		charge.setv7CPosition(tempPosition);
        charge.setId(UUIDUtils.getUUID());
		chargeMapper.insertSelective(charge);
	
	}

	@Override
	public int getTotalAmount(ChargeQVo queryVo) {
		return chargeMapper.getTotalAmount(queryVo);
	}

	@Override
	public List<V7Charge> getPageData(ChargeQVo queryVo) {
		return chargeMapper.getPageData(queryVo);
	}

	@Override
	public V7Charge searchCharge(String id) {
		return chargeMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateCharge(V7Charge charge) {
		V7Charge v7Charge = chargeMapper.selectByPrimaryKey(charge.getId());
		v7Charge.setV7CMonth(charge.getV7CMonth());
		v7Charge.setV7CChargeMoney(charge.getV7CChargeMoney());
		v7Charge.setV7CChargeExplain(charge.getV7CChargeExplain());
		chargeMapper.updateByPrimaryKeySelective(v7Charge);
		
	}

	@Override
	public void delCharge(String id) {
		chargeMapper.deleteByPrimaryKey(id);
		
	}

}
