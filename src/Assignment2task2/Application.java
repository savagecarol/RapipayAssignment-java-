package Assignment2task2;

public class Application {
	
	public static void main(String args[])
	{
		HourlyWorker h = new HourlyWorker("preet" , 2);
		SalariedWorker s = new SalariedWorker("joy" , 4);
		Worker.computePay(2, h);
		Worker.computePay(2, s);
	}

}
