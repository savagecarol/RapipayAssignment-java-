package Assignment2task3;

public class Sav_acc extends Account {
	
	int interest=1;
	
	public Sav_acc() {
	}
	
	
	public void calculateInterest() {
		setBalance((int)(getBalance()+(float)(1+(interest/100))));
	}
		
		public void issueCheque() {
			System.out.println("Cheque book will not be issued to you because you use a saving account");
		}
		
		public void penalty() {
			System.out.println("No penalty because it is saving account");
		}
}

