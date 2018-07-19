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
<!--[if IE 6]>
<script type="text/javascript" src="${ctx}/http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>添加会员</title>
</head>
<body>
<div class="pd-20"  style="margin-top: -25px;">
  <form action="${ctx}/employee/updateEmployee.action" method="post" class="form form-horizontal" id="generalFormId">
  	<input type="hidden" name="id" value="${employee.id }">
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>登录名：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" placeholder="请输入员工姓名" name="v7EName" value="${employee.v7EName }" readonly="readonly" datatype="*2-16" nullmsg="员工名不能为空">
      </div>
      <div class="col-4"></div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>员工名：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" placeholder="请输入员工真实" value="${employee.v7ERealName } " name="v7ERealName" datatype="*2-16" nullmsg="员工名不能为空">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
    	<label class="form-label col-3"><span class="c-red">*</span>性别：</label>
    	<c:if test="${employee.v7ESex eq '1' }">
		    <div class="formControls col-5 skin-minimal">
		        <div class="radio-box">
		          <input calss="sex"  checked="checked"  type="radio" name="v7MSex" datatype="num" value="1" nullmsg="请选择性别！ ">
		          <label for="sex-1">男</label>
		        </div>
		        <div class="radio-box">
		          <input calss="sex" type="radio" name="v7MSex"  datatype="num"  value ="2" nullmsg="请选择性别！">
		          <label for="sex-2">女</label>
		        </div>
		    </div>
	    </c:if>
	    <c:if test="${employee.v7ESex eq '2' }">
		    <div class="formControls col-5 skin-minimal">
		        <div class="radio-box">
		          <input calss="sex"   type="radio" name="v7MSex" datatype="num" value="1" nullmsg="请选择性别！ ">
		          <label for="sex-1">男</label>
		        </div>
		        <div class="radio-box">
		          <input calss="sex"  checked="checked" type="radio" name="v7MSex"  datatype="num"  value ="2" nullmsg="请选择性别！">
		          <label for="sex-2">女</label>
		        </div>
		    </div>
	    </c:if>
	    <div class="col-4"> </div>
	</div>
    
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>手机：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text"  placeholder="请输入员工手机号" value="${employee.v7EPhone }" name="v7EPhone"  datatype="m" nullmsg="手机不能为空">
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
	  <label class="form-label col-3"><span class="c-red">*</span>员工职位：</label>
	      <div class="formControls col-5">
	        <table>
	        	<tr>
	        		<td> &nbsp;<input name="v7EPosition" type="checkbox" value="1" />&nbsp;&nbsp;经理&nbsp;</td>
	        		<td> &nbsp;<input name="v7EPosition" type="checkbox" value="2" />&nbsp;&nbsp;股东 &nbsp;</td>
	        		<td> &nbsp;<input name="v7EPosition" type="checkbox" value="3" />&nbsp;&nbsp;技术总监&nbsp;</td>
	        	</tr>
	        	<tr>
	        		<td> &nbsp;<input name="v7EPosition" type="checkbox" value="4" />&nbsp;&nbsp;首席发型师&nbsp;</td>
	        		<td> &nbsp;<input name="v7EPosition" type="checkbox" value="5" />&nbsp;&nbsp;高级发型师&nbsp;</td>
	        		<td> &nbsp;<input name="v7EPosition" type="checkbox" value="6" />&nbsp;&nbsp;发型师&nbsp;</td>
	        	</tr>
	        	<tr>
	        		<td> &nbsp;<input name="v7EPosition" type="checkbox" value="7" />&nbsp;&nbsp;技师 &nbsp;</td>
	        		<td> &nbsp;<input name="v7EPosition" type="checkbox" value="8" />&nbsp;&nbsp;助理 &nbsp;</td>
	        		<td> &nbsp;<input name="v7EPosition" type="checkbox" value="9" />&nbsp;&nbsp;前台 &nbsp;</td>
	        	</tr>
	        	<tr>
	        		<td> &nbsp;<input name="v7EPosition" type="checkbox" value="10" />&nbsp;&nbsp;其它 &nbsp; </td>
	        	</tr>
	        </table>
	      </div>
	     <div class="col-4"> </div>      
    </div>
    
     <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>入职时间：</label>
      <div class="formControls col-5">
      <input type="text" class="input-text"  placeholder="输入入职时间" name="v7EJoinDate" value="${employee.v7EJoinDateStr }"
					 onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'1990-03-08 11:30:00'})">
      </div>
      
      <div class="col-4"></div>
    </div>   
    
    <div class="row cl">
       <label class="form-label col-3">备注：</label>
      <div class="formControls col-5">
        <textarea name="v7MRemarks" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符"  >${employee.v7ERemarks }</textarea>
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
		//处理生日回显
		 $.ms_DatePicker({
	         YearSelector: "#select_year",
	         MonthSelector: "#select_month",
	         DaySelector: "#select_day",
	         YearData:"${YearData}",
	         MonthData:"${MonthData}",
	         DayData:"${DayData}"
	     });  
		//处理多选框回显
		var temp = '${employee.v7EPosition}';
		temp = temp.split(',');
	  	for(var i=0;i<temp.length;i++){
	        $("input[type=checkbox][name='v7EPosition']").each(function () {
	            if($(this).val() == temp[i]) {
	                $(this).attr("checked",true);
	            }
	        });
	  	} 
	  });  

</script> 
</body>
</html>