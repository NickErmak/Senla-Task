package senlaTask;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task4 {
	
	static int input(String message, Scanner scanner, PrintWriter pw) {
			pw.println(message);
		while (!scanner.hasNextInt()) {
			scanner.next();
			pw.println(message);			
		}				
		return scanner.nextInt();
	}		
		
	 static int NOD (int i1, int i2) {	
		for (int i=2; i<=i1&&i<=i2; i++) { 
			if (i1%i==0&&i2%i==0) 
				return i*NOD(i1/i, i2/i);				
			}
		return 1;				
	}
	 
	 
	public static void main(String[] args) {
		
		PrintWriter pw = new PrintWriter(System.out, true);			
		int i1, i2;
		String mess1 = "Введите первое число";
		String mess2 = "Введите второе число";
				
		Scanner scanner = new Scanner(System.in);
		i1 = input(mess1, scanner, pw);
		i2 = input(mess2, scanner, pw);
		scanner.close();
					
		pw.println("НОД = "+NOD(i1, i2)+"\nНОК = "+ i1/NOD(i1,i2)*i2);		
	}
}
