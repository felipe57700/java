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

public class Animal {
Dueño dueño =new Dueño();
Enfermedad enfermedad=new Enfermedad();
private String especie;
private short edad;
private char sexo;

//constructor
public Animal(String es,short ed,char se){
this.especie=es;
this.edad=ed;
this.sexo=se;
}
    
//constructor por defecto
public Animal(){
this.especie="No Ingresada";
this.edad=0;
this.sexo=' ';
}

//get

public String getEspecie(){
return this.especie;
}

public short getEdad(){
return this.edad;
}

public char getSexo(){
return this.sexo;
} 

//set

public void setEspecie(String es){
this.especie=es;
}

public void setEdad(short e){
this.edad=e;
}

public void setSexo(char s){
this.sexo=s;
}


    
}//fin
