package myfirst;
import java.util.Scanner;
public class DiscountPrices {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		/*
		 ask for price before discount
		 user gives price
		 price must be > 10
		 if <= 10, no discount, price remains ...
		 if >10, discount = price * .1
		 discounted_price = price - discount
		 */
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What was your pre-discount price?");
		
		int price;
		price = keyboard.nextInt();
		int discount = (price/10);
		int discounted_price = (price-discount);
		
		if (price<=10)
			System.out.println("No discount, price remains " + price);
		
		else
			System.out.println("Your discounted price is " + discounted_price);
		
		
	}

}
