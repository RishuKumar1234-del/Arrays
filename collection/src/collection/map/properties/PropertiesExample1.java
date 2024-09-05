package collection.map.properties;

import java.util.Properties;
import java.util.Set;

public class PropertiesExample1 {

	public static void main(String[] args) {
Properties capitals = new Properties();
capitals.put("Illinoil", "springfield");
capitals.put("Misscuri", "jefferson city");
capitals.put("washington", "olympia");
capitals.put("california", "sacramento");
capitals.put("indiana", "indiana polis");
//get a set view of the keys
Set<Object> states= capitals.keySet();
//show all the states and capitals 
for(Object name:states) {
	System.out.println("the capitals of " + name +" is " + capitals.getProperty((String)name) + "." );
}
System.out.println();
//look for states not in list
String str=capitals.getProperty("Florida","not found");
System.out.println("the capitals of Florida is " +str + " ");
	}

}
