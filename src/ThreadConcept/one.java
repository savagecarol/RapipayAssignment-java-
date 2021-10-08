package ThreadConcept;


class A implements Runnable {
	  public void run() 
	  {
	    System.out.println("This code is running in a thread");
	  }
	}


class B extends Thread{
	
	public void run() {
	    System.out.println("Thread 1");
	  }

}



public class one extends Thread {
	  public static void main(String[] args) {
	    one thread = new one();
	    thread.start();
	    System.out.println("This code is outside of the thread");
	  }
	  public void run() {
	    System.out.println("This code is running in a thread");
	  }
	}