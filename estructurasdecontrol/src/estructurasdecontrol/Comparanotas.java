package estructurasdecontrol;
import java.util.Scanner;

public class Comparanotas {
//Esta clase compara 25 notas y te dice la mas alta y la mas baja
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce 25 notas con decimales entre 1 y 10");
		double nota=0;
		double notamaxima=0;
		double notamínima=10;
		boolean notavalida=true;
		
	
			for (int i=1; i<=3; i++)
			{
				do{		  
					nota= entrada.nextDouble();
					if (nota<1 || nota>10)
					{
						notavalida=false;
						System.out.println("Las notas no pueden ser inferiores a 1 ni superiores a 10, introduce las notas de nuevo");
					}
					else
						notavalida=true;
				  } while (!notavalida);
			
				{	
				if (nota>notamaxima) 
					notamaxima=nota;				
				
				if (nota<notamínima)
					notamínima=nota;
					
				}
			}
		System.out.println("la nota maxima es " + notamaxima + " la nota minima es " +notamínima);
	

		
		
		
	}

}
