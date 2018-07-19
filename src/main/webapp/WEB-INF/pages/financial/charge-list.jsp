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
<title>扣款管理</title>

</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 财务中心 <span class="c-gray en">&gt;</span> 扣款管理</nav>
<div class="pd-20">
	<form id ="generalFormId" action="${ctx }/charge/chargeList.action" method="POST">
		<div class="text-c" style="margin-left:250px; margin-top:5px;margin-bottom:5px;" > 
			<input type="text" class="input-text" style="width:150px"placeholder="输入员工编号"  value="${generalAttrName.v7CNum }" name="v7CNum">
				<input type="text" class="input-text" style="width:150px" placeholder="输入员工姓名" value="${generalAttrName.v7CName }" name="v7CName">
			<button type="submit" class="btn btn-success radius" id="generalSearch" name=""><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
			&nbsp;&nbsp;
			<a class="btn btn-success radius mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" ><i class="Hui-iconfont">&#xe68f;</i> reset</a>
		</div>
		<div class="cl pd-5 bg-1 bk-gray mt-20" style="margin-top:5px;" > 
			<span class="l">
				<a href="javascript:;" onclick="general_batch_delete()" class="btn btn-danger radius">
					<i class="Hui-iconfont">&#xe6e2;</i> 批量删除
				</a> 
				<a href="javascript:;"onclick="general_open_window_no_param('新建扣款','${ctx}/charge/gotoNewCharge.action')"
				 	class="btn btn-primary radius">
					<i class="Hui-iconfont">&#xe600;</i> 添加扣款
				</a>
			</span>
			
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
						<th width="25"><input type="checkbox" name="" value=""></th>
						<th width="50">发生时间</th>
						<th width="50">员工编号</th>
						<th width="50">员工姓名</th>
						<th width="100">员工职位</th>
						<th width="50">扣款金额</th>
						<th width="150">扣款说明</th>
						<th width="150">操作时间</th>
						<th width="40">操作</th>
						
					</tr>

				</thead>
				<tbody>
					<c:forEach items="${generalAttrName.recoredList }" var="charge">
						<tr class="text-c">
							<td><input type="checkbox" value="1" name=""></td>
							<td>
								<c:if test="${not empty charge.v7CMonth }">
									<fmt:formatDate value="${charge.v7CMonth }" pattern="yyyy-MM-dd"/>
								</c:if>
							</td>					
							<td>${charge.v7CMnum }</td>					
							<td>${charge.v7CName }</td>					
							<td>${charge.v7CPosition }</td>					
							<td>${charge.v7CChargeMoney }</td>					
							<td>${charge.v7CChargeExplain }</td>					
							<td>
								<c:if test="${not empty charge.v7COperTime }">
									<fmt:formatDate value="${charge.v7COperTime }" pattern="yyyy-MM-dd HH:mm:ss"/>
								</c:if>
							</td>					
							<td class="td-manage">
								<a style="text-decoration:none" title="编辑" onclick="general_open_window_no_param('编辑','${ctx}/charge/editCharge.action?id=${charge.id}')" id="bianji" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> 
								<a style="text-decoration:none" title="删除" 	onClick="general_change_status('${charge.id}','3','${ctx}/charge/delCharge.action','确认删除该记录？','已删除！')"href="javascript:;" class="ml-5" ><i class="Hui-iconfont">&#xe6e2;</i></a>								
 
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