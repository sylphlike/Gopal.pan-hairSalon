<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,member-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link href="${ctx}/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet"type="text/css" />

<title>前台收银历史记录</title>
<style type="text/css">
	#showInfo * {vertical-align: bottom;}
</style>
<script type="text/javascript" src="${ctx }/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${ctx }/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="${ctx }/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript" src="${ctx }/js/H-ui.js"></script>
<script type="text/javascript" src="${ctx }/js/H-ui.admin.js"></script>
<script type="text/javascript" src="${ctx }/js/v7mc_base.js"></script>
<script type="text/javascript" src="${ctx }/js/xdate.js"></script>
<script type="text/javascript" src="${ctx }/lib/My97DatePicker/WdatePicker.js"></script> 
<script  src="${ctx }/js/echarts.js"></script>

<script type="text/javascript">

</script>
</head>
<body>
	<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span>前台管理 <span class="c-gray en">&gt;</span> 收银历史记录</nav>
	<div class="pd-20">
	<form id ="generalFormId" action="${ctx }/cashier/cashierList.action" method="POST">
		<div id="reportHistoryData">
		<div class="text-c" style="margin-left:220px; margin-top:5px;margin-bottom:5px;" > 
			<input type="text" class="input-text" style="width:150px" placeholder="输入结单始时间" id="" name="v7CBeginTime" value="${generalAttrName.v7CBeginTime }"
			onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'1990-03-08 11:30:00'})">&nbsp;-至-&nbsp;
			<input type="text" class="input-text" style="width:150px" placeholder="输入结单结束时间" id="" name="v7CEndTime" value="${generalAttrName.v7CEndTime }"
			onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'1990-03-08 11:30:00'})">
			<button type="submit" class="btn btn-success radius" id="generalSearch" name=""><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
			&nbsp;&nbsp;
			<a class="btn btn-success radius mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" ><i class="Hui-iconfont">&#xe68f;</i> reset</a>
		</div>
		<div class="cl pd-5 bg-1 bk-gray mt-20" style="margin-top:5px;" > 
			
			<div style="float:right;margin-top:11px;margin-bottom:0 px;margin-left:10px; ">
				第<strong>${generalAttrName.currentPage }</strong>页 &nbsp;
				共<strong>${generalAttrName.pageCount }</strong> 页&nbsp;
				共<strong>${generalAttrName.recordCount }</strong>条数据&nbsp;
			</div>
			
			<span style="float:right; margin-right: 20px;" >
				<input type="button" class="btn btn-primary radius" onclick="changePage(1,${generalAttrName.pageCount})" value="首页">
				<input type="button" class="btn btn-primary radius" onclick="changePage(${generalAttrName.currentPage}-1,${generalAttrName.pageCount})" value="上一页">
				<input type="button" class="btn btn-primary radius" onclick="changePage(${generalAttrName.currentPage}+1,${generalAttrName.pageCount})" value="下一页">
				<input type="button" class="btn btn-primary radius" onclick="changePage(${generalAttrName.pageCount},${generalAttrName.pageCount})" value="尾页">
					
			</span>
		</div>
		<div class="mt-20" style="margin-top:5px;">
			<table class="table table-border table-bordered table-hover table-bg ">
				<thead>
					<tr class="text-c">
						<th width="75">消费方式</th>
						<th width="75">消费类型</th>
						<th width="60">会员名</th>
						<th width="63">卡类型</th>
						<!-- <th width="60">总原价</th> -->
						<th width="57">折后价</th>
						<!-- <th width="49">折扣率</th> -->
						<th width="60">对冲卡</th>
						<th width="60">现金</th>
						<th width="53">记次卡</th>
						<th width="42">加价</th>
						<th width="60">发型师</th>
						<th width="55">技师</th>
						<th width="94">产品名称</th>
						<th width="55">销售人</th>
						<th width="75">销售总价</th>
						<th width="150">结单时间</th>
						
					</tr>

				</thead>
				<tbody>
					<c:forEach items="${generalAttrName.recoredList }" var="cashier">
						<tr class="text-c">
							<td>
								<c:if test="${cashier.v7RConsumption  eq 1}">vip卡</c:if>
								<c:if test="${cashier.v7RConsumption  eq 2}">对冲卡</c:if>
								<c:if test="${cashier.v7RConsumption  eq 3}">洗吹卡</c:if>
								<c:if test="${cashier.v7RConsumption  eq 4}">洗剪吹卡</c:if>
								<c:if test="${cashier.v7RConsumption  eq 5}">现金</c:if>
							</td>	
							<td>
								<c:if test="${cashier.v7RConsumetype eq 1}">洗吹</c:if>
								<c:if test="${cashier.v7RConsumetype eq 2}">洗剪吹</c:if>
								<c:if test="${cashier.v7RConsumetype eq 3}">烫发</c:if>
								<c:if test="${cashier.v7RConsumetype eq 4}">染发</c:if>
								<c:if test="${cashier.v7RConsumetype eq 5}">烫染发</c:if>
								<c:if test="${cashier.v7RConsumetype eq 6}">烫染护</c:if>
								<c:if test="${cashier.v7RConsumetype eq 7}">护发</c:if>
							</td>				
							<td>${cashier.v7RMemberid}</td>				
							<td>
								<c:if test="${cashier.v7RUsecardtype eq 1}">金卡</c:if>
								<c:if test="${cashier.v7RUsecardtype eq 2}">银卡</c:if>
								<c:if test="${cashier.v7RUsecardtype eq 3}">普卡</c:if>
								<c:if test="${cashier.v7RUsecardtype eq 4}">对冲卡</c:if>
								<c:if test="${cashier.v7RUsecardtype eq 5}">洗吹卡</c:if>
								<c:if test="${cashier.v7RUsecardtype eq 6}">洗剪吹卡</c:if>
							</td>				
						<%-- 	<td>${cashier.v7RSumcostprice}</td>		 --%>		
							<td>${cashier.v7RDiscountprice}</td>				
						<%-- 	<td>${cashier.v7RDiscountrate}</td>		 --%>		
							<td>${cashier.v7RPaycash4hedging}</td>				
							<td>${cashier.v7RPaycash}</td>				
							<td>${cashier.v7RRecordnum}</td>				
							<td>${cashier.v7RRaiseamount}</td>				
							<td>${cashier.v7RHairstylist}</td>				
							<td>${cashier.v7RTechnician}</td>				
							<td>${cashier.v7RProductid}</td>				
							<td>${cashier.v7RSaleUser}</td>				
							<td>${cashier.v7RSaleTotalprice}</td>				
							<td>
								<c:if test="${not empty cashier.v7RStatementDate}">
									<fmt:formatDate value="${cashier.v7RStatementDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
								</c:if>
							</td>				
										
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		</div>
	</form>
	</div>
</body>
</html>