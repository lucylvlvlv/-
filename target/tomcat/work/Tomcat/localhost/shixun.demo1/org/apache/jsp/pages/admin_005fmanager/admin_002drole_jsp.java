/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-07-03 13:08:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages.admin_005fmanager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_002drole_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	//通过JSP的 代码，在浏览器端来获取 java后台访问的根URL
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<!--  在head标签中，添加一个 当前界面访问工程的根 路径  -->\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no\" />\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/html5shiv.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/respond.min.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui/css/H-ui.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui.admin/css/H-ui.admin.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"lib/Hui-iconfont/1.0.8/iconfont.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui.admin/skin/default/skin.css\" id=\"skin\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui.admin/css/style.css\" />\r\n");
      out.write("<!--[if IE 6]>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/DD_belatedPNG_0.0.8a-min.js\" ></script>\r\n");
      out.write("<script>DD_belatedPNG.fix('*');</script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<title>角色管理</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"breadcrumb\"><i class=\"Hui-iconfont\">&#xe67f;</i> 首页 <span class=\"c-gray en\">&gt;</span> 管理员管理 <span class=\"c-gray en\">&gt;</span> 角色管理 <a class=\"btn btn-success radius r\" style=\"line-height:1.6em;margin-top:3px\" href=\"javascript:location.replace(location.href);\" title=\"刷新\" ><i class=\"Hui-iconfont\">&#xe68f;</i></a></nav>\r\n");
      out.write("<div class=\"page-container\">\r\n");
      out.write("\t<div class=\"cl pd-5 bg-1 bk-gray\"> <span class=\"l\"> <a href=\"javascript:;\" onclick=\"datadel()\" class=\"btn btn-danger radius\"><i class=\"Hui-iconfont\">&#xe6e2;</i> 批量删除</a> <a class=\"btn btn-primary radius\" href=\"javascript:;\" onclick=\"admin_role_add('添加角色','admin-role-add.html','800')\"><i class=\"Hui-iconfont\">&#xe600;</i> 添加角色</a> </span> <span class=\"r\">共有数据：<strong>54</strong> 条</span> </div>\r\n");
      out.write("\t<table class=\"table table-border table-bordered table-hover table-bg\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th scope=\"col\" colspan=\"6\">角色管理</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"text-c\">\r\n");
      out.write("\t\t\t\t<th width=\"25\"><input type=\"checkbox\" value=\"\" name=\"\"></th>\r\n");
      out.write("\t\t\t\t<th width=\"40\">ID</th>\r\n");
      out.write("\t\t\t\t<th width=\"200\">角色名</th>\r\n");
      out.write("\t\t\t\t<th>用户列表</th>\r\n");
      out.write("\t\t\t\t<th width=\"300\">描述</th>\r\n");
      out.write("\t\t\t\t<th width=\"70\">操作</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t<tr class=\"text-c\">\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" value=\"\" name=\"\"></td>\r\n");
      out.write("\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t<td>超级管理员</td>\r\n");
      out.write("\t\t\t\t<td><a href=\"#\">admin</a></td>\r\n");
      out.write("\t\t\t\t<td>拥有至高无上的权利</td>\r\n");
      out.write("\t\t\t\t<td class=\"f-14\"><a title=\"编辑\" href=\"javascript:;\" onclick=\"admin_role_edit('角色编辑','admin-role-add.html','1')\" style=\"text-decoration:none\"><i class=\"Hui-iconfont\">&#xe6df;</i></a> <a title=\"删除\" href=\"javascript:;\" onclick=\"admin_role_del(this,'1')\" class=\"ml-5\" style=\"text-decoration:none\"><i class=\"Hui-iconfont\">&#xe6e2;</i></a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"text-c\">\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" value=\"\" name=\"\"></td>\r\n");
      out.write("\t\t\t\t<td>2</td>\r\n");
      out.write("\t\t\t\t<td>总编</td>\r\n");
      out.write("\t\t\t\t<td><a href=\"#\">张三</a></td>\r\n");
      out.write("\t\t\t\t<td>具有添加、审核、发布、删除内容的权限</td>\r\n");
      out.write("\t\t\t\t<td class=\"f-14\"><a title=\"编辑\" href=\"javascript:;\" onclick=\"admin_role_edit('角色编辑','admin-role-add.html','2')\" style=\"text-decoration:none\"><i class=\"Hui-iconfont\">&#xe6df;</i></a> <a title=\"删除\" href=\"javascript:;\" onclick=\"admin_role_del(this,'1')\" class=\"ml-5\" style=\"text-decoration:none\"><i class=\"Hui-iconfont\">&#xe6e2;</i></a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"text-c\">\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" value=\"\" name=\"\"></td>\r\n");
      out.write("\t\t\t\t<td>3</td>\r\n");
      out.write("\t\t\t\t<td>栏目主辑</td>\r\n");
      out.write("\t\t\t\t<td><a href=\"#\">李四</a>，<a href=\"#\">王五</a></td>\r\n");
      out.write("\t\t\t\t<td>只对所在栏目具有添加、审核、发布、删除内容的权限</td>\r\n");
      out.write("\t\t\t\t<td class=\"f-14\"><a title=\"编辑\" href=\"javascript:;\" onclick=\"admin_role_edit('角色编辑','admin-role-add.html','3')\" style=\"text-decoration:none\"><i class=\"Hui-iconfont\">&#xe6df;</i></a> <a title=\"删除\" href=\"javascript:;\" onclick=\"admin_role_del(this,'1')\" class=\"ml-5\" style=\"text-decoration:none\"><i class=\"Hui-iconfont\">&#xe6e2;</i></a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"text-c\">\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" value=\"\" name=\"\"></td>\r\n");
      out.write("\t\t\t\t<td>4</td>\r\n");
      out.write("\t\t\t\t<td>栏目编辑</td>\r\n");
      out.write("\t\t\t\t<td><a href=\"#\">赵六</a>，<a href=\"#\">钱七</a></td>\r\n");
      out.write("\t\t\t\t<td>只对所在栏目具有添加、删除草稿等权利。</td>\r\n");
      out.write("\t\t\t\t<td class=\"f-14\"><a title=\"编辑\" href=\"javascript:;\" onclick=\"admin_role_edit('角色编辑','admin-role-add.html','4')\" style=\"text-decoration:none\"><i class=\"Hui-iconfont\">&#xe6df;</i></a> <a title=\"删除\" href=\"javascript:;\" onclick=\"admin_role_del(this,'1')\" class=\"ml-5\" style=\"text-decoration:none\"><i class=\"Hui-iconfont\">&#xe6e2;</i></a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("<!--_footer 作为公共模版分离出去-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery/1.9.1/jquery.min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/layer/2.4/layer.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"static/h-ui/js/H-ui.min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"static/h-ui.admin/js/H-ui.admin.js\"></script> <!--/_footer 作为公共模版分离出去-->\r\n");
      out.write("\r\n");
      out.write("<!--请在下方写此页面业务相关的脚本-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/datatables/1.10.0/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("/*管理员-角色-添加*/\r\n");
      out.write("function admin_role_add(title,url,w,h){\r\n");
      out.write("\tlayer_show(title,url,w,h);\r\n");
      out.write("}\r\n");
      out.write("/*管理员-角色-编辑*/\r\n");
      out.write("function admin_role_edit(title,url,id,w,h){\r\n");
      out.write("\tlayer_show(title,url,w,h);\r\n");
      out.write("}\r\n");
      out.write("/*管理员-角色-删除*/\r\n");
      out.write("function admin_role_del(obj,id){\r\n");
      out.write("\tlayer.confirm('角色删除须谨慎，确认要删除吗？',function(index){\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype: 'POST',\r\n");
      out.write("\t\t\turl: '',\r\n");
      out.write("\t\t\tdataType: 'json',\r\n");
      out.write("\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\t$(obj).parents(\"tr\").remove();\r\n");
      out.write("\t\t\t\tlayer.msg('已删除!',{icon:1,time:1000});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror:function(data) {\r\n");
      out.write("\t\t\t\tconsole.log(data.msg);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t});\t\t\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
