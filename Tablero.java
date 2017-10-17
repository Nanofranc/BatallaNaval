import java.util.Random;

public class Tablero {


	Celda[][] tablero = new Celda[10][10];


	public Tablero() {

		for (int j = 0 ; j<tablero.length; j++) {
			for (int i = 0 ; i<tablero.length; i++) {
				tablero[j][i] = new Celda();
			}
		}
	}




	public void generaBarco(int tamaño, int posicion) {

		Random rand = new Random(); 
		int x = rand.nextInt(10);
		int y = rand.nextInt(10);
		

		if (insertaBarco(x,y,tamaño,posicion)) {
			return;
		}else generaBarco(tamaño, posicion);

		 
	}

	public boolean insertaBarco(int posX, int posY, int tamaño, int posicion) {


		int x = posX;
		int y = posY;

		for (int i = 0; i < tamaño; i++) {
			if (posicion == 1 && x+tamaño<11 && tablero[y][x+i]!=null && tablero[y][x+i].ocupado==false) {
				
			}else if (posicion == 2 && y+tamaño<11&& tablero[y+i][x]!=null && tablero[y+i][x].ocupado==false) {
				
			}else return false;
		}
		
		
		for (int i = 0; i < tamaño; i++) {
			if (posicion == 1 && x+tamaño<11 && tablero[y][x+i].ocupado==false){
				tablero[y][x+i].ocupado = true;

			}else if (posicion == 2 && y+tamaño<11&& tablero[y+i][x].ocupado==false) {
				tablero[y+i][x].ocupado = true;
			}
		}
		return true;

	}



}

