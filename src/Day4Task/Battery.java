package Day4Task;

public class Battery {
	private final int MAX_POWER=100;
	private int currentPower;
	public Battery() {
		
	}
	public int getCurrentPower() {
		return currentPower;
	}
	public void setCurrentPower(int currentPower) {
		this.currentPower = currentPower;
	}
	
	
	public int getMAX_POWER() {
		return MAX_POWER;
	}
	
	
	public void plugin() {
		if(currentPower<MAX_POWER) {
			currentPower++;
		}
	}
	

}
