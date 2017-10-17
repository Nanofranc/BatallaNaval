import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Tablero tablero = new Tablero();


		//tablero.insertaBarco(2,2, 2, 2);
		//tablero.insertaBarco(1,4, 2, 1);
		tablero.generaBarco(3, 1);
		tablero.generaBarco(4, 2);
		tablero.generaBarco(5, 1);

		

		for (int j = 0; j<tablero.tablero.length; j++) {
			for (int i = 0; i<tablero.tablero.length; i++) {
				if (tablero.tablero[j][i].ocupado == false) {
					System.out.print("0"+" ");

				}else  {
					System.out.print("1"+" ");
				}

			}
			System.out.println();
		}

		/*System.out.println("ingrese la cantidad de barcos");

			int cantBarcos = input.nextInt();

			 for ( int i=0; i < cantBarcos; i++) {
				 Barco buque = new Barco();

			 }*/



	}
	

}