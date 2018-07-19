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
<title>系统日志</title>

</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 系统管理<span class="c-gray en">&gt;</span> 系统日志</nav>
<div class="pd-20">
	<form id ="generalFormId" action="" method="POST">
		<table>
			<tr>
				<td>模块名</td>
				<td><input type="text" class="input-text" style="width:150px" placeholder="输入模块名" id="moduleName" value="${generalAttrName.moduleName }" name="moduleName"></td>
				<td>功能名</td>
				<td><input type="text" class="input-text" style="width:150px" placeholder="输入功能名" id="featureName" value="${generalAttrName.featureName }" name="featureName"></td>
				<td>执行结果</td>
				<td><input type="text" class="input-text" style="width:150px" placeholder="输入执行结果" id="requestResult" value="${generalAttrName.requestResult }" name="requestResult"></td>
				<td>记录时间段</td>
				<td>
					<input type="text" class="input-text" style="width:150px" placeholder="输入记录开始时间" id="startTime" name="startTime" value="${generalAttrName.startTime }"
					 onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'1990-03-08 11:30:00'})">&nbsp;-至-&nbsp;
					<input type="text" class="input-text" style="width:150px" placeholder="输入记录结束时间" id="endTime" name="endTime" value="${generalAttrName.endTime }"
					 onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'1990-03-08 11:30:00'})">
				</td>
			</tr>
		</table>
		<div class="text-c" style="margin-left:510px; margin-top:5px;margin-bottom:5px;" > 
			<button type="submit" class="btn btn-success radius" id="generalSearch" name=""><i class="Hui-iconfont">&#xe665;</i> 检索</button>
			&nbsp;&nbsp;
			<a class="btn btn-success radius mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" ><i class="Hui-iconfont">&#xe68f;</i> reset</a>
		</div>
		<div class="cl pd-5 bg-1 bk-gray mt-20" style="margin-top:5px;" > 
			<div style="float:right;margin-top:11px;margin-bottom:0px;margin-left:10px; ">
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
						<th width="55">模块名称</th>
						<th width="55">功能名称</th>
						<th width="110">功能路劲</th>
						<th width="30">所带参数</th>
						<th width="30">执行结果</th>
						<th width="25">PC名称</th>
						<th width="25">IP地址</th>
						<th width="25">执行人</th>
						<th width="75">执行时间</th>
					</tr>

				</thead>
				<tbody>
					<c:forEach  items="${generalAttrName.recoredList }" var="universal">
						<tr class="text-c">
							<input type="hidden" id= "state" value="${universal.id }"/>							
							<td>${universal.v7UModuleName }</td>				
							<td>${universal.v7UFeatureName }</td>				
							<td>${universal.v7UFeaturePath }</td>				
							<td>
								<a style="text-decoration:none" title="${universal.v7URequestParam }"  href="javascript:;"><i class="Hui-iconfont">&#xe623;</i></a>
								
							</td>						
							<td>${universal.v7URequestResult }</td>						
							<td>${universal.v7URequestPcname }</td>						
							<td>${universal.v7URequestIp }</td>						
							<td>${universal.v7URequestUser }</td>
							<td>
								<c:if test="${not empty universal.v7URequestTime }">
									<fmt:formatDate value="${universal.v7URequestTime }" pattern="yyyy-MM-dd HH:mm:ss"/>
								</c:if>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</form>
</div>	
</body>
<script type="text/javascript" src="${ctx }/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${ctx }/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="${ctx }/lib/laypage/1.2/laypage.js"></script> 
<script type="text/javascript" src="${ctx }/lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="${ctx }/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="${ctx }/js/H-ui.js"></script> 
<script type="text/javascript" src="${ctx }/js/H-ui.admin.js"></script> 
<script type="text/javascript" src="${ctx }/js/v7mc_base.js"></script> 
<script type="text/javascript">

</script> 
</body>
</html>