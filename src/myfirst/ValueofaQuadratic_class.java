package myfirst;
import java.util.Scanner;

public class ValueofaQuadratic_class {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		// TODO Auto-generated method stub

		System.out.println("Please enter a value for x");
		x = input.nextDouble();
		double quad=0;
		quad= (3*Math.pow(x, 2))-(8*x)+4;
		System.out.println("At x = "+x+" the value is "+quad);
		
		
/*	double x;
	x = 0;
	double total = 3* (x * x) - (8 * x) + 4;
	
	//System.out.println(x);  
		// (5) good - it equaled 5.0
		// (5.5) good - it equaled 5.0
		// (5000) good - it equaled 5000.0
		// (-5) good - it equaled -5.0
		// (0) good - it equaled 0.0
	//System.out.println( 3* (x * x) - (8 * x) + 4);   
		//(5) good, it equaled 39.0
		//(5.5) good, it equaled 50.75
			/*   (5000) wrong, it equaled 7.4960004E7 should be 74960004
		 		why the "E"? and why the decimal placed after the first number? 
		 		i tried 500 and it worked fine. */
		//(-5) good, it equaled 119.0
		//(0) good, it equaled 4.0
	//System.out.println(total);   
		//(5) good, it equaled 39.0
		//(5.5) good, it equaled 50.75
		//(5000) wrong
		//(-5) good, it equaled 119.0
		//(0) good, it equaled 4.0
	System.out.println("at x=0 , the total is : " + total);
		//at x=5 , the total is : 39.0
		//at x=5.5 , the total is : 50.75
		//at x=5000 , the total is : wrong!
		//at x=-5 , the total is : 119.0
		//at x=0 , the total is : 4.0             */
	
	
		
	}

}
