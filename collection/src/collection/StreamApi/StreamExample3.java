package collection.StreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample3 {

	public static void main(String[] args) {
	List<Integer> list=Arrays.asList(3,10,20,15,1,0,13,1,2,2,10,40,19,40,30,19);
	System.out.println("the original list = " +list);
	long totalElements = list.stream().count();
		System.out.println("the total number of elements in the list = " + totalElements);
		double avg = list.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println("the average of the elements = " + avg);
		List<Integer> dup = list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toList());
		System.out.println("the duplicate elements = " + dup);
		List<Integer> numstartw3 = list.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("3")).map(Integer::valueOf).collect(Collectors.toList());
		System.out.println("the numbers start with 3 = " +numstartw3);
		Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("the maximum elements = " + max);
		Integer min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("the minimum number = " + min);
		List<Integer> asc = list.stream().sorted().collect(Collectors.toList());
		System.out.println("the numbers in ascending order = " +asc);
		 Integer secondminimum = list.stream().sorted().distinct().limit(3).skip(2).findFirst().get();
		 System.out.println("the second minimum number = " +secondminimum);
		 System.out.println(6/0);
		 Integer sumfirst5 = list.stream().limit(5).reduce((a,b)->a+b).get();
		System.out.println("sum of first 5 elements = " + sumfirst5);

	}

}
