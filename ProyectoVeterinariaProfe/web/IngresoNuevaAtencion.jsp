<%@page import="java.sql.*,java.util.Calendar,cl.inacap.taller2.conexion.ConexionBD" %>

<%
    // 1.- Recuperar datos del formulario.
    long idMascota = Long.parseLong( request.getParameter("idmascota") );
    long idMedico  = Long.parseLong( request.getParameter("idmedico") );
        
    // 2.- Insertar los datos de la atención médica en la BD.
    try
    {
        Connection conn = ConexionBD.crearConexion();
        String sql = "insert into inacap.listaatenciones " +
                     "(idmascota,idmedico,fecha) values (?,?,?)";
        
        // 2.1.- Creación del objeto que prepara la sentencia de SQL
        //       a ejecutar en la base de datos.
        PreparedStatement pst = conn.prepareStatement(sql);
        
        // 2.2.- Agregación de los datos que llenarán la sentencia de SQL
        //       en los lugares donde aparece el signo de interrogación ('?')
        pst.setLong(1, idMascota);
        pst.setLong(2, idMedico);
        pst.setTimestamp(3, new Timestamp(Calendar.getInstance().getTimeInMillis()));

        
        // 2.3.- Ejecutar la sentencia preparada de SQL.
        pst.executeUpdate();       
        
        out.println("Atención médica ingresada correctamente.");
    }
    catch(SQLException e)
    {
        out.println("Excepción de SQL: " + e);
        return;
    }
    
    
%>