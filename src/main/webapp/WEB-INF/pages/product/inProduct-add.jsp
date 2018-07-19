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
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,member-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="${ctx}/lib/html5.js"></script>
<script type="text/javascript" src="${ctx}/lib/respond.min.js"></script>
<script type="text/javascript" src="${ctx}/lib/PIE_IE678.js"></script>
<![endif]-->
<link href="${ctx}/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/lib/icheck/icheck.css" rel="stylesheet" type="text/css" />
<link href="${ctx }/js/jquery/jquery-ui.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="${ctx}/http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>产品入库</title>
</head>
<body>
<div class="pd-20" style="margin-top: -25px;">
  <form action="${ctx}/inProduct/addInProduct.action" method="post" class="form form-horizontal" id="generalFormId">
   
    
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>产品名称：</label>
      <div class="formControls col-5">
     	 <input type="hidden" name="id" id="editCheck"  value="${storeIn.id }">
     	 <input type="hidden" name="v7PkProduct" id = "v7PkProduct" value="${storeIn.v7PkProduct }">
         <input type="text" name="v7SName" value="${storeIn.v7SName }" id="v7SName" onkeyup="selectCacheProduct(this)" onBlur="selectCacheProductId(this)" class="input-text" placeholder="请输入产品名称" datatype="*2-16" nullmsg="产品名不能为空">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>入库单价：</label>
      <div class="formControls col-5">
    	<input type="text" class="input-text"  placeholder="请输入库单价" value="${storeIn.v7SPrice }" name="v7SPrice" datatype="*2-16" nullmsg="入库单价不能为空">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>入库数量：</label>
      <div class="formControls col-5">
    	<input type="text" class="input-text"  placeholder="请输入入库数量" value="${storeIn.v7SCount }" name="v7SCount" datatype="*2-16" nullmsg="入库数量不能为空">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
       <label class="form-label col-3">备注：</label>
      <div class="formControls col-5">
        <textarea name="v7SRemarks" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" >${storeIn.v7SRemarks }</textarea>
        <p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <div class="col-9 col-offset-3">
        <input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
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
<script type="text/javascript" src="${ctx }/lib/My97DatePicker/WdatePicker.js"></script> 

<script type="text/javascript" src="${ctx }/js/jquery/jquery.chromatable-1.3.0/jquery-ui-1.9.2.custom.js"></script>
<script  src="${ctx }/js/jquery/jquery.tableui.js" type="text/javascript" ></script>
<script src="${ctx }/js/jquery/jquery.chromatable-1.3.0/jquery.chromatable.js" type="text/javascript" ></script>


<script type="text/javascript">
$(function(){
 		$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	}); 
	$("#generalFormId").Validform({
		tiptype:2,
		beforeSubmit:function(curform){
		},
		callback:function(form){
		}
	});
	
	var editCheck = $("#editCheck").val();
	if('' != editCheck){
		$("#v7SName").attr("disabled","disabled");
	}
  
   });  
   
function  selectCacheProduct(inputObject){
	var inputId = ($(inputObject).attr("id"));
	$("#"+inputId).autocomplete({
	    source: function( request, response ) {
	      $.ajax({
	      url: "${ctx}/inProduct/selectCacheProduct.action",
	      type:"post",
	      dataType: "json",
	      data: {
	        term: request.term
	      },
	      success: function( data ) {
	        response( $.map( data.source, function( item ) {
	          return {
	            label: item.v7PName,
	            value: item.v7PName
	          };
	         })
	        );
	       } 
	     });
	    }
	});
}

function selectCacheProductId(inputObject){
	var inputValue = $("#v7SName").val();
	 $.ajax({
	      url: "${ctx}/inProduct/selectCacheProductId.action",
	      type:"post",
	      dataType: "json",
	      data: {
	        term:inputValue
	      },
	      success: function(data) {
	      	 if('' == data){
	      		var inputId = ($(inputObject).attr("id"));
	      		$("#"+inputId).focus();
	      		 layer.msg("产品名称不存在!",{icon: 5,time:3000});
	      	 }else{
		    	 $("#v7PkProduct").val(data);
	      	 }
	    	
	   	  },
	     error:function(XMLHttpRequest, textStatus, errorThrown){
				alert(XMLHttpRequest.status + "," + XMLHttpRequest.readyState + "," + textStatus+"," +errorThrown);
			}
  })
	
}
	 


</script> 


</body>
</html>