<%@page import="java.sql.* "%>

<% 
String id=request.getParameter("id");
ResultSet rs=null;

try{
Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/inacap","inacap","inacap");
Statement st=conn.createStatement();
String sql="select *from inacap.paciente where id="+ id;

//como debe mostrar los resultados vamos a utlizar:
    rs=st.executeQuery(sql);

//mover el indice de lectura del ResultSet a la primera fila <--> al usuario a modificarce
rs.next();

}

catch(SQLException e){
out.print("Error SQL"+e);
}
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Paciente </title>
    </head>
    <body>
        <h1>Modificar Paciente</h1>
        
           <form action="ModificaPaciente.jsp">
               <input type="hidden" name="id" value="<%=rs.getString("id")%>" 
                      </br>
                Nombre Paciente: <input type="text" name="nombre" value="<%= rs.getString("nombre") %>" />
             </br> Apellido Paciente: <input type="text" name="apellido" value="<%=rs.getString("apellido") %>" />
               </br> Rut Paciente: <input type="text" name="rut" value="<%=rs.getString("rut") %>" />
               </br> Edad Paciente: <input type="number" name="edad" value="<%=rs.getByte("edad") %>" />
              
                 </br> Sexo Paciente: M <input type="radio" name="sexo" value="M" <%if(rs.getString("sexo").equals("M")){ %> checked <% }%> > &nbsp;
               
               
                                 F <input type="radio" name="sexo" value="F" <%if(rs.getString("sexo").equals("F")){ %> checked <% }%> > 
                                 
            </br> Ciudad Paciente: 
            <select name="ciudad"> 
                <option value="<%=rs.getString("ciudad")%>">
                <%=rs.getString("ciudad")%>
                </option> 
                 </select> 
                 </br>
                 </br>

                 <input type="reset" value="Limpiar formulario"> &nbsp;
                <input type="submit" value="Modificar paciente">
                 
        </form>
        
    </body>
</html>
