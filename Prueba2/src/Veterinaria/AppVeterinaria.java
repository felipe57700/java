/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veterinaria;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;



/**
 *
 * @author FELIPE
 */
public class AppVeterinaria {

    
    public static void main(String[] args) {
  
  ArrayList<Animal> ani = new ArrayList<Animal>();
  
  Scanner sc=new Scanner(System.in);

  
  while(true){
  
 /* crear un menú de usuario con las siguientes opciones: 1.- ingresar un nuevo animal, con su dueño y
enfermedad ; 2.- listar todos los animales junto al nombre de sus dueños ; 3.- eliminar animales por posición
dentro de la lista; 4.- salir del programa (con solicitud de confirmación de salida) [2,6 ptos.]*/
  System.out.println("Menu");
  System.out.println("=====");
  System.out.println("1.- Ingresar un nuevo animal");
  System.out.println("2.- Listar animales con sus dueños");
  System.out.println("3.- Eliminar todos los animales que tegan x enfermedad");
  System.out.println("4.-Salir");
  int op=sc.nextInt();
  sc.nextLine();
  
  
  
  switch(op){
      case 1:
 
  System.out.println("Añadir especie del Animal: ");
  String especie=sc.nextLine();
  System.out.println("edad: ");
  short edad=sc.nextShort();
  sc.nextLine();
  System.out.println("Sexo(M-F): ");
  char sex=sc.next().charAt(0);
  
//informacion del dueño
 
  sc.nextLine();
  System.out.println("Ingrese Nombre del dueño: ");
  String nombre=sc.nextLine();
  System.out.println("Ingrese rut del dueño: ");
  String rut=sc.nextLine();
  System.out.println("Ingrese Direccion del dueño: ");
  String direccion=sc.nextLine();   
  
  //informacion de enfermedad
  
  
  System.out.println("Ingrese nombre de enfermedad: ");
  String enfer=sc.nextLine();
  System.out.println("Ingrese Descripcion: ");
  String descripcion=sc.nextLine();
  
  //guardando Datos:
  
 Animal temp =new Animal(especie,edad,sex);
 temp.dueño.setNombre(nombre);
 temp.dueño.setRut(rut);
 temp.dueño.setDireccion(direccion);
 temp.enfermedad.setNombre(enfer);
 temp.enfermedad.setDescripcion(descripcion);
 
  ani.add(temp);
  break;
          
      case 2:
          for(Animal aux: ani){
              System.out.println("Especie: "+aux.getEspecie());
              System.out.println("Edad:  "+aux.getEdad());
              System.out.println("Sexo:  "+aux.getSexo());
              System.out.println("Enfermedad:: "+aux.enfermedad.getNombre());
              System.out.println("Descripcion "+aux.enfermedad.getDescripcion());
          }
          
          break;
          
      case 3:
          System.out.println("Ingrese enfermedad:");
          String en=sc.nextLine();
          int pos=ani.indexOf(en);
          ani.remove(pos);
          
          
          
          
          break;
 
  
  //ArrayList<InfoAgenda> listaContactos = new ArrayList<InfoAgenda>();
      
  
  }
    }
  //while   
        
    }
    
}
