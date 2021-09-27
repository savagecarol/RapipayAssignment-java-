package day6task1;
public class EmployeeService {

	private String employees[] = {"101001011","102001022","103002011","104003080","105002020","106002080"};

	public String[] getEmployeeCodes()
	{
		String codes[] = new String[employees.length];
		int count = -1;
		for (String empid : employees) {
			codes[++count] = empid.substring(0, 3);
		}		
		return codes;
	}
	
	public String[] getEmployeeDepartmentId()
	{
		String dep[] = new String[employees.length];
		int count = -1;
		for (String empcode : employees) {
			dep[++count] = empcode.substring(3 , 6);
		}		
		return dep;
	}
	
	
	public String[] getEmployeeCity()
	{
		String city[] = new String[employees.length];
		int count = -1;
		for (String empCity : employees) {
			String cityCode = empCity.substring(empCity.length() - 3);
			if(cityCode.equals("011"))
				city[++count] = "Delhi";
			else if(cityCode.equals("022"))
				city[++count] = "Mumbai";
			else if(cityCode.equals("080"))
				city[++count] = "Banglore";
			else if(cityCode.equals("020"))
				city[++count] = "Pune";
			else 
				city[++count] = "No City";
		}		
		return city;
	}
}
