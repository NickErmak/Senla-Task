package senlaTask;


import java.io.PrintWriter;
import java.util.Scanner;



public class Task3 {

	public static boolean linesIntersect(double x1, double y1, double x2, double y2, 
			double x3, double y3, double x4, double y4){
	      
	      if (x1 == x2 && y1 == y2 ||
	            x3 == x4 && y3 == y4){
	         return false;
	      }
	     
	      double ax = x2-x1;
	      double ay = y2-y1;
	      double bx = x3-x4;
	      double by = y3-y4;
	      double cx = x1-x3;
	      double cy = y1-y3;

	      double alphaNumerator = by*cx - bx*cy;
	      double commonDenominator = ay*bx - ax*by;
	      if (commonDenominator > 0){
	         if (alphaNumerator < 0 || alphaNumerator > commonDenominator){
	            return false;
	         }
	      }else if (commonDenominator < 0){
	         if (alphaNumerator > 0 || alphaNumerator < commonDenominator){
	            return false;
	         }
	      }
	      double betaNumerator = ax*cy - ay*cx;
	      if (commonDenominator > 0){
	         if (betaNumerator < 0 || betaNumerator > commonDenominator){
	            return false;
	         }
	      }else if (commonDenominator < 0){
	         if (betaNumerator > 0 || betaNumerator < commonDenominator){
	            return false;
	         }
	      }
	      if (commonDenominator == 0){
	        
	         double y3LessY1 = y3-y1;
	         double collinearityTestForP3 = x1*(y2-y3) + x2*(y3LessY1) + x3*(y1-y2);   
	        
	         if (collinearityTestForP3 == 0){
	           
	            if (x1 >= x3 && x1 <= x4 || x1 <= x3 && x1 >= x4 ||
	                  x2 >= x3 && x2 <= x4 || x2 <= x3 && x2 >= x4 ||
	                  x3 >= x1 && x3 <= x2 || x3 <= x1 && x3 >= x2){
	               if (y1 >= y3 && y1 <= y4 || y1 <= y3 && y1 >= y4 ||
	                     y2 >= y3 && y2 <= y4 || y2 <= y3 && y2 >= y4 ||
	                     y3 >= y1 && y3 <= y2 || y3 <= y1 && y3 >= y2){
	                  return true;
	               }
	            }
	         }
	         return false;
	      }
	      return true;
	   }
	
	static double input(String message, Scanner scanner, PrintWriter pw) {
		pw.println(message);
	while (!scanner.hasNextDouble()) {
		scanner.next();
		pw.println(message);			
	}				
	return scanner.nextDouble();
}		
			
	public static void main(String[] args) {
		
		PrintWriter pw = new PrintWriter(System.out, true);		
		double ax1, ay1, bx1, by1, ax2, ay2, bx2, by2 ;
		String mess111 = "Введите координату X первой точки первого отрезка";
		String mess112 = "Введите координату Y первой точки первого отрезка";
		String mess121 = "Введите координату X второй точки первого отрезка";
		String mess122 = "Введите координату Y второй точки первого отрезка";
		String mess211 = "Введите координату X первой точки второго отрезка";
		String mess212 = "Введите координату Y первой точки второго отрезка";
		String mess221 = "Введите координату X второй точки второго отрезка";
		String mess222 = "Введите координату Y второй точки второго отрезка";
		
		Scanner scanner = new Scanner(System.in);
		ax1 = input(mess111, scanner, pw);
		ay1 = input(mess112, scanner, pw);
		bx1 = input(mess121, scanner, pw);
		by1 = input(mess122, scanner, pw);
		ax2 = input(mess211, scanner, pw);
		ay2 = input(mess212, scanner, pw);
		bx2 = input(mess221, scanner, pw);
		by2 = input(mess222, scanner, pw);
		scanner.close();
		
		if (linesIntersect(ax1, ay1, bx1, by1, ax2, ay2, bx2, by2))
		pw.println("отрезки пересекаются");
		else pw.println("отрезки не пересекаются");
		
	}
}
