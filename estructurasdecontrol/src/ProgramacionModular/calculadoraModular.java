package ProgramacionModular;

import java.io.IOException;
import java.util.Scanner;

public class calculadoraModular 
//No me sale bien porque se hace con un boolean para salir
{
	static Scanner ent=new Scanner(System.in);
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Como mola Sara. Adoremos todos a Sara");
		char opcion= verMenu(); 
		int Num1=introducenumeros();
		int Num2=introducenumeros();
		int calcular=CalculaNumero( opcion, Num1, Num2);
		verResultado(opcion, Num1, Num2, calcular);
		
	}
	public static char verMenu() throws IOException
	{
		char coso='o';
	
			do
			{
			System.out.println("Introduce + para sumar");
			System.out.println("Introduce - para restar");
			System.out.println("Introduce * para multiplicar");
			System.out.println("Introduce / para dividir");
			System.out.println("Introduce x para salir");
			
			(coso)=(char) System.in.read();
			if (coso=='x')
				System.out.println("Gracias por usar nuestra calculadora");

			return coso;
			}
			while (coso!='x');
				
	}
			
	
	
	public static int introducenumeros()
	{
		System.out.println("Introduce un numero");
		return ent.nextInt();		
	}
	
	public static int CalculaNumero (char opcion,int Num1, int Num2)
	{
		int resultado=0;
		switch (opcion)
		{
		case ('+'):
			resultado=(Num1+Num2);
			break;
		case ('-'):
			resultado= (Num1-Num2);
			break;
		case ('*'):
			resultado=(Num1*Num2);
			break;
		case ('/'):
			if (Num2==0)
				System.out.println("No se puede dividir entre 0");

			else
				resultado=(Num1/Num2);
		break;			
		}
		return resultado;
		}
				
	
		public static void verResultado (char opcion, int Num1, int Num2, int calcular) throws IOException
		{
			String opera="Cosa";
			if (opcion=='+')
			opera= "Sumar";
			if (opcion=='-')
			opera="Restar";
			if (opcion=='*')
			opera="Multiplicar";
			if (opcion=='/')
			opera="Dividir";
			if (opcion=='/' && Num2==0)
				System.out.println("");
			else
			System.out.println("El resultado de " + opera + " de "  + Num1 + " y " + Num2 + " es " + calcular);
						
		}
	





}
