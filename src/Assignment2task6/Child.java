package Assignment2task6;

public abstract class Child {

	 String gender;
	 String name;
	int age;
	
	public Child( String gender, String name){
	       this.gender = gender;
	        this.name = name;
	}

	
	public abstract void setAge(int age);
	
	public abstract void display();
}
