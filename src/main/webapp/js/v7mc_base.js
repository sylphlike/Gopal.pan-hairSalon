/**
 * V7MC v1.0通用技术插件
 * 
 * 
 */

/**通用页面跳转函数（跳转页面无其他参数）*/
function general_open_window_no_param(title,url){
	layer_show(title,url,800,500); 
}


/**分页*/
function changePage(skipPageNum,pageCount){
	if(skipPageNum == 0 || skipPageNum >  pageCount ){
		layer.msg("不能再翻页啦！",{icon:5,time:1000});
		return;
	}
	$("#generalFormId").append('<input type="hidden" name="currentPage" value="'+skipPageNum+'">');
	$("#generalFormId").submit();// 提交表单
}


/**
 * 通用ajax状态修改
 * operId   	操作实体对象ID
 * operType 	操作类型  1启用,2挂起,3删除 
 * action   	访问路径
 * comfirmText	弹出对话框文字
 * hintText		弹出执行结果文字
 */
function general_change_status(operId,operType,action,comfirmText,hintText){
	//删除1 启用 6 挂起5
	var icon;
	if(1 == operType){icon =6}
	if(2 == operType){icon =5}
	if(3 == operType){icon =1}
	layer.confirm(comfirmText,function(index){
		 $.ajax({
			url:action,
		    type:"post",
		    async:false,  //false 异步提交 true 同步提交
		    dataType: "json",
		    data: {
		    	id:operId,
		    	oper:operType
		    }
			});
		 layer.msg(hintText,{icon: icon,time:1000});
		 setTimeout(function (){
			 $("#generalSearch").click();
		 }, 800);
		});
};

/**批量删除*/
function general_batch_delete(){
	 layer.msg("该功能正在研发中,请等待推送新版本！",{icon:5,time:2000});
}

/**批量刷新缓存*/
function general_batch_refresh(){
	layer.msg("该功能正在研发中,请等待推送新版本！",{icon:5,time:2000});
}




/**通用重复校验
 * inputObj input输入框对象
 * action   访问后台路径
 * ischeck  是否需要重复校验，当为空时校验，非空时不校验
 * msg      重复时提示信息
 * */
function checkUniqueness(inputObj,action,ischeck,msg){
	var tempVal = $(inputObj).val();
	var inputId = ($(inputObj).attr("id"));
	if('' == ischeck){
		 $.ajax({
	         url:action,
	         type:"post",
	         dataType:"text",
	         async:true,  //false 异步提交 true 同步提交
	         data:{
	             inName: tempVal
	         },
	         success:function(responseText){
	         	 if(responseText != ""){
	         		 $("#"+inputId).focus();
	         		 layer.msg(msg,{icon: 5,time:2000});
		         }
	         	 
	         },
	         error:function(){
	         	layer.open({
	 				title:'警告',
	 				content: '系统错误！'
	 			});
	         }
	     });
	}

}

