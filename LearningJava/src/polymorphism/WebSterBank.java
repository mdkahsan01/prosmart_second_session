package polymorphism;

public class WebSterBank extends  CentralBank {
	
	public static void main(String[] args) {
		//Create an object of WebSterBank Class
		WebSterBank obj = new WebSterBank();
		//Print the interest rate
		System.out.println("The interest rate is: "+obj.homeLoanInterest());
		
	}
	//This is the Overridden method
	public double homeLoanInterest() {
		return 5.25;
	}
	
	
	

}
