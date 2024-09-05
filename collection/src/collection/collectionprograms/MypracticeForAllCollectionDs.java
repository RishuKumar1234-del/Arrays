package collection.collectionprograms;

import java.util.Arrays;

public class MypracticeForAllCollectionDs {

	public static void main(String[] args) {
     int[] arr= {5,3,15,2,5};
     int[] clone=arr.clone();
     Arrays.sort(arr);
     for(int i:arr) {
    	 System.out.print(i + " ");
     }
     System.out.println("\n----------------");
     Arrays.sort(clone);
     for(int i:clone) {
    	 System.out.print(i + " ");
     }
     int indexof2 = Arrays.binarySearch(arr, 3);
     System.out.println("index of element 3: " +indexof2);
     
	
		
	
	}

}
