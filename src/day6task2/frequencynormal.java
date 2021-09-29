package day6task2;

import java.util.*;
public class frequencynormal {
	
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine(); // input
	int n = str.length(); 
	int[] freq = new int[26];   // otherwise give out of bond error for safety use 26 or 256
    for (char word : str.toCharArray())
        freq[word - 'a']++;

    for (char word : str.toCharArray()) // because this only traverse array not strings
    {
        if (freq[word-'a'] != 0) {
            System.out.println(word +" : " +freq[word-'a']);
            freq[word - 'a'] = 0;
        }
    }

	}
}
