

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FELIPE
 */
public class Data {
 
    public static String arrUsuario[]={"nombre1","nombre2","nombre3"};
    public static String arrClave[]={"clave1","clave2","clave3"};
    
    
    public static int Valida(String nombre,String clave){
   

    for(int op=0; op<arrUsuario.length;op++){
      if(nombre.equals(arrUsuario[op])&&clave.equals(arrClave[op])){
          return 1;
      } else {
      }
    
    
    }
        return 0;
    
    
    
    
    
    
    
}
}