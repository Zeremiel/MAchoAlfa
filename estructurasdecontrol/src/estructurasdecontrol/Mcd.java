package estructurasdecontrol;
import java.util.Scanner;
//Esta clase calcula el máximo común divisor de dos numeros enteros.
public class Mcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in); 
		// Introducimos los numeros por teclado tras pedirlos
		System.out.println("Introduce el primer numero");
		int num1= entrada.nextInt();		
		System.out.println("Introduce el segundo numero");
		int num2= entrada.nextInt(); 		
		// con el scanner hemos recogido los dos numeros con el metodo entrada.nextInt();
		
		while(num1 != num2) //aqui no hay que poner ;
		{
			if (num1>num2)
				num1 = num1-num2;
			else
				num2 = num2-num1;
						
		}
	

		System.out.println("El mínimo común divisor es: " + num1);


	}

}
