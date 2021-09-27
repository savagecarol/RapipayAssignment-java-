package day6task1;

public class MainExecution {

	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeService();
		String codes[] = service.getEmployeeCodes();
		String department[] = service.getEmployeeDepartmentId();
		String city[] = service.getEmployeeCity();
		
		for(int i = 0 ; i < codes.length ; i++)
		{
			System.out.println("********* DATA of " + i +" *********");
			System.out.println(codes[i]);
			System.out.println(department[i]);
			System.out.println(city[i]);
		}
		
	}
}
