﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
<link href="${ctx}/lib/icheck/icheck.css" rel="stylesheet" type="text/css" />

<link href="${ctx}/lib/bootstrap-3.3.5-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${ctx}/lib/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>会员管理</title>
<style type="text/css">
	.bg-1-me{ background-color:#f5faed}
	td:first-child{text-align:right}
    td:nth-child(2){text-align:left}
    .select-width{width:250px;}
</style>
</head>
<body>
	<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 会员中心<span class="c-gray en">&gt;</span> 会员充值</nav>
	<div class="pd-20" style="margin-top:-30px;">
		<form action="${ctx}/card/searchCardRecharge.action" method="post">
			<div class="text-c"> <span class="select-box inline">
				<select name="searchType" class="select"  id="memberCondition" >
					<option value="1">会员编号</option>
					<option value="2">会员电话号</option>
					<option value="3">会员名</option>
				</select>
				</span> 
				<input type="text" name="searchNum" id="selects"  style="width:250px" class="input-text" />
				<button type="submit" class="btn btn-success radius mr-20" id="buttons" style="line-height:1.6em;margin-top:3px" onclick="verification()"><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
			</div>
			<div class="cl pd-5 bg-1 bk-gray mt-20"   style="margin:0 auto;   margin-top:6px;">会员基本信息</div> 
		
			<table class="table table-border table-bordered table-hover table-bg ">
				<thead>
					<tr class="text-c">
						<th width="90">会员编号</th>
						<th width="90">会员名</th>
						<th width="40">性别</th>
						<th width="90">手机</th>
						<th width="90">会员生日</th>
						<th width="90">状态</th>
						<th width="150">加入时间</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${memberCardList}" var="result">
			 			<tr>
							<td style="text-align: center;">${result.v7MNum}</td>
							<td style="text-align: center;">${result.v7MName}</td>
							<c:if test="${result.v7MSex  eq '1'}"> 
								<td style="text-align: center;">男</td>
							</c:if>
							<c:if test="${result.v7MSex  eq '2'}"> 
								<td style="text-align: center;">女</td>
							</c:if>
							<c:if test="${result.v7MStatus eq null}"> 
								<td style="text-align: center;"></td>
							</c:if>
							
							<td style="text-align: center;">${result.v7MPhone}</td>
							<td style="text-align: center;">
								<fmt:formatDate value="${result.v7MBirthday}" pattern="yyyy-MM-dd"/>
							</td>
							<c:if test="${result.v7MStatus  eq '1'}"> 
								<td style="text-align: center;">启用</td>
							</c:if>
							<c:if test="${result.v7MStatus  eq '2'}"> 
								<td style="text-align: center;">失效</td>
							</c:if>
							<c:if test="${result.v7MStatus  eq '3'}"> 
								<td style="text-align: center;">删除</td>
							</c:if>
							<c:if test="${result.v7MStatus eq null}"> 
								<td style="text-align: center;"></td>
							</c:if>
							<td style="text-align: center;">
							<fmt:formatDate value="${result.v7MCrateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
							</td>
						</tr>
			     </c:forEach> 
			</tbody>
		</table>
		<div class="cl pd-5 bg-1 bk-gray mt-20"   style="margin:0 auto; margin-top:-20px;">会员卡信息</div> 
		<table class="table table-border table-bordered table-hover table-bg ">
			<thead>
				<tr class="text-c">
					<th width="100">会员卡类型</th>
					<th width="130">卡余额/剩余次数</th>
					<th width="130">累计充值金额</th>
					<th width="190">累计积分（记次卡无积分）</th>
					<th width="140">状态</th>
					<th width="140">操作</th>
				</tr>
			</thead>
			<tbody>
				
			<c:forEach items="${memberCardList}" varStatus="status" >
			 	 <c:forEach items="${memberCardList[status.index].memberCard}" var="result" >
					 <tr>
						<c:if test="${result.v7CType  eq '1'}"> 
							<td style="text-align: center;">金卡</td>
						</c:if>
						<c:if test="${result.v7CType  eq '2'}"> 
							<td style="text-align: center;">银卡</td>
						</c:if>
						<c:if test="${result.v7CType  eq '3'}"> 
							<td style="text-align: center;">普卡</td>
						</c:if>
						<c:if test="${result.v7CType  eq '4'}"> 
							<td style="text-align: center;">对冲卡</td>
						</c:if>
						<c:if test="${result.v7CType  eq '5'}"> 
							<td style="text-align: center;">洗吹卡</td>
						</c:if>
						<c:if test="${result.v7CType  eq '6'}"> 
							<td style="text-align: center;">洗剪吹卡</td>
						</c:if>
						<td style="text-align: center;">${result.v7CSurplusAmount}</td>
						<td style="text-align: center;">${result.v7CRechargeAmount }</td>
						<td style="text-align: center;">${result.v7CTintegral }</td>
						<c:if test="${result.v7CStatus  eq '1'}"> 
						<td style="text-align: center;">启用</td>
						</c:if>
						<c:if test="${result.v7CStatus  eq '2'}"> 
						<td style="text-align: center;">失效</td>
						</c:if>
						<c:if test="${result.v7CStatus  eq '3'}"> 
						<td style="text-align: center;">删除</td>
						</c:if>
						<td class="td-manage" style="text-align: center;">
							<c:if test="${result.v7CType  eq '6'}">
								该类型卡不能充值
							</c:if>
							<c:if test="${result.v7CType  eq '5'}">
								该类型卡不能充值
							</c:if>
							<c:if test="${result.v7CType  eq '4'}">
								该类型卡不能充值
							</c:if>
							<c:if test="${result.v7CType  eq '1'}">
								<a title="充值" href="javascript:;" onclick="general_open_window_no_param('充值','${ctx}/card/cardRechargeView.action?id=${result.id}&v7CType=${result.v7CType}')" class="ml-5" style="text-decoration:none;" class="ml-5" style="text-decoration:none"><img alt="充值" src="${ctx }/images/recharge.jpg"></a>
							</c:if>
							<c:if test="${result.v7CType  eq '2'}">
								<a title="充值" href="javascript:;" onclick="general_open_window_no_param('充值','${ctx}/card/cardRechargeView.action?id=${result.id}&v7CType=${result.v7CType}')" class="ml-5" style="text-decoration:none;" class="ml-5" style="text-decoration:none"><img alt="充值" src="${ctx }/images/recharge.jpg"></a>
							</c:if>
							<c:if test="${result.v7CType  eq '3'}">
								<a title="充值" href="javascript:;" onclick="general_open_window_no_param('充值','${ctx}/card/cardRechargeView.action?id=${result.id}&v7CType=${result.v7CType}')" class="ml-5" style="text-decoration:none;" class="ml-5" style="text-decoration:none"><img alt="充值" src="${ctx }/images/recharge.jpg"></a>
							</c:if>
						</td>
					  </tr>
				 	</c:forEach> 	
			 	</c:forEach>
			</tbody>
		</table>
	</form>
</div>
	
<script type="text/javascript" src="${ctx}/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${ctx}/lib/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="${ctx}/lib/Validform/5.3.2/Validform.min.js"></script>
<script type="text/javascript" src="${ctx}/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="${ctx}/js/H-ui.js"></script> 
<script type="text/javascript" src="${ctx}/js/H-ui.admin.js"></script>
<script type="text/javascript" src="${ctx }/js/v7mc_base.js"></script> 
<script type="text/javascript">
	$(function(){
		var checkNull = '${nullData}';
		if('nullData' == checkNull){
			layer.msg("系统中不存在该会员数据!",{icon:5,time:3000});
		}
		
	});

	/**搜索条件非空校验*/
    function verification(){
        if (document.getElementById('selects').value=='') {
            layer.msg("请输入搜索条件！",{icon:5,time:2000});
            $("#buttons").attr("type","button");
        }else{
        	 $("#buttons").attr("type","submit");
        }
    } 
</script>
	
	
	
</body>
</html>