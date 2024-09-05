package collection.map.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Arrayexample1 {

	public static void main(String[] args) {
 int [] a= {2,4,5,6,7,8,9,12,9,920};
 int count=0;
 for(int i=0;i<a.length;i++) {
	 if(a[i]%5==0) {
		 count++;
		System.out.print(a[i] + " "); 
	 }
	 
 }
 System.out.println("\nthe total numbers divisble by 4 = " + count);

	}
}
