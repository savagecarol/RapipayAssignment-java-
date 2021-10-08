package Day4Task;

public  class MobilePhone extends Device 
{
	@Override
	public void switchOn() {
		 System.out.println("Switching on...");
	 }
	 
	
	public void calling() {
		System.out.println("Calling a number....");
	}
	
	public void gaming() {
		System.out.println("Playing games....");
	}
	
	public void videoCalling() {
		 System.out.println("Video calling through wifi");
	}
	
	public void fileTransfer() {
		System.out.println("Transferring file through bluetooth....");
	}
	@Override
	public void connect() {
		System.out.println("Connecting to bluetooth...");
	}
	@Override
	 public void switchOff() {
		  System.out.println("Switching off....");
	  }
	  
	
	

}
