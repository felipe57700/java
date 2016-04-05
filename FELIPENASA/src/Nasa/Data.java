/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nasa;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author FELIPE
 */
public class Data {
    
    

    
    
    //pesca un arrayList de trabajador y lo copia a la listatrabajador
     public void guardaTrabajador(ArrayList<Trabajador> auTrabajador){
    
     
        //Metodo para escrbibir datos a un archivo productos.txt
        try
        {
            //fout es solo un nombre de una variable
           
        FileWriter fout = new FileWriter("trabajador.txt");
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
