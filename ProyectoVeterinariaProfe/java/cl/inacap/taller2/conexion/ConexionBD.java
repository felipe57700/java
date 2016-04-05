package cl.inacap.taller2.conexion;
import java.sql.*;

public class ConexionBD 
{
    public static Connection crearConexion()
    {
        // 1.- Definir las credenciales de acceso a la BD.
        String nombreUsuario = "inacap";
        String clave         = "inacap";
        String urlConexion   = "jdbc:derby://localhost:1527/BDMascotas";
        
        // 2.- Crear la conexión a la BD.
        try
        {
            Connection conn = DriverManager.getConnection(
                              urlConexion, nombreUsuario, clave);            
            return conn;
        }
        catch(SQLException e)
        {
            System.out.println("Excepción de SQL: " + e);
            return null;
        }        
    }
}
