package estructurasdecontrol;
import java.util.Scanner;

public class factorial {
     //calcula el factorial de un numero
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce el numero el que quieres el factorial");
		int num1 =entrada.nextInt();
		int fac=1;
		for (int i=1; i<=num1; i++)
		{
			fac=fac*i;
		}
		
		System.out.println("El factor del numero " +num1 + " es " + fac);
		
		
	}

}
