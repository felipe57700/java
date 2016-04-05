
<%@page import="modelo.*" %>
<%@page import="java.sql.* "%>

<%
    ResultSet rs=null;
    rs=Aerolinea.Listar();

        if(rs==null){
          out.println("Error al mostrar la lista");
          return;
        }
        
        
 %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Areolinea</title>
    </head>
    <body>
        <h1>Lista Aerolinea</h1>
        <table border="1">
            <tr>
                <td>ID:</td>
                <td>Nombre:</td>
                <td>Pais de origen:</td>
                 <td>Opciones:</td>
            </tr>
            
            <% while(rs.next()){ %>
             <tr>
                 <td><%=rs.getLong("id") %></td>
                 <td><%=rs.getString("nombre") %></td>
                 <td><%=rs.getString("paisorigen") %></td>
                 <td> <a href="../elimimar.do?id=<%=rs.getLong("id")%>">  
                         <img src="../fotos/eliminar.gif" >
                      </a>  
                         
                     <a  href="ModificarAerolinea.jsp?id=<%=rs.getLong("id")%>" >
                         <img src="../fotos/modificar1.gif" >
                     </a>   
                         
                         
                    </td>      
            </tr>
            
            <% } %>
        </table>
    </body>
</html>
