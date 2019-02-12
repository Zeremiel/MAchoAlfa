package ProgramacionModular;
import java.util.Scanner;
public class MCDrecursivo
{
static Scanner ent= new Scanner(System.in);

	public static void main(String[] args) 
	{
	int numero1=PedirNumero();
	int numero2=PedirNumero();
	int resultado=Calcular(numero1, numero2);
	VerResultado(numero1, numero2, resultado);
	}
		public static int PedirNumero()
		{
			System.out.println("Introduce un numero");
			return ent.nextInt();
		}
		public static int Calcular(int numero1, int numero2)
		{
			if (numero1==numero2)
				return numero1;
			
			if (numero1>numero2)
			{
				return Calcular((numero1-numero2), numero2);
			}
			else
				return Calcular((numero1), numero2-numero1);
						
		}
		public static void VerResultado(int numero1, int numero2, int resultado)
		{
			System.out.println("el MCD de " +numero1+ " y " + numero2 + " es " + resultado);
		}

		



}
