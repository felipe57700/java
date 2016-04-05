<%
    // 1.- Invalidar y cerrar la sesión actual de usuario.
    request.getSession().invalidate();    
    // 2.- Redireccionar al usuario a la página de ingreso.
    response.sendRedirect("index.html");
%>