package collection.map.list;

import java.util.ArrayList;
import java.util.Scanner;

public class FruitAssignment {
	String name;
	String color;
	
	
	public FruitAssignment(String name,String color) {
		this.name=name;
		this.color=color;
	}
	

}

class DriverClassForFruits{
	public static void main(String[] args) {
		ArrayList<FruitAssignment> f=new ArrayList<FruitAssignment>();
		f.add(new FruitAssignment("mango", "yellow"));
		f.add(new FruitAssignment("apple", "maroon"));
		f.add(new FruitAssignment("guava", "green"));
        f.forEach(e->{
        	System.out.println(e);
        });

		
		Scanner scn= new Scanner(System.in);
		System.out.println("enter your choice");
		int choice=scn.nextInt();
		switch (choice) {
		case 1: System.out.println("add a fruit in the list");
		System.out.println("enter fruit");
		f.add(new FruitAssignment(scn.next(), scn.next()));
			
			break;
			
		case 2:System.out.println("search the fruit");	

		default:
			break;
		}
	
	}
}