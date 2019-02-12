package ProgramacionModular;
import java.util.Scanner;
public class PotenciaRecursiva 
{
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int numero=PedirNumero();
		int potencia=pedirPotencia();
		int resultado=calculaResultado(numero, potencia);
		VerResultado(potencia, numero, resultado);		
	}
		public static int PedirNumero()
		{
			System.out.println("Introduce el numero que quieres potenciar");
			return entrada.nextInt();
		}
		public static int pedirPotencia()
		{
			System.out.println("Introduce la potencia que quieres aplicar al numero");
			return entrada.nextInt();
		}
		public static int calculaResultado (int numero, int potencia)
		{	
			if (potencia==0)
				return 1;
		
			
			
			return numero*calculaResultado (numero, potencia-1);
			  
		}		
		public static void VerResultado(int potencia, int numero, int resultado)
		{
			System.out.println("La potencia " + potencia + " de  " + numero + " es " + resultado);
			
		}
		
			
	}
		


