package estructurasdecontrol;
import java.util.Scanner;

public class potencias {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce la base");
		int num1= entrada.nextInt();
		System.out.println("Introduce el exponente");
		int num2= entrada.nextInt();
		
		int resultado = 1;
		
		for (int i = 1; i <= num2; i++)
		{
			 resultado = resultado * (num1);
		}
				
		
		System.out.println("el resultado es " +resultado);




		
		
		

	}

}
