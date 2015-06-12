/**
 * 
 */
package uy.com.ocajavase8.training.martin.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author T_MartinE1
 *
 */
public class SearchAnimal {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("horse", true, true));
		animals.add(new Animal("bunny", true, true));
		animals.add(new Animal("turtle", false, true));
		animals.add(new Animal("ant",true, false));

		System.out.println("SIN LAMDA");
		SearchAnimal.print(new CheckIfHopper(), animals);
		
		System.out.println("CON LAMDA");
		SearchAnimal.print(a -> a.isCanHop(), animals);
	}
	
	/**
	 * Using interface
	 * 
	 * @param checker
	 * @param animals
	 */
	public static void print(CheckTrait checker, List<Animal> animals) {
		for (Animal a : animals) {
			if (checker.test(a)) {
				System.out.println(a.toString());
			}
		}
	}
	
	/**
	 * Using Predicate
	 * 
	 * @param checker
	 * @param animals
	 */
	public static void print2(Predicate<Animal> checker, List<Animal> animals) {		
		for (Animal a : animals) {
			if (checker.test(a)) {
				System.out.println(a.toString());
			}
		}
	}

}
