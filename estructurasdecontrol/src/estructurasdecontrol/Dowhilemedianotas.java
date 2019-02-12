package estructurasdecontrol;
import java.util.Scanner;

public class Dowhilemedianotas {
/*Esta clase coge las notas que se asignan, las suma y devuelve la media, pero si se introduce -99 sale del bucle
Necesitamos las giuientes variables:
Contador para saber cuantas notas hay que poner.
Nota variable para guardar la nota.
Acumulador para guardar la suma.
Salir es un boolean para salir del bucle
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in); 
		int numeronotas=0;
		double acumuladonotas=0;
        boolean salir = false; // es un boolean para salir del bucle;
		do
		{
		System.out.println("Introduce la nota, pon -99 para salir");
		double nota= entrada.nextDouble();
		numeronotas=numeronotas+1;	
		acumuladonotas= acumuladonotas+nota;
		if (nota==-99)
		{			
		 salir=true;
			System.out.println("Gracias por usar este programa");

		};
		if (salir==false)
			System.out.println("La nota media es " + acumuladonotas/numeronotas);
		
				
	}while(salir==false);
	}

}
