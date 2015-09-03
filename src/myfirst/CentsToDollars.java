package myfirst;
import java.util.Scanner;
public class CentsToDollars {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		request user to import cents (pennies). 
		user inputs cents.
		dollars = divide pennies by 100.
		cents = remainder (%)
		"That is " + dollars "dollars and " + cents "cents.")
		 */
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many pennies do you have in your piggy bank?");
		int pennies;
		pennies = keyboard.nextInt();
		int dollars = pennies/100;
		int cents = pennies % 100;
		
		if (dollars == 0)
			System.out.println("That is " + cents + " cents.");
		else
			System.out.println("That is " + dollars + " dollars and " + cents + " cents.");
		
		
		
		
		
		
		

	}

}
