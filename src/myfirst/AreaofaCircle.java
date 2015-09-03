package myfirst;
import java.util.Scanner;
public class AreaofaCircle {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
	 user inputs the radius. i need to find the value of pi. 
	 area will equal radius squared times pi.
	 pi = Math.PI	
	 */
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the radius of the circle?");
		double radius;
		radius = keyboard.nextInt();
		double area_circle = Math.PI * Math.pow(radius,  2);
		System.out.println("The area of the circle is: " + area_circle);
		
		

	}

}
