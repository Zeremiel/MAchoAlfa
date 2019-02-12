package estructurasdecontrol;
import java.util.Scanner;

public class llamada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in); 
		System.out.println("¿Cuanto dura la llamada?");
		int num1= entrada.nextInt();
		if (num1<=3) 
		{
		System.out.println("La llamada cuesta 20 centimos");

		}
		else 		
			System.out.println("La llamada cuesta " + (20+((num1-3)*15)) + " Centimos");

	}

}
