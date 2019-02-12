package estructurasdecontrol;
import java.util.Scanner;

public class triangulopitagorico {
//imprime un triangulo pitagórico	

public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la altura");
		int alto=entrada.nextInt();
			
		for (int i=0; i<=alto; i++)
		
		{
			for( int j=0; j<=i; j++)
			{
			System.out.print("*");		
			}	
		System.out.println();

	}

}
}
