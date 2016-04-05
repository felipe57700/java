<%@page import="java.sql.* " %> 
<%@page import="modelo.Avion; "%>

<%
    
    String id= request.getParameter("id");
    ResultSet rs=null;
    rs=Avion.Cargar(id);
    
    if(rs==null){
        out.println("Error al cargar para modificar");
        return;
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Avion</title>
    </head>
    <body>
        <h1>Modificar Avion</h1>
        <form method="post" action="../modificarAvion.do">
        <table>
            <input type="hidden" name="id" value="<%=id%>"
                
                <%rs.next(); %>
                <tr>
                    <td> Modelo: <input type="text" name="modeloavion" size="20" value="<%=rs.getString("modelo") %> " required />   </td>
                </tr>
                
                <tr>
                    <td> Maximo Pasajeros: <input type="number" size="20" name="maximopasajeros" value="<%=rs.getLong("maximopasajeros") %>" /> </td>
                </tr>           
            </table>
            
            <input type="submit" value="Guardar cambios" />
            
       </form>     
        
    </body>
</html>
