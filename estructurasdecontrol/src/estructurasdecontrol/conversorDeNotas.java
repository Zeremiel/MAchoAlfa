package estructurasdecontrol;
import java.io.IOException;
import java.util.Scanner;
public class conversorDeNotas {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in); 
		int NotaNumerica = 0;
		// Sentencia de entrada para guardar la nota en letra. Vamos decirle al usuario que meta la nota 
		System.out.println("Introduce la nota I, A, F, B, N, S");
		char NotaAlfabetica = (char) System.in.read(); //Asi hacemos un cast para convertir el char en int, como puede dar un error hemos puesto arriba throws IOException para que compile porque puede dar problemas.
		boolean notaCorrecta= true;
		switch (NotaAlfabetica)
			{
			case 'I':								//Como I es un caracter requiere comillas simples
				NotaNumerica = 4;
				break;
			case 'A':								//Como I es un caracter requiere comillas simples
				NotaNumerica = 5;
				break;
			case 'F':								//Como I es un caracter requiere comillas simples
				NotaNumerica = 6;
				break;
			case 'B':								//Como I es un caracter requiere comillas simples
				NotaNumerica = 7;
				break;
			case 'N':								//Como I es un caracter requiere comillas simples
				NotaNumerica = 8;
				break;
			case 'S':								//Como I es un caracter requiere comillas simples
				NotaNumerica = 9;
				break;
			default: System.out.println("La nota introducida no es correcta");
					notaCorrecta= false;
			
			
							
			}
		if (notaCorrecta)
		System.out.println("La nota numerica es " + NotaNumerica);	
		
		
		
	}

}
