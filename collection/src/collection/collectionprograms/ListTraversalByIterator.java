package collection.collectionprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListTraversalByIterator {

	public static void main(String[] args) {
		try {
			
		 
		List<Integer> list= new ArrayList<Integer>();
		list.add(null);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(9);
		list.add(2);
		list.add(null);
		for(Integer i:list) {
			System.out.print(i + " ");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		Set<Integer> s= new HashSet<Integer>();
		s.add(null);
		s.add(4);
		s.add(5);
		s.add(1);
		s.add(5);
		s.add(2);
		s.add(6);
		s.add(null);
		System.out.println("\n");
		for(Integer itr:s) {
			System.out.print(itr + " ");
		}

	}

}
