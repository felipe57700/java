<%@page import="java.sql.*"%>

<%
    /* traer resultados un ResulSet es similar  a una hoja de Excel, trae todas
    las filas, necesitamos un cursos que vaya pasando para sacar esta informacion
    */
    
   ResultSet rsCiudad=null;
   try{
       Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/inacap","inacap","inacap");
       Statement st=conn.createStatement();
       //este devuelve datos
       String sql = "select *from inacap.ciudad order by nombre";
       
       //Como vamos a buscar los datos los debe mostrar en pantalla debemos ocupar
       rsCiudad=st.executeQuery(sql);
   
   
   } 
   
   catch (SQLException e){
   out.println("Excepcion de SQL"+e);
   
   }
    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FORMULARIO INGRESO DE PACIENTE</title>
    </head>
    <body>
        <h1>Ingreso de nuevo paciente.</h1>
        
        <form action="IngresoNuevoPaciente.jsp">
            </br> Nombre Paciente: <input type="text" name="nombre" />
            </br> Apellido Paciente: <input type="text" name="apellido" />
            </br> Rut Paciente: <input type="text" name="rut" />
            </br> Edad Paciente: <input type="number" name="edad" />
            </br> Sexo Paciente: M <input type="radio" name="sexo" value="M" checked> &nbsp;
                                 F <input type="radio" name="sexo" value="F" > 
                                 
            </br> Ciudad Paciente: 
            <select name="ciudad">
                <% while(rsCiudad.next()){  %>
                    <option value="<%=rsCiudad.getString("nombre") %>" >
                    <%=rsCiudad.getString("nombre") %>
                    </option>
                <% } %>
                 </select>
                 </br>
                 </br>

                 <input type="reset" value="Limpiar formulario"> &nbsp;
                <input type="submit" value="Ingresar nuevo paciente">
                 
        </form>
        
                 <a href="ListadoDePacientes.jsp"> Listado de pacientes.</a>
    </body>
</html>
