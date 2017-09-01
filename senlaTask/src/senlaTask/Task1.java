package senlaTask;

import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Calculating prime numbers from 1 to N
 * @author      Ermak Nikita 
 * @version     1.0                 
 */
public class Task1 {
	
	final static String INPUTMESSAGE = "Enter number N";
	final static String RESULTMESSAGE = "Prime numbers up to ";
	 	
	private int primeNumbersN;
	private PrintWriter printWriter;
	
	public Task1(){
		printWriter = new PrintWriter(System.out, true);
	}
	
	public void getPrimeNumbers() {
		boolean isTrue = false; 		
		while (!isTrue) {
			try {
				printWriter.println(INPUTMESSAGE);
				Scanner scanner = new Scanner(System.in);
				primeNumbersN = scanner.nextInt();
				scanner.close();
				isTrue = true;
				}
			catch (InputMismatchException e) {
			}
		}
	}
	public void showPrimeNumbers() {
		printWriter.println(RESULTMESSAGE+primeNumbersN);
		for (int i = 2; i<=primeNumbersN; i++) {
			boolean isPrime = true;
			for (int ii=2; ii<i; ii++) 
				if (i % ii==0) {
					isPrime=false; 
					break;
				}				
			if (isPrime) printWriter.println(i);
		}	
	}
	
	public static void main(String[] args) {
		
		Task1 task1 = new Task1();
		task1.getPrimeNumbers();
		task1.showPrimeNumbers();	
	}
}
