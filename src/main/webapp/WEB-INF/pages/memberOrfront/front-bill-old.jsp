<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link href="${ctx}/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/css/style.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>收銀管理</title>
<style type="text/css">
	.bg-1-me{ background-color:#f5faed}
	td:first-child{text-align:right}
    td:nth-child(2){text-align:left}
    .select-width{width:200px;}
</style>
</head>
<body>
	<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 前台管理 <span class="c-gray en">&gt;</span> 前台收银</nav>
	<div class="pd-20" style="margin-top:-14px;">
		<form action="${ctx }/cashier/searchCashire.action" method="post">
			<div class="text-c"> 
				<span class="select-box inline">
					<select name="searchType" class="select">
						<option value="1">会员编号</option>
						<option value="2">会员电话号</option>
						<option value="3">会员名</option>
					</select>
				</span> 
				<input type="text" name="searchNum" style="width:250px" id="selects" class="input-text">
				<button class="btn btn-success radius mr-20" style="line-height:1.6em;margin-top:3px"onclick="verification()" id="buttons"  ><i class="Hui-iconfont">&#xe665;</i> search</button>
				<a class="btn btn-success radius mr-20" style="line-height:1.6em;margin-top:3px" href="${ctx }/cashier/gotoNewCashier.action" ><i class="Hui-iconfont">&#xe68f;</i> reset</a>
			</div>
		</form>
		<form action="${ctx }/cashier/addCashier.action" method="POST"  onsubmit="return checkCashier()">
		<!-- 会员信息start -->
		<!-- 隐藏信息 -->
		<!-- 会员ID -->
		<input type="hidden" name="memberId" value="${memberInfo.id }"/>
		<!-- 使用会员卡ID -->
		<input type="hidden" name="cardId" id="cardId" />
		<!-- 使用会员卡类型 -->
		<input type="hidden" name="useCardType" id="useCardType" />
		
		<div class="text-c" id="memberInfoDiv">
			<table style="background-color:#F5FAFE; margin-top: 2px;"  >
				<tr >
					<td rowspan="2"><span style="font-family:华文中宋;font-size:17px;">会员信息</span></td>
					<td  style="padding:5px;text-align:right;"><span style="font-family:华文中宋;font-size:13px;">会员编号</span></td>
					<td style="padding:5px; text-align:left;">
						<span style="font-family:华文中宋;font-size:13px; ">${memberInfo.v7MNum }</span>
					</td>
					<td style="padding:5px; text-align:right;"><span style="font-family:华文中宋;font-size:13px;">加入时间</span></td>
					<td style="padding:5px; text-align:left;">
						<span style="font-family:华文中宋;font-size:13px; "><fmt:formatDate value="${memberInfo.v7MCrateTime}" pattern="yyyy-MM-dd"/></span>
					</td>
					<td style="padding:5px;  text-align:right;"><span style="font-family:华文中宋;font-size:13px;">会员姓名</span></td>
					<td style="padding:5px; text-align:left;">
						<span style="font-family:华文中宋;font-size:13px; ">${memberInfo.v7MName }</span>
					</td>
					<td style="padding:5px; text-align:right;"><span style="font-family:华文中宋;font-size:13px;">真实名</span></td>
					<td style="padding:5px; text-align:left;">
						<span style="font-family:华文中宋;font-size:13px; ">${memberInfo.v7MRealName }</span>
					</td>
					
				</tr>
				<tr>
					<td style="padding:5px; text-align:right;"><span style="font-family:华文中宋;font-size:13px;">会员生日</span></td>
					<td style="padding:5px; text-align:left;">
						<span style="font-family:华文中宋;font-size:13px; "><fmt:formatDate value="${memberInfo.v7MBirthday}" pattern="yyyy-MM-dd"/></span>
					</td>
				
					<td style="padding:5px; text-align:right;"><span style="font-family:华文中宋;font-size:13px;">电话号码</span></td>
					<td style="padding:5px; text-align:left;">
						<span style="font-family:华文中宋;font-size:13px; ">${memberInfo.v7MPhone }</span>
					</td>
					<td style="padding:5px;  text-align:right;"><span style="font-family:华文中宋;font-size:13px;">状态 </span></td>
					<td style="padding:5px; text-align:left;">
						<c:if test="${memberInfo.v7MStatus eq '1' }">
							<span class="label label-success radius">已启用</span>
						</c:if>
						<c:if test="${memberInfo.v7MStatus eq '2' }">
							<span class="label label-defaunt radius">已挂起</span>
						</c:if>
					 </td>
					<td style="padding:5px; text-align:right;"><span style="font-family:华文中宋;font-size:13px;">可用卡 </span></td>
					<td style="padding:5px; text-align:left;" id="haveCardType">
						<c:forEach items="${memberInfo.memberCard }" var="result">
								<c:if test="${result.v7CType  eq '1'}"> 
									<span class="label label-success radius">金卡</span>
									<input type="hidden" id="vip_goldCard_id_hidden" value="${result.id }"/>
									<!-- 会员卡类型 -->
									<input type="hidden" name="useCardType4VIP" id ="useCardType4VIP"  value="1"/>
								</c:if>
								<c:if test="${result.v7CType  eq '2'}"> 
									<span class="label label-success radius">银卡</span>
									<input type="hidden" id="vip_silverCard_id_hidden" value="${result.id }"/>
									<!-- 会员卡类型 -->
									<input type="hidden"  name="useCardType4VIP" id ="useCardType4VIP"  value="2"/>
								</c:if>
								<c:if test="${result.v7CType  eq '3'}"> 
									<span class="label label-success radius">普卡</span>
									<input type="hidden" id="vip_classicCard_id_hidden" value="${result.id }"/>
									<!-- 会员卡类型 -->
									<input type="hidden"  name="useCardType4VIP" id ="useCardType4VIP"  value="3"/>
								</c:if>
								<c:if test="${result.v7CType  eq '4'}"> 
									<span class="label label-success radius">对冲卡</span>
									<input type="hidden" id="vip_hedgingCard_id_hidden" value="${result.id }"/>
									<!-- 会员卡类型 -->
									<input type="hidden"  name="useCardType4Hedging" id ="useCardType4Hedging"  value="4"/>
								</c:if>
								<c:if test="${result.v7CType  eq '5'}"> 
									<span class="label label-success radius">洗吹卡</span>
									<input type="hidden" id="vip_record4BlowWash_id_hidden" value="${result.id }"/>
									<!-- 会员卡类型 -->
									<input type="hidden" name="useCardType4blowWash" id ="useCardType4blowWash" value="5"/>
								</c:if>
								<c:if test="${result.v7CType  eq '6'}"> 
									<span class="label label-success radius">洗剪吹卡</span>
									<input type="hidden" id="vip_record4BlowCutWash_id_hidden" value="${result.id }"/>
									<!-- 会员卡类型 -->
									<input type="hidden" name="useCardType4BlowCutWash" id ="useCardType4BlowCutWash" value="6"/>
								</c:if>
						</c:forEach>
					 </td>
				</tr>
			</table>
		</div>
		<!-- 会员信息end -->
		<div class="text-c">
			<div class="pd-5 bg-1-me" style="margin:0 auto;font-size:13px; text-align:center; margin-top: 2px;">结单信息</div>
				<table>
					<tr>
						<td style="padding:5px;" width="70px;  text-align:right;" >消费方式&nbsp;</td>
						<td id="consumption_td" style="padding:5px;  text-align:left;">
							<span id="vipSpan"> <input type="radio" name="consumption" value="1" onclick="consumptionFun(1)"/>&nbsp;VIP卡</span>
	                        <span id="hedgingSpan">&nbsp;<input type="radio" name="consumption" value="2" onclick="consumptionFun(2)"/> &nbsp;对冲卡</span>
	                        <span id="blowWashSpan">&nbsp;<input type="radio" name="consumption" value="3" onclick="consumptionFun(3)"/> &nbsp;洗吹卡</span>
	                        <span id="blowCutWashSpan">&nbsp;<input type="radio" name="consumption" value="4" onclick="consumptionFun(4)"/> &nbsp;洗剪吹卡</span>
	                        <span id="cashSpan">&nbsp;<input type="radio" name="consumption" value="5" onclick="consumptionFun(5)"/> &nbsp;现金</span>
						</td>
						
						<td style="padding:5px;  text-align:right;" >消费类型&nbsp;</td>
						<td style="padding:5px;  text-align:left;">
							<select name="consumeType" id="consumeType" onchange="changeInable(this)" class="select select-width">
								<option value="-1">请选择</option>
								<option value="1">洗吹</option>
								<option value="2">洗剪吹</option>
								<option value="3">烫发</option>
								<option value="4">染发</option>
								<option value="5">烫染发</option>
								<option value="6">烫染护</option>
								<option value="7">护发</option>
							</select>
						</td>
					</tr>
					
					<tr>
						<td style="padding:5px; text-align:right;" >烫发项目&nbsp;</td>
						<td style="padding:5px; text-align:left;">
							<select name="permCostPrice" id="perm" class="select select-width">
								<option value="-1">请选择</option>
								<c:forEach items="${perm }" var="perm">
									<option value="${perm}">${perm}</option>
								</c:forEach>
							</select>
						</td>
						
						<td style="padding:5px;  text-align:right;" >染发项目&nbsp;</td>
						<td style="padding:5px;  text-align:left;">
							<select name="dyeHairCostPrice" id="dyeHair" class="select select-width">
								<option value="-1">请选择</option>
								<c:forEach items="${dyeHair }" var="dyeHair">
									<option value="${dyeHair}">${dyeHair}</option>
								</c:forEach>
							</select>
						</td>
						
						<td style="padding:5px;  text-align:right;">护发项目&nbsp;</td>
						<td style="padding:5px;  text-align:left;">
							<select name="conditionerCostPrice"  id="conditioner" class="select select-width">
								<option value="-1">请选择</option>
								<c:forEach items="${conditioner }" var="conditioner">
									<option value="${conditioner}">${conditioner}</option>
								</c:forEach>
							</select>
						</td>
					</tr>
					
					<tr>
						<td style="padding:5px; text-align:right;" >发型师&nbsp;</td>
						<td style="padding:5px; text-align:left;">
							<select name="hairstylist" id="hairstylist" onchange="computeData()" class="select select-width">
								<option value="-1">请选择</option>
								<c:forEach items="${hairstylist }" var="hairstylist">
									<option value="${hairstylist.id }">${hairstylist.v7EName }</option>
								</c:forEach>
							</select>
						</td>
						
						<td style="padding:5px;  text-align:right;" >技师&nbsp;</td>
						<td style="padding:5px;  text-align:left;">
							<select name="technician" id="technician"  class="select select-width">
								<option value="-1">请选择</option>
								<c:forEach items="${technician }" var="technician">
									<option value="${technician.id }">${technician.v7EName }</option>
								</c:forEach>
							</select>
						</td>
						
						<td style="padding:5px;  text-align:right;">助理&nbsp;</td>
						<td style="padding:5px;  text-align:left;">
							<select name="assistant" id ="assistant" class="select select-width">
								<option value="-1">请选择</option>
								<c:forEach items="${assistant }" var="assistant">
									<option value="${assistant.id }">${assistant.v7EName }</option>
								</c:forEach>
							</select>
						</td>
					</tr>
					
				</table>
				<div class="pd-5 bg-1-me" style="margin:0 auto;font-size:13px; text-align:center; margin-top: 2px;">金额数据</div>
				<!-- VIP卡DIV -->
				<div id="vipdiv">
					<table>
						<tr id="vipdiv_systemDiscount_tr">
							<td style="padding:5px;">原价&nbsp;</td>
							<td style="padding:5px;"><input type="text" name="sumCostPrice" placeholder="消费原价" readonly="readonly" class="input-text"></td>
							<td style="padding:5px; text-align: right;" >折后价&nbsp;</td>
							<td style="padding:5px;"><input type="text" name="discountPrice"  placeholder="消费折后价" readonly="readonly" class="input-text"></td>
							<td style="padding:5px; text-align: right;">加价产品&nbsp;</td>
							<td style="padding:5px; text-align: left;">
								<select  name="raiseAmount"   class="select select-width" size="1">
									<option value="-1">请选择</option>
									<option value="10" >xx品牌 -10</option>
									<option value="20" >xx品牌 -20</option>
									<option value="30" >xx品牌 -30</option>
									<option value="40" >xx品牌 -40</option>
								</select>
							</td>
						</tr>
					</table>
				</div>
				<!-- 对冲卡DIV -->
				<div id="hedgingdiv">
					<table>
						<tr id="hedgingdiv_systemDiscount_tr">
							<td style="padding:5px;">原价&nbsp;</td>
							<td style="padding:5px;"><input type="text" name="sumCostPrice"  placeholder="消费原价" readonly="readonly" class="input-text"></td>
							<td style="padding:5px; text-align: right;" >应付现&nbsp;</td>
							<td style="padding:5px;"><input type="text" name="payCash4Hedging" placeholder="付现金额" readonly="readonly" class="input-text"></td>
							<td style="padding:5px; text-align: right;">加价产品&nbsp;</td>
							<td style="padding:5px; text-align: left;">
								<select  name="raiseAmount"  class="select select-width" size="1" >
									<option value="-1">请选择</option>
									<option value="10" >xx品牌 -10</option>
									<option value="20" >xx品牌 -20</option>
									<option value="30" >xx品牌 -30</option>
									<option value="40" >xx品牌 -40</option>
								</select>
							</td>
						</tr>
					</table>
				</div>
				
				
				<!--记次卡包括洗车卡,洗剪吹卡DIV -->
				<div id="recorddiv">
					<table>
						<tr id="recorddiv_systemDiscount_tr">
							<td style="padding:5px; text-align: right;" >划卡次数&nbsp;</td>
							<td style="padding:5px;"><input type="text" name="payRecord" placeholder="划卡次数" class="input-text"></td>
							<td style="padding:5px; text-align: right;">加价产品&nbsp;</td>
							<td style="padding:5px; text-align: left;">
								<select name="raiseAmount" class="select select-width" size="1">
									<option value="-1">请选择</option>
									<option value="10" >xx品牌 -10</option>
									<option value="20" >xx品牌 -20</option>
									<option value="30" >xx品牌 -30</option>
									<option value="40" >xx品牌 -40</option>
								</select>
							</td>
							
						</tr>
					</table>
				</div>
				
				
				<!-- 现金结账DIV -->
				<div id="cashdiv">
					<table>
						<tr id="vipdiv_CustomDiscount_tr">
							<td style="padding:5px;">原价&nbsp;</td>
							<td style="padding:5px;"><input type="text" name="sumCostPrice"  placeholder="消费原价" readonly="readonly"  class="input-text"></td>
							<td style="padding:5px; text-align: right;" >折扣率&nbsp;</td>
							<td style="padding:5px;"><input type="text" name="customDiscountRate" placeholder="消费折扣率"  class="input-text"></td>
							<td style="padding:5px; text-align: right;" >折后价&nbsp;</td>
							<td style="padding:5px;"><input type="text" name="discountPrice"  placeholder="折后价" class="input-text"></td>
							<td style="padding:5px; text-align: right;">加价产品&nbsp;</td>
							<td style="padding:5px; text-align: left;">
								<select  name="raiseAmount"  class="select select-width" size="1">
									<option value="-1">请选择</option>
									<option value="10" >xx品牌 -10</option>
									<option value="20" >xx品牌 -20</option>
									<option value="30" >xx品牌 -30</option>
									<option value="40" >xx品牌 -40</option>
								</select>
							</td>
						</tr>
					</table>
				</div>
			</div>
	
	
		
			<!-- 产品信息 -->
			<div   class="text-c">
				<div class="pd-5 bg-1-me" style="margin:0 auto;font-size:13px;  text-align:center;  margin-top: 2px;">产品外卖</div>
				<table>
					<tr>
						<td style="padding:5px; text-align: right;" >产品名称&nbsp;</td>
						<td style="padding:5px; text-align: left;" >
							<select name="product" id="prodictChange"  class="select select-width" size="1" onchange="selectMaxInPrice()">
								<option value="-1">请选择</option>
								<c:forEach items="${product }" var="product">
									<option value="${product.id }" >${product.v7PName }</option>
								</c:forEach>
							</select>
						</td>
						
						<td style="padding:5px; text-align: right;">库存数量&nbsp;</td>
				        <td style="padding:5px; text-align: left;">
				      	 <input type="text"  class="input-text" id="storeHaveCount" value="${count }"  readonly="readonly" placeholder="库存数量"  >
				        </td>
				      
				        <td style="padding:5px; text-align: right;">入库最高价&nbsp;</td>
				        <td style="padding:5px; text-align: left;">
				      	  <input type="text" class="input-text" id="storeMaxPrice" value="${maxPrice }" readonly="readonly" placeholder="历史入库最高价格">
				        </td>
					</tr>
					<tr>
						<td style="padding:5px; text-align: right;">销售人&nbsp;</td>
						<td style="padding:5px; text-align: left;">
							<select name="salePeoplel"   class="select select-width" size="1">
								<option value="-1">请选择</option>
								<c:forEach items="${employee }" var="employee">
									<option value="${employee.id }">${employee.v7EName }</option>
								</c:forEach>
							</select>
						</td>
						<td style="padding:5px; text-align: right;">销售金额&nbsp;</td>
						<td style="padding:5px; text-align: left;"><input type="text"  name="saleAmount"  placeholder=" 请输入消费金额"  class="input-text"></td>
					</tr>
				</table>
			</div>
			<div style="margin-left: 75%">
				<button  class="btn btn-success radius mr-20"style="line-height:1.6em;margin-top:3px" > 结单</button>
			</div>
		</form>
	</div>
<script type="text/javascript" src="${ctx }/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${ctx }/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="${ctx }/lib/laypage/1.2/laypage.js"></script> 
<script type="text/javascript" src="${ctx }/lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="${ctx }/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="${ctx }/js/H-ui.js"></script> 
<script type="text/javascript" src="${ctx }/js/H-ui.admin.js"></script>
<script type="text/javascript">
$(function(){
	String.prototype.trim = function () {
		 return this.replace(/^\s\s*/, '' ).replace(/\s\s*$/, '' );
	}
});

/**结单成功后的提示信息*/
$(function(){
	var success = '${sashierSuccess}';
	if(success != ''){
		 layer.open({
				title:'提示',
				content: '结单成功!'
			});
	}
	
	
	/**点击左侧菜单导航后 隐藏非现金结账相关内容*/
	$("#hedgingdiv").hide(); 
	$("#vipdiv").hide(); 
	$("#recorddiv").hide(); 

	/**根据是否是非现金结账 隐藏现金结账消费方式和该会员新没有的会员卡类型的消费方式*/
	var memberInfo = '${memberInfo}';
	if('' == memberInfo){
		$("#memberInfoDiv").hide();
		$("#vipSpan").hide();
		$("#hedgingSpan").hide();
		$("#blowWashSpan").hide();
		$("#blowCutWashSpan").hide();
		$("input[type='radio'][name=consumption][value='5']").attr("checked",true);
	}else{
		/**非现金结账*/
		$("#memberInfoDiv").show();
		$("#cashSpan").hide();
		$("#cashdiv").hide();
		var tempCard =" ";
		$("#haveCardType").find("span").each(function(){
			tempCard +=$(this).text()+",";  
		})
		if(tempCard.indexOf("金卡") > 0 || tempCard.indexOf("银卡") > 0|| tempCard.indexOf("普卡") > 0 ){$("#vipSpan").show();}else{$("#vipSpan").hide();}
		if(tempCard.indexOf("对冲卡") > 0){$("#hedgingSpan").show();}else{$("#hedgingSpan").hide();}
		if(tempCard.indexOf("洗吹卡") > 0){$("#blowWashSpan").show();}else{$("#blowWashSpan").hide();}
		if(tempCard.indexOf("洗剪吹卡") > 0){$("#blowCutWashSpan").show();}else{$("#blowCutWashSpan").hide();}
		
		/**当该会员新只有一张会员卡时，该卡的消费方式默认被选中并且 价格输入内容和加价产品价格内容显示*/
		var tempArray = tempCard.split(",");
		if((tempArray.length -1)   == 1){
			var tempSingle = tempArray[0].trim();
			if(tempSingle == '金卡' || tempSingle == '银卡' || tempSingle == '普卡' ){
				$("input[type='radio'][name=consumption][value='1']").attr("checked",true);
				$("#vipdiv").show();
			}
			if(tempSingle == '对冲卡'){
				$("input[type='radio'][name=consumption][value='2']").attr("checked",true);
				$("#hedgingdiv").show();
			}
			if(tempSingle == '洗吹卡'){
				$("input[type='radio'][name=consumption][value='3']").attr("checked",true);
				$("#recorddiv").show();
			}
			if(tempSingle == '洗剪吹卡'){
				$("input[type='radio'][name=consumption][value='4']").attr("checked",true);
				$("#recorddiv").show();
			}
			//给隐藏域中的会员使用默认的会员卡赋值
			$("#cardId").val('${memberInfo.memberCard[0].id}');
			//给隐藏域中的会员使用默认的会员卡类型赋值
			$("#useCardType").val('${memberInfo.memberCard[0].v7CType}');
		} 
	}
	
	/**烫染护项目不可编辑*/
	$("#perm").attr("disabled",true);  
	$("#dyeHair").attr("disabled",true);  
	$("#conditioner").attr("disabled",true);  

});

/**根据消费类型变更烫染护项目是否可编辑*/
function changeInable(){
	//消费方式是否确认
	 var consumptionVal = $("input[type='radio'][name=consumption]:checked ").val(); //消费方式
	 if(consumptionVal == undefined){
		 layer.open({
				title:'警告',
				content: '请先选择消费方式！'
			});
		 return;
	 }
	
	//清空关联选项中的数据
	var hairstylist = document.getElementById("hairstylist");hairstylist.options[0].selected = true;
	var technician = document.getElementById("technician");technician.options[0].selected = true;
	var assistant = document.getElementById("assistant");assistant.options[0].selected = true;
	
	var perm = document.getElementById("perm");perm.options[0].selected = true;
	var dyeHair = document.getElementById("dyeHair");dyeHair.options[0].selected = true;
	var conditioner = document.getElementById("conditioner");conditioner.options[0].selected = true;
	
	//原价，折后价，应付现，划卡次数
	$("input[name='sumCostPrice']").each(function (){
			$(this).attr('value',"");
	}); 
	$("input[name='discountPrice']").each(function (){
		$(this).attr('value','');
	}); 
	$("input[name='payCash4Hedging']").each(function (){
		$(this).attr('value','');
	}); 
	$("input[name='payRecord']").each(function (){
		$(this).attr('value','');
	}); 
	
	var temp = $("#consumeType").find("option:selected").val();
	if(temp == 1 || temp == 2 ){
		$("#perm").attr("disabled",true);  
		$("#dyeHair").attr("disabled",true);  
		$("#conditioner").attr("disabled",true);  
	}else if(temp == 3 ){
		$("#dyeHair").attr("disabled",true);  
		$("#conditioner").attr("disabled",true); 
		$("#perm").attr("disabled",false);  
	}else if (temp == 4 ){
		$("#perm").attr("disabled",true);  
		$("#conditioner").attr("disabled",true); 
		$("#dyeHair").attr("disabled",false);  
	}else if(temp == 5){
		$("#conditioner").attr("disabled",true);  
		$("#perm").attr("disabled",false);  
		$("#dyeHair").attr("disabled",false);  
	}else if(temp == 6){
		$("#perm").attr("disabled",false);  
		$("#dyeHair").attr("disabled",false);  
		$("#conditioner").attr("disabled",false);  
	}else if(temp == 7 ){
		$("#perm").attr("disabled",true);  
		$("#dyeHair").attr("disabled",true); 
		$("#conditioner").attr("disabled",false);
	}
}
/**根据消费方式 动态显示或隐藏价格输入内容,隐藏域中会员使用的会员卡ID赋值,和会员卡类型*/
function consumptionFun(consumptionType){
	if("5" == consumptionType){  //现金
		$("#cashdiv").show(); 
		$("#hedgingdiv").hide(); 
		$("#vipdiv").hide(); 
		$("#recorddiv").hide(); 
	}else if("4" == consumptionType){ //洗剪吹
		$("#recorddiv").show(); 
		$("#cashdiv").hide(); 
		$("#hedgingdiv").hide(); 
		$("#vipdiv").hide();
		$("#cardId").val($("#vip_record4BlowCutWash_id_hidden").val());
		$("#useCardType").val($("#useCardType4BlowCutWash").val());
		
	}else if("3" == consumptionType){  //洗吹
		$("#recorddiv").show(); 
		$("#cashdiv").hide(); 
		$("#hedgingdiv").hide(); 
		$("#vipdiv").hide();
		$("#cardId").val($("#vip_record4BlowWash_id_hidden").val());
		$("#useCardType").val($("#useCardType4blowWash").val());
	
	}else if("2" == consumptionType){  //对冲卡
		$("#recorddiv").hide(); 
		$("#cashdiv").hide(); 
		$("#hedgingdiv").show(); 
		$("#vipdiv").hide();
		$("#cardId").val($("#vip_hedgingCard_id_hidden").val());
		$("#useCardType").val($("#useCardType4Hedging").val());
	
	}else if("1" == consumptionType){   //VIP
		$("#recorddiv").hide(); 
		$("#cashdiv").hide(); 
		$("#hedgingdiv").hide(); 
		$("#vipdiv").show();
		$("#cardId").val($("#vip_goldCard_id_hidden").val() != undefined?$("#vip_goldCard_id_hidden").val():$("#vip_silverCard_id_hidden").val() != undefined?$("#vip_silverCard_id_hidden").val():$("#vip_classicCard_id_hidden").val());
		$("#useCardType").val($("#useCardType4VIP").val());
	}
	
}

/**搜索条件非空校验*/
function verification(){
    if (document.getElementById('selects').value=='') {
        layer.open({
			title:'警告',
			content: '请输入搜索条件！'
		});
        $("#buttons").attr("type","button");
    }else{
    	 $("#buttons").attr("type","submit");
    }
} 

/**获取外卖商品入库最高价格*/
function selectMaxInPrice(){
	var productText = $("#prodictChange").find("option:selected").text();
	$.ajax({
	    url: "${ctx}/outProduct/showStoreInfo.action",
	    type:"post",
	    dataType: "json",
	    data: {
	      term:productText
	    },
	    success: function( data ) {
	    	if(data.count == undefined){
	    		 layer.open({
	    				title:'警告',
	    				content: '该产品下没能检索到数据~'
	    			});
	    		 $("#storeHaveCount").val(data.count);
			     $("#storeMaxPrice").val(data.maxPrice);
	    	}else{
		     	$("#storeHaveCount").val(data.count);
		     	$("#storeMaxPrice").val(data.maxPrice);
	    		
	    	}
	     } 
	  });
	
}
/*********************页面计算，消费原价，折后价********************/
function computeData(){
	var temp = $("#consumeType").find("option:selected").val();
	if(temp == -1){layerOpen();return;}
	if(temp == 1 ){
		$("input[name='sumCostPrice']").each(function (){
			$(this).attr('value',30);
		}); 
		//计算折后价
		computeDiscountPrice(30,0,0,0,0);
	}else if(temp == 2 ){
		var baseValue = $("#hairstylist").find("option:selected").text();
		baseValue =  strSplit(baseValue);
		if(baseValue == -1 ){layerOpen();return;}
		$("input[name='sumCostPrice']").each(function (){
			$(this).attr('value',baseValue);
		}); 
		//计算折后价
		computeDiscountPrice(0,baseValue,0,0,0);
	}else if(temp == 3 ){
		var perm = $("#perm").find("option:selected").val();
		if(perm == -1 || temp == -1){layerOpen();return;}
		var permPrice =  strSplit(perm)
		$("input[name='sumCostPrice']").each(function (){
			$(this).attr('value',permPrice);
		}); 
		//计算折后价
		computeDiscountPrice(0,0,permPrice,0,0);
	}else if (temp == 4 ){
		var dyeHair = $("#dyeHair").find("option:selected").val();
		if(dyeHair == -1 || temp == -1){layerOpen();return;}
		dyeHair =  strSplit(dyeHair)
		$("input[name='sumCostPrice']").each(function (){
			$(this).attr('value',dyeHair);
		}); 
		//计算折后价
		computeDiscountPrice(0,0,0,dyeHair,0);
	}else if(temp == 5){
		var perm = $("#perm").find("option:selected").val();
		var dyeHair = $("#dyeHair").find("option:selected").val();
		if(perm == -1 || temp == -1 || dyeHair == -1){layerOpen();return;}
		var permPrice =  strSplit(perm)
		var dyeHair =  strSplit(dyeHair)
		$("input[name='sumCostPrice']").each(function (){
			$(this).attr('value',parseInt(dyeHair) +parseInt(permPrice));
		}); 
		//计算折后价
		computeDiscountPrice(0,0,permPrice,dyeHair,0);
		
	}else if(temp == 6){
		var perm = $("#perm").find("option:selected").val();
		var dyeHair = $("#dyeHair").find("option:selected").val();
		var conditioner = $("#conditioner").find("option:selected").val();
		if(perm == -1 || temp == -1 || dyeHair == -1 || conditioner == -1){layerOpen();return;}
		var permPrice =  strSplit(perm)
		var dyeHair =  strSplit(dyeHair)
		var conditioner =  strSplit(conditioner)
		$("input[name='sumCostPrice']").each(function (){
			$(this).attr('value',parseInt(dyeHair) +parseInt(permPrice)+ parseInt(conditioner));
		}); 
		//计算折后价
		computeDiscountPrice(0,0,permPrice,dyeHair,conditioner);
	}else if(temp == 7 ){
		var conditioner = $("#conditioner").find("option:selected").val();
		if( conditioner == -1){layerOpen();return;}
		
		var conditioner =  strSplit(conditioner)
		$("input[name='sumCostPrice']").each(function (){
			$(this).attr('value',conditioner);
		}); 
		//计算折后价
		computeDiscountPrice(0,0,0,0,conditioner);
	}

}
/**
 *计算折后价 
 *blowWashCostPrice 洗吹原价  blowCutWashCostPrice 洗剪吹原价  permCostPrice 烫发原价
 *dyeHairCostPrice 染发原价  conditionerCostPrice 护发原价
 */
function computeDiscountPrice(blowWashCostPrice,blowCutWashCostPrice,permCostPrice,dyeHairCostPrice,conditionerCostPrice){
	var useCardType = $("#useCardType").val();
	
	if(useCardType ==1){//金卡
		var consumeType = $("#consumeType").find("option:selected").val();
		if(consumeType == 1){ //洗吹
			var discountRate = '${goldCard.blowWash}';
			var discountPrice = parseInt(blowWashCostPrice)*parseFloat(discountRate);
			$("input[name='discountPrice']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
		}else if(consumeType == 2){ //洗剪吹
			var discountRate = '${goldCard.blowCutWash}';
			var discountPrice = parseInt(blowCutWashCostPrice)*parseFloat(discountRate);
			$("input[name='discountPrice']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
			
		}else if(consumeType == 3){ //烫发
			var discountRate = '${goldCard.perm}';
			var discountPrice = parseInt(permCostPrice)*parseFloat(discountRate);
			$("input[name='discountPrice']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
			
		}else if(consumeType == 4){ //染发
			var discountRate = '${goldCard.dyeHair}';
			var discountPrice = parseInt(dyeHairCostPrice)*parseFloat(discountRate);
			$("input[name='discountPrice']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
		}else if(consumeType == 5){ //烫染发
			var discountRatePerm = '${goldCard.perm}';
			var discountRateDyeHair = '${goldCard.dyeHair}';
			var discountPrice = (parseInt(dyeHairCostPrice)*parseFloat(discountRateDyeHair))+(parseInt(permCostPrice)*parseFloat(discountRatePerm));
			$("input[name='discountPrice']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
			
		}else if(consumeType == 6){ //烫染护发
			var discountRatePerm = '${goldCard.perm}';
			var discountRateDyeHair = '${goldCard.dyeHair}';
			var discountRateConditioner = '${goldCard.conditioner}';
			var discountPrice = (parseInt(dyeHairCostPrice)*parseFloat(discountRateDyeHair))+(parseInt(permCostPrice)*parseFloat(discountRatePerm))+(parseInt(conditionerCostPrice)*parseFloat(discountRateConditioner));
			$("input[name='discountPrice']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
			
		}else if(consumeType == 7){ //护发
			var discountRateConditioner = '${goldCard.conditioner}';
			var discountPrice = parseInt(conditionerCostPrice)*parseFloat(discountRateConditioner);
			$("input[name='discountPrice']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
		}
		
	}else if(useCardType == 2){  //银卡
		var consumeType = $("#consumeType").find("option:selected").val();
		if(consumeType == 1){ //洗吹
			var discountRate = '${silverCard.blowWash}';
			var discountPrice = parseInt(blowWashCostPrice)*parseFloat(discountRate);
			$("input[name='discountPrice']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
		}else if(consumeType == 2){ //洗剪吹
			var discountRate = '${silverCard.blowCutWash}';
			var discountPrice = parseInt(blowCutWashCostPrice)*parseFloat(discountRate);
			$("input[name='discountPrice']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
			
		}else if(consumeType == 3){ //烫发
			var discountRate = '${silverCard.perm}';
			var discountPrice = parseInt(permCostPrice)*parseFloat(discountRate);
			$("input[name='discountPrice']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
			
		}else if(consumeType == 4){ //染发
			var discountRate = '${silverCard.dyeHair}';
			var discountPrice = parseInt(dyeHairCostPrice)*parseFloat(discountRate);
			$("input[name='discountPrice']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
		}else if(consumeType == 5){ //烫染发
			var discountRatePerm = '${silverCard.perm}';
			var discountRateDyeHair = '${silverCard.dyeHair}';
			var discountPrice = (parseInt(dyeHairCostPrice)*parseFloat(discountRateDyeHair))+(parseInt(permCostPrice)*parseFloat(discountRatePerm));
			$("input[name='discountPrice']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
			
		}else if(consumeType == 6){ //烫染护发
			var discountRatePerm = '${silverCard.perm}';
			var discountRateDyeHair = '${silverCard.dyeHair}';
			var discountRateConditioner = '${silverCard.conditioner}';
			var discountPrice = (parseInt(dyeHairCostPrice)*parseFloat(discountRateDyeHair))+(parseInt(permCostPrice)*parseFloat(discountRatePerm))+(parseInt(conditionerCostPrice)*parseFloat(discountRateConditioner));
			$("input[name='discountPrice']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
			
		}else if(consumeType == 7){ //护发
			var discountRateConditioner = '${silverCard.conditioner}';
			var discountPrice = parseInt(conditionerCostPrice)*parseFloat(discountRateConditioner);
			$("input[name='discountPrice']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
		}
		
	}else if(useCardType == 3){  //普卡
		var consumeType = $("#consumeType").find("option:selected").val();
		if(consumeType == 1){ //洗吹
			var discountRate = '${classicCard.blowWash}';
			var discountPrice = parseInt(blowWashCostPrice)*parseFloat(discountRate);
			$("input[name='discountPrice']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
		}else if(consumeType == 2){ //洗剪吹
			var discountRate = '${classicCard.blowCutWash}';
			var discountPrice = parseInt(blowCutWashCostPrice)*parseFloat(discountRate);
			$("input[name='discountPrice']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
			
		}else if(consumeType == 3){ //烫发
			var discountRate = '${classicCard.perm}';
			var discountPrice = parseInt(permCostPrice)*parseFloat(discountRate);
			$("input[name='discountPrice']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
			
		}else if(consumeType == 4){ //染发
			var discountRate = '${classicCard.dyeHair}';
			var discountPrice = parseInt(dyeHairCostPrice)*parseFloat(discountRate);
			$("input[name='discountPrice']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
		}else if(consumeType == 5){ //烫染发
			var discountRatePerm = '${classicCard.perm}';
			var discountRateDyeHair = '${classicCard.dyeHair}';
			var discountPrice = (parseInt(dyeHairCostPrice)*parseFloat(discountRateDyeHair))+(parseInt(permCostPrice)*parseFloat(discountRatePerm));
			$("input[name='discountPrice']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
			
		}else if(consumeType == 6){ //烫染护发
			var discountRatePerm = '${classicCard.perm}';
			var discountRateDyeHair = '${classicCard.dyeHair}';
			var discountRateConditioner = '${classicCard.conditioner}';
			var discountPrice = (parseInt(dyeHairCostPrice)*parseFloat(discountRateDyeHair))+(parseInt(permCostPrice)*parseFloat(discountRatePerm))+(parseInt(conditionerCostPrice)*parseFloat(discountRateConditioner));
			$("input[name='discountPrice']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
			
		}else if(consumeType == 7){ //护发
			var discountRateConditioner = '${classicCard.conditioner}';
			var discountPrice = parseInt(conditionerCostPrice)*parseFloat(discountRateConditioner);
			$("input[name='discountPrice']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
		}
	}else if(useCardType == 4){  //对冲卡
		var consumeType = $("#consumeType").find("option:selected").val();
		if(consumeType == 1){ //洗吹
			var discountRate = '${hedgingCard.blowWash}';
			var discountPrice = parseInt(blowWashCostPrice)*parseFloat(discountRate);
			$("input[name='payCash4Hedging']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
		}else if(consumeType == 2){ //洗剪吹
			var discountRate = '${hedgingCard.blowCutWash}';
			var discountPrice = parseInt(blowCutWashCostPrice)*parseFloat(discountRate);
			$("input[name='payCash4Hedging']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
			
		}else if(consumeType == 3){ //烫发
			var discountRate = '${hedgingCard.perm}';
			var discountPrice = parseInt(permCostPrice)*parseFloat(discountRate);
			$("input[name='payCash4Hedging']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
			
		}else if(consumeType == 4){ //染发
			var discountRate = '${hedgingCard.dyeHair}';
			var discountPrice = parseInt(dyeHairCostPrice)*parseFloat(discountRate);
			$("input[name='payCash4Hedging']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
		}else if(consumeType == 5){ //烫染发
			var discountRatePerm = '${hedgingCard.perm}';
			var discountRateDyeHair = '${hedgingCard.dyeHair}';
			var discountPrice = (parseInt(dyeHairCostPrice)*parseFloat(discountRateDyeHair))+(parseInt(permCostPrice)*parseFloat(discountRatePerm));
			$("input[name='payCash4Hedging']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
			
		}else if(consumeType == 6){ //烫染护发
			var discountRatePerm = '${hedgingCard.perm}';
			var discountRateDyeHair = '${hedgingCard.dyeHair}';
			var discountRateConditioner = '${hedgingCard.conditioner}';
			var discountPrice = (parseInt(dyeHairCostPrice)*parseFloat(discountRateDyeHair))+(parseInt(permCostPrice)*parseFloat(discountRatePerm))+(parseInt(conditionerCostPrice)*parseFloat(discountRateConditioner));
			$("input[name='payCash4Hedging']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
			
		}else if(consumeType == 7){ //护发
			var discountRateConditioner = '${hedgingCard.conditioner}';
			var discountPrice = parseInt(conditionerCostPrice)*parseFloat(discountRateConditioner);
			$("input[name='payCash4Hedging']").each(function (){
				$(this).attr('value',discountPrice.toFixed(2));
			}); 
		}
	}else if(useCardType == 5){  //记次卡
		
	}
	
}
 function strSplit(str){
	var temp =   str.substring(str.indexOf("-")+1,str.length);
	return temp;
 }
 
 function layerOpen(){
	 layer.open({
			title:'警告',
			content: '数据填写不全！'
		});
 }
 /**对计算结果精确到小数点后两位，其后的全舍弃*/
 function resultPrecision(result){
	 alert(result);
	 if(result.indexOf(".") > 0){
		 var index = result.indexOf(".")+2;
		 result = result.split(0,index);
	 }else {return result;}
	 
 }
 
 
 
 /*提交买单验证*/
 function checkCashier(){
	 var warning ="";
	 var consumptionVal = $("input[type='radio'][name=consumption]:checked ").val(); //消费方式
	 if(consumptionVal == undefined){warning+="消费方式不能为空！<br/>"}
	 var hairstylist = $("#hairstylist").find("option:selected").val();  //发型师
	 if(hairstylist == -1){warning += "发型师不能为空！<br/>"}
	 var technician = $("#technician").find("option:selected").val();    //技师
	 if(technician == -1){warning += "技师不能为空！<br/>"}
	 var consumeType = $("#consumeType").find("option:selected").val();  //消费类型
	 if(consumeType == -1){warning+="消费类型不能为空！<br/>"}
	 else if(consumeType == 3){
		 var perm = $("#perm").find("option:selected").val();
		 if('-1' == perm){warning +="烫发选项不能为空！<br/>"}
	 }else if(consumeType == 4){
		 var perm = $("#dyeHair").find("option:selected").val();
		 if('-1' == perm){warning +="染发选项不能为空！<br/>"}
	 }else if(consumeType == 5){
		 var perm = $("#dyeHair").find("option:selected").val();
		 if('-1' == perm){warning +="染发选项不能为空！<br/>"}
		 var perm = $("#dyeHair").find("option:selected").val();
		 if('-1' == perm){warning +="染发选项不能为空！<br/>"}
	 }else if(consumeType == 6){
		 var perm = $("#perm").find("option:selected").val();
		 if('-1' == perm){warning +="烫发选项不能为空！<br/>"}
		 var perm = $("#dyeHair").find("option:selected").val();
		 if('-1' == perm){warning +="染发选项不能为空！<br/>"}
		 var perm = $("#conditioner").find("option:selected").val();
		 if('-1' == perm){warning +="护发选项不能为空！<br/>"}
	 }else if(consumeType == 7){
		 var perm = $("#conditioner").find("option:selected").val();
		 if('-1' == perm){warning +="护发选项不能为空！<br/>"}
	 }
	 
	 var discount = $("#discount").find("option:selected").val();
	 
	 
	 if(warning !=''){
		 layer.open({
				title:'警告',
				content: warning
			});
		 return false;
	 }
	 layer.open({
			type:3
		});
	 return true;
 }
</script>
</body>
</html>