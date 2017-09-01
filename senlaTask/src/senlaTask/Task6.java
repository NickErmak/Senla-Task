package senlaTask;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Deleting numbers from entered text fragment 
 * @author      Ermak Nikita 
 * @version     1.0                 
 */
public class Task6 {
	
	final static String INPUTMESSAGE = "Enter the text for editing";
	final static String RESULTMESSAGEISPALINDROME = "Text without numbers:";
	final static PrintWriter PRINTWRITER = new PrintWriter(System.out, true);
	
	private static String getTextFromConsole (){
		PRINTWRITER.println(INPUTMESSAGE);
		Scanner scanner = new Scanner(System.in);
		String textOriginal = new String (scanner.nextLine());
		scanner.close();
		return textOriginal;
	}
	
	private static String deleteNumbersFromText(String textOriginal) {
		return textOriginal.replaceAll("\\d", "");
	}
	
	private static void showTextNoNumbers(String textNoNumbers) {
		PRINTWRITER.println(RESULTMESSAGEISPALINDROME);
		PRINTWRITER.println(textNoNumbers);
	}

	public static void main(String[] args) {
		showTextNoNumbers(deleteNumbersFromText(getTextFromConsole()));		
	}
}
