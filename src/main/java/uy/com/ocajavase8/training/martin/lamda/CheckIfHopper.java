/**
 * 
 */
package uy.com.ocajavase8.training.martin.lamda;

/**
 * @author T_MartinE1
 *
 */
public class CheckIfHopper implements CheckTrait {

	/* (non-Javadoc)
	 * @see uy.com.ocajavase8.training.martin.lamda.CheckTrait#test(uy.com.ocajavase8.training.martin.lamda.Animal)
	 */
	public boolean test(Animal a) {
		// TODO Auto-generated method stub
		return a.isCanHop();
	}

}
