<%@page import="cl.inacap.modelo.CuentaBancaria"%>

<% 
long saldoActual = CuentaBancaria.verSaldo(1);

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Giro de Dinero</title>
    </head>
    <body>
        <form action="ControladorGiro.do" method="post">
            ¿Cuanto dinero desea girar? saldo:<%=saldoActual%> <br/><br/>
            <input type="radio" name="montodinero" value="5000" /> $5.000
            </br>
            
            <input type="radio" name="montodinero" value="10000" /> $10.000
            </br>
         
            <input type="radio" name="montodinero" value="20000" /> $20.000
            </br>
            
            <input type="radio" name="montodinero" value="40000" /> $40.000
            </br>
            
            <input type="radio" name="montodinero" value="50000" /> $50.000
            </br>
            
            <input type="radio" name="montodinero" value="100000" /> $100.000
            </br>
            <input type="submit" value="Girar" >
            
        </form>
    </body>
</html>
