package Gestor;

public class letra {
	
	private boolean existe;
	private boolean posicion;
	private char a;
	
	public letra(char a) {
		this.a=a;
		existe=false;
		posicion=false;
	}
	
	public char geta() {
		return a;
	}
	
	public boolean getexiste() {
		return existe;
	}
	
	public boolean getposicion() {
		return posicion;
	}
	
	public void setexiste (boolean existe) {
		this.existe=existe;
	}
	
	public void setposicion(boolean posicion) {
		this.posicion=posicion;
	}
}
