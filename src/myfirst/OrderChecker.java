package myfirst;
import java.util.Scanner;
public class OrderChecker {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
	 ask user for number of bolts
	 ask user for number of nuts
	 ask user for number of washers
	  
	 total = bolts x 5, nuts x 3, washers x 1	
	 print out total price in cents.
	 check the order:
	 	nuts >= bolts && washers >= 2*bolts
	 		if so, Order is OK.
	 		if not, Check the Order: too few nuts
	 	or	if not, Check the Order: too few washers
	 	or both error messages 	
	 */
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many bolts are you ordering?");
		int bolts;
		bolts = keyboard.nextInt();	
		
		System.out.println("How many nuts are you ordering?");
		int nuts;
		nuts = keyboard.nextInt();	
		
		System.out.println("How many washers are you ordering?");
		int washers;
		washers = keyboard.nextInt();	
		
			if ((nuts>=bolts) && (washers>=(2*bolts)))
				{
				System.out.println("Order is OK");
				}
			
			else if (nuts<bolts)
				{
				System.out.println("Check the Order: too few nuts");
				}
			
							
			if (washers<(2*bolts))
				{
				System.out.println("Check the Order: too few washers");
				}
			else
				{
				
				}
		
		int total = ((bolts*5) + (nuts*3) + washers);	
		System.out.println("Total cost: " + total);
		
	}

}
