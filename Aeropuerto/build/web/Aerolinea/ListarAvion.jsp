<%@page import="java.sql.*" %>
<%@page import="modelo.Avion " %>

<%
    ResultSet rs=Avion.Listar();
    
    if(rs==null){
        out.println("Error al listar");
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
        <h1>Listar Aviones</h1>
        <table border="2">
            <tr>
                <td> ID </td>
                <td> ID Areloninea </td>
                <td> ID Piloto</td>
                <td> ID Copiloto</td>
                <td> Modelo</td>
                <td>Maximo Pasajeros</td>
                <td>Opciones</td>
            </tr>
            
        <%while(rs.next()){%>
            <tr>
                <td> <%=rs.getLong("id") %> </td>
                <td> <%=rs.getLong("idaerolinea")%> </td>
                <td> <%=rs.getLong("idpiloto")%> </td>
                <td> <%=rs.getLong("idcopiloto") %></td>
                <td> <%=rs.getString("modelo") %></td>
                <td><%=rs.getInt("maximopasajeros") %></td>
                <td>
                    <a href="../eliminarAvion.do?id=<%=rs.getLong("id")%> ">
                        <img src="../fotos/eliminar.gif" >
                    </a>
                    
                    <a href="ModificarAvion.jsp?id=<%=rs.getLong("id")%>" >
                        <img src="../fotos/modificar1.gif" >  
                    </a>
                </td>
            </tr>
        <%}%>
        </table>
    </body>
</html>
