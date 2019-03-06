<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	//通过JSP的 代码，在浏览器端来获取 java后台访问的根URL
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<html>
	<head>
	<base href="<%=basePath%>">
		<meta charset="utf-8">
		<meta name="renderer" content="webkit|ie-comp|ie-stand">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
		<meta http-equiv="Cache-Control" content="no-siteapp" />
		<link rel="Bookmark" href="/favicon.ico">
		<link rel="Shortcut Icon" href="/favicon.ico" />
		<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
		<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
		<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
		<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
		<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
		<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />
		<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
		<!--/meta 作为公共模版分离出去-->
	</head>

	<body>
		<article class="page-container">
			<form class="form form-horizontal"  action="info/add.action" method="post">
				
				<div class="row cl">
					<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>信息标题：</label>
					<div class="formControls col-xs-8 col-sm-9">
						<input type="text" class="input-text" value="${info.title}" placeholder="" name="title">
					</div>
				</div>
				<div class="row cl">
					<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>分类栏目：</label>
					<div class="formControls col-xs-8 col-sm-9">
						  <input type="text" class="input-text" value="${info.type}" placeholder="" name="type">
						  <!--  <span class="select-box">
							<select id="sel" name="" class="select" name="type" value="${info.type}">
								<option value="0">全部分类</option>
								<option value="1">通知公告</option>
								<option value="2">政策速递</option>
								<option value="3">纳税指导</option>
							</select>
						</span>-->
					</div>
				</div>
				<div class="row cl">
					<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>创建人：</label>
					<div class="formControls col-xs-8 col-sm-9">
						<input type="text" class="input-text" value="${info.user}" placeholder="" name="user">
					</div>
				</div>
				<!--  <div class="row cl">
					<label class="form-label col-xs-4 col-sm-2">信息发布时间：</label>
					<div class="formControls col-xs-8 col-sm-9">
						<input type="text" onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd HH:mm:ss')})" id="commentdatemin" name="createDate" class="input-text Wdate">
					</div>
				</div>-->
				<div class="row cl">
					<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>文章内容：</label>
					<div class="formControls col-xs-8 col-sm-9">
						<textarea type="text" class="input-text" style="height: 140px;" value="${info.info1}" placeholder="" name="info1"></textarea>
					</div>
				</div>
				<div class="row cl">
					<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
						<button class="btn btn-default type="submit"><i class="Hui-iconfont">&#xe632;</i>保存</button>
						<button class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
					</div>
				</div>
			</form>
		</article>

		<!--_footer 作为公共模版分离出去-->
		<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
		<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
		<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
		<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script>
		<!--/_footer /作为公共模版分离出去-->

		<!--请在下方写此页面业务相关的脚本-->
		
		<script type="text/javascript" src="lib/My97DatePicker/4.8/WdatePicker.js"></script>
		<script type="text/javascript" src="lib/jquery.validation/1.14.0/jquery.validate.js"></script>
		<script type="text/javascript" src="lib/jquery.validation/1.14.0/validate-methods.js"></script>
		<script type="text/javascript" src="lib/jquery.validation/1.14.0/messages_zh.js"></script>
		</script>
		<script type="text/javascript">
		 	function test(){
		 		var opval=document.getElementById("sel").value;
		 		alert(opvval);
		 		location.herf="add.tion?op="+opval;
		 	}
			$(function() {

				//表单验证
				$("#form-article-add").validate({
					rules: {
						articleTitle: {
							required: true,
						},
						articleType: {
							required: true,
						},
						articleInfo: {
							required: true,
						},
						author: {
							required: true,
						}
						//commentdatemin:{
							//required: true,
						//}
					},
					onkeyup: false,
				
					focusCleanup: true,
					success: "valid",
					submitHandler: function(form) {
						//$(form).ajaxSubmit();
						var index = parent.layer.getFrameIndex(window.name);
						//parent.$('.btn-refresh').click();
						parent.layer.close(index);
					}
				});
			});
		</script>
		<!--/请在上方写此页面业务相关的脚本-->

</body>
</html>