package senlaTask;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("������� ����� ��� �������� �� \"��������������\"");
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(scanner.next());
		scanner.close();		
		
		sb.reverse();
		if (sb.toString().equalsIgnoreCase(sb.reverse().toString())) 
			pw.println("���������");
		else pw.println("�� ���������");
	}
}
