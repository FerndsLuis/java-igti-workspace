/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.21
 * Generated at: 2022-06-10 02:06:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import br.com.DAO.ConexaoDAO;
import br.com.MODEL.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("br.com.MODEL");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("br.com.DAO.ConexaoDAO");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\"\r\n");
      out.write("	integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("	integrity=\"sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("	<!-- Criando o menu -->\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("		<a class=\"navbar-brand\" href=\"#\">Sistema de Cursos</a>\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("			data-target=\"#navbarSupportedContent\"\r\n");
      out.write("			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("			aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("			<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("				<li class=\"nav-item active\"><a class=\"nav-link\"\r\n");
      out.write("					href=\"index.jsp\">Principal <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"nav-item dropdown\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("						CRUD </a>\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"pesquisar.jsp\">Pesquisa</a> <a\r\n");
      out.write("							class=\"dropdown-item\" href=\"inserir.jsp\">Inseir</a> <a\r\n");
      out.write("							class=\"dropdown-item\" href=\"modificar.jsp\">Modificar</a>\r\n");
      out.write("					</div></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("	<!-- Criando o menu -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Demonstração da empresa -->\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-12\">\r\n");
      out.write("				<div class=\"card-group\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<img src=\"...\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<h5 class=\"card-title\">Card title</h5>\r\n");
      out.write("							<p class=\"card-text\">This is a wider card with supporting\r\n");
      out.write("								text below as a natural lead-in to additional content. This\r\n");
      out.write("								content is a little bit longer.</p>\r\n");
      out.write("							<p class=\"card-text\">\r\n");
      out.write("								<small class=\"text-muted\">Last updated 3 mins ago</small>\r\n");
      out.write("							</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<img src=\"...\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<h5 class=\"card-title\">Card title</h5>\r\n");
      out.write("							<p class=\"card-text\">This card has supporting text below as a\r\n");
      out.write("								natural lead-in to additional content.</p>\r\n");
      out.write("							<p class=\"card-text\">\r\n");
      out.write("								<small class=\"text-muted\">Last updated 3 mins ago</small>\r\n");
      out.write("							</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("				<div class=\"col-12\">\r\n");
      out.write("					<div class=\"card-group\">\r\n");
      out.write("						<div class=\"card\">\r\n");
      out.write("							<img src=\"...\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h5 class=\"card-title\">Card title</h5>\r\n");
      out.write("								<p class=\"card-text\">This is a wider card with supporting\r\n");
      out.write("									text below as a natural lead-in to additional content. This\r\n");
      out.write("									content is a little bit longer.</p>\r\n");
      out.write("								<p class=\"card-text\">\r\n");
      out.write("									<small class=\"text-muted\">Last updated 3 mins ago</small>\r\n");
      out.write("								</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"card\">\r\n");
      out.write("							<img src=\"...\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h5 class=\"card-title\">Card title</h5>\r\n");
      out.write("								<p class=\"card-text\">This card has supporting text below as\r\n");
      out.write("									a natural lead-in to additional content.</p>\r\n");
      out.write("								<p class=\"card-text\">\r\n");
      out.write("									<small class=\"text-muted\">Last updated 3 mins ago</small>\r\n");
      out.write("								</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- Demonstração da empresa -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
}
