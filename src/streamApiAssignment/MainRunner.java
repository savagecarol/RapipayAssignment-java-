package streamApiAssignment;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class MainRunner {
	
	ArrayList<Account> accounts = new ArrayList<Account>();	
	MainRunner()
	{
		
		ContactDetails  c1 = new ContactDetails("london" ,"bro" ,99999999  , "p@gmail.com");
		ContactDetails  c2 = new ContactDetails("london"  ,"bro" , 99999999 , "q@gmail.com");
		ContactDetails  c3 = new ContactDetails("new york" ,"kha" , 99999999 , "r@gmail.com");
		ContactDetails  c4 = new ContactDetails("texas"  ,"lo" , 99999999 , "s@gmail.com");
		ContactDetails  c5 = new ContactDetails("las vegas" ,"na" , 99999999 , "t@gmail.com");
		
		Policy  p1 = new Policy(1 ,"pa" ,3,1000);
		Policy  p2 = new Policy(2 ,"pb" ,4,2000);
		Policy  p3 = new Policy(3 ,"pc" ,5,3000);
		Policy  p4 = new Policy(4 ,"pd" ,4,4000);
		Policy  p5 = new Policy(5 ,"pe" ,5,5000);
		
		List<Policy> policy1  = new ArrayList<Policy>();
		List<Policy> policy2  = new ArrayList<Policy>();
		List<Policy> policy3  = new ArrayList<Policy>();
		List<Policy> policy4  = new ArrayList<Policy>();
		List<Policy> policy5  = new ArrayList<Policy>();
		
		Collections.addAll(policy1, p1 , p2);
		Collections.addAll(policy2, p2 , p1);
		Collections.addAll(policy3, p3 , p3);
		Collections.addAll(policy4, p4 , p4);
		Collections.addAll(policy5, p5 , p2);
		
		Account  a1 = new Account(1 ,"A" ,100, policy1 ,c1) ;
		Account  a2 = new Account(2 ,"B" ,200, policy2 ,c2);
		Account  a3 = new Account(3 ,"C" ,300, policy3 ,c3);
		Account  a4 = new Account(4 ,"D" ,400, policy4 ,c4);
		Account  a5 = new Account(5 ,"E" ,150, policy5 ,c5);
		
		Collections.addAll(accounts, a1 , a2 , a3 , a4, a5);
		
	}
	
	public static void main(String a[])
	{
		
		MainRunner run = new MainRunner();
		
		run.accounts = updateEmail(run.accounts);
		run.accounts = updateEmail(run.accounts);
		maxSumAssuredAmount(run.accounts);
		run.accounts = (run.accounts);
		filter1(run.accounts);
		filter2(run.accounts);
	}
	
	public static ArrayList<Account> updateEmail(ArrayList<Account> a)
	{
		
		Object mList[] = a.stream().map(p ->
		{
			if(p.accountNumber%2==0) p.contactDetails.email = "a@gmail";
			else p.contactDetails.email = "b@gmail";
			return p;
			
		}).collect(Collectors.toList()).toArray();
		
		ArrayList<Account> accounts = new ArrayList<Account>();
		for(int i = 0 ; i < mList.length ; i++)
		{
			Account e = (Account)mList[i];
			accounts.add(e);
			System.out.println(e);
		}
		return accounts;
	}
	
	public static void maxSumAssuredAmount(ArrayList<Account> a)
	{
		
		Comparator<Account> minEmpSalaryCompare = (emp1 , emp2) ->
		{
			List<Policy> p1 = emp1.policies;
			List<Policy> p2 = emp2.policies;
			int sum1 = 0;
			for(int i = 0 ; i < p1.size() ; i++)
			{
				if(p1.get(i).premiumAmount >= sum1 )
					sum1  = p1.get(i).sumAssuredAmount;
			}
			int sum2 = 0;
			for(int i = 0 ; i < p2.size() ; i++)
			{
				if(p2.get(i).premiumAmount >= sum2 )
					sum2  = p2.get(i).sumAssuredAmount;
				
			}
			return sum1-sum2;		
		};
		Account maxA = a.stream().max(minEmpSalaryCompare).get();
		System.out.println("maximum balance " + maxA.balance);
	}
	
	public static ArrayList<Account> updateAmount(ArrayList<Account> a)
	{
		
		Object mList[] = a.stream().map(p ->
		{

			for(Policy r : p.policies)
			{
				if(r.policyNumber<=3) return p; 
				else 
				{
					r.premiumAmount = r.premiumAmount +(int)( r.premiumAmount * 0.01);
					break;
				}
			}
			
			return p;
		}
		).collect(Collectors.toList()).toArray();
		
		ArrayList<Account> accounts = new ArrayList<Account>();
		for(int i = 0 ; i < mList.length ; i++)
		{
			Account e = (Account)mList[i];
			accounts.add(e);
			System.out.println(e);
		}
	
		return accounts;
	}
	
	public static void filter1(ArrayList<Account> a)
	{
		Object p[] = a.stream().filter(e -> e.contactDetails.state.equals("bro") && e.contactDetails.address.equals("london")).collect(Collectors.toList()).toArray();
		
		for(int i = 0 ; i < p.length ; i++)
		{
			Account e = (Account)p[i];
			System.out.println(e);
		}
	}
	

	
	public static void filter2(ArrayList<Account> a)
	{
		Object p[] = a.stream().filter(e -> e.contactDetails.state.equals("bro") && e.balance <  func(e.policies)).collect(Collectors.toList()).toArray();
		for(int i = 0 ; i < p.length ; i++)
		{
			Account e = (Account)p[i];
			System.out.println(e);
		}
		
	}

	private static int func(List<Policy> policies) {
		
		int money = 0;
		for(int i = 0 ; i< policies.size() ; i++) {
			money = money + policies.get(i).premiumAmount;
		}
		return money;
	}
}

