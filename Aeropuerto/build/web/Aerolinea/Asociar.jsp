<%@page import="java.sql.*" %>
<%
    ResultSet rsPiloto=null;
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        Piloto:
        <select name="idpiloto">
            <%while(rsPiloto.next() ) { %>
            <option value="<%=rsPiloto.getLong("id")%> ">
                <%=rsPiloto.getString("nombre")+" "+rsPiloto.getString("apellido") %>
                
            </option>
          <%}%>  
        </select>
        
    </body>
</html>
