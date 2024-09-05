package collection.map.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class RemovingDuplicate2 {

	public static void main(String[] args) {
		List<String> friends=new ArrayList<String>();
		friends.add("rishu");
		friends.add("mukesh");
		friends.add("rakesh");
		friends.add("rishu");
		//method-1:
		System.out.println("----------------by using simple system class-----------------");
		System.out.println(friends);
		//method-2:
	  System.out.println("----------------by using simple for loop----------------");
	  for(int i=0;i<friends.size();i++) {
		  System.out.print(friends.get(i) + " ");
	  }
	//method-3:
	  System.out.println("----------------by using  for each loop----------------");
		for(String f:friends) {
			System.out.print(f + " ");
		}
		//method-4:
		  System.out.println("----------------by using  for each functional interface----------------");
		  friends.forEach(e->{
			  System.out.print(e + " ");
		  });
		//method-5:
		  System.out.println("----------------by using  iterator interface---------------");
		  Iterator<String> itr = friends.iterator();
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }
		//method-6:
		  System.out.println("----------------by using  iterator interface---------------");
		  ListIterator<String> litr=friends.listIterator();
		  while(litr.hasNext()) {
			  System.out.println(litr.next());
		  }
		  System.out.println();
		//method-7:
		  System.out.println("----------------by using Stream api---------------");
		  List<String> friendstream = friends.stream().collect(Collectors.toList());
		  for(String fs:friendstream) {
			  System.out.print(fs + " ");
		  }
		  System.out.println();
		  List<String> unique = friends.stream().distinct().collect(Collectors.toList());
		  for(String uni:unique) {
			  System.out.print(uni + " ");
		  }
		  

	}

}
