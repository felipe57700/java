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
public class Dueño {
 private String nombre,rut,direccion;
 
 //constructor
 public Dueño(String nom,String ru,String di){
 this.nombre=nom;
 this.rut=ru;
 this.direccion=di;
 }
 
 //constructor por defecto
 public Dueño(){
 this.direccion="No ingresado";
 this.nombre="No ingresado";
 this.rut="No ingresado";
 
 }

 //get
 
 public String getNombre(){
 return this.nombre;
 }
 
 public String getRut(){
 return this.rut;
 }
 
 public String getDireccion(){
 return this.direccion;
 }
 
 //set
 
 public void setNombre(String n){this.nombre=n;}
 public void setRut(String r){this.rut=r;}
 public void setDireccion(String d){this.direccion=d;}
 
 
 
}//fin
