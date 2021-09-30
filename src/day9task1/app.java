package day9task1;
import java.util.*;
public class app  
{  
    public static void main(String args[])  
    {  
        try  
        {  
        	Scanner sc = new Scanner(System.in);
        	String country = sc.nextLine(); 
        	if(country.equals("india") || country.equals("nepal") || country.equals("bhutan") || country.equals("srilanka"))
        		System.out.print("valid");
        	else
        		throw new ExceptionForCountry("This is user-defined exception");  
        }  
        catch (ExceptionForCountry e)  
        {  
           System.out.println(e.getMessage());  
           System.out.println(e);  
        }  
    }  
}  