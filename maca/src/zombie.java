
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
public class zombie {

    /**
     * @param args the command line arguments
     */
    int canti
            dad=0;
    public static int Calcula(int dias,int zombies){
        if(dias==0){
            return 0;
        }
        
        else{
      // zombies=(int) (Math.pow(zombies, 3)-(Math.pow(zombies, 3)*0.25));
       zombies=zombies+(zombies*3);
       zombies= (int) (zombies-(zombies*0.25));
       dias=dias-1;
       
        return zombies + Calcula(dias,zombies); 
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner sc=new Scanner(System.in);
        int diaA=0,zombieA=0;
        System.out.println("Ingrese cantidad de dias:");
        diaA=sc.nextInt();
        System.out.println("Ingrese cantidad de zombies:");
        zombieA=sc.nextInt();
        
        //llamo a la funcion
        //System.out.println("La cantidad de zombies es: "+ Calcula(diaA,zombieA));
        
        int a=Calcula(diaA,zombieA);
        System.out.println("La cantidad de zombies es: "+a);
    }
    
}
