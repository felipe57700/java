<%@page import="java.sql.*, cl.inacap.taller2.conexion.*, cl.inacap.taller2.datos.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ResultSet rs = null;    
    try
    {
        Connection conn = ConexionBD.crearConexion();        
        Statement st = conn.createStatement();
        String sql   = "select * from inacap.mascota";        
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
        <title>Ingreso de nueva mascota</title>
    </head>
    <body>
        <h1>Ingreso de nueva mascota</h1>
    
   
    <div style="position:fixed" >
        <form method="post" action="IngresoNuevaMascota.jsp">
            <table width="500" border="1" align="center" bgcolor="white">
            <tr>
                <td>Nombre:</td>
                <td><input type="text" name="nombremascota" size="50" maxlength="40" /></td>
            </tr> 
            <tr>
                <td>Raza:</td>
                <td>
                    <select name="razamascota">
                        <% for(String s: ListaRazas.arrRazas) { %>
                            <option value="<%= s%>"><%= s%></option>
                        <% } %>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Sexo:</td>
                <td>
                    M <input type="radio" name="sexomascota" value="M">
                  &nbsp; 
                  F <input type="radio" name="sexomascota" value="F">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Agregar datos de la mascota" />
                </td>
            </tr>
            </table>
    </div>
                    
            <h1>Listado de mascotas</h1>
            <table border="1" align="center" width="800">
            <tr bgcolor="#cccccc">
                <td align="center"><b>Id</b></td>
                <td align="center"><b>Nombre</b></td>
                <td align="center"><b>Raza</b></td>
                <td align="center"><b>Sexo</b></td>
                <td align="center"><b>Fecha</b></td>
                <td align="center"><b>Operaciones</b></td>                
            </tr>
            
            <% while(rs.next()) {  %>
            <tr>
                <td align="center"><%= rs.getLong("id") %></td>
                <td align="center"><%= rs.getString("nombre") %></td>
                <td align="center"><%= rs.getLong("idraza") %></td>
                <td align="center"><%= rs.getString("sexo") %></td>
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
        </form>
    </body>
</html>
