<%-- 
    Document   : LoginUsuario
    Created on : 04-11-2014, 11:36:25 AM
    Author     : FELIPE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ingreso de Usuario</h1>
        <form action="ValidarUsuario.do" method="post">
            
            Rut Usuario:
            <input type="text" name="rutusuario" size="20" />
            <br/>
            Clave Usuario:
            <input type="password" name="claveusuario" size="20" />
            
            <input type="submit" value="ingresar al sistema" >
            
        </form>
        
        
        
    </body>
</html>
