<%@page import="cl.inacap.modelo.*, java.util.ArrayList, java.sql.*" %>
<%
    ResultSet rs;
    try
    {
        Connection conn = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/BDAppS3", "inacap", "inacap");        
        Statement st = conn.createStatement();
        rs = st.executeQuery("select * from inacap.avion");      
    }
    catch(SQLException e)
    {
        System.err.println("Excepción de SQL: " + e);
        return;
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Aviones</title>
    </head>
    <body>
        <h1>Listado de Aviones</h1>

        <table border="1" width="800"  align="center">
            <tr style="background-color: lightslategray">
               <td align="center">Id</td>
               <td align="center">Piloto</td>
               <td align="center">Copiloto</td>
               <td align="center">Modelo</td>
               <td align="center">Máximo Pasajeros</td>
               <td align="center">Operaciones</td>
           </tr>
           
           <% while( rs.next() ) { %> 
           <tr>
               <td align="center"><%= rs.getString("id") %></td>
               <td align="center"><%= rs.getString("idpiloto") %></td>
               <td align="center"><%= rs.getString("idcopiloto") %></td>
               <td align="center"><%= rs.getString("modelo") %></td>
               <td align="center"><%= rs.getString("maximopasajeros") %></td>
               <td align="center">              
                   <a href="EliminarAvion.do?id=<%= rs.getString("id") %>">
                       <img src="iconos/eliminar.png" />
                   </a> 
               </td>
           </tr>
           
           <% } %>
        </table>
    </body>
</html>
