package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import cl.inacap.taller2.conexion.*;

public final class ListaAtenciones_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    ResultSet rs = null;
    
    try
    {
        Connection conn = ConexionBD.crearConexion();
        
        Statement st = conn.createStatement();
        String sql   = "select LISTAATENCIONES.ID,LISTAATENCIONES.FECHA, " +  
                       "MEDICO.NOMBRE as NOMBREMEDICO, MEDICO.APELLIDO, " +
                       "MASCOTA.NOMBRE as NOMBREMASCOTA, MASCOTA.RAZA " +
                       "from inacap.MEDICO, inacap.MASCOTA, " +
                       "inacap.LISTAATENCIONES where " +
                       "MASCOTA.ID = LISTAATENCIONES.IDMASCOTA and " +
                       "MEDICO.ID = LISTAATENCIONES.IDMEDICO";
        
        rs = st.executeQuery( sql );
    }
    catch(SQLException e)
    {
        out.println("Excepción de SQL: " + e);
        return;
    }    

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Listado de Atenciones Veterinarias</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Listado de Atenciones Veterinarias</h1>\n");
      out.write("        \n");
      out.write("        <table border=\"1\" align=\"center\" width=\"800\">\n");
      out.write("            <tr bgcolor=\"#cccccc\">\n");
      out.write("                <td align=\"center\"><b>Id</b></td>\n");
      out.write("                <td align=\"center\"><b>Nombre Médico</b></td>\n");
      out.write("                <td align=\"center\"><b>Apellido Médico</b></td>\n");
      out.write("                <td align=\"center\"><b>Nombre Mascota</b></td>\n");
      out.write("                <td align=\"center\"><b>Raza Mascota</b></td>\n");
      out.write("                <td align=\"center\"><b>Fecha Atención</b></td>\n");
      out.write("                <td align=\"center\"><b>Operaciones</b></td>                \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");
 while(rs.next()) {  
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"center\">");
      out.print( rs.getLong("id") );
      out.write("</td>\n");
      out.write("                <td align=\"center\">");
      out.print( rs.getString("nombremedico") );
      out.write("</td>\n");
      out.write("                <td align=\"center\">");
      out.print( rs.getString("apellido") );
      out.write("</td>\n");
      out.write("                <td align=\"center\">");
      out.print( rs.getString("nombremascota") );
      out.write("</td>\n");
      out.write("                <td align=\"center\">");
      out.print( rs.getString("raza") );
      out.write("</td>\n");
      out.write("                <td align=\"center\">");
      out.print( rs.getTimestamp("fecha") );
      out.write("</td>\n");
      out.write("                <td align=\"center\">\n");
      out.write("                    <a href=\"FormularioModificacionUsuario.jsp?id=");
      out.print( rs.getLong("id") );
      out.write("\">\n");
      out.write("                        <img src=\"../imagenes/modificar.png\" />\n");
      out.write("                    </a>\n");
      out.write("                    &nbsp;\n");
      out.write("                    <a href=\"EliminarUsuario.jsp?id=");
      out.print( rs.getLong("id") );
      out.write("\"> \n");
      out.write("                        <img src=\"../imagenes/eliminar.png\" /> \n");
      out.write("                    </a>\n");
      out.write("                </td>                \n");
      out.write("            </tr>\n");
      out.write("            ");
 } 
      out.write("            \n");
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
