package collection.map.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class Tcomp implements Comparator<String>{
	public int compare(String a,String b) {
		 int i,j=0,k;
		try {
			
		
	
		 i=a.lastIndexOf(' ');
		 j=b.lastIndexOf(' ');
		 k= a.substring(i).compareToIgnoreCase(b.substring(j));
		 if(k==0) 
			 return a.compareToIgnoreCase(b);
		 else
			 return k;
		}
		 catch (Exception e) {
			return j;
			}
			 
	}
}

public class TreeMapExample3 {

	public static void main(String[] args) {
		
TreeMap<String, Double> tm = new TreeMap<String, Double>(new Tcomp());
tm.put("rishu", 13.23);
tm.put("risi", 15.23);
tm.put("amitesh", 98.7);
Set<Entry<String, Double>> set = tm.entrySet();
for(Map.Entry<String, Double> me:set) {
	System.out.println(me.getKey() + " => " +me.getValue());
}
	}

}
