<%@page import="javax.servlet.http.*,cl.inacap.taller2.conexion.*,java.sql.*" %>
<%
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
%>


