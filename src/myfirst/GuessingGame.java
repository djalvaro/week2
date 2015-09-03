package myfirst;
import java.lang.Math;
import java.util.Scanner;
public class GuessingGame  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 	System.out.println("I'm thinking of a number from 1 to 10.");
		System.out.println("You must guess what it is in 3 tries.");
		
		int Rng = (int)(Math.random()*10+1);
		//System.out.println(Rng);
		
		
		//Scanner newScanner = new Scanner(System.in);
		 Scanner keyboard = new Scanner(System.in);
		 int NumberOfTries = 0;
         int guess;    
        	 

        	 for (int i=0; i<3; i++) { 
			        		 System.out.print("Enter a guess: ");
			
			            	 guess = keyboard.nextInt();
			        		 
			        		 if (guess == Rng)
			        		 {	   
				                  System.out.println("RIGHT!");
				                  break;
			        		 }
			
			        		 else
			        		 {
				                  System.out.println("wrong");
			        		 }   
        		
        	 }
        	 
		 	 
		System.out.println("The correct number was " + Rng);
		System.out.println("You have lost the game.");
		
		
         }
}  

