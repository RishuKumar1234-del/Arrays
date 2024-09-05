package collection.map.properties;

import java.util.Properties;
import java.util.Set;

public class PropertiesExample2 {

	public static void main(String[] args) {
		Properties deflist = new Properties();
		deflist.put("Florida", "Tallahassec");
		deflist.put("wisconsin", "Madison");
		Properties capitals = new Properties(deflist);
		capitals.put("Illinoil", "springfield");
		capitals.put("Misscuri", "jefferson city");
		capitals.put("washington", "olympia");
		capitals.put("california", "sacramento");
		capitals.put("indiana", "indiana polis");
//get a view of the keys
		Set<Object> states = capitals.keySet();
		for(Object name:states) {
			System.out.println("the capitals of " + name + " is " + capitals.getProperty((String)name) + " . ");
		}
		System.out.println();
		//Florida will now be found in the default list
	         String str = capitals.getProperty("Florida");
	         System.out.println("the capitals of florida is: " + str +".");
	}

}
