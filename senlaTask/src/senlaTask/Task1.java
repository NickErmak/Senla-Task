package senlaTask;

import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
	 	
	public static void main(String[] args) {
		
		PrintWriter pw = new PrintWriter(System.out, true);	
		boolean isTrue = false; 
		int n=0;
				
		while (!isTrue) {
			try {
				pw.println("¬ведите число N");
				Scanner scanner = new Scanner(System.in);
				n = scanner.nextInt();
				scanner.close();
				isTrue = true;
				}
			catch (InputMismatchException e) {
			}
		}
			
							
			for (int i = 2; i<=n; i++) {
				boolean prost = true;
				
				for (int ii=2; ii<i; ii++) {
					if (i % ii==0) {prost=false; break;}
					
				}
				if (prost) pw.println(i);
			}
			
	}

}
