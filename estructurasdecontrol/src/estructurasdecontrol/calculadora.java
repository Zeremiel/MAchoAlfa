package estructurasdecontrol;

import java.io.IOException;
import java.util.Scanner;

public class calculadora 
{
//esta clase es una mini calculadora
	//Esto pertenece a la practica 6 de ENDE, vladi es un macho Alfa total.
	public static void main(String[] args) throws IOException 
	{
		Scanner entrada = new Scanner(System.in); 
		char operacion;
		do 
		{
			System.out.println("elige si quieres sumar (+), restar(-), multiplicar(*), dividir(/) o salir de la calculadora (=)");
			operacion= (char) System.in.read();
			if (operacion !='+' && operacion !='-' && operacion !='*' && operacion !='/' && operacion !='=')
			System.out.println("elige una opción válida");
		} 
		
		while (operacion !='+' && operacion !='-' && operacion !='*' && operacion !='/' && operacion !='=');
		if (operacion!='=')
		{
		
		System.out.println("Introduce el primer numero");
		int resultado=0;
		int num1= entrada.nextInt();
		System.out.println("Introduce el segundo numero");
		int num2= entrada.nextInt();
		
		
		switch (operacion)
		{
		case ('+'):
			resultado=(num1+num2);
			break;
		case ('-'):
			resultado= (num1-num2);
			break;
		case ('*'):
			resultado=(num1*num2);
			break;
		case ('/'):
			if (num2==0)
				System.out.println();

			else
				resultado=(num1/num2);
		break;			
		}
		
		if (operacion=='/' && num2==0)
			System.out.println("No se puede dividir entre cero");
		else
		System.out.println("El resultado es" +resultado);
		}
		else System.out.println("Gracias por usar nuestra calculadora");

}
	}
