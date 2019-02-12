package estructurasdecontrol;

import java.io.IOException;

public class dowhile2 {
		//otra version del ejercicio dowhile
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char resp;
		boolean respuestaValida=false;
		System.out.println("Introduce una N o Una S");
		do 
		{
		resp = (char) System.in.read(); //Este es el puto cast para leer un caracter como entrada, siempre da error i por eso ponemos arriba el throw IOException, se pone poniendo el cursor //sobre el error y poniendolo asi lo marca directamente		
		resp = Character.toUpperCase(resp); //esto convierte el caracter que estas metiendo en mayuscula de tal manera que es mas facil de tratar mas adelante
		respuestaValida = (resp=='S' || resp=='N');//Esto te da true implicitamente si se cumplen las condiciones
		if (respuestaValida==false)//Se podria poner (!respuestaValida), como diferente de true.
			System.out.println("Respuesta no valida");
		} while (!respuestaValida); //Esto es como poner respuestaValida==false)
	}

}
