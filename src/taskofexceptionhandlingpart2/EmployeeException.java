package taskofexceptionhandlingpart2;

public class EmployeeException extends Exception
{
	public  EmployeeException(String idNum , int payRate)
	{
		super(idNum + " -------employee not created-----" + Integer.toString(payRate));
	}

}
