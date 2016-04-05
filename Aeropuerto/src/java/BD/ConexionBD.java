/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;
import java.sql.*;

/**
 *
 * @author FELIPE
 */
public class ConexionBD {
    
    public static Connection CrearConexion(){
    
        //definimos claves y url
        String clave="inacap";
        String usuario="inacap";
        String url="jdbc:derby://localhost:1527/aereopuerto";
        
        //crear conexion a la Base de datos
        
        try{
            Connection conn=DriverManager.getConnection(url,usuario,clave);
            return conn;
        }
        catch(SQLException e){
            System.out.println("Excepcion de sql:"+e);
        return null;
        }
        
        
    }
}
