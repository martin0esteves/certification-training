package uy.com.ocajavase8.training.martin.overloading;

public class ClassWithOverloadMethods {

	// OVERLOADED METHODS
	
	public int        contar(String s) { print("string"); return 0; }	
	public static int contar(int s) { print("int"); return 0; }
	
	
	
	public static void print(String s) {
		System.out.println(s);
	}
	
	public static void main(String args []) {
		ClassWithOverloadMethods classWithOverloadMethods = new ClassWithOverloadMethods();
		classWithOverloadMethods.contar("Martin");
		classWithOverloadMethods.contar(1);		
	}
	
}
