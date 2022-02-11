package Gestor;

import java.util.Scanner;

public class gestor {
	
	palabra p1;
	palabra p2;
	
	String clave;
	
	private Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		gestor wordle=new gestor("algo");
	}
	
	public gestor(String palabraClave) {
		
		clave=palabraClave;
		
		System.out.println("Que palabra quieres probar teniendo en cuenta que la longitud de la palabra a adivinar es : "+palabraClave.length());
		String n=teclado.nextLine();
		
		p1=new palabra(n);
		p2=new palabra(palabraClave);
		
		
		for (int i=0;i<palabraClave.length();i++) {
			if (p1.getletra(i)==p2.getletra(i) ) {
				p1.getletra(i).setposicion(true);
			}
			else if(p1.getletra(i)==recorrer(i)) {
				
			}
		}
	}
	
	public letra recorrer(int j) {//Me da un problema de incompatibilidad que no se solucionar
		
		letra a;
		
		for (int i=0;i<clave.length();i++) {
			
			if (p1.getletra(j)==p2.getletra(i)) {
				a=p1.getletra(j);
				return a;
			}
			else {
				a=p1.getletra(i);
				return a;
			}
			
		}
	}

}
