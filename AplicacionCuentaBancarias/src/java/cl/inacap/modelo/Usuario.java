
package cl.inacap.modelo;
import java.sql.*;
import java.sql.Date;

import cl.inacap.bd.ConexionBD;


public class Usuario {
    private String rut;
    private String clave;
    private Timestamp fecha;
    
    public Usuario() {
        this.rut="";
        this.clave="";
        //new Timestamp((new Date()).getTime());
        this.fecha=null;
    }
    
    public static boolean validar(String rut, String clave){
    
        try{
            Connection conn = ConexionBD.crearConexion();
            String sql= "select * from inacap.usuariobanco where rut=? and clave=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, rut);
            pst.setString(2, clave);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()== true)//si devuelve algo.
            return true; // el usuario existe con la clave dada
            
            else 
               return false; //sino, el usuario no existe en la BD
            
            
        }
        
        catch(SQLException e){
        System.err.println("error sql"+e);
        return false;
        }
        
    }
    
    
}
