package uy.com.ocajavase8.training.martin.lamda.parser;

public class CustomParser {
	
	public interface tokenToDigit {		
		default int tokenToDigitParser(char c) {
			int digit = 0;
			switch (c) {
			case '0':
				digit = 0;
				break;
			case '1':
				digit = 1;
				break;				
			default:
				break;
			}
			return digit;
		}
	}
	
	@FunctionalInterface
	public interface ParseNum {		
		int parseNum(String s, Integer n);
	}
	
	public static void main(String... args) {
		String s = "1234567890";
		Integer n = 0;
	}
	
}
