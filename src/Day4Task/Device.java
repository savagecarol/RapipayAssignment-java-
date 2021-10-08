package Day4Task;

public abstract class Device implements Wifi,Bluetooth{
    private Battery battery;
    public Device(Battery battery) {
    	super();
    	this.battery=battery;
    }
    
    public Device() {
    	super();
    }

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}
    
   public abstract void switchOn();
   public abstract void switchOff();
}

