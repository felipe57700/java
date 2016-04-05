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
public class Propulsor {
    
    private float altura,ancho,peso,temperatura,cantidadCombustible;
    private String nombreClave,tipoCombustible;
    
    //constructor

    public Propulsor(float altura, float ancho, float peso, float temperatura, float cantidadCombustible, String nombreClave, String tipoCombustible) {
        this.altura = altura;
        this.ancho = ancho;
        this.peso = peso;
        this.temperatura = temperatura;
        this.cantidadCombustible = cantidadCombustible;
        this.nombreClave = nombreClave;
        this.tipoCombustible = tipoCombustible;
    }
     //constructor por defecto
     public Propulsor() {
        this.altura = 0.F;
        this.ancho = 0.F;
        this.peso = 0.F;
        this.temperatura = 0.F;
        this.cantidadCombustible = 0.F;
        this.nombreClave = "Sin ingresar.";
        this.tipoCombustible = "Sin ingresar.";
    }
    
    //get
    public float getAltura() {
        return altura;
    }

    public float getAncho() {
        return ancho;
    }

    public float getPeso() {
        return peso;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public float getCantidadCombustible() {
        return cantidadCombustible;
    }

    public String getNombreClave() {
        return nombreClave;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }
   
    //set
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public void setCantidadCombustible(float cantidadCombustible) {
        this.cantidadCombustible = cantidadCombustible;
    }

    public void setNombreClave(String nombreClave) {
        this.nombreClave = nombreClave;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
     
    
     
    
    //funcion pide propulsor
    public Propulsor pidePropulsor(){
      Scanner sc = new Scanner(System.in);  
    System.out.println("Ingrese altura de propulsor:");
    float al=sc.nextFloat();
    System.out.println("Ingrese ancho de propulsor:");
    float an=sc.nextFloat();
    System.out.println("Ingrese Peso de propulsor:");
    float pe=sc.nextFloat();
    System.out.println("Ingrese temperatura en Celsius del propulsor:");
    float te=sc.nextFloat();
    System.out.println("Ingrese cantidad de combustible en litros de propulsor:");
    float co=sc.nextFloat();
    sc.nextLine();
    System.out.println("Ingrese Nombre clave de propulsor:");
    String n=sc.nextLine();
    System.out.println("Ingrese Tipo de combustible de propulsor:");
    String t=sc.nextLine();
    Propulsor p = new Propulsor(al, an, pe, te, co, n, t);
    return p;
    }

    public void Mostrar(Propulsor pro) {
        System.out.println( "Informacion de Propulsor(" + "altura=" + pro.altura + ", ancho=" + pro.ancho + ", peso=" + pro.peso + ", temperatura=" + pro.temperatura + ", cantidadCombustible=" + pro.cantidadCombustible + ", nombreClave=" + pro.nombreClave + ", tipoCombustible=" + pro.tipoCombustible + ')');
    }
     
    
}
