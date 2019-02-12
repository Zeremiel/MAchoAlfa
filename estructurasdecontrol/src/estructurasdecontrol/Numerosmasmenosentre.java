package estructurasdecontrol;
import java.util.Scanner;

public class Numerosmasmenosentre 
{
//Esta clase nos dice en un conjunto de seis numeros introducidos son mayores que 55, menores de 14 o estan entre medias
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in); 

		int num;
		int menor=0;
		int mayor=0;
		int medio=0;
		System.out.println("Introduce 6 numeros");

		for (int i=0; i<=6; i++)
			{
			num=entrada.nextInt();
			if (num<15)
				menor++;
			else if (num<55)
				mayor++;
			else if (num>=45)
				medio++;			
			
			}
		
		System.out.println("hay "+ menor + "numeros por debajo de 15, hay" +mayor + " numeros por encima de 55 y hay" +medio + "numeros entre 45 y 55");

		
		
		
		}	
	}



