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
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,member-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link href="${ctx}/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${ctx }/lib/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="${ctx }/lib/My97DatePicker/calendar.js"></script>
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>会员详情</title>


</head>
<body>
<div class="pd-20">
<div class="pd-5 bg-1-me" style="margin:0 auto;font-size:13px;background-color:#F5FAFE; text-align:center;">会员基本信息</div>
	<c:forEach items="${memberCardList}" var="member">
	<table style="background-color:#f5faeh; height: 65px;"  >
		<tr style='background-color:#EFE4E4'>
			<td  style="padding:5px; text-align:right"><span style="font-family:华文中宋;font-size:14px;">会员编号</span></td>
			<td style="padding:5px;">
				<span style="font-family:华文中宋;font-size:15px; ">${member.v7MNum }</span>
				
				
			</td>
			<td style="padding:5px; text-align:right"><span style="font-family:华文中宋;font-size:14px;">会员姓名</span></td>
			<td style="padding:5px;">
				<span style="font-family:华文中宋;font-size:15px; ">${member.v7MName}</span>
			</td>
		</tr>
		<tr style='background-color:#F5FAFE'>
			<td style="padding:5px; text-align:right"><span style="font-family:华文中宋;font-size:14px;">真实名称</span></td>
			<td style="padding:5px;">
				<span style="font-family:华文中宋;font-size:15px; ">${member.v7MRealName}</span>
			</td>
			<td style="padding:5px; text-align:right"><span style="font-family:华文中宋;font-size:14px;">电话号码</span></td>
			<td style="padding:5px;">
				<span style="font-family:华文中宋;font-size:15px; ">${member.v7MPhone }</span>
			</td>
		</tr>
		<tr style='background-color:#EEEBEB'>
			<td style="padding:5px; text-align:right"><span style="font-family:华文中宋;font-size:14px;">会员生日</span></td>
			<td style="padding:5px;">
				<span style="font-family:华文中宋;font-size:15px; "><fmt:formatDate value="${member.v7MBirthday}" pattern="yyyy-MM-dd"/></span>
			</td>
			<td style="padding:5px; text-align:right"><span style="font-family:华文中宋;font-size:14px;">加入时间</span></td>
			<td style="padding:5px;">
				<span style="font-family:华文中宋;font-size:15px; "><fmt:formatDate value="${member.v7MCrateTime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
			</td>
		</tr>
		<tr>
			
			<td style="padding:5px; text-align:right"><span style="font-family:华文中宋;font-size:14px;">状态 </span></td>
			<c:if test="${member.v7MStatus eq '1' }">
			
			<td style="padding:5px;">启用 </td>
			</c:if>
			<c:if test="${member.v7MStatus eq '2' }">
			
			<td style="padding:5px;">挂起</td>
			</c:if>
			<c:if test="${member.v7MStatus eq '3' }">
			
			<td style="padding:5px;">删除</td>
			</c:if>
		</tr>
	</table>
	</c:forEach>
	<div class="pd-5 bg-1-me" style="margin:0 auto;font-size:13px; background-color:#FFFFCC; text-align:center;">已有卡信息</div>
	<div class="mt-20" style="margin-top:5px;">
	
		<table class="table table-border table-bordered table-hover table-bg ">
			<thead>
				<tr class="text-c">     	 		 	
					<th width="90">会员卡类型</th>
					<th width="90">卡余额/剩余次数</th>
					<th width="40">累计充值金额 </th>
					<th width="90">累计积分（记次卡无积分）</th>
					<th width="90">状态</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${memberCardList}" varStatus="status" >
					<c:forEach items="${memberCardList[status.index].memberCard}" var="result" >
						<tr class="text-c">
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
							
							<td >${result.v7CSurplusAmount}</td>
							<td >${result.v7CRechargeAmount }</td>
							<td >${result.v7CTintegral }</td>
							<c:if test="${result.v7CStatus  eq '1'}"> 
								<td >启用</td>
							</c:if>
							<c:if test="${result.v7CStatus  eq '2'}"> 
								<td >挂起</td>
							</c:if>
							<c:if test="${result.v7CStatus  eq '3'}"> 
								<td >删除</td>
							</c:if>
						</tr>
					</c:forEach>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>	
</body>
<script type="text/javascript" src="${ctx }/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${ctx }/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="${ctx }/lib/laypage/1.2/laypage.js"></script> 
<script type="text/javascript" src="${ctx }/lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="${ctx }/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="${ctx }/js/H-ui.js"></script> 
<script type="text/javascript" src="${ctx }/js/H-ui.admin.js"></script> 
<script type="text/javascript">

</script> 
</body>
</html>