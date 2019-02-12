package estructurasdecontrol;

public class sumanumeros {
//suma numeros en incrementos de 4 hasta llegar a 1500 empezando por 3 lo hago con los tres bucles y comento los dos peores
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 3;
		int sumatorio =0;
		
		while (sumatorio <=1500)
		{
			sumatorio = sumatorio+contador;
			contador = contador + 4;
		}
		System.out.println ("El sumatorio es" + sumatorio);
		
		/**for (int cont2 =3; cont2<=1500; cont2=cont2+4) {
			sumatorio= sumatorio+contador;
			
		}
		System.out.println ("El sumatorio es" + sumatorio);
		 **/
	}

}
