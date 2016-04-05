<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.*" %>
<%
    // 1.- Recuperar la sesión del usuario que está ingresando.
    HttpSession hs = request.getSession();

    // 2.- Validar que el rol del usuario entrante sea "administrador";
    //     sino, impedirle el acceso a esta página.
    if( hs.getAttribute("rol") == null ||
        hs.getAttribute("rol").equals("administrador") == false )
    {
        out.println("Ud. no tiene acceso a esta página!!");
        return;
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página inicial de Administración</title>
    </head>
    <body>
        <h1>Bienvenido, usuario administrador</h1>
        <%@include file="bannerInfoUsuario.jsp" %>
        <br />
        <a href="cerrarSesion.jsp">Cerrar Sesión</a>
        
    </body>
</html>













