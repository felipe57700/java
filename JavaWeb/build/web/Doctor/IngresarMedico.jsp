<%@page import="java.sql.*"%>

<%
    String nombre=request.getParameter("nombremedico");
    String apellido=request.getParameter("apellidomedico");
    String rut=request.getParameter("rutmedico");
    String sexo=request.getParameter("sexomedico");
    int edad=Integer.parseInt(request.getParameter("edadmedico"));
    String ciudad=request.getParameter("ciudadmedico");
    
    try{
    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/inacap","inacap","inacap");
    Statement st=conn.createStatement();
    String sql="insert into inacap.medico (nombre,apellido,rut,edad,sexo,ciudad)"+
    "values('"+ nombre +"','"+ apellido +"','"+ rut +"',"+ edad +",'"+ sexo +"','"+ ciudad +"')";
    st.execute(sql);
    out.print("ingresado correctamente");
    response.sendRedirect("ListarMedico.jsp");
    }
    
    catch(SQLException e){
    out.print("Error de SQL"+e);
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <h1></h1>
    </body>
</html>
