package senlaTask;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Recursive algorithm for calculating Greatest common divisor (GCD) 
 * and Least common multiple (LCM) of two numbers
 * @author      Ermak Nikita 
 * @version     1.0                 
 */
public class Task4 {
	
	final static String INPUTMESSAGEFIRSTNUMBER = "Enter the first number";
	final static String INPUTMESSAGESECONDNUMBER = "Enter the second number";
	final static String RESULTMESSAGEGSD = "Greatest common divisor = ";
	final static String RESULTMESSAGELCM = "Least common multiple = ";
	
	private PrintWriter printWriter;
	private int firstNumber;
	private int secondNumber;
	
	public Task4(){
		printWriter = new PrintWriter(System.out, true);
		firstNumber = getNumberFromConsole(INPUTMESSAGEFIRSTNUMBER);
		secondNumber = getNumberFromConsole(INPUTMESSAGESECONDNUMBER);
	}
		
	private int getNumberFromConsole(String inputMessage) {
		Scanner scanner = new Scanner(System.in);
		printWriter.println(inputMessage);
		while (!scanner.hasNextInt()) {
			scanner.next();
			printWriter.println(inputMessage);			
		}		
		return scanner.nextInt();
	}		
		
	private int getGCD (int firstNumber, int secondNumber) {	
		for (int i=2; i<=firstNumber&&i<=secondNumber; i++) { 
			if (firstNumber%i==0&&secondNumber%i==0) 
				return i*getGCD(firstNumber/i, secondNumber/i);				
			}
		return 1;				
	}
	
	private int getLCM (int firstNumber, int secondNumber) {		
		return firstNumber/getGCD (firstNumber, secondNumber)*secondNumber;
	}
	 
	private void showNodNok() {
		 printWriter.print(RESULTMESSAGEGSD);
		 printWriter.println(getGCD(firstNumber, secondNumber));
		 printWriter.print(RESULTMESSAGELCM);
		 printWriter.println(getLCM(firstNumber, secondNumber));
	}
	 
	public static void main(String[] args) {
		
		Task4 task4 = new Task4();
		task4.showNodNok();				
	}
}
