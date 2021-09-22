package mobiledatabase;

public class mobiledata {
	
	long phoneNumber[]= {
			             9898989898L,
						 9898989897L,
	                     9898989896L,
	                     9898989895L,
	                     9898989894L
	                     };
	
	public long[] getAllPhoneNumber(){return phoneNumber;}
	
	public boolean verofyPhoneNumber(long searchPhoneNumber)
	{
			for(int i = 0 ; i < phoneNumber.length ; i++)
			{
				if(phoneNumber[i] == searchPhoneNumber) return true;
			}
			return false;
	}
	
}
