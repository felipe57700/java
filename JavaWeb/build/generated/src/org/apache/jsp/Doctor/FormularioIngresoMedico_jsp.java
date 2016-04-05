package org.apache.jsp.Doctor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class FormularioIngresoMedico_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

    ResultSet rs=null;
try{
    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/inacap","inacap","inacap");
    Statement st=conn.createStatement();
    String sql="select *from inacap.ciudad order by nombre asc";
    rs=st.executeQuery(sql);

}

catch(SQLException e){
    out.print("Excepcion de SQL"+e);

}
        


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ingreso de nuevos medicos.</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Ingreso de nuevos medicos.</h1>\n");
      out.write("        \n");
      out.write("        <form action=\"IngresarMedico.jsp\">\n");
      out.write("            <br/>\n");
      out.write("            Nombre : <input type=\"text\" name=\"nombremedico\"> <br/>\n");
      out.write("            Apellido : <input type=\"text\" name=\"apellidomedico\"> <br/>\n");
      out.write("            Rut: <input type=\"text\" name=\"rutmedico\"> <br/>\n");
      out.write("            Edad: <input type=\"number\" name=\"edadmedico\"> <br/>\n");
      out.write("            Sexo: \n");
      out.write("            M <input type=\"radio\" name=\"sexomedico\" value=\"M\" checked> &nbsp;\n");
      out.write("            F <input type=\"radio\" name=\"sexomedico\" value=\"F\"> </br>\n");
      out.write("            \n");
      out.write("            Ciudad: \n");
      out.write("            <select name=\"ciudadmedico\">\n");
      out.write("                ");
while(rs.next()) { 
      out.write("\n");
      out.write("                <option value=\"");
      out.print(rs.getString("nombre"));
      out.write("\"> ");
      out.print(rs.getString("nombre"));
      out.write("</option>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <br/>\n");
      out.write("            <input type=\"reset\" value=\"Limpiar\"> &nbsp;\n");
      out.write("            <input type=\"submit\" value=\"Ingresar medico\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
