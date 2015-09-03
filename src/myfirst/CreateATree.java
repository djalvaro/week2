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
   		 int row = (j+1);
   		 if (j<=tree_length)
   			System.out.println((starsRow)*(row));
   		 
   		 
   		 
   		 /*
   		  print a *
   		  next round print * times 2
   		  next round * times 3
   		  etc...
   		  */

		 }   

}
		
		

		

	}


