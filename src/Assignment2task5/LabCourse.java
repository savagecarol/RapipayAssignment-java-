package Assignment2task5;

public class LabCourse extends CollegeCourse
{
	LabCourse(String department , String courseNumber  ,  int hours )
	{
		super(department, courseNumber, hours);
	}
	
	public int labFee = 50;
	int labCourse;
	
	public static void labDisplay(LabCourse l)
	{
		System.out.println(l.department);
		System.out.println(l.courseNumber);
		System.out.println(l.credit);
		System.out.print(50 * l.credit);
	}
	

}
