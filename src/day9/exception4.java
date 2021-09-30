package day9;

public class exception4 {
	final static int p = 8; 
    public static void main(String[] args)     
   {     
       exception4 obj = new exception4();
       System.out.println("Hashcode is: " + obj.hashCode());
       try
       {
    	   System.out.println(p); 
    	   int data = 50/0;
    	   
       }
       catch(Exception e)
       {
    	   System.out.println("our exception");
   
       }
       
       finally
       {
    	   System.out.println("finally block");
       }
       obj = null;           
       System.out.println("End of the garbage collection");     
   }     
   
   protected void finalize()     
   {     
       System.out.println("Called the finalize() method");     
   }     
}