package collection.map.map;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTraversing {

	public static void main(String[] args) {
		TreeMap<String, Double> tm = new TreeMap<String, Double>();
		tm.put("rishu", 1414.14);
		tm.put("vinit", 123.22);
		tm.put("sanu", 1378.54);
		tm.put("roshan", 99.22);
		tm.put("govind", 19.08);
		Collection<Double> valuedouble = tm.values();
		 Set<Entry<String, Double>> set = tm.entrySet();
		 set.forEach(e->{
			 System.out.println(e.getKey() + " => " + e.getValue());
		 });
		 double balance=tm.get("rishu");
		 tm.put("rishu", balance+1000.00 );
		 System.out.println("\nRishu's new balance is: " +tm.get("rishu"));

	}

}
