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
<link href="${ctx}/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<link href="${ctx }/js/jquery/jquery-ui.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="${ctx}/http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>添加会员</title>
</head>
<body>
<div class="pd-20" style="margin-top: -25px;">
  <form action="${ctx}/member/addMember.action" method="post" class="form form-horizontal" id="general-validform-add">
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>会员名：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" placeholder="请输入会员名称"  onblur="checkUniqueness(this,'${ctx}/member/checkUniqueness.action','','会员名称重复!')"  id="member-name" name="v7MName" datatype="*2-16" nullmsg="用户名不能为空">
      </div>
      <div class="col-4"></div>
    </div>
     <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>真实名：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" placeholder="请输入会员真实名称" id="member-realName" name="v7MRealName" datatype="*2-16" nullmsg="用户名不能为空">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>性别：</label>
    <div class="formControls col-5 skin-minimal">
        <div class="radio-box">
          <input calss="sex"  type="radio" name="v7MSex" datatype="num" value="1" nullmsg="请选择性别！ ">
          <label for="sex-1">男</label>
        </div>
        <div class="radio-box">
          <input calss="sex" type="radio" name="v7MSex"  datatype="num"  value ="2" nullmsg="请选择性别！">
          <label for="sex-2">女</label>
        </div>
      </div>
      <div class="col-4"> </div>
    </div>
    
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>手机：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text"  placeholder="请输入会员手机号" id="member-tel" name="v7MPhone"  datatype="m" nullmsg="手机不能为空"
        	onblur="checkUniqueness(this,'${ctx}/member/checkUniquenessPhone.action','','会员电话号码重复!')" >
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>生日：</label>
      <div class="formControls col-5">
    	 <select  id="select_year" class="select" size="1" name="birthday" datatype="num" style="width:70px;">
    	 	<option selected="selected"></option>
    	 </select>
    	 <label>年</label> 
    	 <select  id="select_month" class="select" size="1" name="birthday" datatype="num" style="width:70px;">
    	 	<option  selected="selected"></option>
    	 </select>
    	 <label>月</label> 
    	 <select id="select_day" class="select" size="1" name="birthday" datatype="num" style="width:70px;">
    	  <option selected="selected"></option>
    	 </select>
    	 <label>日</label> 
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
	  <label class="form-label col-3"><span class="c-red">*</span>会员卡类型：</label>
	      <div class="formControls col-5">
	        <select class="select" size="1" name="v7CType" datatype="num"    >
	          <option value="-1" selected  >会员卡类型</option>
	          <option value="1">金卡</option>
	          <option value="2">银卡</option>
	          <option value="3">普通卡</option>
	          <option value="4">对冲卡</option>
	          <option value="5">洗吹卡</option>
	          <option value="6">洗剪吹卡</option>
	        </select>
	      </div>
	     <div class="col-4"> </div>      
    </div>
    
     <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>充值金额：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text"  placeholder="请输入充值金额"  name="v7CRechargeAmount" datatype="n" nullmsg="充值金额不能为空">
      </div>
      <div class="col-4"></div>
    </div>   
    
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>办卡人：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" id="handleEmployee" name="handleEmployee"  onkeyup="getCacheEmployee(this)" placeholder="请输入办卡人姓名" datatype="*2-16" nullmsg="办卡人不能为空">
      </div>
      <div class="col-4"></div>
    </div>  
    
    <div class="row cl">
       <label class="form-label col-3">备注：</label>
      <div class="formControls col-5">
        <textarea name="v7MRemarks" class="textarea"  placeholder="说点什么...最少输入10个字符" ></textarea>
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

<script type="text/javascript" src="${ctx }/js/v7mc_base.js"></script> 

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
	$("#general-validform-add").Validform({
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
	 
/**仿百度收索员工名称*/   
function  getCacheEmployee(inputObject){
	var inputId = ($(inputObject).attr("id"));
	$("#"+inputId).autocomplete({
	    source: function( request, response ) {
	      $.ajax({
	      url: "${ctx}/member/getCacheEmployee.action",
	      type:"post",
	      dataType: "json",
	      data: {
	        term: request.term
	      },
	      success: function(data) {
	        response($.map(data.source, function(item) {
	          return {
	            label: item,
	            value: item
	          };
	         })
	        );
	       } 
	     });
	    }
	});
}

</script> 


</body>
</html>