package Assignment2task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Restaurant implements IRestaurant{
	
	static ArrayList<Dish> menuArray=new ArrayList<>();
	
	static {
		menuArray.add(new Dish(101,"Pasta",10,20));
		menuArray.add(new Dish(102,"Chowmein",8,10));
		menuArray.add(new Dish(101,"Manchurian",10,25));
		menuArray.add(new Dish(101,"Pizza",15,15));
		}

	public Dish getDish(int getId) {
		
		
		Dish foundDish=null;
		
		Iterator<Dish> itr=menuArray.iterator();
		while(itr.hasNext()) {
			Dish d=itr.next();
			if(d.getDishId()==getId) {
				foundDish=d;
				break;
			}
		}
		return foundDish;
		
		
	}

}
