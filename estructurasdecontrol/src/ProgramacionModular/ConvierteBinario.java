package ProgramacionModular;
import java.util.Scanner;
public class ConvierteBinario {
	public static Scanner ent= new Scanner(System.in);
	
	
	public static void main(String[] args) 
	
	{	
		int numeroDecimal=pideNumero();
		int base=pideBase(numeroDecimal);
		calculaBinario(numeroDecimal, base);
		
	}
	public static int pideNumero()
	{
		
		int num=-10;
		do
		{
			System.out.println("Introduce el numero, debe ser positivo");
			num=ent.nextInt();
		}				
		while (num<=0);
		return num;	
	}
	public static int pideBase(int numeroDecimal)
	{
		int num=-10;
		do
		{
			System.out.println("Introduce la base, debe de ser menor que el numero");
			num=ent.nextInt();
		}				
		while (num>numeroDecimal);
		return num;
	}
	public static void calculaBinario (int numeroDecimal, int base)
	{
		System.out.println("El primer numero en la base del segundo numero leido de arriba hacia abajo es:");
		do 
		{ int bin=numeroDecimal%base;
		System.out.println(bin);
		numeroDecimal=numeroDecimal/base;			
		}
		while (numeroDecimal>=base);
		System.out.println(numeroDecimal%base);

		
		
	}

}
