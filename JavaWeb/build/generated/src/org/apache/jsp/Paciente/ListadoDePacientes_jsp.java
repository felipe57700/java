package org.apache.jsp.Paciente;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ListadoDePacientes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  
//necesitamos traer resultados un ResultSet es como una hoja de excel
    
    ResultSet rs=null;
    
    try{
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/inacap","inacap","inacap");
        Statement st=conn.createStatement();
        String sql="select *from inacap.paciente";
        
        //como bamos a buscar los datos y los debe mostrar usuaremos st.executeQuery
        rs=st.executeQuery(sql);
    
    }

    catch(SQLException e){
        out.print("Error de SQL "+e);
    
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
      out.write("        <title>LISTADO DE PACIENTES</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Listado de Pacientes</h1>\n");
      out.write("        \n");
      out.write("        <table border=\"1\">\n");
      out.write("           <tr> \n");
      out.write("            <td> ID </td>\n");
      out.write("            <td> NOMBRE </td>\n");
      out.write("            <td> APELLIDO </td>\n");
      out.write("            <td> RUT </td>\n");
      out.write("            <td> EDAD </td>\n");
      out.write("            <td> SEXO </td>\n");
      out.write("            <td> CIUDAD </td>\n");
      out.write("            <td> OPERACIONES </td>\n");
      out.write("           </tr>   \n");
      out.write("           \n");
      out.write("           ");
 while(rs.next()){ 
      out.write("\n");
      out.write("           <tr> \n");
      out.write("               <td allign=\"center\"> ");
      out.print(rs.getLong("id") );
      out.write(" </td>\n");
      out.write("               <td allign=\"center\"> ");
      out.print(rs.getString("Nombre")  );
      out.write(" </td>\n");
      out.write("               <td allign=\"center\"> ");
      out.print(rs.getString("Apellido") );
      out.write(" </td>\n");
      out.write("               <td allign=\"center\"> ");
      out.print(rs.getString("rut") );
      out.write(" </td>\n");
      out.write("               <td allign=\"center\"> ");
      out.print(rs.getInt("edad") );
      out.write(" </td>\n");
      out.write("               <td allign=\"center\"> ");
 if(rs.getString("sexo").equals("M")){ 
      out.write(" \n");
      out.write("                 \n");
      out.write("                <img src=\"../imagenes/masculino.gif\"/>\n");
      out.write("                   ");
} else{ 
      out.write("\n");
      out.write("                 <img src=\"../imagenes/femenino.gif\" />\n");
      out.write("                   ");
 } 
      out.write("\n");
      out.write("               </td>\n");
      out.write("               \n");
      out.write("               <td allign=\"center\"> ");
      out.print(rs.getString("ciudad") );
      out.write(" </td>\n");
      out.write("               \n");
      out.write("               <td allign=\"center\">  \n");
      out.write("                   \n");
      out.write("                   <a href=\"FormularioModificarPaciente.jsp?id=");
      out.print(rs.getLong("id") );
      out.write("\">\n");
      out.write("                   <img src=\"../imagenes/editar.gif\" /> \n");
      out.write("                   </a>\n");
      out.write("                     \n");
      out.write("                   <a href=\"EliminarPaciente.jsp?id=");
      out.print(rs.getLong("id") );
      out.write("\"> \n");
      out.write("                     <img src=\"../imagenes/borrar.png\" />  \n");
      out.write("                   </a>\n");
      out.write("               </td>\n");
      out.write("           </tr>    \n");
      out.write("         ");
 } 
      out.write("   \n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("         <a href=\"FormularioNuevoPaciente.jsp\">Ingresar nuevo paciente</a>\n");
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
