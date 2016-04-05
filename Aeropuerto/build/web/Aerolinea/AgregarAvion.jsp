<%-- 
    Document   : AgregarAvion
    Created on : 25-11-2014, 17:40:18
    Author     : FELIPE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Avion</title>
    </head>
    <body>
        <h1>Agregar avion</h1>
        <form method="post" action="../IngresoAvion.do" >
            <table>
                <tr>
                    <td> Modelo: <input type="text" name="modeloavion" size="20"/>   </td>
                </tr>
                
                <tr>
                    <td> Maximo Pasajeros: <input type="number" size="20" name="maximopasajeros"/> </td>
                </tr>           
            </table>
            
            <input type="submit" value="Guardar"/>
        </form>        
    </body>
</html>
