package Assignment2task5;

public class CollegeCourse 
{
	
	String department;
	String courseNumber;
	int credit;
	
	CollegeCourse(String department , String courseNumber  ,  int hours )
	{
		this.department = department;
		this.courseNumber = courseNumber;
		this.credit = 120 * hours;
	}
	public static void display(CollegeCourse course)
	{
		System.out.println(course.department);
		System.out.println(course.courseNumber);
		System.out.println(course.credit);
	}
	
	
}
