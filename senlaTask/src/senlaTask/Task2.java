package senlaTask;

import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		PrintWriter pw = new PrintWriter(System.out, true);		
		
		int n=0;
		int fib1=0;
		int fib2=1;
		boolean isTrue = false;		
	
		while (!isTrue) {
			try {
				pw.println("Введите число N");
				Scanner scanner = new Scanner(System.in);
				n = scanner.nextInt();
				scanner.close();
				isTrue = true;
				}
			catch (InputMismatchException e) {
			}
		}		
		pw.println("Числа Фибоначчи до "+n+":");
		while (fib1<=n) {
			pw.println(fib1);
			fib2=fib1+fib2;
			fib1=fib2-fib1;		
		}
	}
}
