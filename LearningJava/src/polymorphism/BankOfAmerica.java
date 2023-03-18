package polymorphism;

public class BankOfAmerica extends  CentralBank {
	
	public static void main (String[] args) {
		
		BankOfAmerica intrate = new BankOfAmerica();
		System.out.println("The interest rate is: "+intrate.homeLoanInterest());
		
	}  
	
	
	public double homeLoanInterest() {
		return 5.0;
	}
	

}
