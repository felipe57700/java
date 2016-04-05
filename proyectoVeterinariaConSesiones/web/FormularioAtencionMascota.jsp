<%@page import="cl.inacap.taller2.conexion.*, java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ResultSet rsMascotas = null, rsMedicos = null;
    
    try
    {
        Connection conn = ConexionBD.crearConexion();
        
        Statement stMascotas = conn.createStatement();
        Statement stMedicos  = conn.createStatement();
        
        rsMascotas = stMascotas.executeQuery( "select * from inacap.Mascota" );
        rsMedicos  = stMedicos.executeQuery( "select * from inacap.Medico" );        
    }
    catch(SQLException e)
    {
        out.println("Excepción de SQL: " + e);
        return;
    }   
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso de nueva atención médica</title>
    </head>
    <body>
        <h1>Ingreso de nueva atención médica</h1>
        
        <form method="get" action="IngresoNuevaAtencion.jsp">
            
            Nombre Mascota: 
            <select name="idmascota">
                <% while( rsMascotas.next() ) { %>
                    <option value="<%= rsMascotas.getLong("id") %>"> 
                        <%= rsMascotas.getString("nombre") %>  
                    </option>
                <% } %>
            </select>
            
            <br />
                       
            Nombre Médico: 
            <select name="idmedico">
                <% while( rsMedicos.next() ) { %>
                    <option value="<%= rsMedicos.getLong("id") %>"> 
                        <%= rsMedicos.getString("nombre") + " " +
                            rsMedicos.getString("apellido") %>  
                    </option>
                <% } %>
            </select>
                        
            <br />            
            <input type="submit" value="Agregar datos de la mascota" /> 
        </form>
    </body>
</html>
