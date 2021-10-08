package dayxtask2;
import java.io.File;

interface Printer
{
	public void filePrinter(File[] file);
}

public class App 
{
 
	
	public static void PrintingFunc(File[] files)
	{
		try {
		      for(File file : files)
		      {
		        if(file.isFile())
		        {
		          System.out.println(file);
		        }
		      }
		    } 
		catch (Exception e)
			{
		      e.getStackTrace();
		   }
	
	}
	public void printLambda(File[] files)
	{
		Printer p = (File[] f)->{
			System.out.println("by lambda");
			App.PrintingFunc(f);
		};
		p.filePrinter(files);
	}
	

	public void printAnonymous(File[] files)
	{
		
		Printer p = new Printer()
		{
			@Override 
			public void filePrinter(File[] f)
			{
				System.out.println("by anonymus");
				App.PrintingFunc(f);	
			}
		};
		p.filePrinter(files);	  
	}
	
	
	public static void main(String[] args)
		{
	
		 App user = new App();
		 File folder = new File("F:\\my books");
		 File[] files = folder.listFiles();
		 user.printLambda(files);
		 user.printAnonymous(files);
		
		}
}





