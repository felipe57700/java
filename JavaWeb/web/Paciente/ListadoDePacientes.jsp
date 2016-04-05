<%@page import="java.sql.*" %>

<%  
//necesitamos traer resultados un ResultSet es como una hoja de excel
    
    ResultSet rs=null;
    
    try{
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/inacap","inacap","inacap");
        Statement st=conn.createStatement();
        String sql="select *from inacap.paciente";
        
        //como bamos a buscar los datos y los debe mostrar usuaremos st.executeQuery
        rs=st.executeQuery(sql);
    
    }

    catch(SQLException e){
        out.print("Error de SQL "+e);
    
    }


%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LISTADO DE PACIENTES</title>
    </head>
    <body>
        <h1>Listado de Pacientes</h1>
        
        <table border="1">
           <tr> 
            <td> ID </td>
            <td> NOMBRE </td>
            <td> APELLIDO </td>
            <td> RUT </td>
            <td> EDAD </td>
            <td> SEXO </td>
            <td> CIUDAD </td>
            <td> OPERACIONES </td>
           </tr>   
           
           <% while(rs.next()){ %>
           <tr> 
               <td allign="center"> <%=rs.getLong("id") %> </td>
               <td allign="center"> <%=rs.getString("Nombre")  %> </td>
               <td allign="center"> <%=rs.getString("Apellido") %> </td>
               <td allign="center"> <%=rs.getString("rut") %> </td>
               <td allign="center"> <%=rs.getInt("edad") %> </td>
               <td allign="center"> <% if(rs.getString("sexo").equals("M")){ %> 
                 
                <img src="../imagenes/masculino.gif"/>
                   <%} else{ %>
                 <img src="../imagenes/femenino.gif" />
                   <% } %>
               </td>
               
               <td allign="center"> <%=rs.getString("ciudad") %> </td>
               
               <td allign="center">  
                   
                   <a href="FormularioModificarPaciente.jsp?id=<%=rs.getLong("id") %>">
                   <img src="../imagenes/editar.gif" /> 
                   </a>
                     
                   <a href="EliminarPaciente.jsp?id=<%=rs.getLong("id") %>"> 
                     <img src="../imagenes/borrar.png" />  
                   </a>
               </td>
           </tr>    
         <% } %>   
            
        </table>
         <a href="FormularioNuevoPaciente.jsp">Ingresar nuevo paciente</a>
    </body>
</html>
