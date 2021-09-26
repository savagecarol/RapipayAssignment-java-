package day3task2;
import java.util.*;

class ArraysWork {

	int arr[] = {15,19,6,3,74,84,62,100,20,38,415,3,74,16,15,9,650,67};		
	public void getRepeatedValues()
	{
		 Map<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i < arr.length; i++)
        {
            if (mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        	{
        		if(entry.getValue() >1)
            	System.out.print(entry.getKey() + " ");
        	}
	}
	
	public short getSum()
	{
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++)
		{
			sum = sum + arr[i];
		}
			return (short)sum;
	}
	
	public void getUniqueValues()
	{
		Map<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i < arr.length; i++)
        {
            if (mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        	{
        		if(entry.getValue()==1)
            	System.out.print(entry.getKey()+" ");
        	}
	}
}

public class ArrayMainClass {

	public static void main(String[] args) 
	{
		ArraysWork aw = new ArraysWork();
		System.out.print(aw.getSum());
		System.out.println("\n**********");
		aw.getRepeatedValues();
		System.out.println("\n**********");
		aw.getUniqueValues();
	}
}