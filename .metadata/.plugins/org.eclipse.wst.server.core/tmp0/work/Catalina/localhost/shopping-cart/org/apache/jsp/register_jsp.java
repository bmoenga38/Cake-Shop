/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.96
 * Generated at: 2023-11-16 17:30:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.cake.service.impl.*;
import com.cake.service.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/header.jsp", Long.valueOf(1700152987121L));
    _jspx_dependants.put("/footer.html", Long.valueOf(1700152635478L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("com.cake.service");
    _jspx_imports_packages.add("javax.servlet");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Register</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/changes.css\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: #E6F9E6;\">\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Logout Header</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/changes.css\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: #E6F9E6;\">\r\n");
      out.write("	<!--Company Header Starting  -->\r\n");
      out.write("	<div class=\"container-fluid text-center\"\r\n");
      out.write("		style=\"margin-top: 45px; background-color: #33cc33; color: white; padding: 5px;\">\r\n");
      out.write("		<h2>John's E-Shop</h2>\r\n");
      out.write("		<h6>Cakes and Pastries</h6>\r\n");
      out.write("		<form class=\"form-inline\" action=\"index.jsp\" method=\"get\">\r\n");
      out.write("			<div class=\"input-group\">\r\n");
      out.write("				<input type=\"text\" class=\"form-control\" size=\"50\" name=\"search\"\r\n");
      out.write("					placeholder=\"Search Items\" required>\r\n");
      out.write("				<div class=\"input-group-btn\">\r\n");
      out.write("					<input type=\"submit\" class=\"btn btn-danger\" value=\"Search\" />\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</form>\r\n");
      out.write("		<p align=\"center\"\r\n");
      out.write("			style=\"color: blue; font-weight: bold; margin-top: 5px; margin-bottom: 5px;\"\r\n");
      out.write("			id=\"message\"></p>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- Company Header Ending -->\r\n");
      out.write("\r\n");
      out.write("	");

	/* Checking the user credentials */
	String userType = (String) session.getAttribute("usertype");
	if (userType == null) { //LOGGED OUT
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Starting Navigation Bar -->\r\n");
      out.write("	<nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("		<div class=\"container-fluid\">\r\n");
      out.write("			<div class=\"navbar-header\">\r\n");
      out.write("				<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("					data-target=\"#myNavbar\">\r\n");
      out.write("					<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("						class=\"icon-bar\"></span>\r\n");
      out.write("				</button>\r\n");
      out.write("				<a class=\"navbar-brand\" href=\"index.jsp\"><span\r\n");
      out.write("					class=\"glyphicon glyphicon-home\">&nbsp;</span>Shopping Center</a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("				<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("					<li><a href=\"login.jsp\">Login</a></li>\r\n");
      out.write("					<li><a href=\"register.jsp\">Register</a></li>\r\n");
      out.write("					<li><a href=\"index.jsp\">Products</a></li>\r\n");
      out.write("					<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("						data-toggle=\"dropdown\" href=\"#\">Category <span class=\"caret\"></span>\r\n");
      out.write("					</a>\r\n");
      out.write("						<ul class=\"dropdown-menu\">\r\n");
      out.write("							<li><a href=\"index.jsp?type=mobile\">Mobiles</a></li>\r\n");
      out.write("							<li><a href=\"index.jsp?type=tv\">TVs</a></li>\r\n");
      out.write("							<li><a href=\"index.jsp?type=laptop\">Laptops</a></li>\r\n");
      out.write("							<li><a href=\"index.jsp?type=camera\">Camera</a></li>\r\n");
      out.write("							<li><a href=\"index.jsp?type=speaker\">Speakers</a></li>\r\n");
      out.write("							<li><a href=\"index.jsp?type=tablet\">Tablets</a></li>\r\n");
      out.write("						</ul></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("	");

	} else if ("customer".equalsIgnoreCase(userType)) { //CUSTOMER HEADER

	int notf = new CartServiceImpl().getCartCount((String) session.getAttribute("username"));
	
      out.write("\r\n");
      out.write("	<nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"container-fluid\">\r\n");
      out.write("			<div class=\"navbar-header\">\r\n");
      out.write("				<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("					data-target=\"#myNavbar\">\r\n");
      out.write("					<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("						class=\"icon-bar\"></span>\r\n");
      out.write("				</button>\r\n");
      out.write("				<a class=\"navbar-brand\" href=\"userHome.jsp\"><span\r\n");
      out.write("					class=\"glyphicon glyphicon-home\">&nbsp;</span>Shopping Center</a>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("				<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("					<li><a href=\"userHome.jsp\"><span\r\n");
      out.write("							class=\"glyphicon glyphicon-home\">Products</span></a></li>\r\n");
      out.write("					<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("						data-toggle=\"dropdown\" href=\"#\">Category <span class=\"caret\"></span>\r\n");
      out.write("					</a>\r\n");
      out.write("						<ul class=\"dropdown-menu\">\r\n");
      out.write("							<li><a href=\"userHome.jsp?type=mobile\">Mobiles</a></li>\r\n");
      out.write("							<li><a href=\"userHome.jsp?type=tv\">TV</a></li>\r\n");
      out.write("							<li><a href=\"userHome.jsp?type=laptop\">Laptops</a></li>\r\n");
      out.write("							<li><a href=\"userHome.jsp?type=camera\">Camera</a></li>\r\n");
      out.write("							<li><a href=\"userHome.jsp?type=speaker\">Speakers</a></li>\r\n");
      out.write("							<li><a href=\"userHome.jsp?type=tablet\">Tablets</a></li>\r\n");
      out.write("						</ul></li>\r\n");
      out.write("					");

					if (notf == 0) {
					
      out.write("\r\n");
      out.write("					<li><a href=\"cartDetails.jsp\"> <span\r\n");
      out.write("							class=\"glyphicon glyphicon-shopping-cart\"></span>Cart\r\n");
      out.write("					</a></li>\r\n");
      out.write("\r\n");
      out.write("					");

					} else {
					
      out.write("\r\n");
      out.write("					<li><a href=\"cartDetails.jsp\"\r\n");
      out.write("						style=\"margin: 0px; padding: 0px;\" id=\"mycart\"><i\r\n");
      out.write("							data-count=\"");
      out.print(notf);
      out.write("\"\r\n");
      out.write("							class=\"fa fa-shopping-cart fa-3x icon-white badge\"\r\n");
      out.write("							style=\"background-color: #333; margin: 0px; padding: 0px; padding-bottom: 0px; padding-top: 5px;\">\r\n");
      out.write("						</i></a></li>\r\n");
      out.write("					");

					}
					
      out.write("\r\n");
      out.write("					<li><a href=\"orderDetails.jsp\">Orders</a></li>\r\n");
      out.write("					<li><a href=\"userProfile.jsp\">Profile</a></li>\r\n");
      out.write("					<li><a href=\"./LogoutSrv\">Logout</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("	");

	} else { //ADMIN HEADER
	
      out.write("\r\n");
      out.write("	<nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("		<div class=\"container-fluid\">\r\n");
      out.write("			<div class=\"navbar-header\">\r\n");
      out.write("				<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("					data-target=\"#myNavbar\">\r\n");
      out.write("					<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("						class=\"icon-bar\"></span>\r\n");
      out.write("				</button>\r\n");
      out.write("				<a class=\"navbar-brand\" href=\"adminViewProduct.jsp\"><span\r\n");
      out.write("					class=\"glyphicon glyphicon-home\">&nbsp;</span>Shopping Center</a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("				<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("					<li><a href=\"adminViewProduct.jsp\">Products</a></li>\r\n");
      out.write("					<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("						data-toggle=\"dropdown\" href=\"#\">Category <span class=\"caret\"></span>\r\n");
      out.write("					</a>\r\n");
      out.write("						<ul class=\"dropdown-menu\">\r\n");
      out.write("							<li><a href=\"adminViewProduct.jsp?type=mobile\">Mobiles</a></li>\r\n");
      out.write("							<li><a href=\"adminViewProduct.jsp?type=tv\">Tvs</a></li>\r\n");
      out.write("							<li><a href=\"adminViewProduct.jsp?type=laptop\">Laptops</a></li>\r\n");
      out.write("							<li><a href=\"adminViewProduct.jsp?type=camera\">Camera</a></li>\r\n");
      out.write("							<li><a href=\"adminViewProduct.jsp?type=speaker\">Speakers</a></li>\r\n");
      out.write("							<li><a href=\"adminViewProduct.jsp?type=tablet\">Tablets</a></li>\r\n");
      out.write("						</ul></li>\r\n");
      out.write("					<li><a href=\"adminStock.jsp\">Stock</a></li>\r\n");
      out.write("					<li><a href=\"shippedItems.jsp\">Shipped</a></li>\r\n");
      out.write("					<li><a href=\"unshippedItems.jsp\">Orders</a></li>\r\n");
      out.write("					<!-- <li><a href=\"\"> <span class=\"glyphicon glyphicon-shopping-cart\"></span>&nbsp;Cart</a></li> -->\r\n");
      out.write("					<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("						data-toggle=\"dropdown\" href=\"#\">Update Items <span\r\n");
      out.write("							class=\"caret\"></span>\r\n");
      out.write("					</a>\r\n");
      out.write("						<ul class=\"dropdown-menu\">\r\n");
      out.write("							<li><a href=\"addProduct.jsp\">Add Product</a></li>\r\n");
      out.write("							<li><a href=\"removeProduct.jsp\">Remove Product</a></li>\r\n");
      out.write("							<li><a href=\"updateProductById.jsp\">Update Product</a></li>\r\n");
      out.write("						</ul></li>\r\n");
      out.write("					<li><a href=\"./LogoutSrv\">Logout</a></li>\r\n");
      out.write("\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("	");

	}
	
      out.write("\r\n");
      out.write("	<!-- End of Navigation Bar -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
      out.write('	');

	String message = request.getParameter("message");
	
      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"row\"\r\n");
      out.write("			style=\"margin-top: 5px; margin-left: 2px; margin-right: 2px;\">\r\n");
      out.write("\r\n");
      out.write("			<form action=\"./RegisterSrv\" method=\"post\"\r\n");
      out.write("				class=\"col-md-6 col-md-offset-3\"\r\n");
      out.write("				style=\"border: 2px solid black; border-radius: 10px; background-color: #FFE5CC; padding: 10px;\">\r\n");
      out.write("				<div style=\"font-weight: bold;\" class=\"text-center\">\r\n");
      out.write("					<h2 style=\"color: green;\">Registration Form</h2>\r\n");
      out.write("					");

					if (message != null) {
					
      out.write("\r\n");
      out.write("					<p style=\"color: blue;\">\r\n");
      out.write("						");
      out.print(message);
      out.write("\r\n");
      out.write("					</p>\r\n");
      out.write("					");

					}
					
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("				<div></div>\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col-md-6 form-group\">\r\n");
      out.write("						<label for=\"first_name\">Name</label> <input type=\"text\"\r\n");
      out.write("							name=\"username\" class=\"form-control\" id=\"first_name\"\r\n");
      out.write("							name=\"first_name\" required>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-6 form-group\">\r\n");
      out.write("						<label for=\"last_name\">Email</label> <input type=\"email\"\r\n");
      out.write("							name=\"email\" class=\"form-control\" id=\"last_name\" name=\"last_name\"\r\n");
      out.write("							required>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"form-group\">\r\n");
      out.write("					<label for=\"last_name\">Address</label>\r\n");
      out.write("					<textarea name=\"address\" class=\"form-control\" id=\"last_name\"\r\n");
      out.write("						name=\"last_name\" required></textarea>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col-md-6 form-group\">\r\n");
      out.write("						<label for=\"last_name\">Mobile</label> <input type=\"number\"\r\n");
      out.write("							name=\"mobile\" class=\"form-control\" id=\"last_name\"\r\n");
      out.write("							name=\"last_name\" required>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-6 form-group\">\r\n");
      out.write("						<label for=\"last_name\">Pin Code</label> <input type=\"number\"\r\n");
      out.write("							name=\"pincode\" class=\"form-control\" id=\"last_name\"\r\n");
      out.write("							name=\"last_name\" required>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col-md-6 form-group\">\r\n");
      out.write("						<label for=\"last_name\">Password</label> <input type=\"password\"\r\n");
      out.write("							name=\"password\" class=\"form-control\" id=\"last_name\"\r\n");
      out.write("							name=\"last_name\" required>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-6 form-group\">\r\n");
      out.write("						<label for=\"last_name\">Confirm Password</label> <input\r\n");
      out.write("							type=\"password\" name=\"confirmPassword\" class=\"form-control\"\r\n");
      out.write("							id=\"last_name\" name=\"last_name\" required>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"row text-center\">\r\n");
      out.write("					<div class=\"col-md-6\" style=\"margin-bottom: 2px;\">\r\n");
      out.write("						<button type=\"Reset\" class=\"btn btn-danger\">Reset</button>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-6\">\r\n");
      out.write("						<button type=\"submit\" class=\"btn btn-success\">Register</button>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
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
      out.write("		style=\"background-color: #3d783d; color: white; margin-top: 200px;\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<h3 class=\"text-center\">Contact</h3>\r\n");
      out.write("			<p class=\"text-center\">\r\n");
      out.write("				<em>We love our fans!</em>\r\n");
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
