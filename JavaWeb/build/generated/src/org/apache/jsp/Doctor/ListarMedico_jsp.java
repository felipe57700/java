package org.apache.jsp.Doctor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ListarMedico_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    String sql="select *from inacap.medico";
    rs=st.executeQuery(sql);

}

catch(SQLException e){
    out.print("Excepcion de SQL"+e);

}
        


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Lista de Medicos</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: buttonface \">\n");
      out.write("        <h1 style=\"background:coral\" align=\"center\">Lista de Medicos</h1>\n");
      out.write("        <table border=\"1\" align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"center\"><b>ID</b></td>\n");
      out.write("                <td align=\"center\"><b>NOMBRE</b></td>\n");
      out.write("                <td align=\"center\"><b>APELLIDO</b></td>\n");
      out.write("                <td align=\"center\"><b>RUT</b></td>\n");
      out.write("                <td align=\"center\"><b>EDAD</b></td>\n");
      out.write("                <td align=\"center\"><b>SEXO</b></td>\n");
      out.write("                <td align=\"center\"><b>CIUDAD</b></td>\n");
      out.write("                <td align=\"center\"><b>OPERACIONES</b></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");
while(rs.next()) {
      out.write("\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td align=\"center\">");
      out.print(rs.getString("id"));
      out.write(" </td>\n");
      out.write("                <td align=\"center\">");
      out.print(rs.getString("nombre"));
      out.write("</td>\n");
      out.write("                <td align=\"center\">");
      out.print(rs.getString("apellido"));
      out.write("</td>\n");
      out.write("                <td align=\"center\">");
      out.print(rs.getString("rut"));
      out.write("</td>\n");
      out.write("                <td align=\"center\">");
      out.print(rs.getInt("edad"));
      out.write("</td>\n");
      out.write("                <td align=\"center\">\n");
      out.write("                    ");
if(rs.getString("sexo").equals("M")){
      out.write("\n");
      out.write("                    <img src=\"../imagenes/masculino.gif\">\n");
      out.write("                    ");
 } else{
      out.write("\n");
      out.write("                    <img src=\"../imagenes/femenino.gif\">\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td align=\"center\">");
      out.print(rs.getString("ciudad"));
      out.write("</td>\n");
      out.write("                <td align=\"center\"> <a href=\"FormularioModificarMedico.jsp?id=");
      out.print(rs.getString("id"));
      out.write("\">\n");
      out.write("                                        <img src=\"../imagenes/editar.gif\">\n");
      out.write("                                    </a>\n");
      out.write("                                    &nbsp;\n");
      out.write("                                    <a href=\"EliminarDoctor.jsp?id=");
      out.print(rs.getString("id"));
      out.write("\">\n");
      out.write("                                        <img src=\"../imagenes/borrar.png\">\n");
      out.write("                                    </a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("           \n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("            <table border=\"1\" align=\"center\" >\n");
      out.write("                 <tr> \n");
      out.write("                     <td>\n");
      out.write("                        <a  href=\"FormularioIngresoMedico.jsp\"  >\n");
      out.write("                            <img align src=\"../imagenes/nuevo.png\" >\n");
      out.write("                            </td>   </a>\n");
      out.write("                </tr>\n");
      out.write("            </table> \n");
      out.write("            <h1 style=\"background:chocolate\" align=\"center\">Lista de Medicos</h1>\n");
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
