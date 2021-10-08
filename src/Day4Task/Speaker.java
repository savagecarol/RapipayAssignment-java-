package Day4Task;

public class Speaker extends Device{
	@Override
	public void switchOn() {
		 System.out.println("Switching on...");
	 }
	 
	  
	public void playMusic() {
		System.out.println("Playing Music...");
	}
	
	@Override
	public void connect() {
		System.out.println("Connecting with bluetooth...");
	}
	
	public void videoCalling() {
		 System.out.println("Video calling through wifi");
	}
	
	public void fileTransfer() {
		System.out.println("Transferring file through bluetooth....");
	}
	
	@Override
	public void switchOff() {
		  System.out.println("Switching off....");
	  }
   
}
