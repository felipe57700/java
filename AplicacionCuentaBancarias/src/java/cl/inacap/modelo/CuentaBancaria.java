/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.modelo;

import cl.inacap.bd.ConexionBD;
import java.sql.*;

/**
 *
 * @author FELIPE
 */
public class CuentaBancaria {
    private long idUsuario;
    private long saldo;
    private Timestamp fecha;
    
    public static long verSaldo (long idCuenta){
         try{
            Connection conn = ConexionBD.crearConexion();
            String sql= "select * from inacap.cuentabancaria where id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setLong(1, idCuenta);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()== true)
            return rs.getLong("Saldo");
            
            else 
               return -1;
            
            
        }
        
        catch(SQLException e){
        System.err.println("error sql"+e);
        return -1L;
        }
        

}



public static boolean girar(long idCuenta, long monto){
    //guardar variable, si el ide de la cuenta exite o no, ver si es mayor a 0
    
    long saldoActual=verSaldo(idCuenta);
    
    if(monto >saldoActual){
        System.err.println("Monto de giro mayor al saldo");
        return false;
        
    }
    
     if(monto < 1L){
        System.err.println("Monto de giro negativo invalido");
        return false;
        
    }
        
        try{
            Connection conn = ConexionBD.crearConexion();
            String sql= "update inacap.cuentabancaria set saldo =?  where id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setLong(1, saldoActual - monto);
            pst.setLong(2, idCuenta);
            pst.executeUpdate();
            return true;
            
           
            }
        
        catch(SQLException e){
        System.err.println("error sql"+e);
        return false;
        }
        
   
}

public static boolean depositar(long idCuenta, long monto){
      long saldoActual=verSaldo(idCuenta);
      
       if(monto < 1L){
        System.err.println("Monto de deposito negativo invalido");
        return false;
        
    }
        
      
      
    try{
            Connection conn = ConexionBD.crearConexion();
            String sql= "update inacap.cuentabancaria set saldo =?  where id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setLong(1, saldoActual + monto);
            pst.setLong(2, idCuenta);
            pst.executeUpdate();
            return true;
            
           
            }
        
        catch(SQLException e){
        System.err.println("error sql"+e);
        return false;
        }
        
}


}

