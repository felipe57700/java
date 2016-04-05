/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import BD.ConexionBD;
import java.sql.*;
/**
 *
 * @author FELIPE
 */
public class Aerolinea {
    private long id;
    private String nombre, paisorigen;

    //constructores
    public Aerolinea(long id, String nombre, String paisorigen) {
        this.id = id;
        this.nombre = nombre;
        this.paisorigen = paisorigen;
    }
    
    public Aerolinea() {
        this.id =0;
        this.nombre = "";
        this.paisorigen ="";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisorigen() {
        return paisorigen;
    }

    public void setPaisorigen(String paisorigen) {
        this.paisorigen = paisorigen;
    }
    
    
    
    public static boolean Agregar(String nombre, String paisdeorigen){
       
       
    try{    
    //creo la conexion de el modelo BD importado
        Connection conn=ConexionBD.CrearConexion();
        
        //creo sentencia sql
        String sql="Insert into aerolinea (nombre,paisorigen) values (?,?)";
        PreparedStatement pst= conn.prepareStatement(sql);
        pst.setString(1,nombre);
        pst.setString(2,paisdeorigen);
        pst.executeUpdate();
        return true;
    }  
    
        catch(SQLException e){
            return false;
        } 
        
    }//fin agregar
    
    
    public static ResultSet Listar(){
    try{
    ResultSet rss=null;
        Connection conn=ConexionBD.CrearConexion();
        String sql="select * from inacap.aerolinea";
        PreparedStatement pst=conn.prepareStatement(sql);
        
        rss=pst.executeQuery();
        
        return rss;
    }
    
    catch(SQLException e){
        System.err.println("Error Sql"+e);
        return null;
    }
        
        
    }//fin linstar
    
    
    public static boolean Borrar(long id){
        try{
        Connection conn = ConexionBD.CrearConexion();
        String sql="delete from inacap.aerolinea where id=?";
        PreparedStatement pst= conn.prepareStatement(sql);
        pst.setLong(1, id);
        pst.executeUpdate();
        return true;
        }
        
        catch(SQLException e){
        
            System.err.println("Error sql"+e);
            return false;
        }
        
    }//fin borrar
    
    public static ResultSet Cargar(String id){
        ResultSet rss=null;
        
        
        try{
        
        Connection conn= ConexionBD.CrearConexion();
        String sql="select * from inacap.aerolinea where id=?";
        
        PreparedStatement pst=conn.prepareStatement(sql);
        pst.setString(1, id);
        rss=pst.executeQuery();
        return rss;
        }
        
        catch(SQLException e){
            System.err.println("Error de SQL"+e);
            return rss;
        }
        
        
    }//fin cargar
    
    
    public static boolean Modificar(String nombre, String paisdeorigen,String id){
       
       
    try{    
    //creo la conexion de el modelo BD importado
        Connection conn=ConexionBD.CrearConexion();
        
        //creo sentencia sql
        String sql="update inacap.aerolinea set nombre=?,paisorigen=? where id=?";
        PreparedStatement pst= conn.prepareStatement(sql);
        pst.setString(1,nombre);
        pst.setString(2,paisdeorigen);
        pst.setString(3,id);
        pst.executeUpdate();
        return true;
    }  
    
        catch(SQLException e){
            return false;
        } 
        
    }//fin agregar
    
    
}

