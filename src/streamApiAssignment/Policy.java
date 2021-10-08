package streamApiAssignment;

public class Policy {
	
	int policyNumber;
	String policyName;
	int premiumAmount;
	int sumAssuredAmount;
	public Policy(int policyNumber, String policyName, int premiumAmount, int sumAssuredAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policyName = policyName;
		this.premiumAmount = premiumAmount;
		this.sumAssuredAmount = sumAssuredAmount;
	}
	@Override
	public String toString() {
		return "Policy [policyNumber=" + policyNumber + ", policyName=" + policyName + ", premiumAmount="
				+ premiumAmount + ", sumAssuredAmount=" + sumAssuredAmount + "]";
	} 

}
