<%@page import="java.sql.* "%>

<%
    ResultSet rs=null;
try{
    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/inacap","inacap","inacap");
    Statement st=conn.createStatement();
    String sql="select *from inacap.ciudad order by nombre asc";
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
        <title>Ingreso de nuevos medicos.</title>
    </head>
    <body>
        <h1>Ingreso de nuevos medicos.</h1>
        
        <form action="IngresarMedico.jsp">
            <br/>
            Nombre : <input type="text" name="nombremedico"> <br/>
            Apellido : <input type="text" name="apellidomedico"> <br/>
            Rut: <input type="text" name="rutmedico"> <br/>
            Edad: <input type="number" name="edadmedico"> <br/>
            Sexo: 
            M <input type="radio" name="sexomedico" value="M" checked> &nbsp;
            F <input type="radio" name="sexomedico" value="F"> </br>
            
            Ciudad: 
            <select name="ciudadmedico">
                <%while(rs.next()) { %>
                <option value="<%=rs.getString("nombre")%>"> <%=rs.getString("nombre")%></option>
                <% } %>
            </select>
            <br/>
            <input type="reset" value="Limpiar"> &nbsp;
            <input type="submit" value="Ingresar medico">
            
            
        </form>
        
        
        
    </body>
</html>
