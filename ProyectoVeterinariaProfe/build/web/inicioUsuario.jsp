<%@page import="javax.servlet.http.*" %>
<%
    // 1.- Recuperar la sesión del usuario que está ingresando.
    HttpSession hs = request.getSession();

    // 2.- Validar que el rol del usuario entrante sea "administrador";
    //     sino, impedirle el acceso a esta página.
    
    //si rol es igual a null impedir el ingreso o si rol es distinto de editor y distinto de administrador impedir el acceso.
    if( hs.getAttribute("rol") == null ||
        (hs.getAttribute("rol").equals("usuario") == false) & (hs.getAttribute("rol").equals("administrador") == false) )
    {
        out.println("Ud. no tiene acceso a esta página!!");
        return;
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido Usuario</title>
    </head>
    <body>
        <h1>Bienvenido Usuario</h1>
        <%@include file="bannerInfoUsuario.jsp" %>
    </body>
</html>
