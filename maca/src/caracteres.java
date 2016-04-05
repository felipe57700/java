import java.util.Scanner;

public class caracteres
{
	public static void main(String[] args)
	{
		char letra;
		int contadorCaracteres[] = new int[256];
		int i = 0;
		String frase;	
		Scanner sc = new Scanner(System.in);

		


		System.out.println("Ingrese una frase por teclado: ");
		frase = sc.nextLine();
	
		for(i=0; i<frase.length(); i++)
		{
			letra = frase.charAt(i);
                        
			
		}
                
                System.out.println("cantiadad de letra palabra:"+i);
		
	}
}

