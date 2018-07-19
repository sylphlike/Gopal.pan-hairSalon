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

<title>前台日轧账</title>
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
	$(function() {
		var flag = '${flag}';
		if(1 == flag){
			document.getElementById("showInfo").style.display="online";
		}else if(2 == flag){
			document.getElementById("showInfo").style.display="none";
		}
		
		var myDate = new Date();

		var fullYear = myDate.getFullYear(); //获取完整的年份(4位,1970-????)
		var month = myDate.getMonth(); //获取当前月份(0-11,0代表1月)
		var date = myDate.getDate(); //获取当前日(1-31)
		var week_num = myDate.getDay(); //获取当前星期X(0-6,0代表星期天)
		var week;
		switch (week_num){
			case 0:{
				week = "星期日"
			}break;
			case 1:{
				week = "星期一"
			}break;
			case 2:{
				week ="星期二"
			}break;
			case 3:{
				week = "星期三"
			}break;
			case 4:{
				week = "星期四"
			}break;
			case 5:{
				week = "星期五"
			}break;
			case 6:{
				week = "星期六"
			}break;
			case 7:{
				week = "星期日"
			}break;
		}

		var currentDate = "今天是: " + fullYear + "年 " + (month + 1) + "月 " + date+ "日  " + week;
		$("#currentDate").html(currentDate);
		var charTitle = "--"+fullYear+"/"+(month+1)+"/"+date;
		var charVal = fullYear+"-"+(month+1)+"-"+date;

		var firstDate = new Date();
		firstDate.setDate(1); //第一天
		var todoList = new XDate(firstDate).toString('yyyy-MM-dd') + "到"+ fullYear + "-" + (month + 1) + "-" + date;
		$("#todoList").html(todoList);
		
	});
</script>
</head>
<body>
	<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span>前台管理 <span class="c-gray en">&gt;</span> 轧账管理</nav>
	<div class="pd-20">
		<div id="showInfo" class="pd-5 bg-1-me">
			<form id="generalFormId" action="${ctx }/cashierReport/rollingAccounts.action"method="POST">
				<div style="margin: 0 auto; font-size: 16px;font-family:方正舒体;  text-align: left; margin-top: -10px; background: #F5FAFE; vertical-align: ottom; text-align: center;">
				<%-- <img alt="日历" src="${ctx }/images/calendarDetail.gif"> &nbsp; --%>
				<span id="currentDate" ></span>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<button class="btn btn-primary radius">轧账</button>
				</div>
			</form>
		</div>
		<form id ="generalFormId" action="${ctx }/cashierReport/rollAccountsDayListHistory.action" method="POST">
			<div id="reportHistoryData">
				<div class="text-c" style="margin-left:220px; margin-top:5px;margin-bottom:5px;" > 
					<input type="text" class="input-text" style="width:150px" placeholder="输入轧账起始时间" id="" name="v7RBeginTime" value="${generalAttrName.v7RBeginTime }"
					onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd',minDate:'1990-03-08'})">&nbsp;-至-&nbsp;
					<input type="text" class="input-text" style="width:150px" placeholder="输入轧账束时间" id="" name="v7REndTime" value="${generalAttrName.v7REndTime }"
					onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd',minDate:'1990-03-08'})">
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
								<th width="75">轧账日期</th>
								<th width="85">现金收入</th>
								<th width="90">Vip划卡</th>
								<th width="95">对冲收入</th>
								<th width="105">洗吹划卡</th>
								<th width="105">洗剪吹划卡</th>
								<th width="100">Vip办卡</th>
								<th width="105">对冲办卡</th>
								<th width="105">洗吹办卡</th>
								<th width="105">洗剪吹办卡</th>
								<th width="95">办卡金额</th>
								<th width="95">加价金额</th>
								<th width="95">外卖金额</th>
								<th width="95">总现金收入</th>
							</tr>
		
						</thead>
						<tbody>
							<c:forEach items="${generalAttrName.recoredList }" var="roll">
						
								<tr class="text-c">
									<td>
										<c:if test="${not empty roll.v7RRollingDate }">
											<fmt:formatDate value="${roll.v7RRollingDate }" pattern="yyyy-MM-dd"/>
										</c:if>
									</td>				
									<td>${roll.v7RCash }</td>				
									<td>${roll.v7RVipout }</td>				
									<td>${roll.v7RHedgecashin }</td>				
									<td>${roll.v7RBlowwashout }</td>						
									<td>${roll.v7RBlowcutwashout }</td>						
									<td>${roll.v7RVipin }</td>						
									<td>${roll.v7RHedgein }</td>						
									<td>${roll.v7RBlowwashin }</td>						
									<td>${roll.v7RBlowcutwashin }</td>						
									<td>${roll.v7RCardmoney }</td>						
									<td>${roll.v7RRaiseamount }</td>						
									<td>${roll.v7RTakeout }</td>						
									<td>${roll.v7RTotalCash }</td>						
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