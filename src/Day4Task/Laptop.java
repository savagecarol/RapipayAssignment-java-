package Day4Task;

public class Laptop extends Device{
	@Override
	public void switchOn() {
		 System.out.println("Switching on...");
	 }
	 
	 
  public void doProcessing() {
	  System.out.println("Doing processing...");
  }
  
  public void webSurfing() {
	  System.out.println("Doing web surfing...");
  }
  
  public void fileTransfer() {
		System.out.println("Transferring file through bluetooth....");
	}

  public void videoCalling() {
		 System.out.println("Video calling through wifi");
	}
  
  @Override
  public void connect() {
	  System.out.println("Connecting with bluetooth....");
  }
  @Override
  public void switchOff() {
	  System.out.println("Switching off....");
  }
  
  
	
}
