<%@page import="javax.servlet.http.*" %>
<%
    // 1.- Inicializar la sesión de usuario del usuario actual.
    HttpSession hs = request.getSession();
    
    // 2.- Recuperar los datos de ingreso de usuario,
    //     para validarlos contra una BD de usuarios ya registrados.
    String usuario = request.getParameter("nombreusuario");
    String clave   = request.getParameter("claveusuario");
    
    if( usuario.equals("admin1") && clave.equals("123456") )
    {
        // El usuario puede entrar al sitio.
        hs.setAttribute("nombreUsuario", "admin1");
        hs.setAttribute("rol", "administrador");
        
        // Redirige al usuario hacia su página de inicio.
        response.sendRedirect("inicioAdmin.jsp");
    }
    else
    {
        // Error: el usuario o clave es inválido(a).
        out.println("El nombre de usuario o la clave es erróneo(a)...");
        return;
    }   
%>


