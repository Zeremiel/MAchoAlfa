package ProgramacionModular;
import java.util.Scanner;

public class potenciaModular 
{
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args)
	{
		int base = pedirbase();
		int potencia = Potencia();
		int calcular = calculaPotencia(base, potencia);//Esta es la forma de pasar por valor, aun no hemos visto como pasar por referencia
		verRes(base, calcular);
		//Los metodos pueden devolver un solo valor. PASO DE PARAMETROS: EXISTEN DOS FORMAS DE PASAR PARAMETROS:
		//POR VALOR Y POR REFERENCIA, CUANDO PASAMOS POR VALOR LO QUE PASAMOS ES UNA COPIA DE LOS PARAMETROS ORIGINALES O ACTUALES (ES LO MISMO)
		//ESO SIGNIFICA QUE LOS VALORES ORIGINALES NO SE PUEDEN MODIFICAR DENTRO DEL METODO. CUANDO LOS PASAMOS POR REFERENCIA SIGNIFICA QUE LO QUE PASAMOS
		//AL PARAMETRO FORMAL ES LA DIRECCIÓN DE MEMORIA DEL PARAMETRO ORIGINAL POR LO QUE SERÍA MODIFICABLE EL CONTENIDO DE LAS VARIABLES ORIGINALES
	}
	///////////////////////////////////////////////////////////////////////////////////////////
		private static int pedirbase()
		{
			System.out.println("Introduce la base que quieres elevar a potencia");
			return entrada.nextInt();			
		}
		///////////////////////////////////////////////////////////////////////////////////////////

		private static int Potencia()
		{
			System.out.println("Introduce la potencia a la que quieres elevar el número");
			return entrada.nextInt();	
		}
		///////////////////////////////////////////////////////////////////////////////////////////

		private static int calculaPotencia(int base, int potencia)
		{

			int resultado = 1;
			
			for (int i = 1; i <= potencia; i++)
			{
				 resultado = resultado * (base);
			}
			return resultado;
			
		}
		///////////////////////////////////////////////////////////////////////////////////////////

		
			private static void verRes(int base, int calcular)
			{
				System.out.println("La potencia de " + base +" es " + calcular);
			}
			
}
		
			
		
	
	

	
