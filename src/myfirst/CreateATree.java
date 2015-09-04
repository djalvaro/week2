package myfirst;

import java.util.Scanner;
public class CreateATree {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 ask user the length of their tree
		 create x lines, with from 1 to x stars
		 has to be a loop, adding row & star every time
		 loop should stop when it finishes with tree_length row
		 */
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the length of your tree.");
		int tree_length;
		tree_length = keyboard.nextInt();
		String starsRow = ("*");
		
   	 for (int j=0; j<tree_length; j++) { 
	 			System.out.println("");
   		 		System.out.print(starsRow);
   			//	if (j<=tree_length)
   					for (int i=0; i<j; i++) {
		   	   		 	System.out.print(starsRow);
   						
   			//else
   			//   	break;  		
 	

		   	   	 }
   		 
   		 /*
   		  print a *
   		  next round print * + j times *
   		  etc... until arrive at inputted number
   		  */

		 }   

}
		
		

		

	}


