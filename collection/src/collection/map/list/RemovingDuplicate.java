package collection.map.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemovingDuplicate {

	public static void main(String[] args) {
	 List<String> list= new ArrayList<String>();
	 list.add("risi");
	 list.add("a");
	 list.add("b");
	 list.add("c");
	 list.add("a");
	 list.add("risi");
	 System.out.println("the orignal list : ");
	 for(String s:list) {
		 System.out.print(s + " ,");
	 }
	 System.out.println("\nthe list without duplicate element");
  TreeSet<String > ts = new TreeSet<String>(list);
  list.clear();
  list.addAll(ts);
  for(int i=0;i<list.size();i++) {
	  System.out.print(list.get(i) + " , ");
  }
  System.out.println("\nthe unique list by using stream api");
  List<String> uniquelist = list.stream().distinct().collect(Collectors.toList());
    for(String str:uniquelist) {
    	System.out.print(str + " , ");
    }
	}

	

}
