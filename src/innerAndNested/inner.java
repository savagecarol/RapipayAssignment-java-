package innerAndNested;

class k {
	
	public class bro
	{
		public int a = 10;
		private int k = 20;
		public int getK()
		{
			return k;
		}
	}
	
	private class gal
	{
		public int a = 10;
		private int k = 20;	
		public int getK()
		{
			return k;
		}
	}

	protected class dra
	{
		public int a = 10;
		private int k = 20;
		public int getK()
		{
			return k;
		}
	}
	
	
	
	static class crow
	{
		public int a = 10;
		private int k = 20;
		public int getK()
		{
			return k;
		}
	}
}

public class inner
{
	public static void main(String args[])
	{
		
		k.bro  p = new k().new bro(); 
		
		k.dra  q = new k().new dra(); 
		
		
		System.out.println(p.a);
		System.out.println(p.getK());
		
		
		System.out.println(q.a);
		System.out.println(q.getK());
		
	
		k.crow  r = new k.crow();
		System.out.println(r.a);
		System.out.println(r.getK());
		
		
	}
}


