package Assignment2task5;

import java.util.Scanner;

public class userCourse {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Department");
		String department = sc.nextLine();
		
		System.out.println("Enter course");
		String courseNo = sc.nextLine();
		
		System.out.println("Enter credit hours");
		String hours = sc.nextLine();
		
		if(department.equals("BIO") || department.equals("CHM") || department.equals("CIS") || department.equals("PHY"))
		{
			LabCourse l= new LabCourse(department , courseNo  ,  Integer.parseInt(hours));
			LabCourse.display(l);
		
		}
		else
		{
			CollegeCourse c = new CollegeCourse(department , courseNo  ,  Integer.parseInt(hours));
			CollegeCourse.display(c);
		}
		
	}

}
