package mob;
import java.util.*;

// model 

public class Device
{

	private String deviceName;
	private String modelNumber;
	private String cost;
	private String avgRating;
	private String brandName;
	
	public Device(String deviceName, String cost, String avgRating,String brandName)  // no return type // class name // defualt values
	{
		this.deviceName = deviceName;
		this.modelNumber = getAlphaNumericString();
		this.cost = cost;
		this.avgRating = avgRating;
		this.brandName = brandName;
	}
	
	static String getAlphaNumericString()
    {
		int n = 6;
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) 
        {
            int index= (int)(AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(String avgRating) {
		this.avgRating = avgRating;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	
}

