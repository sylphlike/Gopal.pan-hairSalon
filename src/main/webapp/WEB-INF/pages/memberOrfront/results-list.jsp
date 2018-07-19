<%@ page language="java" contentType="text/html; charset=UTF-8"
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


<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>会员卡操作明细</title>
<style type="text/css">

</style>
</head>
<body>
	<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 前台管理<span class="c-gray en">&gt;</span>业绩管理</nav>
	<div class="pd-20" style="margin-top:-15px;">
		<form action="${ctx }/results/resultsList.action" id="generalFormId" method="post">
			<div class="text-c" style="margin-left:100px; margin-top:5px;margin-bottom:5px;" > 
				<input type="text" class="input-text" style="width:150px" placeholder="输入员工编号" id="" name="v7RNum" value="${generalAttrName.v7RNum }">
				<input type="text" class="input-text" style="width:150px" placeholder="输入员工名称" id="" name="v7RName" value="${generalAttrName.v7RName }">
				<input type="text" class="input-text" style="width:150px" placeholder="输入业绩月份" id="" name="v7RMonth" value="${generalAttrName.v7RMonth }"
				onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM',minDate:'1990-03'})">
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
			<table class="table table-border table-bordered table-hover table-bg ">
				<thead>
					<tr class="text-c">
						<th width="85">业绩月份</th>
						<th width="85">员工编号</th>
						<th width="85">员工姓名</th>
						<th width="180">员工职位</th>
						<th width="90">项目业绩</th>
						<th width="80">洗吹次数</th>
						<th width="80">洗剪吹次数</th>
						<th width="90">加价业绩</th>
						<th width="90">外卖业绩</th>
						<th width="90">办卡业绩</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${generalAttrName.recoredList}" var="result">
			 			<tr>
							<td style="text-align: center;">${result.v7RMonth }</td>
							<td style="text-align: center;">${result.v7RMnum}</td>
							<td style="text-align: center;">${result.v7RName}</td>
							<td style="text-align: center;">${result.v7RPosition}</td>
							<td style="text-align: center;">${result.v7RBusResults}</td>
							<td style="text-align: center;">${result.v7RBlowwash}</td>
							<td style="text-align: center;">${result.v7RBlowcutwash}</td>
							<td style="text-align: center;">${result.v7RRaiseResults}</td>
							<td style="text-align: center;">${result.v7ROutResults}</td>
							<td style="text-align: center;">${result.v7RTransResults}</td>
						</tr>
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
<script type="text/javascript" src="${ctx }/lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript">

</script>
	
</body>
</html>