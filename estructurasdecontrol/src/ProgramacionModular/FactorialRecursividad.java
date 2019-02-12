package ProgramacionModular;
import java.util.Scanner;
public class FactorialRecursividad
{
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args)
	{
		int numero =pedirNumero();
		int resultado=factorial(numero);
		verResultado(resultado);
	}
///////////////////////////////////////////////////////////////////
	private static int pedirNumero()
	{
		System.out.println("Introduce el numero a factorizar que sea mayor que 0");
		int numi= entrada.nextInt();
			if (numi <=0)
			{
				System.out.println("El numero introducido no es valido");
				return pedirNumero();
			}
			else 
				return numi;
	}
///////////////////////////////////////////////////////////////////

	private static int factorial(int numero)
		{
		 if (numero==0) //esto funciona porque genera una pila LIFO por lo que el ultimo return es el primero en ejecutarse asi que 
			 //luego se ejecutan secuencialmente todos los else y el ultimo return da el resultado de la multiplicacion de llamadas. La recursividad funciona
			 //siempre con la regla LIFO.
		        return 1;
		    else
		        return numero*(factorial(numero-1));
		}
///////////////////////////////////////////////////////////////////

	private static void verResultado(int resultado)
		{
		System.out.println("El resultado es "+ resultado);

		
		}
	
		
		
	}

