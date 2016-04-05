/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nasa;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author FELIPE
 */
public class Trabajador {
    
    private String rut,nombre,apellido,idns;
    private int edad;
    private int altura,peso;
    private String funcion;
//constructor
    public Trabajador(String rut, String nombre, String apellido, String idns, int edad, int altura, int peso, String funcion) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.idns = idns;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.funcion = funcion;
    }
    
   //constructor por defecto
    public Trabajador() {
        this.rut = "No ingresado";
        this.nombre = "No ingresado";
        this.apellido = "No ingresado";
        this.idns = "No ingresado";
        this.edad = 0;
        this.altura = 0;
        this.peso = 0;
        this.funcion = "No ingresado";
    } 
    
    //get
    public String getRut() {
        return this.rut;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getIdns() {
        return this.idns;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getAltura() {
        return this.altura;
    }

    public int getPeso() {
        return this.peso;
    }

    public String getFuncion() {
        return this.funcion;
    }
   
    //set
    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setIdns(String idns) {
        this.idns = idns;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
    
    public Trabajador pideTrabajador(){
    Scanner sc= new Scanner(System.in);
    
    Trabajador t=new Trabajador();
    System.out.println("Ingrese Rut:");
    t.rut=sc.nextLine();
    System.out.println("Ingrese Nombre:");
    t.nombre=sc.nextLine();
    System.out.println("Ingrese Apellido:");
    t.apellido=sc.nextLine();
    System.out.println("Ingrese IDNS:");
    t.idns=sc.nextLine();
    System.out.println("Ingrese Edad:");
    t.edad=sc.nextInt();
    System.out.println("Ingrese Altura(EN CMS):");
    t.altura=sc.nextInt();
    System.out.println("Ingrese Peso(EN GRAMOS):");
    t.peso=sc.nextInt();
    sc.nextLine();
    System.out.println("Ingrese Funcion (A)= administrativo, (T)= Tecnico. (J)=Encargado Agencia:");
   t.funcion=sc.nextLine() ;
    
    System.out.println("Presione enter para continuar");
    return t;
    }
    
    public void muestra(Trabajador t){

    
        System.out.println( "Trabajador(" +  "rut=" + t.rut + ", nombre=" + t.nombre + ", apellido=" + t.apellido + ", idns=" + t.idns + ", edad=" + t.edad + ", altura=" + t.altura + ", peso=" + t.peso + ", funcion=" + t.funcion + ')');
    }
    
    public void guardaTrabajador(ArrayList<Trabajador> auTrabajador){
    
     
        //Metodo para escrbibir datos a un archivo productos.txt
        try
        {
            //fout es solo un nombre de una variable
           
        FileWriter fout = new FileWriter("C:/txt/trabajador.txt");
        //pasa archivos
        for(Trabajador p:auTrabajador){
            p.muestra(p);
        fout.write(p.getRut()+"\r\n"); // \r\n son saltos hacia abajo del S.O windows
        fout.write(p.getNombre()+"\r\n");
        fout.write(p.getApellido()+"\r\n");
        fout.write(p.getIdns()+"\r\n");
        fout.write(p.getFuncion()+"\r\n");
        fout.write(p.getEdad()+"\r\n");
        fout.write(p.getAltura()+"\r\n");
        fout.write(p.getPeso()+"\r\n");
        
        }
        
        //cerra archivo
        fout.close();
        }
        
        catch(IOException e)
        {
        System.out.println("Excepcion de E/S "+e);
        }
        
    
}
}
