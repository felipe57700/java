<%@page import="java.sql.*" %>
<%
String id=request.getParameter("id");
try{
    
    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/inacap","inacap","inacap");
    Statement st =conn.createStatement();
    String sql="delete from inacap.medico where id="+id;
    st.execute(sql);
    response.sendRedirect("ListarMedico.jsp");
    
}

catch(SQLException e){
    out.print("Excepcion sql"+e);
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
