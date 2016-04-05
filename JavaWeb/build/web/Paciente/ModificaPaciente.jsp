<%@page import="java.sql.*" %>
<%
 /* Recibir los datos del formulario de ingreso de pacientes,
    se deben usar los nombres de los formularios, ojo solo devuelve String
    */
  String nombre= request.getParameter("nombre");
  String apellido= request.getParameter("apellido");
  String rut= request.getParameter("rut");
  byte edad= Byte.parseByte (request.getParameter("edad"));
  String sexo=request.getParameter("sexo");
  String ciudad=request.getParameter("ciudad");
  String id=request.getParameter("id");
  
  //conexion a la base de datos
  
  try{
      //crea la conexion a la base de datos
  Connection conn= DriverManager.getConnection("jdbc:derby://localhost:1527/inacap","inacap","inacap"); 
  
   //crea un objeto de base de datos
  Statement st = conn.createStatement();
  
  //ingresa Sql
  String sql=" update inacap.paciente " + 
          "set nombre= '"+ nombre +"',"+
          "apellido= '"+ apellido +"',"+
          "rut= '"+ rut +"',"+
          "edad="+ edad +"," +
          "sexo='"+ sexo +"', "+
          "ciudad='"+ ciudad +"' where id=" + id;
           
          
          
          out.println(sql+" <br/> <br/>");
          
          st.execute(sql);
          out.println("Datos ingresados correctamente");
          response.sendRedirect("ListadoDePacientes.jsp");
   
   
  }
  
  catch(SQLException e){
  
    out.println("Error  de sql"+e);
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
