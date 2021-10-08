package day11self;

import java.util.*;

public class Counter {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String inp = sc.nextLine();
		char a[] = inp.toCharArray();
		HashMap<Character, Integer> data = new HashMap<Character, Integer>();
		for(int i = 0 ; i < inp.length() ; i++)
		{
			 if (data.containsKey(a[i]))
			 	{
	                data.put(a[i], data.get(a[i]) + 1);
	         	}
	         else
	            {
	                data.put(a[i], 1);
	            }
		}
		data.forEach((key , value) -> {System.out.println(key + " ---> " + value);});
	}

}
