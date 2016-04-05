package org.apache.jsp.Paciente;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class IngresoNuevoPaciente_jsp extends org.apache.jasper.runtime.HttpJspBase
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

 /* Recibir los datos del formulario de ingreso de pacientes,
    se deben usar los nombres de los formularios, ojo solo devuelve String
    */
  String nombre= request.getParameter("nombre");
  String apellido= request.getParameter("apellido");
  String rut= request.getParameter("rut");
  byte edad= Byte.parseByte (request.getParameter("edad"));
  String sexo=request.getParameter("sexo");
  String ciudad=request.getParameter("ciudad");
  
  //conexion a la base de datos
  
  try{
      //crea la conexion a la base de datos
  Connection conn= DriverManager.getConnection("jdbc:derby://localhost:1527/inacap","inacap","inacap"); 
  
   //crea un objeto de base de datos
  Statement st = conn.createStatement();
  
  //ingresa Sql
  String sql=" insert into inacap.paciente " + 
          " (nombre,apellido,rut,edad,sexo,ciudad) " +
          "values ('"+nombre+"', '"+apellido+"', '"+rut+"', "+edad+", '"+sexo+"', '"+ciudad+"')";
          out.println(sql+" <br/> <br/>");
          
          st.execute(sql);
          out.println("Datos ingresados correctamente");
   
   
  }
  
  catch(SQLException e){
  
    out.println("Error  de sql"+e);
  }
  
  
  
    
    
    

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1></h1>\n");
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
