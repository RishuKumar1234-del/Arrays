package collection.map.list;

import java.util.ArrayList;
import java.util.List;

public class Programm {

	public static void main(String[] args) {
		List l= new ArrayList();
		l.add(3);
		l.add("apple");
		l.add("mango");
		l.add(4.6);
		l.add('c');
		l.add('e');
		l.add(null);
		l.add(null);
		System.out.println(l);
		l.remove("mango");
		
		System.out.println(l);
		System.out.println("===========================");
		
		//untype-sage of ArrayList
		
		ArrayList al=new ArrayList();
		al.add(7);
		al.add("banana");
		al.add(8.4);
		al.add('d');
		System.out.println(al);
		al.add(2, l);
		al.retainAll(al);
		System.out.println(al);
		

	}

}
