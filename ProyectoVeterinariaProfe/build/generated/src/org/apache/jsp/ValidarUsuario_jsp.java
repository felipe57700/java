package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import cl.inacap.taller2.conexion.*;
import java.sql.*;

public final class ValidarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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

    // 1.- Inicializar la sesión de usuario del usuario actual.
    HttpSession hs = request.getSession();
    
    // 2.- Recuperar los datos de ingreso de usuario,
    //     para validarlos contra una BD de usuarios ya registrados.
    String usuario = request.getParameter("nombreusuario");
    String clave   = request.getParameter("claveusuario");
    
    // 3.- Validar si el usuario existe dentro de la tabla Usuario de la BD.
    ResultSet rsUsuario = null;
    
    try
    {
        Connection conn = ConexionBD.crearConexion();
        String sql      = " select * from inacap.Usuariov where " +
                          " nombre=? and clave=?";        
        PreparedStatement pst = conn.prepareStatement( sql );
        pst.setString(1, usuario);
        pst.setString(2, clave);        
        rsUsuario       = pst.executeQuery();
    }
    catch(SQLException e){}
    
    if( rsUsuario.next() == true )
    {
        // El usuario puede entrar al sitio.
        hs.setAttribute("nombreUsuario", rsUsuario.getString("nombre") );
        
        switch( rsUsuario.getInt("rol") )
        {
            case 1:    hs.setAttribute("rol", "administrador");
                       response.sendRedirect("inicioAdmin.jsp");
                       break;
            case 2:    hs.setAttribute("rol", "editor");
                       response.sendRedirect("inicioEditor.jsp");
                       break;
            case 3:    hs.setAttribute("rol", "usuario");
                       response.sendRedirect("inicioUsuario.jsp");
                       break;
            case 4:    hs.setAttribute("rol", "medico");
                       response.sendRedirect("inicioMedico.jsp");
                       break;                
        }
        
        // Redirige al usuario hacia su página de inicio.

    }
    else
    {
        // Error: el usuario o clave es inválido(a).
        out.println("El nombre de usuario o la clave es erróneo(a)...");
        return;
    }   

      out.write("\n");
      out.write("\n");
      out.write("\n");
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
