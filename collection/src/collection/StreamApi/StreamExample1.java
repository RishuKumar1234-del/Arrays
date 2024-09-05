package collection.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {

	public static void main(String[] args) {
		List<String> mylist= Arrays.asList("Rishu","Rahul","Risi","Govind","Gurudev prasad ","Rishu");
		System.out.println("the original list is: " +mylist);
		
		System.out.println("\n");
		List<String> justtakingvalue = mylist.stream().map(str->String.valueOf(str)).collect(Collectors.toList());
		System.out.println("the list obtained by using only mapping = " +justtakingvalue);
    List<String> namestartswtihR = mylist.stream().map(str->String.valueOf(str))
                   .filter(str->str.startsWith("R"))
                   .map(String::valueOf)
                   .collect(Collectors.toList());
    System.out.println("The list having name starts with R \n " + namestartswtihR);
    
    String name="rakesh";
    System.out.println();
    System.out.println(name.valueOf(name));
   
		

	}

}
