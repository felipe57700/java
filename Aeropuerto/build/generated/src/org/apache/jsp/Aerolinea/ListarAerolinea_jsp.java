package org.apache.jsp.Aerolinea;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.*;
import java.sql.*;

public final class ListarAerolinea_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

    ResultSet rs=null;
    rs=Aerolinea.Listar();

        if(rs==null){
          out.println("Error al mostrar la lista");
          return;
        }
        
        
 
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Lista Areolinea</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Lista Aerolinea</h1>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <td>ID:</td>\n");
      out.write("                <td>Nombre:</td>\n");
      out.write("                <td>Pais de origen:</td>\n");
      out.write("                 <td>Opciones:</td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");
 while(rs.next()){ 
      out.write("\n");
      out.write("             <tr>\n");
      out.write("                 <td>");
      out.print(rs.getLong("id") );
      out.write("</td>\n");
      out.write("                 <td>");
      out.print(rs.getString("nombre") );
      out.write("</td>\n");
      out.write("                 <td>");
      out.print(rs.getString("paisorigen") );
      out.write("</td>\n");
      out.write("                 <td> <a href=\"../elimimar.do?id=");
      out.print(rs.getLong("id"));
      out.write("\">  \n");
      out.write("                         <img src=\"../fotos/eliminar.gif\" >\n");
      out.write("                      </a>  \n");
      out.write("                         \n");
      out.write("                     <a  href=\"ModificarAerolinea.jsp?id=");
      out.print(rs.getLong("id"));
      out.write("\" >\n");
      out.write("                         <img src=\"../fotos/modificar1.gif\" >\n");
      out.write("                     </a>   \n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                    </td>      \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");
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
