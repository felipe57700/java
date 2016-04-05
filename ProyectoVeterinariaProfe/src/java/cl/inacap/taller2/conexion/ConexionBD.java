/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.inacap.taller2.conexion;

import java.sql.*;


public class ConexionBD {
   public static Connection crearConexion()
    {
        // 1.- Definir las credenciales de acceso a la BD.
        String nombreUsuario = "inacap";
        String clave         = "inacap";
        String urlConexion   = "jdbc:derby://localhost:1527/BDUsuario";
        
        // 2.- Crear la conexiÃ³n a la BD.
        try
        {
            Connection conn = DriverManager.getConnection(
                              urlConexion, nombreUsuario, clave);
            
            return conn;
        }
        catch(SQLException e)
        {
            System.out.println("ExcepciÃ³n de SQL: " + e);
            return null;
        }        
    } 
    
   
}
