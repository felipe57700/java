import java.util.Scanner;

public class String03
{
    

    
    
    
    
    
    
    
    public static int CuentaFrases(String frase){
        char letra;
		int i = 0;
		int numeroPalabras = 0;
		boolean palabraLeida = false;
    for(i=0; i < frase.length(); i++)
		{
			letra = frase.charAt(i);

			if(letra == ' ' & palabraLeida == true)
			{
				numeroPalabras++;
				palabraLeida = false;
			}
			else if(letra == ' ' & palabraLeida == false)
			{
				palabraLeida = false;
			}
			else 
			{
				palabraLeida = true;
			}
		}

		if(palabraLeida == true)
			numeroPalabras++;
                
                return numeroPalabras;
}
    
	public static void main(String[] args)
	{
		
		String frase;
		Scanner sc = new Scanner(System.in);	

		System.out.println("Ingrese una frase por teclado: ");
		frase = sc.nextLine();
	
		CuentaFrases(frase);

	}
}
