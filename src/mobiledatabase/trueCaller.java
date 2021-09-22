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
		System.out.println(isNumberAvailable);
	}

}
