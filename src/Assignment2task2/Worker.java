package Assignment2task2;

public class Worker {
	
	String name;
	int rate;
	Worker(String name , int rate)
	{
		this.name = name;
		this.rate = rate;
		
	}
	
	public static void computePay(int hour , HourlyWorker h)
	{
		if(hour < 40)
			System.out.println("all info " + h.name + " " + h.rate + " " + hour * h.rate);
		else 
			System.out.println("all info " + h.name + " " + h.rate + " " + hour * h.rate * 2);
	}
	public static void computePay(int hour , SalariedWorker s)
	{
		System.out.println("all info " + s.name + " " + s.rate + " " + hour * s.rate);
	}

}
