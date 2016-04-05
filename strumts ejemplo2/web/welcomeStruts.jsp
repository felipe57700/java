<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <html:base/>
    </head>
    <body style="background-color: white">
        <h2> Formulario de ingreso de Usuario</h2>
        <html:form method="post" action="/loginUsuario">
            Nombre de usuario:
            <html:text property="nombreusuario"/>
            <html:errors property="errornombre"/>
            <br/>
            Clave de usuario:
            <html:password property="claveusuario"/>
            <html:errors property="errorclave" />
            <br/>
            <html:submit/>
        </html:form>
        
    </body>
</html:html>
