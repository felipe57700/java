
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author FELIPE
 */
public class FelipeMuñoz {
static String palaLarga="no existe.";
static String palaCorta="no existe.";
static int menor=10000;
static int mayor=0;
static String fraseDepurada="";
    
public static void  LargoPalabras(String pala){
    int valor=pala.length();
    
    if(valor>mayor){
    palaLarga=pala;
    mayor=valor;
   
    }
    
    else if(valor<menor){
    palaCorta=pala;
    menor=valor;
    
    }
    
}    
    
    public static void BuscarPorLargo(String frase, int largo){
    
char letra;
int caracter=0;
int palabra=0;
int espacio=0;

String pala="";
		for(int i=0; i<frase.length(); i++){
                 letra=frase.charAt(i);
                 
                    
                    if((letra>=65&letra<=90)||(letra>=97&letra<=122)){
                            caracter++;
                            pala=pala+letra;
                    }
                    
                    else if(letra==' '){
                     espacio++;
                     
                     
                     //aqui es una palabra
                        if((caracter>=2)&(espacio==1)){
                            palabra++;
                            espacio=0;
                            caracter=0;
                            LargoPalabras(pala);
                            
                            if(pala.length()==largo){
                            System.out.println("Encontrado: "+pala);
                            }
                            
                            pala="";
                        }
                        
                            else{
                            caracter=0;
                            espacio=0;
                            pala="";
                            }
                        
                    }
                    
                    
                    
                }
    }
    
    
    
   public static void  BuscarPorPosicion(String frase, int posicion){
       

char letra;
int caracter=0;
int palabra=0;
int espacio=0;

String frase2=" "+frase;

posicion=posicion+1;
boolean blanco=false;
char letra2;   

String pala="";
                    
                for(int x=posicion; x>=0; x--){
                 letra2=frase2.charAt(x);
                 
                     if(letra2==' '){
                     posicion=x;
                     
                     x=-1;
                     }
                }       



		for(int i=posicion; i<frase2.length(); i++){
                 letra=frase2.charAt(i);
                 
                    
                    if((letra>=65&letra<=90)||(letra>=97&letra<=122)){
                            caracter++;
                            pala=pala+letra;
                            
                    }
                    
                    else if(letra==' '){
                     espacio++;
                     
                     
                     //aqui es una palabra
                        if((caracter>=2)&(espacio==1)){
                            palabra++;
                            espacio=0;
                            caracter=0;
                            System.out.println("Palabra encontrada:"+pala);
                            i=frase.length();
                            blanco=true;
                            
                        }
                        
                            else {
                            caracter=0;
                            espacio=0;
                            pala="";
                            
                            }
                        
                    }
                    
                    
                    
                }
       
       
       
   } 
    
    
    
    

public static int  CuentaCaracteres(String frase){

char letra;
int caracter=0;
int palabra=0;
int espacio=0;

String pala="";
		for(int i=0; i<frase.length(); i++){
                 letra=frase.charAt(i);
                 
                    
                    if((letra>=65&letra<=90)||(letra>=97&letra<=122)){
                            caracter++;
                            pala=pala+letra;
                    }
                    
                    else if(letra==' '){
                     espacio++;
                     
                     
                     //aqui es una palabra
                        if((caracter>=2)&(espacio==1)){
                            palabra++;
                            espacio=0;
                            caracter=0;
                            LargoPalabras(pala);
                            fraseDepurada=fraseDepurada+pala+" ";
                            pala="";
                        }
                        
                            else{
                            caracter=0;
                            espacio=0;
                            pala="";
                            }
                        
                    }
                    
                    
                    
                }
		
                    return palabra;
}    
    
    
    
    public static void main(String[] args) {
       
        boolean salir=false;
        String frase="";
		Scanner sc = new Scanner(System.in);	
//opcion 1 case 1:
		
          //break;      
               
               //case 2:
           
            
           
            //break;
           
           //case 3:
           
           
           
           //break
           
           //largo de frase ingresada
          // System.out.println("El Largo de la frase ingresada es: "+ (frase.length()-1)+ " caracteres");
           //buscar por largo
           
           
           
           
           do {
               System.out.println("                                              ");
               System.out.println("                                               ");
               System.out.println("===========MENU==============================");
               System.out.println("=============================================");
               System.out.println( "1.- Ingesar la frase.");
               
               System.out.println( "2.- palabra mas corta ."); 
               System.out.println( "3.- palabra mas larga ."); 
               System.out.println( "4.- Buscar palabra por largo");
               System.out.println( "5.- Buscar palabra posicion");
               System.out.println( "6.- Salir");
               System.out.println("Ingrese una opcion por teclado: ");
               int op = sc.nextInt();
               sc.nextLine();
               System.out.println("============================================="); 
               
               
               switch(op){
                       case 1:
                        System.out.println("Ingrese una frase por teclado: ");
                         frase = sc.nextLine();
                         frase=frase+' ';
                       System.out.println("Cantidad de palabras: "+CuentaCaracteres(frase));
                       System.out.println("La frase depurada es: "+fraseDepurada);
                       break;
                           
                       case 2:
                       System.out.println("La ultima palabra mas corta leida es: "+ palaCorta);
                       break;
                           
                       case 3:
                       System.out.println("La ultima palabra mas Larga leida es: "+ palaLarga);    
                       break;
                           
                       case 4:
                       System.out.println("Ingrese el largo de las palabras a buscas: ");
                            int ab= sc.nextInt();
                             BuscarPorLargo(frase, ab); 
                             sc.nextLine();    
                       break;
                           
                       case 5:
                        System.out.println("La frase con palabras validas es:"+fraseDepurada);
                        System.out.print("Ingrese la posicion para buscar una palabra en esta frase:");
                        int posicion = sc.nextInt();
                        char auxiliar;
                        auxiliar=frase.charAt(posicion);
                        System.out.println("caracter seleccionado="+frase.charAt(posicion));
                        if(auxiliar==' '){
                        System.out.println("es un espacio vacio");
                            }
                            else{         
                            BuscarPorPosicion(fraseDepurada, posicion);
                            }
                           sc.nextLine();   
                       break;
                           
                       case 6:
                           System.exit(0);
                     
                       break; 
                      
                       
                            
                       default:
                       System.out.println("Opcion no valida");    
                       break;
               }
               
               
               
               
           }while(salir!=true);
           
           
    }
    
}
