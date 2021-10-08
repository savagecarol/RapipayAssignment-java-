package week2Task;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import Assignment1.Account;


class WrongPhoneNumberException extends Exception
{
	WrongPhoneNumberException(String args)
	{
		super(args);
	}
}


class InvalidPhoneNumberException extends Exception
{
	InvalidPhoneNumberException(String args)
	{
		super(args);
	}
}

public class PhoneBookApp {
	static Scanner sc = new Scanner(System.in);
	Map<String, List<Long>> phoneBook = new HashMap<>();

	public static void main(String args[]) {
		PhoneBookApp user = new PhoneBookApp();
		while (true) {

			System.out.println("********** MY PHONE BOOK ***********");
			System.out.println();
			System.out.println("Add a phone Numbers : press 1");
			System.out.println("update a phone Numbers : press 2");
			System.out.println("search by phone Number : press 3");
			System.out.println("Search by username : press 4");
			System.out.println("download a phone book :  press 5");
			System.out.println("exit : press 6");
			System.out.println("Choose Options :");
			System.out.println();

			int options = Integer.parseInt(sc.nextLine());
			String userName;
			Long phoneNumber;

			switch (options) {
			case 1:
				user.infoInput();
				break;

			case 2:
				System.out.println("enter username");
				userName = sc.nextLine();
				System.out.println("enter phone number");
				phoneNumber = Long.parseLong(sc.nextLine());
				user.updatePhoneNumber(userName,phoneNumber);
				break;
		
				

			case 3:
				System.out.println("enter the phone Number that you want to search");
				phoneNumber = Long.parseLong(sc.nextLine());
				String value = user.searchUser(phoneNumber);
				System.out.println(value);
				break;

			case 4:
				System.out.println("enter the username that you want to search");
				userName = sc.nextLine();
				List<Long> num = user.getPhoneNumbers(userName);
				if(num!=null)
				System.out.println("all the numbers of " + userName + " " + num);
				break;

			case 5:
				System.out.println("enter the username that you want download");
				userName = sc.nextLine();
				user.downloadPhoneNumbersInFile(userName);
				break;

			case 6:
				System.exit(0);

			default:
				System.out.println("Please choose the correct option");
				break;

			}

		}

	}

	public  boolean isVaildNumber(long phoneNumber)
	{
		try
		{
			String phone = String.valueOf(phoneNumber);
			if (phone.length() == 10 && (phone.charAt(0) == '7' || phone.charAt(0) == '8' || phone.charAt(0) == '9'))
			{
				return true;
			}
			else
			{
				throw new InvalidPhoneNumberException(" Number is Not Valid : please enter valid number this time ");
			}
		}
		catch(InvalidPhoneNumberException e)
		{
				System.out.println(e);
		}
		return false;
	}

	public void infoInput()
	{
		System.out.println("Enter the username");
		String userName = sc.nextLine();
		System.out.println("Enter the numbers you want to input");
		int totalInput = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < totalInput; i++) {

			System.out.println("Enter number " + (i + 1));
			long number = Long.parseLong(sc.nextLine());
				if (isVaildNumber(number)) 
					{
					insertPhoneNumber(userName, number);
					}
		}

	}

	public void insertPhoneNumber(String userName, long phoneNumber) 
	{
		List<Long> a;
		if (phoneBook.containsKey(userName)) {
			a = phoneBook.get(userName);
		} else {
			a = new ArrayList<Long>();
		}
		a.add(phoneNumber);
		phoneBook.put(userName, a);
		System.out.println("phone number added");
	}

	public void updatePhoneNumber(String username, long newPhoneNumber)
	{
		List<Long> allNumber = getPhoneNumbers(username);
		if(allNumber == null)
			System.out.println("user not found");
		else
		{
			System.out.println("enter the index you want to update");
			for(int i = 0 ; i < allNumber.size() ; i++)
			{
				System.out.println(allNumber.get(i) + " press (i+1)" );
			}
			int option = Integer.parseInt(sc.nextLine());
			allNumber.set( option-1 , newPhoneNumber);
			phoneBook.put(username, allNumber);
		}
	
	}

	public String searchUser(Long phoneNumber)
	{
		try 
		{
			for (String name : phoneBook.keySet())
				{
					if (phoneBook.get(name).contains(phoneNumber))
						return name + " user found";
				}
				throw new WrongPhoneNumberException(" user not found ");	
		}
		catch(WrongPhoneNumberException e)
		{
			System.out.println(e);
		}
		return null;
	}

	public List<Long> getPhoneNumbers(String username) {
		if (phoneBook.containsKey(username))
			return phoneBook.get(username);
		return null;
	}

	public void downloadPhoneNumbersInFile(String username) {

		String BASE_PATH = "C:\\Users\\dell\\Documents\\workspace-spring-tool-suite-4-4.10.0.RELEASE\\corejava-salary\\src\\week2Task\\";

		try {	
			List<Long> allNumber = getPhoneNumbers(username);
			if (allNumber != null) {
				File myObj = new File(BASE_PATH + username + ".txt");
				
				 if (myObj.createNewFile()) {
				        System.out.println("File created: " + myObj.getName());
				      } else {
				        System.out.println("File updating");
				      }
				 		
				for (long a : allNumber) {
					BufferedWriter out = new BufferedWriter(new FileWriter(BASE_PATH + username + ".txt", true));
					out.write(String.valueOf(a) + "\n");
					out.close();
				}
				System.out.println("data in " + username + ".txt");
				
			} else {
				System.out.println("username not found");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}
}
