package collection.collectionprograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuewExample1 {

	public static void main(String[] args) {
  Map<String, Double> m=new HashMap<>();
  System.out.println(Math.sqrt(123.3));
  m.put("w", 123.3);
  m.put("124", 123.3);
  m.put("b", 114.5);
 m.replace("124", 116.7);
 
 m.forEach((a,b)->{
	 System.out.println(a+124 + " => " + Math.sqrt(b));
 });
  Set<Entry<String,Double>> set = m.entrySet();
  Set<String> keySet = m.keySet();
  Collection<Double> v = m.values();
  System.out.println("the keys of the map are: " +keySet);
  System.out.println("the values of the map are: " +v);
  System.out.println("\n");
for(Map.Entry<String, Double> me: set) {
	System.out.println(me.getKey() + " =>" +me.getValue());
}
  
  
	}

}
