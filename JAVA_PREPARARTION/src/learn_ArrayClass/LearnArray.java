package learn_ArrayClass;

import java.util.Arrays;

public class LearnArray {
	
	public static void main(String[] arg) {
		int[] arr= {1,4,3,7,9,6,8,10};
		
		
		//to sort the elemens in the array
		Arrays.sort(arr);
		
		for(int i:arr) {
			System.out.println(i);
		}
		
		//search the element in the Array
		int index=Arrays.binarySearch(arr, 4);
		System.out.println("index:"+index);
	}

}
