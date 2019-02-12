package ProgramacionModular;
import java.util.Scanner;
public class FactorialModular 
{
static Scanner entrada = new Scanner(System.in);
 

	public static void main(String[] args) 
	{ double numero = pedirNumero();
	  double factor = calcFactor(numero);
	  verRes(numero, factor);
	}
		private static double pedirNumero()
		{
		System.out.println("Vladi mola demasiado, que desgracia tener que cargar con Sara.jo");
		System.out.println("Introduce el numero a factorizar");
		return entrada.nextDouble();
		}
		
		private static double calcFactor(double numero)
		{
			int fac=1;
			for (int i=1; i<=numero; i++)
			{
				fac=fac*i;
			}
			return fac;
			
		}
		public static void verRes( double numero, double factor)
		{
			System.out.println("El factor de " + numero + " es " + factor);

			
		}
		
		
		
	
}
