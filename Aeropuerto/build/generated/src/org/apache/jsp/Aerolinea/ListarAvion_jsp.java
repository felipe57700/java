package org.apache.jsp.Aerolinea;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import modelo.Avion;

public final class ListarAvion_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");

    ResultSet rs=Avion.Listar();
    
    if(rs==null){
        out.println("Error al listar");
        return; 
    }
    
    



      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Listar Aviones</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Listar Aviones</h1>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td> ID </td>\n");
      out.write("                <td> ID Areloninea </td>\n");
      out.write("                <td> ID Piloto</td>\n");
      out.write("                <td> ID Copiloto</td>\n");
      out.write("                <td> Modelo</td>\n");
      out.write("                <td>Maximo Pasajeros</td>\n");
      out.write("                <td>Opciones</td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("        ");
while(rs.next()){
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td> ");
      out.print(rs.getLong("id") );
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print(rs.getLong("idareloninea"));
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print(rs.getLong("idpiloto"));
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print(rs.getLong("idcopiloto") );
      out.write("</td>\n");
      out.write("                <td> ");
      out.print(rs.getString("modelo") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getInt("maximopasajeros") );
      out.write("</td>\n");
      out.write("                <td>Opciones</td>\n");
      out.write("            </tr>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        </table>\n");
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
