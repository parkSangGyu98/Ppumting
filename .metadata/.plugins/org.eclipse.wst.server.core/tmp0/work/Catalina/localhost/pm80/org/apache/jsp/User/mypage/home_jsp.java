/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.73
 * Generated at: 2022-08-23 08:44:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.User.mypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.net.URLEncoder;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"32x32\"\r\n");
      out.write("	href=\"../../ico/favicon-32x32.png\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\"\r\n");
      out.write("	content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\r\n");
      out.write("<meta name=\"generator\" content=\"Hugo 0.88.1\">\r\n");
      out.write("<title>HOME | PUMTTING</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"canonical\"\r\n");
      out.write("	href=\"https://getbootstrap.com/docs/5.1/examples/carousel/\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap core CSS -->\r\n");
      out.write("<link href=\"../../assets/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Custom styles for this template -->\r\n");
      out.write("<link href=\"homecss/carousel.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("	<div id=\"header\">\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/incl/banner.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("subtitle", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(URLEncoder.encode("mod010: Login.jsp", "UTF-8")), request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("	<main>\r\n");
      out.write("\r\n");
      out.write("		<div id=\"myCarousel\" class=\"carousel slide\" data-bs-ride=\"carousel\">\r\n");
      out.write("			<div class=\"carousel-indicators\">\r\n");
      out.write("				<button type=\"button\" data-bs-target=\"#myCarousel\"\r\n");
      out.write("					data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\"\r\n");
      out.write("					aria-label=\"Slide 1\"></button>\r\n");
      out.write("				<button type=\"button\" data-bs-target=\"#myCarousel\"\r\n");
      out.write("					data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\r\n");
      out.write("				<button type=\"button\" data-bs-target=\"#myCarousel\"\r\n");
      out.write("					data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"carousel-inner\">\r\n");
      out.write("				<div class=\"carousel-item active\">\r\n");
      out.write("					<div class=\"container\">\r\n");
      out.write("						<div class=\"carousel-caption text-start\">\r\n");
      out.write("							<h1>Premium Personal Trainer</h1>\r\n");
      out.write("							<p>\r\n");
      out.write("								?????? ??????????????? ?????? ???????????? ?????? ?????? ?????? P.P.T!<br> ????????? ????????????????????? ???????????? ????????????\r\n");
      out.write("								????????????!\r\n");
      out.write("							</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<a class=\"btn btn-lg btn-primary\" aria-current=\"page\"\r\n");
      out.write("									href='");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("'>P.P.T ????????????</a>\r\n");
      out.write("							</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"carousel-item\">\r\n");
      out.write("					<div class=\"container\">\r\n");
      out.write("						<div class=\"carousel-caption\">\r\n");
      out.write("							<h1>????????? ?????? ????????? ???????????? ????????? ???????????? ...????</h1>\r\n");
      out.write("							<p>\r\n");
      out.write("								?????? ????????? ?????? ?????? PPUMTING?????? ???????????? OPEN ????????????!<br> ?????? ?????? ?????? ?????????\r\n");
      out.write("								????????? ???????????????!\r\n");
      out.write("							</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<a class=\"btn btn-lg btn-primary\"\r\n");
      out.write("									href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\">????????? ???????????????</a>\r\n");
      out.write("							</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"carousel-item\">\r\n");
      out.write("					<div class=\"container\">\r\n");
      out.write("						<div class=\"carousel-caption text-end\">\r\n");
      out.write("							<h1>PPUMTING ??????????????? ????????? ????????? &#128077;</h1>\r\n");
      out.write("							<p>??????????????? ???????????? ?????????????????? ???????????? ????????????!</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<a class=\"btn btn-lg btn-primary\" href=\"#\">P.P.T ?????? ????????????</a>\r\n");
      out.write("							</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<button class=\"carousel-control-prev\" type=\"button\"\r\n");
      out.write("				data-bs-target=\"#myCarousel\" data-bs-slide=\"prev\">\r\n");
      out.write("				<span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("				<span class=\"visually-hidden\">Previous</span>\r\n");
      out.write("			</button>\r\n");
      out.write("			<button class=\"carousel-control-next\" type=\"button\"\r\n");
      out.write("				data-bs-target=\"#myCarousel\" data-bs-slide=\"next\">\r\n");
      out.write("				<span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("				<span class=\"visually-hidden\">Next</span>\r\n");
      out.write("			</button>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!-- Marketing messaging and featurettes\r\n");
      out.write("  ================================================== -->\r\n");
      out.write("		<!-- Wrap the rest of the page in another container to center all the content. -->\r\n");
      out.write("\r\n");
      out.write("		<div class=\"container marketing\">\r\n");
      out.write("\r\n");
      out.write("			<!-- Three columns of text below the carousel -->\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-lg-4\">\r\n");
      out.write("					<img class=\"radius_img\" src=\"../../img/radius_img01.jpg\" alt=\"\">\r\n");
      out.write("					<h2>?????????</h2>\r\n");
      out.write("					<p>\"????????? ??????\"</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						<a class=\"btn btn-secondary\" aria-current=\"page\"\r\n");
      out.write("							href='");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("'>?????????\r\n");
      out.write("							????????? ????????????</a>\r\n");
      out.write("					</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- /.col-lg-4 -->\r\n");
      out.write("				<div class=\"col-lg-4\">\r\n");
      out.write("					<img class=\"radius_img\" src=\"../../img/radius_img02.jpg\" alt=\"\">\r\n");
      out.write("					<h2>?????????</h2>\r\n");
      out.write("					<p>\"?????? ?????? ??????????????? ??????????????? ?????????.\"</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						<a class=\"btn btn-secondary\" aria-current=\"page\"\r\n");
      out.write("							href='");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("'>?????????\r\n");
      out.write("							????????? ????????????</a>\r\n");
      out.write("					</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- /.col-lg-4 -->\r\n");
      out.write("				<div class=\"col-lg-4\">\r\n");
      out.write("					<img class=\"radius_img\" src=\"../../img/radius_img03.jpg\" alt=\"\">\r\n");
      out.write("					<h2>?????????</h2>\r\n");
      out.write("					<p>'??????'?????? ?????? ??? '??? ???'??? ??? ?????? ????????????.</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						<a class=\"btn btn-secondary\" aria-current=\"page\"\r\n");
      out.write("							href='");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("'>?????????\r\n");
      out.write("							????????? ????????????</a>\r\n");
      out.write("					</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- /.col-lg-4 -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- /.row -->\r\n");
      out.write("		</div>\r\n");
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
      out.write("	</main>\r\n");
      out.write("	<script src=\"../../assets/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
      // /User/mypage/home.jsp(78,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/Trainer/mypage");
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

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /User/mypage/home.jsp(93,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/Qna/qnaInfo/find.do");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f2_reused = false;
    try {
      _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f2.setParent(null);
      // /User/mypage/home.jsp(137,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f2.setValue("/Trainer/mypage");
      int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
      if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      _jspx_th_c_005furl_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f2, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f3_reused = false;
    try {
      _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f3.setParent(null);
      // /User/mypage/home.jsp(148,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f3.setValue("/Trainer/mypage");
      int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
      if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      _jspx_th_c_005furl_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f3, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f4_reused = false;
    try {
      _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f4.setParent(null);
      // /User/mypage/home.jsp(159,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f4.setValue("/Trainer/mypage");
      int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
      if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      _jspx_th_c_005furl_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f4, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f4_reused);
    }
    return false;
  }
}
