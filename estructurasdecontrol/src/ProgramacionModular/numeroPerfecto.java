package ProgramacionModular;
import java.util.Scanner;
public class numeroPerfecto 
/**
 * Este programa indica si un numero es perfecto o no lo es, un numero es perfecto vcuando la suma de sus divisores propios (Aquellos cuyo resto es 0) es igual al propio numero
 */

{
static Scanner ent = new Scanner(System.in);
	public static void main(String[] args) 
	
	{
	int numero=IntroduceNumero();
	boolean resultado=CalculaResultado(numero);
	 verResultado(numero, resultado);
	}
	
		public static int IntroduceNumero() 
		{
	    System.out.println("Introduce un numero");
		return ent.nextInt();
		}
		
		public static boolean CalculaResultado(int numero)
		//para comprobar si un numero es divisor propio de 6
		{
			int acumulador=0;
			for (int i=1; i<numero/2; i++)
			{
				if (numero%i==0)
					acumulador=acumulador+i;
			}
			if (acumulador==numero)
				return true;
				else
				return false;			
		}
		public static void verResultado (int numero, boolean resultado)
		{
			if (resultado==true)
			System.out.println("el numero "+numero+ " es perfecto");
			else
			System.out.println("El numero " +numero+ " No es perfecto");
			
		}
		
		

}
