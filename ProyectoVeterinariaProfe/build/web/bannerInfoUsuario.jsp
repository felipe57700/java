<%@page import="javax.servlet.http.* "%>
<% //por si hay otra variable de este nombre
    HttpSession hs1= request.getSession();
%>

<div style="position:fixed; top:10px; left:70%; width:300px;
        background-color:yellow; border: black solid 2px;
        border-radius:10px">
        <b>Nombre de usuario:</b> <%=hs1.getAttribute("nombreUsuario")%>
        <br/>
        <b>Rol:</b> <%=hs1.getAttribute("rol") %>
        <br/>
        <a href="cerrarSesion.jsp"> Cerrar Sesión </a>
</div>        
     