package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cl.inacap.modelo.*;
import java.util.ArrayList;
import java.sql.*;

public final class ListarAviones_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    ResultSet rs;
    try
    {
        Connection conn = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/BDAppS3", "inacap", "inacap");        
        Statement st = conn.createStatement();
        rs = st.executeQuery("select * from inacap.avion");      
    }
    catch(SQLException e)
    {
        System.err.println("Excepción de SQL: " + e);
        return;
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Listar Aviones</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Listado de Aviones</h1>\n");
      out.write("\n");
      out.write("        <table border=\"1\" width=\"800\"  align=\"center\">\n");
      out.write("            <tr style=\"background-color: lightslategray\">\n");
      out.write("               <td align=\"center\">Id</td>\n");
      out.write("               <td align=\"center\">Piloto</td>\n");
      out.write("               <td align=\"center\">Copiloto</td>\n");
      out.write("               <td align=\"center\">Modelo</td>\n");
      out.write("               <td align=\"center\">Máximo Pasajeros</td>\n");
      out.write("               <td align=\"center\">Operaciones</td>\n");
      out.write("           </tr>\n");
      out.write("           \n");
      out.write("           ");
 while( rs.next() ) { 
      out.write(" \n");
      out.write("           <tr>\n");
      out.write("               <td align=\"center\">");
      out.print( rs.getString("id") );
      out.write("</td>\n");
      out.write("               <td align=\"center\">");
      out.print( rs.getString("idpiloto") );
      out.write("</td>\n");
      out.write("               <td align=\"center\">");
      out.print( rs.getString("idcopiloto") );
      out.write("</td>\n");
      out.write("               <td align=\"center\">");
      out.print( rs.getString("modelo") );
      out.write("</td>\n");
      out.write("               <td align=\"center\">");
      out.print( rs.getString("maximopasajeros") );
      out.write("</td>\n");
      out.write("               <td align=\"center\">              \n");
      out.write("                   <a href=\"EliminarAvion.do?id=");
      out.print( rs.getString("id") );
      out.write("\">\n");
      out.write("                       <img src=\"iconos/eliminar.png\" />\n");
      out.write("                   </a> \n");
      out.write("               </td>\n");
      out.write("           </tr>\n");
      out.write("           \n");
      out.write("           ");
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
