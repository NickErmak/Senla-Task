package senlaTask;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Check two segments for intersection via coordinates
 * @author      Ermak Nikita 
 * @version     1.0                 
 */
public class Task3 {
	
	final static String INPUTMESSAGECOMMON = "Enter coordinates X and Y (via space) in the following order";
	final static String INPUTMESSAGEORDER = "The first point of the first segment\n"
			+ "The second point of the first segment\n"
			+ "The first point of the second segment\n"
			+ "The second point of the second segment";
	final static String RESULTMESSAGEDOINTERSECT = "The following segments intersect";
	final static String RESULTMESSAGENOTINTERSECT = "The following segments do not intersect";

	final static PrintWriter PRINTWRITER = new PrintWriter(System.out, true);
	
	private static boolean linesIntersect(double x1, double y1, double x2, double y2, 
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
	
	private static double[] getCoordinates() {
		PRINTWRITER.println(INPUTMESSAGECOMMON);
		PRINTWRITER.println(INPUTMESSAGEORDER);
		
		Scanner scanner = new Scanner(System.in);
		String[] inputFromConsole=  scanner.nextLine().split("\\s+");		
	    double[] coordinates =Arrays.stream(inputFromConsole).mapToDouble(Double::parseDouble).toArray();
		scanner.close();
		return coordinates;	
		}		
	
	private static boolean checkIntersection(double [] coordinates) {
		boolean doIntersect = linesIntersect(coordinates[0], coordinates[1], coordinates[2], coordinates[3], 
				coordinates[4], coordinates[5], coordinates[6], coordinates[7]);
		return doIntersect;		
	}
	
	private static void showResult(boolean doIntersect) {
		if (doIntersect)
			PRINTWRITER.println(RESULTMESSAGEDOINTERSECT);
			else PRINTWRITER.println(RESULTMESSAGENOTINTERSECT);		
	}
			
	public static void main(String[] args) {
		
		showResult(checkIntersection(getCoordinates()));			
	}
}
