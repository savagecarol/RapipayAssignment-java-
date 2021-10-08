package Day4Task;
import java.util.Scanner;
public class UserApp {
	
public static void main(String args[]) 
{
	
	UserApp app=new UserApp();
	
	String userChoice = "MobilePhone";
	
	switch(userChoice) {
	case "MobilePhone":
		MobilePhone mb=new MobilePhone();
		app.userAction(mb,userChoice);
		break;
		
	case "Laptop":
		Laptop laptop=new Laptop();
		app.userAction(laptop, userChoice);
		break;
		
	case "Camera":
		Camera camera=new Camera();
		app.userAction(camera, userChoice);
		break;
		
	case "Printer":
		Printer printer=new Printer();
		app.userAction(printer, userChoice);
		break;
		
		
	case "Speaker":
		Speaker speaker=new Speaker();
		app.userAction(speaker,userChoice);
		break;
		
	default:
		System.out.println(" Not Yet Implemented...");
	}
	
	
	
}
	
	
	
	
	public void userAction(Device device,String uerChoice) {
		device.switchOn();
		device.switchOff();
		
		
		if(device instanceof MobilePhone) {
			MobilePhone mobile=(MobilePhone)device;
			mobile.calling();
			mobile.gaming();
			mobile.videoCalling();
			mobile.fileTransfer();
		}
	
		
		else if(device instanceof Laptop) {
			Laptop laptop=(Laptop)device;
		    laptop.doProcessing();
		    laptop.webSurfing();
		    laptop.fileTransfer();
			
		}
		
		else if(device instanceof Camera) {
			Camera camera=(Camera)device;
			camera.takePhotos();
			camera.videoMaking();
			
		}
		
		else if(device instanceof Printer) {
			Printer printer= (Printer)device;
			printer.printout();
			printer.scanning();
		}
		
		else if(device instanceof Speaker) {
			Speaker speaker=(Speaker)device;
			speaker.connect();
			speaker.playMusic();
		}
		
	}
}

