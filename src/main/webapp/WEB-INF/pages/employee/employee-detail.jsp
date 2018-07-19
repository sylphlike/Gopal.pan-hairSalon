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
<div class="pd-5 bg-1-me" style="margin:0 auto;font-size:13px;background-color:#F5FAFE; text-align:center;">员工详细信息</div>
	<table style="background-color:#f5faeh; height: 65px;"  >
		<tr style='background-color:#EFE4E4'>
			<td  style="padding:5px; text-align:right"><span style="font-family:华文中宋;font-size:14px;">员工编号:</span></td>
			<td style="padding:5px;">
				<span style="font-family:华文中宋;font-size:15px; ">${employee.v7ENum }</span>
			</td>
			<td style="padding:5px; text-align:right"><span style="font-family:华文中宋;font-size:14px;">登录名:</span></td>
			<td style="padding:5px;">
				<span style="font-family:华文中宋;font-size:15px; ">${employee.v7EName }</span>
			</td>
		</tr>
		<tr style='background-color:#F5FAFE'>
			<td style="padding:5px; text-align:right"><span style="font-family:华文中宋;font-size:14px;">真实名称:</span></td>
			<td style="padding:5px;">
				<span style="font-family:华文中宋;font-size:15px; ">${employee.v7ERealName }</span>
			</td>
			<td style="padding:5px; text-align:right"><span style="font-family:华文中宋;font-size:14px;">电话号码:</span></td>
			<td style="padding:5px;">
				<span style="font-family:华文中宋;font-size:15px; ">${employee.v7EPhone }</span>
			</td>
		</tr>
		<tr style='background-color:#EFE4E4'>
			<td style="padding:5px; text-align:right"><span style="font-family:华文中宋;font-size:14px;">员工生日:</span></td>
			<td style="padding:5px;">
				<span style="font-family:华文中宋;font-size:15px; ">
					<c:if test="${not empty employee.v7EBirthday }">
						<fmt:formatDate value="${employee.v7EBirthday }" pattern="yyyy-MM-dd"/>
					</c:if> 
				</span>
			</td>
			<td style="padding:5px; text-align:right"><span style="font-family:华文中宋;font-size:14px;">入职时间:</span></td>
			<td style="padding:5px;">
				<span style="font-family:华文中宋;font-size:15px; ">
					<c:if test="${not empty employee.v7EJoinDate }">
						<fmt:formatDate value="${employee.v7EJoinDate }" pattern="yyyy-MM-dd"/>
					</c:if> 
				</span>
			</td>
		</tr>
		<tr style='background-color:#F5FAFE' >
			<td style="padding:5px; text-align:right"><span style="font-family:华文中宋;font-size:14px;">员工职位:</span></td>
			<td style="padding:5px;">
				<span style="font-family:华文中宋;font-size:15px; ">${employee.v7EPosition }</span>
			</td>
			<td style="padding:5px; text-align:right"><span style="font-family:华文中宋;font-size:14px;">状态: </span></td>
			<td style="padding:5px;">
				<c:if test="${employee.v7EStatus eq '1' }">
					<span>已启用</span>
				</c:if>
				<c:if test="${employee.v7EStatus eq '2' }">
					<span>已挂起</span>
				</c:if>
			 </td>
		</tr>
		<tr style='background-color:#EFE4E4'>
			<td style="padding:5px; text-align:right"><span style="font-family:华文中宋;font-size:14px;">上次登录时间:</span></td>
			<td style="padding:5px;">
				<span style="font-family:华文中宋;font-size:15px; ">${employee.v7ELastLogin }</span>
			</td>
			<td style="padding:5px; text-align:right"><span style="font-family:华文中宋;font-size:14px;">上次登录IP:</span></td>
			<td style="padding:5px;">
				<span style="font-family:华文中宋;font-size:15px; ">${employee.v7ELastIp }</span>
			</td>
		</tr>
		<tr style='background-color:#F5FAFE' >
			<td style="padding:5px; text-align:right"><span style="font-family:华文中宋;font-size:14px;">总登录次数:</span></td>
			<td style="padding:5px;">
				<span style="font-family:华文中宋;font-size:15px; ">${employee.v7ESumLogin }</span>
			</td>
			<td style="padding:5px; text-align:right"><span style="font-family:华文中宋;font-size:14px;">总在线时长: </span></td>
			<td style="padding:5px;">${employee.v7EOnlineTime }</td>
		</tr>
		
	</table>

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