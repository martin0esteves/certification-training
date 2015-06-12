package uy.com.ocajavase8.training.martin.primitewrapper;

public class PrimitiveWrapper {

	public static void main(String[] args) {
	
		Integer n = 5;
		Integer n2 = 10;
		System.out.println(String.format("Antes llamada. %s:. %s:.", n, n2));
		
		swap(n, n2);
		
		System.out.println(String.format("Despues swap. %s:. %s:.", n, n2));
		
		swap2(n, n2);
		
		System.out.println(String.format("Despues swap. %s:. %s:.", n, n2));
	}

	private static void swap2(Integer n, Integer n2) {
		n = 1;
		n2 = 2;
	}

	private static void swap(Integer n, Integer n2) {
		Integer aux = n;
		n = n2;
		n2 = aux;
	}
	
	
	
}
