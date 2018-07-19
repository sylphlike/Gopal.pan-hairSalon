<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<script type="text/javascript" src="${ctx}/lib/html5.js"></script>
<script type="text/javascript" src="${ctx}/lib/respond.min.js"></script>
<script type="text/javascript" src="${ctx}/lib/PIE_IE678.js"></script>
<![endif]-->
<link href="${ctx}/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/lib/icheck/icheck.css" rel="stylesheet"
	type="text/css" />
<link href="${ctx}/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet"
	type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="${ctx}/http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>添加品牌</title>
</head>
<body>
	<div class="pd-20">
		<form action="${ctx}/brand/addBrand.action" method="post" class="form form-horizontal" id="generalFormId">
			<input type="hidden" name="id" value="${brand.id }"/>
			<div class="row cl">
				<label class="form-label col-3"><span class="c-red">*</span>品牌名：</label>
				<div class="formControls col-5">
					<input type="text" class="input-text" placeholder="请输入品牌名"  onblur="checkUniqueness(this,'${ctx}/brand/checkUniqueness.action','${brand.id }','品牌名称重复!')" id="v7BName"  name="v7BName" datatype="*2-16" nullmsg="品牌名不能为空"
						value="${brand.v7BName}" />
				</div>
				<div class="col-4"></div>
			</div>
			<div class="row cl">
				<label class="form-label col-3"><span class="c-red">*</span>品牌类别：</label>
				<div class="formControls col-5">
					<table>
						<tr>
							<td>&nbsp;<input name="v7BType" type="checkbox" value="洗发类" />&nbsp;&nbsp;洗护类&nbsp;</td>
							<td>&nbsp;<input name="v7BType" type="checkbox" value="烫发类" />&nbsp;&nbsp;烫发类&nbsp;
							</td>
						</tr>
						<tr>
							<td>&nbsp;<input name="v7BType" type="checkbox" value="染发类" />&nbsp;&nbsp;染发类&nbsp;</td>
							<td>&nbsp;<input name="v7BType" type="checkbox" value="其它类" />&nbsp;&nbsp;其它&nbsp;</td>
						</tr>
					</table>
				</div>
				<div class="col-4"></div>
			</div>
			<div class="row cl">
				<label class="form-label col-3">品牌说明：</label>
				<div class="formControls col-5">
					<textarea name="v7BBrandDeclare" cols="" rows="" class="textarea"
						placeholder="请输入品牌说明" >${brand.v7BBrandDeclare}</textarea>
					<p class="textarea-numberbar">
						<em class="textarea-length">0</em>/100
					</p>
				</div>
				<div class="col-4"></div>
			</div>
			<div class="row cl">
				<label class="form-label col-3">备注：</label>
				<div class="formControls col-5">
					<textarea name="v7BRemarks" cols="" rows="" class="textarea"
						placeholder="说点什么...最少输入10个字符">${brand.v7BRemarks }</textarea>
					<p class="textarea-numberbar">
						<em class="textarea-length">0</em>/100
					</p>
				</div>

				<div class="col-4"></div>
			</div>
			<div class="row cl">
				<div class="col-9 col-offset-3">
					<input class="btn btn-primary radius" type="submit"
						value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
				</div>
			</div>
		</form>
	</div>
<script type="text/javascript" src="${ctx}/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${ctx}/lib/icheck/jquery.icheck.min.js"></script>
<script type="text/javascript" src="${ctx}/lib/Validform/5.3.2/Validform.js"></script>
<script type="text/javascript" src="${ctx}/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="${ctx}/js/H-ui.js"></script>
<script type="text/javascript" src="${ctx}/js/H-ui.admin.js"></script>
<script type="text/javascript" src="${ctx}/js/birthday.js"></script>

<script type="text/javascript" src="${ctx }/js/v7mc_base.js"></script> 
	
<script type="text/javascript">
	$(function() {
		$('.skin-minimal input').iCheck({
			checkboxClass : 'icheckbox-blue',
			radioClass : 'iradio-blue',
			increaseArea : '20%'
		});
		$("#generalFormId").Validform({
			tiptype : 2,
			beforeSubmit : function(curform) {
			},
			callback : function(form) {
			}
		});
		//处理多选框回显
		var temp = '${brand.v7BType}';
		temp = temp.split(',');
	  	for(var i=0;i<temp.length;i++){
	        $("input[type=checkbox][name='v7BType']").each(function () {
	            if($(this).val() == temp[i]) {
	                $(this).attr("checked",true);
	            }
	        });
	  	} 
	  	var tempId = '${brand.id}';
	  	if(tempId != ''){
	  		$("#v7BName").attr('readonly',true);
	  	}
	});
</script>
</body>
</html>