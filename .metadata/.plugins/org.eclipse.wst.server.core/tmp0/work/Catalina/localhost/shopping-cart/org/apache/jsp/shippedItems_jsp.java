/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.96
 * Generated at: 2023-11-16 19:23:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.cake.service.impl.*;
import com.cake.beans.*;
import com.cake.service.*;
import java.util.*;

public final class shippedItems_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/footer.html", Long.valueOf(1700157037520L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("com.cake.service");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("com.cake.beans");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("com.cake.service.impl");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Admin Home</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/changes.css\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: #E6F9E6;\">\r\n");
      out.write("	");

	/* Checking the user credentials */
	String userType = (String) session.getAttribute("usertype");
	String userName = (String) session.getAttribute("username");
	String password = (String) session.getAttribute("password");

	if (userType == null || !userType.equals("admin")) {

		response.sendRedirect("login.jsp?message=Access Denied, Login as admin!!");

	}

	else if (userName == null || password == null) {

		response.sendRedirect("login.jsp?message=Session Expired, Login Again!!");

	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"text-center\"\r\n");
      out.write("		style=\"color: green; font-size: 24px; font-weight: bold;\">Shipped\r\n");
      out.write("		Orders</div>\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<div class=\"table-responsive \">\r\n");
      out.write("			<table class=\"table table-hover table-sm\">\r\n");
      out.write("				<thead\r\n");
      out.write("					style=\"background-color: #115884; color: white; font-size: 18px;\">\r\n");
      out.write("					<tr>\r\n");
      out.write("						<th>TransactionId</th>\r\n");
      out.write("						<th>ProductId</th>\r\n");
      out.write("						<th>Username</th>\r\n");
      out.write("						<th>Address</th>\r\n");
      out.write("						<th>Quantity</th>\r\n");
      out.write("						<th>Amount</th>\r\n");
      out.write("						<td>Status</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</thead>\r\n");
      out.write("				<tbody style=\"background-color: white;\">\r\n");
      out.write("\r\n");
      out.write("					");

					OrderServiceImpl orderdao = new OrderServiceImpl();

					List<OrderBean> orders = new ArrayList<OrderBean>();
					orders = orderdao.getAllOrders();
					int count = 0;
					for (OrderBean order : orders) {
						String transId = order.getTransactionId();
						String prodId = order.getProductId();
						int quantity = order.getQuantity();
						int shipped = order.getShipped();
						String userId = new TransServiceImpl().getUserId(transId);
						String userAddr = new UserServiceImpl().getUserAddr(userId);
						if (shipped != 0) {
							count++;
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>");
      out.print(transId);
      out.write("</td>\r\n");
      out.write("						<td><a href=\"./updateProduct.jsp?prodid=");
      out.print(prodId);
      out.write('"');
      out.write('>');
      out.print(prodId);
      out.write("</a></td>\r\n");
      out.write("						<td>");
      out.print(userId);
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(userAddr);
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(quantity);
      out.write("</td>\r\n");
      out.write("						<td>Rs. ");
      out.print(order.getAmount());
      out.write("</td>\r\n");
      out.write("						<td class=\"text-success\" style=\"font-weight: bold;\">SHIPPED</td>\r\n");
      out.write("\r\n");
      out.write("					</tr>\r\n");
      out.write("\r\n");
      out.write("					");

					}
					}
					
      out.write("\r\n");
      out.write("					");

					if (count == 0) {
					
      out.write("\r\n");
      out.write("					<tr style=\"background-color: grey; color: white;\">\r\n");
      out.write("						<td colspan=\"7\" style=\"text-align: center;\">No Items\r\n");
      out.write("							Available</td>\r\n");
      out.write("\r\n");
      out.write("					</tr>\r\n");
      out.write("					");

					}
					
      out.write("\r\n");
      out.write("				</tbody>\r\n");
      out.write("			</table>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Shoping Center</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/changes.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: #E6F9E6;\">\r\n");
      out.write("	<!-- Start the footer Contacts -->\r\n");
      out.write("	<!-- <a name=\"contact\"></a> -->\r\n");
      out.write("	<div class=\"container-fluid\"\r\n");
      out.write("		style=\"background-color: #343148; color: white; margin-top: 200px;\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<h3 class=\"text-center\">Contact</h3>\r\n");
      out.write("			<p class=\"text-center\">\r\n");
      out.write("				<em>We love our Customers!</em>\r\n");
      out.write("			</p>\r\n");
      out.write("			<div class=\"row test\">\r\n");
      out.write("				<div class=\"col-md-4\">\r\n");
      out.write("					<p>Fan? Drop a note.</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						<span class=\"glyphicon glyphicon-map-marker\"></span>Brycode\r\n");
      out.write("					</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						<span class=\"glyphicon glyphicon-phone\"></span>Phone: +254738476283\r\n");
      out.write("						\r\n");
      out.write("					</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						<span class=\"glyphicon glyphicon-envelope\"></span>Email:\r\n");
      out.write("						e-shopforJohn@gmail.com\r\n");
      out.write("					</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						<span class=\"glyphicon glyphicon-copyright-mark\"></span>\r\n");
      out.write("						E-shop - 2023\r\n");
      out.write("					</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-8\">\r\n");
      out.write("					<form action=\"fansMessage\" method=\"post\">\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<div class=\"col-sm-6 form-group\">\r\n");
      out.write("								<input class=\"form-control\" id=\"name\" name=\"name\"\r\n");
      out.write("									placeholder=\"Name\" type=\"text\" required>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"col-sm-6 form-group\">\r\n");
      out.write("								<input class=\"form-control\" id=\"email\" name=\"email\"\r\n");
      out.write("									placeholder=\"Email\" type=\"email\" required>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<textarea class=\"form-control\" id=\"comments\" name=\"comments\"\r\n");
      out.write("							placeholder=\"Comment\" rows=\"5\" required></textarea>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<div class=\"col-md-12 form-group\">\r\n");
      out.write("								<button class=\"btn pull-right\" type=\"submit\">Send</button>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- End of Contact or about us -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
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
}
