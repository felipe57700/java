/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Veterinaria;

/**
 *
 * @author FELIPE
 */
public class Enfermedad {
private String nombre,descripcion;

//Constructor 
public Enfermedad(String nom,String des){
this.nombre=nom;
this.descripcion=des;
}

//Constructor por defecto
public Enfermedad(){
this.nombre="No tiene";
this.descripcion="No tiene";
}
    
    
public String getNombre(){
return this.nombre;
}

public String getDescripcion(){
return this.descripcion;
}

public void setNombre(String nom){
this.nombre=nom;
}

public void setDescripcion(String des){
this.descripcion=des;
}

}//fin
