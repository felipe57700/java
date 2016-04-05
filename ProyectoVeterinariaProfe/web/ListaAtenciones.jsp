<%@page import="java.sql.*, cl.inacap.taller2.conexion.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ResultSet rs = null;
    
    try
    {
        Connection conn = ConexionBD.crearConexion();
        
        Statement st = conn.createStatement();
        String sql   = "select LISTAATENCIONES.ID,LISTAATENCIONES.FECHA, " +  
                       "MEDICO.NOMBRE as NOMBREMEDICO, MEDICO.APELLIDO, " +
                       "MASCOTA.NOMBRE as NOMBREMASCOTA, MASCOTA.RAZA " +
                       "from inacap.MEDICO, inacap.MASCOTA, " +
                       "inacap.LISTAATENCIONES where " +
                       "MASCOTA.ID = LISTAATENCIONES.IDMASCOTA and " +
                       "MEDICO.ID = LISTAATENCIONES.IDMEDICO";
        
        rs = st.executeQuery( sql );
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
        <title>Listado de Atenciones Veterinarias</title>
    </head>
    <body>
        <h1>Listado de Atenciones Veterinarias</h1>
        
        <table border="1" align="center" width="800">
            <tr bgcolor="#cccccc">
                <td align="center"><b>Id</b></td>
                <td align="center"><b>Nombre Médico</b></td>
                <td align="center"><b>Apellido Médico</b></td>
                <td align="center"><b>Nombre Mascota</b></td>
                <td align="center"><b>Raza Mascota</b></td>
                <td align="center"><b>Fecha Atención</b></td>
                <td align="center"><b>Operaciones</b></td>                
            </tr>
            
            <% while(rs.next()) {  %>
            <tr>
                <td align="center"><%= rs.getLong("id") %></td>
                <td align="center"><%= rs.getString("nombremedico") %></td>
                <td align="center"><%= rs.getString("apellido") %></td>
                <td align="center"><%= rs.getString("nombremascota") %></td>
                <td align="center"><%= rs.getString("raza") %></td>
                <td align="center"><%= rs.getTimestamp("fecha") %></td>
                <td align="center">
                    <a href="FormularioModificacionUsuario.jsp?id=<%= rs.getLong("id") %>">
                        <img src="../imagenes/modificar.png" />
                    </a>
                    &nbsp;
                    <a href="EliminarUsuario.jsp?id=<%= rs.getLong("id") %>"> 
                        <img src="../imagenes/eliminar.png" /> 
                    </a>
                </td>                
            </tr>
            <% } %>            
        </table>
    </body>
</html>
