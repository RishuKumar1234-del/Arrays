package collection.StreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(0,3,10,20,30,15,1,13,1,2,2,10,40,19,3);
		
		System.out.println("the original list = " + list);
		//(1).sum of numbers
		Integer sum = list.stream().reduce((a,b)->a+b).get();
		System.out.println("\nthe sum of the numbers = " + sum);
		//(2).print avg.of number
		double average = list.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println("\nthe average of the list = " +average);
		//(3).print odd/even number
		List<Integer> even = list.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println("\n the list of even numbers= " +even);
		
		List<Integer> odd = list.stream().filter(e->e%2!=0).collect(Collectors.toList());
		System.out.println("\n the list of even numbers= " +even);
		//(4).print Duplicate number
		Set<Integer> dupNum= new HashSet<Integer>();
		List<Integer> dupList = list.stream().filter(e->!dupNum.add(e)).collect(Collectors.toList());
		System.out.println("\n the list having duplicate number " +dupList);
		//(5).number starts with
		Stream<Integer> numstartswith3 = list.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("3")).map(Integer::valueOf);
		System.out.println("\n the number starts with 3= " + numstartswith3);
		//(6).max and min number
		Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("\n the maximum number in the list= " + max);
		System.out.println();
		Integer min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("\n the minimum number in the list= " + min);
		
		//(7).sorting the numbers
		List<Integer> asc = list.stream().sorted().collect(Collectors.toList());
		System.out.println("\n the list in  ascending order= " + asc);
		List<Integer> desc = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		//(8).sorting the number in reverse order
		System.out.println("\n the list in  ascending order= " + desc);
		//(10).second highest maximum number
		Integer secondhighest = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		System.out.println("\nthe second highest number in the list= " + secondhighest);
		//(10).second highest lowest number
		Integer secondhighestlowest = list.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
		System.out.println("\nthe second highest lowest number in the list = " + secondhighest);
		
		//(11).get all distinct number
		List<Integer> unique = list.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println("\n the unique list= " + unique);
		//(12).get top 5 or 10 values
		List<Integer> top5 = list.stream().limit(5).collect(Collectors.toList());
		System.out.println("the top 5 values of the list= " +top5);
		
		

	}

}
