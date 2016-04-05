/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import BD.ConexionBD;
import com.sun.xml.ws.tx.at.v10.types.PrepareResponse;
import java.sql.*;

/**
 *
 * @author FELIPE
 */
public class Avion {
    private long Id, IdAerolinea,IdPiloto,IdCopiloto;
    private int MaximoPasajeros;
    private String modelo;

    public Avion(long Id, long IdAerolinea, long IdPiloto, long IdCopiloto, int MaximoPasajeros) {
        this.Id = Id;
        this.IdAerolinea = IdAerolinea;
        this.IdPiloto = IdPiloto;
        this.IdCopiloto = IdCopiloto;
        this.MaximoPasajeros = MaximoPasajeros;
    }

    public Avion() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public long getIdAerolinea() {
        return IdAerolinea;
    }

    public void setIdAerolinea(long IdAerolinea) {
        this.IdAerolinea = IdAerolinea;
    }

    public long getIdPiloto() {
        return IdPiloto;
    }

    public void setIdPiloto(long IdPiloto) {
        this.IdPiloto = IdPiloto;
    }

    public long getIdCopiloto() {
        return IdCopiloto;
    }

    public void setIdCopiloto(long IdCopiloto) {
        this.IdCopiloto = IdCopiloto;
    }

    public int getMaximoPasajeros() {
        return MaximoPasajeros;
    }

    public void setMaximoPasajeros(int MaximoPasajeros) {
        this.MaximoPasajeros = MaximoPasajeros;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    public static boolean Guardar(String modelo, int maximop){
        
        try{
        Connection conn = ConexionBD.CrearConexion();
        String sql="insert into inacap.avion (modelo,maximopasajeros) values (?,?)";
        PreparedStatement pst=conn.prepareStatement(sql);
        pst.setString(1,modelo);
        pst.setInt(2 ,maximop);
        pst.executeUpdate();
            
        return true;
        }
       
        catch(SQLException e ){
        System.err.println("Error SQL:"+e);
            return false;
        }
                
     }
    
    
     public static ResultSet Listar(){
        try{
         ResultSet rs=null;
         Connection conn=ConexionBD.CrearConexion();
         String sql="select * from inacap.avion";
         PreparedStatement pst= conn.prepareStatement(sql);
         rs=pst.executeQuery();
         return rs;   
        }
        
        catch(SQLException e){
            System.err.println("Error de SQL"+e);
            return null;
        }
     }
        
     public static boolean Eliminar(String id){
     try{
     Connection conn= ConexionBD.CrearConexion();
     String sql="delete from inacap.avion where id=?";
     PreparedStatement pst = conn.prepareStatement(sql);
     pst.setString(1, id);
     pst.execute();
     
     return true;
     }
     
     catch(SQLException e){
     System.err.println("Error SQL:"+e);
     }
         
         return false;
     }
     
    
    public static ResultSet Cargar(String id){
        try{
            ResultSet rs=null;
            Connection conn = ConexionBD.CrearConexion();
            String sql="Select * from inacap.avion where id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, id);
            rs=pst.executeQuery();
            return rs;
        }
    
        catch(SQLException e){
            System.err.println("Error SQL:"+e);
            return null;
         }
    
        
    }
    
    
    
    public static boolean update(String id, String modelo, String maximopasajeros){
        try{
            Connection conn=ConexionBD.CrearConexion();
            String sql="update inacap.avion set modelo=?, maximopasajeros=? where id=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1, modelo);
            pst.setString(2, maximopasajeros);
            pst.setString(3, id);
            pst.executeUpdate();
            return true;
        }
    
        catch(SQLException e){
             System.err.println("Sql error"+e);
             return false;
        }
        
    
    }
    
    
    
}
