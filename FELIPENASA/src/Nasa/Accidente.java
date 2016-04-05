/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nasa;
import java.util.Scanner;

/**
 *
 * @author FELIPE
 */
public class Accidente {
    private Fecha fecha=new Fecha();
    private String causa, detalle;
    
    //constuctor
    public Accidente(String c,String d, Fecha f){
    this.causa=c;
    this.detalle=d;
    this.fecha=f;
    }
    
    //constructor por defecto
     public Accidente(){
    //valor de fecha por defecto
    Fecha f= new Fecha((byte)0,(byte)0,0);
    this.causa="No ingresada";
    this.detalle="No ingresada";
    this.fecha=f;
    }
    
    //get

    public Fecha getFecha() {
        return fecha;
    }

    public String getCausa() {
        return causa;
    }

    public String getDetalle() {
        return detalle;
    }

    //set
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    
    //METODOS
    
    public Accidente pideAccidente(){
        Scanner sc= new Scanner(System.in);
        //debe ingresar contidad de accidentes
    System.out.println("Ingrese la causa del accidente:");
    String causa=sc.nextLine();
    System.out.println("Ingrese el detalle del accidente:");
     String dettale=sc.nextLine();
    //fecha
    Fecha f=new Fecha();
    f=f.pideFecha();
    Accidente a = new Accidente(causa,detalle,f);
    return a;
    }
    
    
    public void muestraAccidente(Accidente a){
     
    System.out.println("Accidente(" + "causa=" + a.causa + ", detalle=" + a.detalle + ')');
    a.fecha.muestraFecha(fecha);
    }

  
    
    
    
    
}
