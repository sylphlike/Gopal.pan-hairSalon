<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
<title>添加扣款</title>
</head>
<body>
<div class="pd-20" style="margin-top: -25px;">
  <form action="${ctx}/charge/addCharge.action" method="post" class="form form-horizontal" id="generalFormId">
  	 <input type="hidden" name="id" value="${charge.id }">
	 <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>员工名：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" placeholder="请输入员工登录名" id="v7CName" name="v7CName" datatype="*2-16" nullmsg="员工登录名不能为空"
        	onkeyup="getCacheEmployee(this)" onBlur="selectCacheEmployeeExist(this)" value="${charge.v7CName }">
      </div>
      <div class="col-4"> </div>
    </div>
    
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>发生时间：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" placeholder="请输入发生时间" id="v7CMonth" name="v7CMonth" datatype="*" nullmsg="发生时间不能为空"
        	 onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd',minDate:'1990-03-08'})"
        	 value="<fmt:formatDate value="${charge.v7CMonth }" pattern="yyyy-MM-dd"/>">
      </div>
      <div class="col-4"> </div>
    </div>
    
    <div class="row cl" >
	  <label class="form-label col-3"><span class="c-red">*</span>扣款金额：</label>
      <div class="formControls col-5">
       	<input type="text" class="input-text" placeholder="请输入扣款金额 " id="v7CChargeMoney" name="v7CChargeMoney" datatype="n" 
       		nullmsg="扣款金额 不能为空" value="${fn:substringBefore(charge.v7CChargeMoney,'.')}">
      </div>
     <div class="col-4"> </div>      
    </div>
    <div class="row cl">
       <label class="form-label col-3">扣款说明：</label>
      <div class="formControls col-5">
        <textarea name="v7CChargeExplain" class="textarea" datatype="*"  placeholder="请输入扣款说明" nullmsg="扣款说明不能为空" >${charge.v7CChargeExplain }</textarea>
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
<script type="text/javascript" src="${ctx}/lib/My97DatePicker/WdatePicker.js"></script> 

<script type="text/javascript" src="${ctx }/js/jquery/jquery.chromatable-1.3.0/jquery-ui-1.9.2.custom.js"></script>
<script  src="${ctx }/js/jquery/jquery.tableui.js" type="text/javascript" ></script>
<script src="${ctx }/js/jquery/jquery.chromatable-1.3.0/jquery.chromatable.js" type="text/javascript" ></script>


<script type="text/javascript">
$(function(){
	var flag = '${charge}';
	if(flag != ''){
		document.getElementById("v7CName").readOnly=true;
	}
	
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
   $.ms_DatePicker({
         YearSelector: "#select_year",
         MonthSelector: "#select_month",
         DaySelector: "#select_day"
   });
});  
  

/**
 * 从缓存中国获取员工数据，模糊匹配 仿百度收索
 */
function  getCacheEmployee(inputObject){
	var inputId = ($(inputObject).attr("id"));
	$("#"+inputId).autocomplete({
	    source: function( request, response ) {
	      $.ajax({
	      url: "${ctx}/employee/getCacheEmployee.action",
	      type:"post",
	      dataType: "json",
	      data: {
	        term: request.term
	      },
	      success: function( data ) {
	        response( $.map( data.source, function( item ) {
	          return {
	            label: item.v7EName ,
	            value: item.v7EName
	          };
	         })
	        );
	       } 
	     });
	    }
	});
}

function selectCacheEmployeeExist(inputObj){
	var inputVal = $(inputObj).val();
    $.ajax({
	      url: "${ctx}/employee/selectCacheEmployeeExist.action",
	      type:"post",
	      dataType: "json",
	      data: {
	        term: inputVal
	      },
	      success: function(data) {
	      	if(false == data){
	      		var inputId = ($(inputObj).attr("id"));
   	        	$("#"+inputId).focus();
   	         	layer.msg("员工名不存在 !",{icon: 5,time:3000});
	      	}
	      } 
});
}
	 


</script> 


</body>
</html>