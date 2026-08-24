package test;
class BankAccount {

int accountnumber;
String accountholder;;
double balance;
//parameterized constructor
public BankAccount(int accountnumber,String accountholder,double balance ) {
	this.accountnumber = accountnumber;
	this.accountholder = accountholder;
	this.balance = balance;
}
	// getter methods
	public int getaccountnumber() {
		return accountnumber;
	}
	public String getaccountholder() {
		return accountholder;
	}
	public double getbalance() {
		return balance;
	}
	//setter method
	public void setbalance(double balance) {
		this.balance = balance;
	}
		//deposit
		public void deposit(double amount) {
			balance = balance+amount;
			System.out.println("deposited amount" +amount);
		}
		
			
		// Withdraw Method
	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance = balance - amount;
	            System.out.println("Withdrawn Amount: " + amount);
	        } else {
	            System.out.println("Insufficient balance");
	        }
	    }
	
}






































