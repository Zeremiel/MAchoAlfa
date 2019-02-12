package estructurasdecontrol;
import java.util.Scanner;

public class imprimenumerocaracteres {
//Esta mierda imprime caracteres dependiendo de cuanto pongas.
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la altura");
		int alto=entrada.nextInt();
		System.out.println("El largo");
		int largo=entrada.nextInt();
		
		
		for (int i=1; i<=alto; i++)
		{System.out.println("");
			for(int j=0; j<=largo; j++)
				{
			System.out.print("*");
					
				}
		}	



	}

}
