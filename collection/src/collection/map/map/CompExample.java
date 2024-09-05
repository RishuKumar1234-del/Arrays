package collection.map.map;

import java.util.Comparator;
import java.util.TreeSet;

class Mycom implements Comparator<String>{
	public int compare(String a ,String b) {
		//reverse the comparision
		//System.out.println(b.compareTo(a));
		return b.compareTo(a);
}
	
}

public class CompExample {

	public static void main(String[] args) {
		TreeSet<String> ts= new TreeSet<String>(new Mycom());
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		for(String s:ts) {
			System.out.print(s +" ");
		}

		
	}

}
