package estructurasdecontrol;

import java.io.IOException;

public class dowhile {
	//vamos a hacer algo con una estructura do-while, se pide por teclado una respuesta 
	//sabiendo que son validas la s y la n, si no es valido la vuelve a pedir
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char resp;
		System.out.println("Introduce una N o Una S");
		do 
		{
		resp = (char) System.in.read(); //Este es el puto cast para leer un caracter como entrada, siempre da error i por eso ponemos arriba el throw IOException, se pone poniendo el cursor //sobre el error y poniendolo asi lo marca directamente		
		resp = Character.toUpperCase(resp); //esto convierte el caracter que estas metiendo en mayuscula de tal manera que es mas facil de tratar mas adelante
		if (resp != 'S'&& resp != 'N')
			System.out.println("Respuesta no valida");
		} while (resp != 'S'&& resp != 'N');
		
	}
// La siguiente linea salta dos caracteres en el buffer de teclado //system.int.skip(2);
}
