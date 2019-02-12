package estructurasdecontrol;
import java.io.IOException;
import java.util.Scanner;

public class cuentapalabras {
//Cuenta el numero de palabras antes de un punto.
//Hay que hacerlo con un booleano para que si solo se pone un punto no de una frase de una palabra.	
	public static void main(String[] args) throws IOException 
	
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una frase que finalice en punto .");
		int cont=0;
		char frase;
		do 
		{
			frase= (char) System.in.read();
			if (frase == ' ')
			{
				cont++;
			}
		} 
		while (frase !='.'); 	
		if (cont==0)
			System.out.println("No has introducido nada");
		else
			System.out.println("La frase tiene " + (cont+1) + " palabras");

		}

}
