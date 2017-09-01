package senlaTask;

import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Calculating Fibonacci numbers from 1 to N
 * @author      Ermak Nikita 
 * @version     1.0                 
 */
public class Task2 {
	
	final static String INPUTMESSAGE = "Enter number N";
	final static String RESULTMESSAGE = "Fibonacci numbers up to ";

	private static PrintWriter printWriter = new PrintWriter(System.out, true);		
	private static int getFibonacciNumberN() {
		int FibonacciNumberN=-1;
		boolean isTrue = false;		
		while (!isTrue) {
			try {
				printWriter.println(INPUTMESSAGE);
				Scanner scanner = new Scanner(System.in);
				FibonacciNumberN = scanner.nextInt();
				scanner.close();
				isTrue = true;
				}
			catch (InputMismatchException e) {
			}
		}	
		return FibonacciNumberN;
	}
	private static void showFibonacciNumbers(int FibonacciNumberN) {
		int firstFibonacciNumber=0;
		int secondFibonacciNumber=1;
		printWriter.println(RESULTMESSAGE+FibonacciNumberN);
		while (firstFibonacciNumber<=FibonacciNumberN) {
			printWriter.println(firstFibonacciNumber);
			secondFibonacciNumber=firstFibonacciNumber+secondFibonacciNumber;
			firstFibonacciNumber=secondFibonacciNumber-firstFibonacciNumber;		
		}
	}
	
	public static void main(String[] args) {				
		showFibonacciNumbers(getFibonacciNumberN());
	}
}
