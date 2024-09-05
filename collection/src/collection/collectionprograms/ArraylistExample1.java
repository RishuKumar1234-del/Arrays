package collection.collectionprograms;

import java.util.ArrayList;

public class ArraylistExample1 {

	public static void main(String[] args) {
ArrayList<String> fruits= new ArrayList<String>();
fruits.add("Mango");
fruits.add("banana");
fruits.add("guava");
fruits.add("papaya");
fruits.add("pineapple");
System.out.println(fruits);
System.out.println(fruits.indexOf("banana"));
System.out.println(fruits.get(fruits.indexOf("papaya")));
System.out.println(fruits.get(fruits.indexOf("Mango")));
fruits.add("grapes");
//fruits.set(2, "grapes");
System.out.println(fruits.lastIndexOf("grapes"));
System.out.println(fruits.size());
System.out.println(fruits);

	}

}
