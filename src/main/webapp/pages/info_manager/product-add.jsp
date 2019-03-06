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
<!--  在head标签中，添加一个 当前界面访问工程的根 路径  -->
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
	</head>

	<body>
		<article class="page-container">
			<form class="form form-horizontal" id="form-article-add" action="" method="post">
				<div class="row cl">
					<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>ä¿¡æ¯æ é¢ï¼</label>
					<div class="formControls col-xs-8 col-sm-9">
						<input type="text" class="input-text" value="" placeholder="" name="articleTitle">
					</div>
				</div>
				<div class="row cl">
					<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>æç« åå®¹ï¼</label>
					<div class="formControls col-xs-8 col-sm-9">
						<textarea type="text" class="input-text" style="height: 140px;" value="" placeholder="" name="articleInfo"></textarea>
					</div>
				</div>
				<div class="row cl">
					<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
						<button onClick="article_save_submit();" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> ä¿å­</button>
						<button onClick="removeIframe();" class="btn btn-default radius" type="button">&nbsp;&nbsp;åæ¶&nbsp;&nbsp;</button>
					</div>
				</div>
			</form>
		</article>

		<!--_footer ä½ä¸ºå¬å±æ¨¡çåç¦»åºå»-->
		<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
		<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
		<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
		<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script>
		<!--/_footer /ä½ä¸ºå¬å±æ¨¡çåç¦»åºå»-->

		<!--è¯·å¨ä¸æ¹åæ­¤é¡µé¢ä¸å¡ç¸å³çèæ¬-->
		<script type="text/javascript" src="lib/My97DatePicker/4.8/WdatePicker.js"></script>
		<script type="text/javascript" src="lib/jquery.validation/1.14.0/jquery.validate.js"></script>
		<script type="text/javascript" src="lib/jquery.validation/1.14.0/validate-methods.js"></script>
		<script type="text/javascript" src="lib/jquery.validation/1.14.0/messages_zh.js"></script>
		</script>
		<script type="text/javascript">
			$(function() {

				//è¡¨åéªè¯
				$("#form-article-add").validate({
					rules: {
						articleTitle: {
							required: true,
						},
						articleInfo: {
							required: true,
						}
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
	</body>

</html>