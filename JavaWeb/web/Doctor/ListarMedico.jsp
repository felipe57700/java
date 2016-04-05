<%@page import="java.sql.* "%>

<%
    ResultSet rs=null;
try{
    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/inacap","inacap","inacap");
    Statement st=conn.createStatement();
    String sql="select *from inacap.medico";
    rs=st.executeQuery(sql);

}

catch(SQLException e){
    out.print("Excepcion de SQL"+e);

}
        

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Medicos</title>
    </head>
    <body style="background-color: buttonface ">
        <h1 style="background:coral" align="center">Lista de Medicos</h1>
        <table border="1" align="center">
            <tr>
                <td align="center"><b>ID</b></td>
                <td align="center"><b>NOMBRE</b></td>
                <td align="center"><b>APELLIDO</b></td>
                <td align="center"><b>RUT</b></td>
                <td align="center"><b>EDAD</b></td>
                <td align="center"><b>SEXO</b></td>
                <td align="center"><b>CIUDAD</b></td>
                <td align="center"><b>OPERACIONES</b></td>
            </tr>
            
            <%while(rs.next()) {%>
            
            <tr>
                <td align="center"><%=rs.getString("id")%> </td>
                <td align="center"><%=rs.getString("nombre")%></td>
                <td align="center"><%=rs.getString("apellido")%></td>
                <td align="center"><%=rs.getString("rut")%></td>
                <td align="center"><%=rs.getInt("edad")%></td>
                <td align="center">
                    <%if(rs.getString("sexo").equals("M")){%>
                    <img src="../imagenes/masculino.gif">
                    <% } else{%>
                    <img src="../imagenes/femenino.gif">
                    <% } %>
                </td>
                <td align="center"><%=rs.getString("ciudad")%></td>
                <td align="center"> <a href="FormularioModificarMedico.jsp?id=<%=rs.getString("id")%>">
                                        <img src="../imagenes/editar.gif">
                                    </a>
                                    &nbsp;
                                    <a href="EliminarDoctor.jsp?id=<%=rs.getString("id")%>">
                                        <img src="../imagenes/borrar.png">
                                    </a>
                </td>
            </tr>
            <% } %>
           
        </table>
        
            <table border="1" align="center" >
                 <tr> 
                     <td>
                        <a  href="FormularioIngresoMedico.jsp"  >
                            <img align src="../imagenes/nuevo.png" >
                            </td>   </a>
                </tr>
            </table> 
            <h1 style="background:chocolate" align="center">Lista de Medicos</h1>
    </body>
</html>
