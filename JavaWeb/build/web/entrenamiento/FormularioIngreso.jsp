<%@page import="java.sql.* " %>

<%
ResultSet rs=null;
try{
Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/inacap","inacap","inacap");
Statement st=conn.createStatement();
String sql="select *from inacap.ciudad order by nombre asc";
rs=st.executeQuery(sql);
}

catch (SQLException e){
    out.print("Excepcion SQL:"+e);
}

%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de ingreso</title>
    </head>
    <body>
        <h1>Formulario de ingreso</h1>
        <form action="">
            Nombre: <input type="text" name="nombreentra"> <br/>
            Fecha: <input type="text" name="apellido"> <br/>
            Sexo: M <input type="radio" name="sexo" value="M">
            F<input type="radio" name="sexo" value="F">
            
            Ciudad:
            <select>
                <% while(rs.next()){%>
                <option value="<%=rs.getString("nombre")%>"><%=rs.getString("nombre")%></option>
                <%}%>
            </select>
            <br/>
            <input type="submit" value="Ingresar"> &nbsp;
            <input type="reset" value="limpiar">
            
            
        </form>
    </body>
</html>
