package senlaTask;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Checking the word on Palindrome 
 * @author      Ermak Nikita 
 * @version     1.0                 
 */
public class Task5 {
	
	final static String INPUTMESSAGE = "\"Palindrome\" checkout\nEnter the word";
	final static String RESULTMESSAGEISPALINDROME = "The current word is a \"Palindrome\"";
	final static String RESULTMESSAGEISNOTPALINDROME = "The current word is not a \"Palindrome\"";
	
	final static PrintWriter PRINTWRITER = new PrintWriter(System.out, true);
			
	private static StringBuilder getWordFromConsole() {
		PRINTWRITER.println(INPUTMESSAGE);
		Scanner scanner = new Scanner(System.in);
		StringBuilder wordFromConcole = new StringBuilder(scanner.next());
		scanner.close();
		return wordFromConcole;
	}
	
	private static void palindromeCheckout(StringBuilder stringBuilder) {
		if (stringBuilder.toString().equalsIgnoreCase(stringBuilder.reverse().toString())) 
			PRINTWRITER.println(RESULTMESSAGEISPALINDROME);
		else PRINTWRITER.println(RESULTMESSAGEISNOTPALINDROME);
	}

	public static void main(String[] args) {
		
		palindromeCheckout(getWordFromConsole());		
		
	}
}
