import java.util.Random;

public class Celda {

	int x, y, largo, posicion;
	boolean ocupado = false;
	int cantTocado=0;
	
	 Random rand = new Random(); 

	public Celda() {
		
		
		this.x = rand.nextInt(10);
		this.y = rand.nextInt(10);
		
		
		
	}
public Celda(int x, int y, int largo, int posicion) {
	
	this.x = x;
	this.y = y;
	this.largo = largo;
	this.posicion = posicion;
	
	
		
	}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public int getLargo() {
	return largo;
}
public void setLargo(int largo) {
	this.largo = largo;
}
public int getPosicion() {
	return posicion;
}
public void setPosicion(int posicion) {
	this.posicion = posicion;
}
public Random getRand() {
	return rand;
}
public void setRand(Random rand) {
	this.rand = rand;
}


}
