/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.73
 * Generated at: 2022-08-17 08:07:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Trainer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.net.URLEncoder;

public final class mypage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1656316243398L));
    _jspx_dependants.put("/incl/footer.jsp", Long.valueOf(1660719778201L));
    _jspx_dependants.put("jar:file:/C:/NCS/back/ppumting/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pm80/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.net.URLEncoder");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\"\r\n");
      out.write("	content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\r\n");
      out.write("<meta name=\"generator\" content=\"Hugo 0.88.1\">\r\n");
      out.write("<link href=\"mypagecss/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"../User/mypage/homecss/carousel.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"../assets/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("<script src=\"../assets/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<title>TRAINER | PPUMTING</title>\r\n");
      out.write("<style>\r\n");
      out.write(".login_btn a {\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bd-placeholder-img {\r\n");
      out.write("	font-size: 1.125rem;\r\n");
      out.write("	text-anchor: middle;\r\n");
      out.write("	-webkit-user-select: none;\r\n");
      out.write("	-moz-user-select: none;\r\n");
      out.write("	user-select: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media ( min-width : 768px) {\r\n");
      out.write("	.bd-placeholder-img-lg {\r\n");
      out.write("		font-size: 3.5rem;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("	<div id=\"header\">\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/incl/banner.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("subtitle", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(URLEncoder.encode("mod010: Login.jsp", "UTF-8")), request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("	<div class=\"trainer-wrapper\">\r\n");
      out.write("		<div class=\"inner\">\r\n");
      out.write("			<div class=\"trainer-container\">\r\n");
      out.write("				<h1>\r\n");
      out.write("					<span class=\"trainer-hover\">Trainer List</span>\r\n");
      out.write("				</h1>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<main>\r\n");
      out.write("		<!-- START THE FEATURETTES -->\r\n");
      out.write("\r\n");
      out.write("		<hr class=\"featurette-divider\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"row featurette\" style=\"flex-wrap: nowrap;\">\r\n");
      out.write("			<div class=\"col-md-7\" style=\"width: 48%;\">\r\n");
      out.write("				<h2 class=\"featurette-heading\">\r\n");
      out.write("					????????? <br> <span class=\"text-muted\">\"?????? ????????? ????????????.\"</span>\r\n");
      out.write("				</h2>\r\n");
      out.write("				<p class=\"lead\">Some great placeholder content for the first\r\n");
      out.write("					featurette here. Imagine some exciting prose here.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-5\">\r\n");
      out.write("				<img src=\"./img/trainer3-2.jpg\" style=\"width: 560px; height: 450px;\">\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<hr class=\"featurette-divider\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"row featurette\" style=\"flex-wrap: nowrap;\">\r\n");
      out.write("			<div class=\"col-md-7-2 order-md-2\" style=\"width: 48%;\">\r\n");
      out.write("				<h2 class=\"featurette-heading\">\r\n");
      out.write("					????????? <br> <span class=\"text-muted\">\"????????? ?????? ??? ?????? ?????????\r\n");
      out.write("						???????!\"</span>\r\n");
      out.write("				</h2>\r\n");
      out.write("				<p class=\"lead\">Another featurette? Of course. More placeholder\r\n");
      out.write("					content here to give you an idea of how this layout would work with\r\n");
      out.write("					some actual real-world content in place.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-5 order-md-1\">\r\n");
      out.write("				<img src=\"./img/trainer2-1.jpg\" style=\"width: 560px; height: 450px;\">\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<hr class=\"featurette-divider\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"row featurette\" style=\"flex-wrap: nowrap;\">\r\n");
      out.write("			<div class=\"col-md-7\" style=\"width: 48%;\">\r\n");
      out.write("				<h2 class=\"featurette-heading\">\r\n");
      out.write("					????????? <br> <span class=\"text-muted\">\"????????? ????????? ?????????..\r\n");
      out.write("						????????????..\"</span>\r\n");
      out.write("				</h2>\r\n");
      out.write("				<p class=\"lead\">And yes, this is the last block of\r\n");
      out.write("					representative placeholder content. Again, not really intended to\r\n");
      out.write("					be actually read, simply here to give you a better view of what\r\n");
      out.write("					this would look like with some actual content. Your content.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-5\">\r\n");
      out.write("				<img src=\"./img/trainer1.png\" style=\"width: 560px; height: 450px;\">\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<hr class=\"featurette-divider\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"row featurette\" style=\"flex-wrap: nowrap;\">\r\n");
      out.write("			<div class=\"col-md-7-2 order-md-2\" style=\"width: 48%;\">\r\n");
      out.write("				<h2 class=\"featurette-heading\">\r\n");
      out.write("					????????? <br> <span class=\"text-muted\">\"?????? ????????? ????????? ??????? ???????????????\r\n");
      out.write("						?????????..\"</span>\r\n");
      out.write("				</h2>\r\n");
      out.write("				<p class=\"lead\">Another featurette? Of course. More placeholder\r\n");
      out.write("					content here to give you an idea of how this layout would work with\r\n");
      out.write("					some actual real-world content in place.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-5 order-md-1\">\r\n");
      out.write("				<img src=\"./img/trainer5.jpg\" style=\"width: 560px; height: 450px;\">\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<hr class=\"featurette-divider\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"paymentBtn\">\r\n");
      out.write("			<button class=\"payment_btn\">\r\n");
      out.write("				<a href='");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("'>PT ??? ???????????? ????????????</a>\r\n");
      out.write("			</button>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("		<div id=\"footer\">\r\n");
      out.write("			");
      out.write("\r\n");
      out.write("<div id=\"copyright\">\r\n");
      out.write("	<footer class=\"container\">\r\n");
      out.write("			<p class=\"float-end\">\r\n");
      out.write("				<a href=\"#\">Back to top</a>\r\n");
      out.write("			</p>\r\n");
      out.write("			<p>\r\n");
      out.write("				&copy; 2017???2021 Company, Inc. &middot; <a href=\"#\">Privacy</a>\r\n");
      out.write("				&middot; <a href=\"#\">Terms</a>\r\n");
      out.write("			</p>\r\n");
      out.write("		</footer>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<script>\r\n");
      out.write("    $( document ).ready( function() {\r\n");
      out.write("      $(\".top\").hide();\r\n");
      out.write("      $(window).scroll(function(){\r\n");
      out.write("        if(	$(this).scrollTop() > 200){	\r\n");
      out.write("          $(\".top\").fadeIn();	\r\n");
      out.write("        }\r\n");
      out.write("        else{	\r\n");
      out.write("          $(\".top\").fadeOut();	\r\n");
      out.write("        }			\r\n");
      out.write("      });\r\n");
      out.write("      $(\".top\").click(function(){\r\n");
      out.write("        $('body,html').animate({\r\n");
      out.write("          scrollTop:0 \r\n");
      out.write("        },300 );\r\n");
      out.write("        return false;\r\n");
      out.write("      });\r\n");
      out.write("    });</script>\r\n");
      out.write("	</main>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /Trainer/mypage.jsp(136,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/point/minusPoint");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }
}
