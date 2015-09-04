package myfirst;

public class WorkingWithArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		  add each integer in array
		 */
		
		
		int[] val = {0, 1, 2, 3};
		int sum;
		int adding;
		adding = 0;
		sum = 0;
	
	   	for (int i=0; i<val.length; i++) { 
	   		if (i<val.length)
	   			adding = adding + i;
	   		else
	   			break;
	   	}
	   		{
		sum = adding;
	   	System.out.println("Sum of all numbers = " + sum);	
	
  		
		
	 /*  		int [] numbers = { 1, 2, 3, 4, 5 ,6, 7, 8, 9 , 10 };
	   		int sum = 0;
	   		for(int i = 0; i < numbers.length; i++){
	   		    sum += numbers[i];
	   		}
	   		System.out.println("The sum is: " + sum);
		*/


	}
	}
}
