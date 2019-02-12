package ProgramacionModular;
import java.util.Scanner;
public class Rectangulo 
/** Ejemplo de programación modular que calcula el area y perimetro de un rectangulo, se llaman metodos**/
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		//Introducimos la base y la altura (Estamos creando un metodo para pedir base y altura
		double altura = pedirAltura();
		double base = pedirBase();
		//calcular area y perimetro
		double area = calcularArea(base,altura); // asi le ponemos los parametros dentro del metodo que hemos creado.
		double perimetro = calcularPerimetro (base, altura);
		//ver resultads
		verResultados(area,perimetro);
		//Todo esto es el main, aqui solo deberia haber llamadas y comentarios.
	}
	//Ahora estamos fuera del main, es bueno poner una separacion despues del main para verlo
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static double pedirBase()
	{
		System.out.println("Introduce la base");
		return sc.nextDouble(); //Con return devuelve el valor que se a introducido y mas arriba donde base es igual a pedirBase base 
		//se convierte en el valor introducido. pedirBase se convierte en el valor que se devuelve.		
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static double pedirAltura()
	{
		System.out.println("Introduce la altura");
		return sc.nextDouble();//Asi hacemos lo mismo y cambiamos pedirAltura por el valor introducido
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static double calcularArea (double base, double altura) // se pone double porque asi se especifica el tipo de dato que va a devolver.
	{
		return base*altura; //Devuelveel valor de base*altura	
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static double calcularPerimetro (double base, double altura) // se pone double porque asi se especifica el tipo de dato que va a devolver.
	{
		return (base+altura)*2; //Devuelveel valor de base*altura
	}	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void verResultados(double area, double perimetro)    //es un metodo void porque no devuelve nada.
	{
		System.out.println("area =" +area);
		System.out.println("perimetro =" +perimetro);
	}
	
	
	
}
