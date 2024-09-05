package collection.StreamApi;

public class FindClosestNumberinList {

	public static int findClosest(int[] arr,int n,int target) {
		int left=0;
		int right=n-1;
		while(left<right) {
			if(Math.abs(arr[left]-target)<=Math.abs(right)) {
				 right--;
				
			}
			else {
				left++;
			}
		}
		return arr[left];
	}
		

		public static void main(String[] args) {
			int[] arr= {5,4,3,2,7};
			int n=arr.length;
			int target=8;
			int closetelement=findClosest(arr, n, target);
			System.out.println("the colsest element: " +closetelement);
		
			
		}

}
