<%
    // 1.- Invalidar y cerrar la sesi�n actual de usuario.
    request.getSession().invalidate();    
    // 2.- Redireccionar al usuario a la p�gina de ingreso.
    response.sendRedirect("index.html");
%>