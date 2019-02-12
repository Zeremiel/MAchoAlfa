package ProgramacionModular;
import java.util.Scanner;
public class calendariGgregoriano 
{
	
public static Scanner ent=new Scanner(System.in);
	public static void main(String[] args) 
	{
		arrancaAplicacion();

	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public static void arrancaAplicacion()
	{  
	   int mes=pedirMes();
	   int año=pedirAño();
	   int dia=pedirDia();
	   validarFecha(mes, año, dia);
	   
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int pedirMes()
	{
		
		System.out.println("Introduce el mes, debe ser superior a 0 e inferior a 13");
		return ent.nextInt();		
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int pedirAño()
	{
		
		System.out.println("Introduce el año, debe ser superior a 1582");
		return ent.nextInt();		
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int pedirDia()
	{

		System.out.println("Introduce el dia, debe ser superior a 0");
		return ent.nextInt();		
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void validarFecha(int mes, int año, int dia)
	{
		boolean añoBisiesto=false;
		if((año %4 ==0)&&(año %100!=0)||(año %400==0))
			añoBisiesto=true;
		
		boolean fechavalida=true;		
		if (mes<1 || mes>12)
			fechavalida=false;
			
			if (año<1582)
				fechavalida=false;
				switch (mes)
				{
				case 1: if (dia<1||dia>31)
				fechavalida=false;
				break;
				case 2: if (añoBisiesto==true)
							{if (dia<1 || dia>29)
								fechavalida=false;
							break;
							}
						else
							if(dia<1 || dia>28)
								fechavalida=false;
							break;
				
				case 3: if (dia<1||dia>31)
				fechavalida=false;
				break;
				case 4: if (dia<1||dia>30)
				fechavalida=false;
				break;
				case 5: if (dia<1||dia>31)
				fechavalida=false;
				break;
				case 6: if (dia<1||dia>30)
				fechavalida=false;
				break;
				case 7: if (dia<1||dia>31)
				fechavalida=false;
				break;
				case 8: if (dia<1||dia>31)
				fechavalida=false;
				break;
				case 9: if (dia<1||dia>30)
				fechavalida=false;
				break;
				case 10: if (dia<1||dia>31)
				fechavalida=false;
				break;
				case 11: if (dia<1||dia>30)
				fechavalida=false;
				break;
				case 12: if (dia<1||dia>31)
				fechavalida=false;
				break;
				//Los case no tienen porque ir seguidos en orden, pueden agruparse todos los casos iguales para solo ocupar una linea 
				//en el caso final ya que todos llegaran a ese caso, por ejemplo los case 7,8,10,12,3,5 y 1 podrian ponerse todos de golpe y en el 
				//ultimo de ellos poner la condicion porque todos esos meses tienen 31 dias.
				}
		if (fechavalida==true)
			System.out.println("La fecha introducida es el año " +año+" el mes "+mes+" y el dia " +dia);
		else 
			{
			System.out.println("La fecha introducida no es valida");
			arrancaAplicacion();
			}
	}
}
