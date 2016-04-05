<%@page import="java.sql.*" %>
<%
    ResultSet rsPiloto, rsCopiloto, rsAvion;
    try
    {
        Connection conn = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/BDAppS3", "inacap", "inacap");
        
        Statement st1 = conn.createStatement();
        Statement st2 = conn.createStatement();
        Statement st3 = conn.createStatement();
        
        rsPiloto = st1.executeQuery("select * from inacap.piloto");
        rsCopiloto = st2.executeQuery("select * from inacap.piloto");
        rsAvion = st3.executeQuery("select * from inacap.avion,aerolinea where " +
                                   "inacap.avion.idaerolinea = inacap.aerolinea.id");      
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
        <title>Asociación de Pilotos a Aerolínea</title>
    </head>
    <body>
        <h1>Asociación de Pilotos a Aerolínea</h1>
        
        <form method="post" action="AsociarPilotos.do">
            Piloto:
            <select name="idpiloto" size="5">
                <% while(rsPiloto.next()) { %>
                    <option value="<%= rsPiloto.getLong("id") %>">
                            <%= rsPiloto.getString("apellido") %>, <%= rsPiloto.getString("nombre") %>
                    </option>
                <% } %>
            </select>
            <br />
            Copiloto:
            <select name="idcopiloto" size="5">
                <% while(rsCopiloto.next()) { %>
                    <option value="<%= rsCopiloto.getLong("id") %>">
                            <%= rsCopiloto.getString("apellido") %>, <%= rsCopiloto.getString("nombre") %>
                    </option>
                <% } %> 
            </select>
            <br />
            Aerolínea:
            <select name="idavion" size="5">
                <% while(rsAvion.next()) { %>
                    <option value="<%= rsAvion.getLong("id") %>">
                            <%= rsAvion.getString("modelo") %> (<%= rsAvion.getString("nombre") %>)
                    </option> 
                <% } %>
            </select>
            <br />
            <input type="submit" />
        </form>
    </body>
</html>
