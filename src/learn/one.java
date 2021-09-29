package assignment1;
import java.util.Scanner;
public class Table {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter number: "); 
	int n = sc.nextInt();
	int arr[]=new int[10];
	System.out.print("Enter starting range "); 
	int start=sc.nextInt();
	System.out.print("Enter ending no ");   
	int end=sc.nextInt();
	  int k=0;
	
	  if(end - start  > 10 )
	  {
		  System.out.println("error");
		  return;
	  }
	  
	for(int i=start; i <= end; i++)  
	{  
	   arr[k]=n*i;
	   k++;
	}  
	
	for(int i = 0 ; i < 10 ; i++)
	{
		System.out .println(arr[i]);
	}

}

}