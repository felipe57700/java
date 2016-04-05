<%@page import="java.sql.*,cl.inacap.taller2.conexion.ConexionBD" %>

<%
    // 1.- Recuperar datos del formulario.
    String nombre = request.getParameter("nombremascota");
    String raza   = request.getParameter("razamascota");
    char   sexo   = request.getParameter("sexomascota").charAt(0);
    String enfermedad = request.getParameter("enfermedadmascota");
    String tratamiento= request.getParameter("tratamientomascota");
    
    // 2.- Insertar los datos de la mascota en la BD.
    try
    {
        Connection conn = ConexionBD.crearConexion();
        String sql = "insert into inacap.Mascota " +
                     "(nombre,raza,sexo,tratamiento) " +
                     "values (?,?,?,?)";
        
        // 2.1.- Creación del objeto que prepara la sentencia de SQL
        //       a ejecutar en la base de datos.
        PreparedStatement pst = conn.prepareStatement(sql);
        
        // 2.2.- Agregación de los datos que llenarán la sentencia de SQL
        //       en los lugares donde aparece el signo de interrogación ('?')
        pst.setString(1, nombre);
        pst.setString(2, raza);
        pst.setString(3, sexo + "");
        pst.setString(4, tratamiento);
        
        // 2.3.- Ejecutar la sentencia preparada de SQL.
        pst.executeUpdate();       
        
        response.sendRedirect("FormularioNuevaMascota.jsp");
    }
    catch(SQLException e)
    {
        out.println("Excepción de SQL: " + e);
        return;
    }
    
    
%>