package learn_CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClass {
	public static void main(String atd[]) {
		List<Integer> ls=new ArrayList<>();
		
		ls.add(2);
		ls.add(4);
		ls.add(1);
		ls.add(5);
		ls.add(8);
		ls.add(7);
		ls.add(1);
		
		//mix 
		System.out.println("Min:"+Collections.min(ls));
		
		//max
		System.out.println("Max:"+Collections.max(ls));
		
		//frequency
		System.out.println("frequency:"+Collections.frequency(ls,1));
		
		//sort default ascending
		Collections.sort(ls);
		System.out.println("---------Ascending-----------");
		for(Integer i:ls) {
			System.out.println(i);
		}
		
		//sorting in descending
		Collections.sort(ls,Comparator.reverseOrder());
		System.out.println("---------Reverse-----------");
		for(Integer i:ls) {
			System.out.println(i);
		}
		
	}

}
