package mobiledatabase;

import java.util.Scanner;

public class trueCaller {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		mobiledata db = new mobiledata();
		long phoneNumber[] = db.getAllPhoneNumber();
		boolean isNumberAvailable = db.verofyPhoneNumber(number);
			
		for(int i = 0 ; i < phoneNumber.length ; i++)
		{
//			System.out.println((i+1) + " " + arr[i]);
		}
		
		
		System.out.println(isNumberAvailable);
	}

}
