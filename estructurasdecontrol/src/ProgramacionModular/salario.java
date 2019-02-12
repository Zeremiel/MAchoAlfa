package ProgramacionModular;
import java.util.Scanner;
public class salario 
{
static Scanner ent=new Scanner(System.in);
	public static void main(String[] args)	
	//Declarar una constante en java, un dato cuyo valor no varia durante la ejecucion de un programa
	// se hace esto: final double salarioFijo = numhoras*tarifa --------------final define que el dato sera constante, el resto sigue igual
	//int horasExtra = horasTrabajadas-38

		{
		int tarifa=pedirtarifa();
		int trab=pedirnum();
		calcular(tarifa, trab);
		}
	public static int pedirtarifa()
	{	
		int Num=0;
		do
		{
		System.out.println("Introduce la tarifa ordinaria, debe ser superior a 0"); 
		Num= ent.nextInt();
		if (Num<=0)
		System.out.println("La tarifa debe ser mayor que 0");
		}
		while (Num<=0);
		return Num;
		
	}
	public static int pedirnum()
	{
		int Num=0;

		do
		{
		System.out.println("Introduce el numero de trabajadores");
		Num= ent.nextInt();
		if (Num<=0)
		System.out.println("El numero de trabajadores debe ser mayor que 0");
		}
		while (Num<=0);
		return Num;
	}
	public static void calcular (int tarif, int trab) 
	{
		for (int i=1; i<=trab; i++)
		{
			System.out.println("Introduce el numero de horas trabajadas por este trabajador");
			int horas=ent.nextInt();
			int extras=0;
				if (horas>38)
				extras=horas-38;
			int bruto=(horas-extras)*tarif+(extras*(tarif+(tarif/2)));
			int neto=0;
			int impuesto=0;
			if (bruto<600)
				neto=bruto;
			if (bruto>600 && bruto<1200)
				{
				impuesto=((bruto-600)/4)*3;
				neto=bruto-impuesto;					
				}
			if (bruto>1200)
				{
				impuesto=125+(((bruto-1200)/20)*9);
				neto=bruto-impuesto;				
				}
			System.out.println("El salario bruto de este trabajador es " +bruto+", el salario neto de este trabajador es "+neto+" los impuestos que paga este trabajador son " +impuesto);
			
		}
		
	}
}

