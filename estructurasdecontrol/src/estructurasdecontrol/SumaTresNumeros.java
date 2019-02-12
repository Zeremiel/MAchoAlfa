package estructurasdecontrol;

//Esta clase suma los tres primeros numeros naturales
public class SumaTresNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int suma = 0; //Acumulador en el que guardamos el resultado de las sumas.
			for (int cont = 1; cont <=3; cont++)
			suma = suma + cont;
			
			System.out.println("La suma es:" + suma);
	}

}
