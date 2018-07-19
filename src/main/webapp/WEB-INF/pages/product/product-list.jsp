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

</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 产品中心 <span class="c-gray en">&gt;</span> 产品管理</nav>
<div class="pd-20">
	<form id ="generalFormId" action="" method="POST">
		<%-- <div style="width: 850px;">
			<table>
				<tr>
					<td style="width: 50px;">产品品牌</td>
					<td style="width: 160px;"><input type="text" class="input-text" style="width:150px" placeholder="输入产品品牌" value="${generalAttrName.v7PBrand }" name="v7PBrand"></td>
					<td style="width: 50px;">产品类型</td>
					<td style="width: 160px;"><input type="text" class="input-text" style="width:150px" placeholder="输入产品类型" value="${generalAttrName.v7PType }" name="v7PType"></td>
					<td style="width: 50px;">产品名称</td>
					<td style="width: 160px;"><input type="text" class="input-text" style="width:150px" placeholder="输入产品名称" value="${generalAttrName.v7PName }" name="v7PName"></td>
					<td style="width: 100px;">
				</tr>
			</table>
		</div> --%>
		<div class="text-c" style="margin-left:100px; margin-top:5px;margin-bottom:5px;" > 
			<input type="text" class="input-text" style="width:150px" placeholder="输入产品品牌" value="${generalAttrName.v7PBrand }" name="v7PBrand">
			<input type="text" class="input-text" style="width:150px" placeholder="输入产品类型" value="${generalAttrName.v7PType }" name="v7PType">
			<input type="text" class="input-text" style="width:150px" placeholder="输入产品名称" value="${generalAttrName.v7PName }" name="v7PName">
		
			<button type="submit" class="btn btn-success radius" id="generalSearch" name=""><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
			&nbsp;&nbsp;
			<a class="btn btn-success radius mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" ><i class="Hui-iconfont">&#xe68f;</i> reset</a>
		</div>
		<div class="cl pd-5 bg-1 bk-gray mt-20" style="margin-top:5px;" > 
			<span class="l">
				<a href="javascript:;" onclick="general_batch_delete()" class="btn btn-danger radius">
					<i class="Hui-iconfont">&#xe6e2;</i> 批量删除
				</a> 
				<a href="javascript:;" onclick="general_open_window_no_param('添加产品','${ctx}/product/gotoNewProduct.action')" class="btn btn-primary radius">
					<i class="Hui-iconfont">&#xe600;</i> 添加产品
				</a>
			</span>
			
			
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
						<th width="25"><input type="checkbox" name="" value=""></th>
						<th width="90">产品品牌</th>
						<th width="90">产品类型</th>
						<th width="90">产品名称</th>
						<th width="50">计量单位</th>
						<th width="90">产品规格</th>
						<th width="180">代理商</th>
						<th width="90">代理商电话</th>
						<th width="140">备注</th>
						<th width="50">状态</th>
						<th width="70">操作</th>
					</tr>

				</thead>
				<tbody>
					<c:forEach items="${generalAttrName.recoredList }" var="product">
						<tr class="text-c">
							<td><input type="checkbox" value="1" name=""></td>
							<td>${product.v7PBrand }</td>				
							<td>${product.v7PType }</td>				
							<td>${product.v7PName }</td>				
							<td>${product.v7PUnit }</td>				
							<td>${product.v7PStandard }</td>				
							<td>${product.v7PAgent }</td>				
							<td>${product.v7PAgentPhone }</td>				
							<td>${product.v7PRemarks }</td>				
							<td class="td-status">
								<c:if test="${product.v7PStatus eq '1' }">
									<span class="label label-success radius">已启用</span>
								</c:if>
								<c:if test="${product.v7PStatus eq '2' }">
									<span class="label label-defaunt radius">已挂起</span>
								</c:if>
							
							</td>
							<td class="td-manage">
								
								<c:if test="${product.v7PStatus eq '1' }">
									<a style="text-decoration:none" title="挂起" onClick="general_change_status('${product.id}','2','${ctx}/product/updateProductStatus.action','确认挂起该产品？','已挂起！')" href="javascript:;"><i class="Hui-iconfont">&#xe631;</i></a>
								</c:if>
								<c:if test="${product.v7PStatus eq '2' }">
									<a style="text-decoration:none" title="启用" onClick="general_change_status('${product.id}','1','${ctx}/product/updateProductStatus.action','确认启用该产品？','已启用！')" href="javascript:;"><i class="Hui-iconfont">&#xe6e1;</i></a>
								</c:if>
								<a style="text-decoration:none" title="编辑"   onclick="general_open_window_no_param('编辑','${ctx}/product/gotoProductEditView.action?id=${product.id}')" id="bianji" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> 
								<a style="text-decoration:none" title="删除" 	  onClick="general_change_status('${product.id}','3','${ctx}/product/updateProductStatus.action','确认删除该产品？','已删除！')"href="javascript:;" class="ml-5" ><i class="Hui-iconfont">&#xe6e2;</i></a>
								
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