package myfirst;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		long hoursWorked;
		double payRate;
		//double taxRate;
		
		hoursWorked = 40;
		payRate = 10.0;
		double taxRate = 0.10;
		
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("pay Amount : " + (hoursWorked * payRate));
		System.out.println("tax Amount: " + (hoursWorked * payRate * taxRate));
		
		// removing one of the variables = no good - unknown declaring!
		//removing one of the iniitializations = no good - not initialized!
				
		// problems arise when there's incomplete information.
		

	}

}
