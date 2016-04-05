package org.apache.jsp.Paciente;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class FormularioModificarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 
String id=request.getParameter("id");
ResultSet rs=null;

try{
Connection conn=DriverManager.getConnection("","","");
Statement st=conn.createStatement();
String sql="select *from inacap.paciente where id="+id;

//como debe mostrar los resultados vamos a utlizar:
    rs=st.executeQuery(sql);

//mover el indice de lectura del ResultSet a la primera fila <--> al usuario a modificarce
rs.next();

}

catch(SQLException e){
out.print("Error SQL"+e);
}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Modificar Paciente </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Modificar Paciente</h1>\n");
      out.write("        \n");
      out.write("           <form action=\"IngresoNuevoPaciente.jsp\">\n");
      out.write("              ");
      out.write("\n");
      out.write("                Nombre Paciente: <input type=\"text\" name=\"nombre\" value=\"");
      out.print( rs.getString("nombre") );
      out.write("\" />\n");
      out.write("         ");
      out.write("\n");
      out.write("               ");
      out.write("\n");
      out.write("                 </br>\n");
      out.write("                 </br>\n");
      out.write("\n");
      out.write("                 <input type=\"reset\" value=\"Limpiar formulario\"> &nbsp;\n");
      out.write("                <input type=\"submit\" value=\"Ingresar nuevo paciente\">\n");
      out.write("                 \n");
      out.write("        </form>\n");
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
