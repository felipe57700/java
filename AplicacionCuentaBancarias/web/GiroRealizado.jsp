<%@page import="cl.inacap.modelo.CuentaBancaria"%>

<% 
long saldoActual = CuentaBancaria.verSaldo(1);

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Giro realizado</h1> <br/>
        <h1>Saldo actual: <%=saldoActual%></h1>
    </body>
</html>
