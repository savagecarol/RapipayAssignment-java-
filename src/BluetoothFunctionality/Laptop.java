package BluetoothFunctionality;

public class Laptop {
	
	public void shareFileViaBluetooth(String fileName , String pairedDeviceName)
		{
		
			bluetooth v1 = new bluetooth()
			{ 
				@Override
				public String Sharing(String fileName, String pairedDeviceName) {
					return fileName + " shared to " + pairedDeviceName;
				}
			};
			
			if(pairedDeviceName!=null && fileName !=null && !fileName.equals(""))
			{
				System.out.println(v1.Sharing(fileName, pairedDeviceName));
			}
		}
	
	
	
	public static boolean shareNetwork(String myNet, String toDevice)
	{
	
			wifi wi = new wifi()
			{ 
				@Override
				public String networkSharing(String myNet, String toDevice) {
					return myNet + " shared to " + toDevice;
				}
			};
			if(myNet!=null && toDevice !=null )
			{
				System.out.println("sharing can be done in laptop " +  wi.networkSharing(myNet , toDevice));
				return true;
			}
			return false;

	}
	public static void videoCall()
	{
		if(shareNetwork("joi" , "mi"))
		{
			System.out.println("do video call in laptop");
		}
		else
		{
			System.out.println("not possible");
		}
	}
	
	
	
	public void doProcessing()
		{
		
		}
	
	public void playGames()
		{
		
		}
	
	
	
	
	

}
