package Day4Task;

public class Printer extends Device {
	@Override
	public void switchOn() {
		 System.out.println("Switching on...");
	 }
	 
	 
  public void printout() {
	  System.out.println("Taking printout...");
  }
  
  public void scanning() {
	  System.out.println("Scanning...");
  }
  
  public void videoCalling() {
		 
	}
	
	public void fileTransfer() {
		
	}
	@Override
	public void connect() {
		System.out.println("Connecting to Wifi...");
	}
	@Override
  public void switchOff() {
	  System.out.println("Switching off....");
  }
  
}
