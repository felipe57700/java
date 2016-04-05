<%@page import="java.sql.* "%>

<%
    String id=request.getParameter("id");
    ResultSet rs=null;
    
try{
    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/inacap","inacap","inacap");
    Statement st=conn.createStatement();
    Statement sp=conn.createStatement();
    String sql="select *from inacap.medico where id="+id;
    String sql2="select *from inacap.ciudad";
    rs=st.executeQuery(sql);
   
    rs.next();

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
        
        <form action="ModificarMedico.jsp">
            <br/>
            <input type="hidden" name="id" value="<%=id%>">
            Nombre : <input type="text" name="nombremedico" value="<%=rs.getString("nombre")%>"> <br/>
            Apellido : <input type="text" name="apellidomedico" value="<%=rs.getString("apellido")%>"> <br/>
            Rut: <input type="text" name="rutmedico" value="<%=rs.getString("rut")%>"> <br/>
            Edad: <input type="number" name="edadmedico" value="<%=rs.getInt("edad")%>"> <br/>
            Sexo: 
            M <input type="radio" name="sexomedico" value="M" <%if(rs.getString("sexo").equals("M")){ %> 
                     checked <%}%>> &nbsp;
            F <input type="radio" name="sexomedico" value="F" <%if(rs.getString("sexo").equals("F")){ %>
                     checked <%}%> > &nbsp; </br>
            
            Ciudad: 
            <select name="ciudadmedico">
                
                <option value="<%=rs.getString("ciudad")%>"> <%=rs.getString("ciudad")%> </option>
                
               
            </select>
            <br/>
            <input type="reset" value="Limpiar"> &nbsp;
            <input type="submit" value="Modificar medico">
            
            
        </form>
        
        
        
    </body>
</html>
