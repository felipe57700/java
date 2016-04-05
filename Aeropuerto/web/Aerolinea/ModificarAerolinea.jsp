<%@page import="modelo.Aerolinea " %> 
<%@page import="java.sql.*" %>
<%
  
    String id=request.getParameter("id");
            
    ResultSet rs=Aerolinea.Cargar(id);;
    
    
    if(rs==null){
        out.println("Error vacio");
        return;
    } 
   
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
        <title>Modificar Aerolinea</title>
    </head>
    <body>
        <h1>Modificar Aerolinea</h1>
        <form action="../modificar.do" method="post">
            <table border="2">
                <tr> 
                    <%rs.next(); // Permite avanzar a los datos del 1er paciente. %>
                <input type="hidden" value="<%=id%>" name="id" >
                
                    <td> Nombre Aerolinea:<input type="text"  name="nombreaerolinea" size="20" value="<%=rs.getString("nombre") %>" > </td>
                 </tr>  
                 
                  <tr>  
                      <td>  Pais de origen:<input type="text"  name="paisorigen" size="20" value="<%=rs.getString("paisorigen") %>"></td>
                   
                </tr>
                <tr>  
                    <td></td>
                    <td><input type="submit" value="Modificar" /></td>

                   
                </tr>
              
            </table>
                    
        </form>
        
    </body>
</html>
