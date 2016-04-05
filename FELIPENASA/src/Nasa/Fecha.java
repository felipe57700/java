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
public class Fecha {
    private byte dia;
    private byte mes;
    private int año;
    
    //contructor fecha
    public Fecha(byte d, byte m, int a){
        
        this.año=a;
        this.dia=d;
        this.mes=m;
}
    //constructor por defecto
    public Fecha(){
    this.año=0;
    this.dia=0;
    this.mes=0;   
    }

    //get
    public byte getDia() {
        return dia;
    }

    
    public byte getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }
    
    //set

    public void setAño(int año) {
        this.año = año;
    }
    
  public void setDia(byte dia) {
        this.dia = dia;
    }  
    
public void setMes(byte mes) {
        this.mes = mes;
    }    
    
   public Fecha pideFecha(){
    Scanner sc = new Scanner(System.in);   
   System.out.println("Ingrese dia:");
   byte aux=sc.nextByte();
   byte d=0,m=0;
   int año=0;
   //validaciones
   if(aux<0||aux>32){System.out.println("Error dia no valido");}
   else{ d=aux;}
   
   System.out.println("Ingrese Mes:");
   aux=sc.nextByte();
   //validaciones
   if(aux<0||aux>12){System.out.println("Error Mes no valido");}
   else{ m=aux;}
   System.out.println("Ingrese Año:");
   año=sc.nextInt();
   //validaciones
   int añoactual= 2014;
   if(año<2006||aux>añoactual){System.out.println("Error año no valido");}
   Fecha f=new Fecha(d,m,año);
   return f;
   }
   
   public void muestraFecha(Fecha f){
    System.out.println("Fecha(" + "dia=" + f.dia + ", mes=" + f.mes + ", año=" + f.año + ')');
   }


   
   
    
}


