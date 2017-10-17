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




	public void generaBarco(int tama�o, int posicion) {

		Random rand = new Random(); 
		int x = rand.nextInt(10);
		int y = rand.nextInt(10);
		

		if (insertaBarco(x,y,tama�o,posicion)) {
			return;
		}else generaBarco(tama�o, posicion);

		 
	}

	public boolean insertaBarco(int posX, int posY, int tama�o, int posicion) {


		int x = posX;
		int y = posY;

		for (int i = 0; i < tama�o; i++) {
			if (posicion == 1 && x+tama�o<11 && tablero[y][x+i]!=null && tablero[y][x+i].ocupado==false) {
				
			}else if (posicion == 2 && y+tama�o<11&& tablero[y+i][x]!=null && tablero[y+i][x].ocupado==false) {
				
			}else return false;
		}
		
		
		for (int i = 0; i < tama�o; i++) {
			if (posicion == 1 && x+tama�o<11 && tablero[y][x+i].ocupado==false){
				tablero[y][x+i].ocupado = true;

			}else if (posicion == 2 && y+tama�o<11&& tablero[y+i][x].ocupado==false) {
				tablero[y+i][x].ocupado = true;
			}
		}
		return true;

	}



}

