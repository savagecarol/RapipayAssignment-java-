package Assignment2task3;

public class Account {

	private String name;
	private int acc_no;
	private String type;
	private int balance;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAcc_no() {
		return acc_no;
	}
	
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void withdrawl(int withdraw) {
		if (getBalance()-withdraw>0){
			setBalance(getBalance()-withdraw);
		}
		else {
			System.out.println("Not enough balance");
		}
	}
	
	public void deposit(int depositMoney) {
		balance=balance+depositMoney;
	}
	
	public void display(){
		System.out.println("Balance is: "+getBalance());
	}
	
	public void updateBalance() {
	}
}
