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
<title>薪水管理</title>

</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 财务中心 <span class="c-gray en">&gt;</span> 薪水管理</nav>
<div class="pd-20">
	<form id ="generalFormId" action="" method="POST">
		<div class="text-c" style="margin-left:100px; margin-top:5px;margin-bottom:5px;" > 
				<input type="text" class="input-text" style="width:150px" placeholder="输入员工编号" id="" name="v7SNum" value="${generalAttrName.v7SNum }">
				<input type="text" class="input-text" style="width:150px" placeholder="输入员工名称" id="" name="v7SName" value="${generalAttrName.v7SName }">
				<input type="text" class="input-text" style="width:150px" placeholder="输入业绩月份" id="" name="v7SMonth" value="${generalAttrName.v7SMonth }"
				onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM',minDate:'1990-03'})">
				<button type="submit" class="btn btn-success radius" id="generalSearch" name=""><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
				&nbsp;&nbsp;
				<a class="btn btn-success radius mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" ><i class="Hui-iconfont">&#xe68f;</i> reset</a>
		</div>
		<div class="cl pd-5 bg-1 bk-gray mt-20" style="margin-top:5px;" > 
			<span class="l">
				<a href="javascript:;" class="btn btn-primary radius" onclick="general_batch_delete()">
					<i class="Hui-iconfont">&#xe63a;</i> 批量发放
				</a>
			</span>
			
			<div style="float:right;margin-top:11px;margin-bottom:0px;margin-left:10px; ">
				第<strong>${generalAttrName.currentPage }</strong>页 &nbsp;
				共<strong>${generalAttrName.pageCount }</strong> 页&nbsp;
				共<strong>${generalAttrName.recordCount }</strong>条数据&nbsp;
			</div>
			
			<span style="float:right; margin-right: 20px;">
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
						<th width="60">月份</th>
						<th width="50">员工编号</th>
						<th width="50">员工姓名</th>
						<th width="100">员工职位</th>
						<th width="50">基本薪资</th>
						<th width="50">绩效薪资</th>
						<th width="50">外卖薪资</th>
						<th width="50">办卡薪资</th>
						<th width="50">扣款金额</th>
						<th width="50">实发金额</th>
						<th width="50">状态</th>
						<th width="50">操作</th>
						
					</tr>

				</thead>
				<tbody>
					<c:forEach items="${generalAttrName.recoredList }" var="result">
						<tr class="text-c">
							<td>${result.v7SMonth }</td>					
							<td>${result.v7SMnum }</td>					
							<td>${result.v7SName }</td>					
							<td>${result.v7SPosition }</td>					
							<td>${result.v7SBaseSalary }</td>					
							<td>${result.v7SPreSalary }</td>					
							<td>${result.v7SOutSalary }</td>					
							<td>${result.v7STransSalary }</td>					
							<td>${result.v7SChargeSalary }</td>					
							<td>${result.v7SRealitySalary }</td>					
							<td><span class="label label-success radius">已发放</span></td>					
							<td class="td-manage">
								<a title="发工资" id="bianji" onclick="" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe63a;</i></a> 
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