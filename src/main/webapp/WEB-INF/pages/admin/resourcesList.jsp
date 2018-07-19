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

<title>资源列表</title>
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
<script type="text/javascript" src="${ctx }/lib/layer/1.9.3/layer.js"></script>
<script  src="${ctx }/js/echarts.js"></script>

<script type="text/javascript">
	$(function(){
		layer.msg("该功能正在研发中,请等待推送新版本！",{icon:5,time:3000});
	});
</script>
</head>
<body>
	<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span>管理员中心 <span class="c-gray en">&gt;</span> 资源列表</nav>
	<div class="pd-20" id="ehcartsDiv" style="width: 80%;height:380px;float: left;"></div>

</body>
</html>