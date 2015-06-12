package uy.com.ocajavase8.training.martin.controlflow;

public class BreakWithLabel {
	public static void main(String args[]) {

		int n = 0;

		outterSwitch: switch (n) {

		case 0:
			System.out.println("outter 0");
			
			switch (n) {
			case 0:
				System.out.println("0");

				break;
				// break outterSwitch;
				// break;
			case 1:
				System.out.println("1");
				break;
			default:
				System.out.println("default");
				break;
			}

		case 1:
			System.out.println("outter 1");
		}

		System.out.println("exit");

	}

}
