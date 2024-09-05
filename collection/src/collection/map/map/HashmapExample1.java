package collection.map.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class HashmapExample1 {

	public static void main(String[] args) {
		HashMap<String, Double> names= new HashMap<String, Double>();
		names.put("Joh Doe", 3434.34);
		names.put("Tom Smith", 123.22);
		names.put("Jane Baker", 1378.00);
		names.put("Tod Hall", 99.22);
		names.put("Ralph Smith", -19.08);
		
		//Get a set of the entries
		Set<Map.Entry<String, Double>> set = names.entrySet();
		//display the set
	for(Map.Entry<String, Double> hme:set) {
		System.out.println(hme.getKey() + " : " + hme.getValue());
	}
	//Deposit 1000rs into John doe's account
	System.out.println();
	System.out.print("The updated account of Joh Doe is = " );
	names.replace("Joh Doe", 3434.34+1000);
	System.out.print(names.get("Joh Doe"));
	//Deposit 2000rs into Joh Doe's account
	System.out.println();
	Double balance=names.get("Joh Doe");
	names.put("Joh Doe", balance+2000);
	System.out.println("Joh Doe's new balance: " + names.get("Joh Doe"));




	}

}
