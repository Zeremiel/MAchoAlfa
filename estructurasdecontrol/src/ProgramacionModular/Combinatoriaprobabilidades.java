package ProgramacionModular;

import java.util.Scanner;

public class Combinatoriaprobabilidades 
{
	static Scanner ent=new Scanner(System.in);
	public static void main(String[] args)
	{		
		int Num1=introducenumero1();
		int Num2=introducenumero2(Num1);
		int comb=calc(Num1, Num2);		
		verresultado(comb);
	}
	
	public static int introducenumero1()
	{	
		int Numero=0;
		do
		{
		System.out.println("Introduce un numero mayor que 0");
		Numero= ent.nextInt();
		if (Numero<0)
		System.out.println("El numero es menor que 0");
		}
		while (Numero<0);					
			return ent.nextInt();
	}
	public static int introducenumero2(int Num1)
		{	
		int Numero=0;
		do
			{
		System.out.println("Introduce un numero mayor que 0 y menor que el primer numero");
		Numero= ent.nextInt();
		if (Numero<0)
		System.out.println("El numero es menor que 0");
		if (Numero<Num1)
		System.out.println("El numero es menor que " +Num1);	
			}
		while (Numero<0 || Numero<Num1);					
			return ent.nextInt();
		}
	
	public static int calc (int Num1, int Num2) 
		{
		int Resultado=Calculafactorial(Num1)/Calculafactorial(Num2)-(Calculafactorial (Num1-Num2));		
		return Resultado;
	
		}
	public static int Calculafactorial(int numero)
	{
		int fac=1;
		for (int i=1; i<=numero; i++)
		{
			fac=fac*i;
		}
		return fac;
	}
	public static void verresultado(int comb)
	{
		System.out.println("El resultado es " + comb);
		
		
		
	}
}
		
	

