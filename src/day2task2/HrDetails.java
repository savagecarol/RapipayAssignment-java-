package day2task2;
import java.util.*;

public class HrDetails {
		
		public static void main(String args[])
		{
			inputDetails();
		}
		public static void inputDetails()
		{
			Scanner sc = new Scanner(System.in);
			int hr_reg = sc.nextInt();
			int hr_over = sc.nextInt();
			calculateHrPay(hr_reg , hr_over);
		}	
		public static void calculateHrPay(int hr_reg , int hr_over)
		{
				float hr_pay = (hr_reg * 500 ) + ( hr_over * 500 * 1.5f); 
				System.out.println("payment of hr is : " + hr_pay);
		}
}
