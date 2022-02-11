package Gestor;

public class palabra {
	
	private letra[] array;
	
	public palabra(String word) {
		
		this.array=new letra[word.length()];
		
		for (int i=0;i<word.length();i++) {
			
			array[i]=new letra (Character.toUpperCase(word.charAt(i)));
			
		}
		
	}
	public letra getletra (int i) {
		return array[i];
		
	}
	
	
	
}
