<%-- 
    Document   : AgregarAerolinea
    Created on : 24-11-2014, 14:45:01
    Author     : FELIPE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Aerolinea</title>
    </head>
    <body>
        <h1>Agregar Aerolinea</h1>
        <form action="../Ingresar.do" method="post">
            <table border="2">
                <tr> 
                    
                    <td> Nombre Aerolinea:<input type="text"  name="nombreaerolinea" size="20" > </td>
                 </tr>  
                 
                  <tr>  
                      <td>  Pais de origen:<input type="text"  name="paisorigen" size="20" ></td>
                   
                </tr>
                <tr>  
                    <td></td>
                    <td><input type="submit" value="Guardar" /></td>

                   
                </tr>
              
            </table>
                    
        </form>
        
    </body>
</html>
