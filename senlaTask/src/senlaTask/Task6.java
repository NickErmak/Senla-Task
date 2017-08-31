package senlaTask;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("Введите текст");
		Scanner scanner = new Scanner(System.in);
		String textOrig = new String (scanner.nextLine());
		scanner.close();
		String textNoNumbers = textOrig.replaceAll("\\d", "");
		pw.println("Текст после редакции:\n"+textNoNumbers);
	}
}
