package collection.map.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIteration {

	public static void main(String[] args) {
		Map<String, String> lhm= new LinkedHashMap<String, String>();
		lhm.put("Rishu", null);
		lhm.put("vikram", "kumar");
		lhm.put("Rishu", null);
		lhm.put("Ranjeet", "kumar");
		System.out.println("original map = " + lhm);
	Map<String, String> synchronizedMap = Collections.synchronizedMap(lhm);
	System.out.println("new synchronized map = " +synchronizedMap);
	
	
	
	synchronizedMap.forEach((a,b)->{
		System.out.println(a + " => " +b);
	});
	
	
	}
	
}
