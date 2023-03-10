package encapsulation;

public class Bank {
	
	int accountNumber = 12345678;
	private int pinNumber = 1234;
	private double balance = 150000;
	
	public void drawMoney(int acNo, int pinNo, int amount) {
		
		if(acNo==accountNumber && pinNo==pinNumber) {
			
			if(amount<=balance) {
						
			balance = balance-amount;
			
			System.out.println("Amount withdrawn: "+amount);
			}else {
				System.out.println("Insufficiant Balance");
			}
			
		}else {
			System.out.println("Invalid Credintals");			
		}
		
	}
	
	
	
		public void updatePin(int accountNumber, int oldPin, int newPin) {
			
			
			
		}
		
		
		
		
		
		public int getPinNumber() {
			return pinNumber;
		}
		public void setPinNumber(int pinNumber) {
			this.pinNumber = pinNumber;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public int getAccountNumber() {
			return accountNumber;
		}
	
	
}
