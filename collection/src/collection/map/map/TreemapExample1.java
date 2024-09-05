package collection.map.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreemapExample1 extends HashmapExample1 {

	public static void main(String[] args) {

    TreeMap<String ,Double> tm = new TreeMap<String, Double>();
     tm.put("Amit",5454.6 );
     tm.put("Sheshank",678.45 );
     tm.put("Ravindr",8765.34 );
     tm.put("Tushar",45623.43 );
     tm.put("Sanjay",9876.34 );
     System.out.println(tm);
     //Get a set-view that is collection view of the map
     System.out.println("All the entries in ascending order based on the key are: ");
    Set<Map.Entry<String, Double>> tmSet= tm.entrySet();
    for(Map.Entry<String, Double> me:tmSet) {
    	System.out.println(me.getKey() +" = > " + me.getValue());
    }
    //Deposit 1000rs into Sheshank's account
    Double balance=tm.get("Sheshank");
    tm.put("Sheshank", balance+1000);
    System.out.println("\n Sheshank's new balance is: " +tm.get("Sheshank"));


	}

}
