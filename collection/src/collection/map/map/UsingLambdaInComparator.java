package collection.map.map;

import java.util.TreeSet;

public class UsingLambdaInComparator {

	public static void main(String[] args) {
		
TreeSet<String> ts = new TreeSet<String>((a,b)->b.compareTo(a));
ts.add("a");
ts.add("b");
ts.add("c");
ts.add("d");
ts.forEach(e->{
	System.out.println(e);
});
	}

}
