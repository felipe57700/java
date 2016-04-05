<%@page import="cl.inacap.modelo.*, java.util.ArrayList" %>
<%
    ArrayList<Aerolinea> lista = Aerolinea.listarAerolineas();
    
    if(lista == null)
    {
        out.println("Error al mostrar la lista...");
        return;
    }   
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Aerolíneas</title>
    </head>
    <body>
        <h1>Listado de Aerolíneas</h1>

        <table border="1" width="800"  align="center">
            <tr style="background-color: lightslategray">
               <td align="center">Id</td>
               <td align="center">Nombre</td>
               <td align="center">País</td>
               <td align="center">Operaciones</td>
           </tr>
           
           <% for(Aerolinea a: lista) { %> 
           <tr>
               <td align="center"><%= a.getId() %></td>
               <td align="center"><%= a.getNombre() %></td>
               <td align="center"><%= a.getPais() %></td>
               <td align="center">              
                   <a href="EliminarAerolinea.do?id=<%= a.getId() %>">
                       <img src="iconos/eliminar.png" />
                   </a> 
               </td>
           </tr>
           
           <% } %>
        </table>
    </body>
</html>
