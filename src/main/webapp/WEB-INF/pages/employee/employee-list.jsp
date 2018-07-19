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
<title>会员列表</title>
<style type="text/css">
	.btn-me{
		vertical-align:middle;
		width:35px;
		height:20px;
		display:-moz-inline-box;
		display:inline-block; 
	}
	
</style>

</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 员工中心 <span class="c-gray en">&gt;</span> 员工管理</nav>
<div class="pd-20">
	<form id ="generalFormId" action="${ctx }/employee/employeeList.action" method="POST">
		<table>
			<tr>
				<td>员工编号</td>
				<td><input type="text" class="input-text" style="width:150px" placeholder="输入员工编号" id="" value="${generalAttrName.v7ENum }" name="v7ENum"></td>
				<td>员工名</td>
				<td><input type="text" class="input-text" style="width:150px" placeholder="输入员工名称" id="" value="${generalAttrName.v7EName }" name="v7EName"></td>
				<td>电话号码</td>
				<td><input type="text" class="input-text" style="width:150px" placeholder="输入员工电话号码" id="" value="${generalAttrName.v7EPhone }" name="v7EPhone"></td>
				<td>入职时间段</td>
				<td>
					<input type="text" class="input-text" style="width:150px" placeholder="输入入职起始时间" id="" name="v7EBeginTime" value="${generalAttrName.v7EBeginTime }"
					 onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'1990-03-08 11:30:00'})">&nbsp;-至-&nbsp;
					<input type="text" class="input-text" style="width:150px" placeholder="输入入职束时间" id="" name="v7EEndTime" value="${generalAttrName.v7EEndTime }"
					 onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'1990-03-08 11:30:00'})">
				</td>
			</tr>
		</table>
	
		<div class="text-c" style="margin-left:563px; margin-top:5px;margin-bottom:5px;" > 
			<button type="submit" class="btn btn-success radius" id="generalSearch" name=""><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
			&nbsp;&nbsp;
			<a class="btn btn-success radius mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" ><i class="Hui-iconfont">&#xe68f;</i> reset</a>
		</div>
		<div class="cl pd-5 bg-1 bk-gray mt-20" style="margin-top:5px;" > 
			<span class="l">
				<a href="javascript:;" onclick="general_batch_delete()" class="btn btn-danger radius">
					<i class="Hui-iconfont">&#xe6e2;</i> 批量删除
				</a> 
				<a href="javascript:;" onclick="general_open_window_no_param('添加员工','${ctx}/employee/gotoNewEmployee.action')" class="btn btn-primary radius">
					<i class="Hui-iconfont">&#xe600;</i> 添加员工 
				</a>
			</span>
			
			
			<div style="float:right;margin-top:11px;margin-bottom:0 px;margin-left:10px; ">
				第<strong>${generalAttrName.currentPage }</strong>页 &nbsp;
				共<strong>${generalAttrName.pageCount }</strong> 页&nbsp;
				共<strong>${generalAttrName.recordCount }</strong>条数据&nbsp;
			</div>
			
			<span style="float:right;margin-right: 20px;" >
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
						<th width="25"><input type="checkbox" name="" value=""></th>
						<th width="80">员工编号</th>
						<th width="90">员工名</th>
						<th width="100">真实名称</th>
						<th width="40">性别</th>
						<th width="110">手机</th>
						<th width="90">员工生日</th>
						<th width="180">职位</th>
						<th width="130">入职时间</th>
						<th width="60">状态</th>
						<th width="60">员工详情</th>
						<th width="120">操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${generalAttrName.recoredList }" var="employee">
						<tr class="text-c">
							<td><input type="checkbox" value="1" name=""></td>
							<td>${employee.v7ENum }</td>
							<td>${employee.v7EName }</td>
							<td>${employee.v7ERealName }</td>
							<td>
								<c:if test="${employee.v7ESex eq '1' }">
									男
								</c:if> 
								<c:if test="${employee.v7ESex eq '2' }">
									女
								</c:if> 
							</td>
							<td>${employee.v7EPhone }</td>
							<td>
								<c:if test="${not empty employee.v7EBirthday }">
									<fmt:formatDate value="${employee.v7EBirthday }" pattern="yyyy-MM-dd"/>
								</c:if> 
							</td>
							<td>${employee.v7EPosition}</td>
							<td>
								<c:if test="${not empty employee.v7EJoinDate }">
									<fmt:formatDate value="${employee.v7EJoinDate }" pattern="yyyy-MM-dd"/>
								</c:if> 
							</td>
							<td class="td-status">
								<c:if test="${employee.v7EStatus eq '1' }">
									<span class="label label-success radius">已启用</span>
								</c:if>
								<c:if test="${employee.v7EStatus eq '2' }">
									<span class="label label-defaunt radius">已挂起</span>
								</c:if>
							</td>
							<td>
								<span class="btn-me btn-success radius" onClick="general_open_window_no_param('员工详情','${ctx}/employee/employeeDetail.action?id=${employee.id }')"> 详情</span>
							</td>
							<td class="td-manage">
							
								<c:if test="${employee.v7EStatus eq '1' }">
									<a style="text-decoration:none" title="挂起" onClick="general_change_status('${employee.id}','2','${ctx}/employee/updateEmployeeStatus.action','确认挂起该员工？','已挂起！')" href="javascript:;"><i class="Hui-iconfont">&#xe631;</i></a>
								</c:if>
								<c:if test="${employee.v7EStatus eq '2' }">
									<a style="text-decoration:none" title="启用" onClick="general_change_status('${employee.id}','1','${ctx}/employee/updateEmployeeStatus.action','确认启用该员工？','已启用！')" href="javascript:;"><i class="Hui-iconfont">&#xe6e1;</i></a>
								</c:if>
								<a style="text-decoration:none" title="编辑"   onclick="general_open_window_no_param('编辑','${ctx}/employee/employeeEditView.action?id=${employee.id}')" id="bianji" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> 
								<a style="text-decoration:none" title="修改密码" onClick="general_open_window_no_param('修改密码','${ctx}/employee/employeeChangePwdView.action?id=${employee.id }')" class="ml-5"  href="javascript:;"><i class="Hui-iconfont">&#xe63f;</i></a>
								<a style="text-decoration:none" title="删除" 	  onClick="general_change_status('${employee.id}','3','${ctx}/employee/updateEmployeeStatus.action','确认删除该员工？','已删除！')"href="javascript:;" class="ml-5" ><i class="Hui-iconfont">&#xe6e2;</i></a>
							
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