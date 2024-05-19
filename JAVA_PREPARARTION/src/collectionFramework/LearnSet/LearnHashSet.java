package collectionFramework.LearnSet;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
	
	public static void main(String arg) {
		
		Set<Integer> hs=new HashSet<Integer>();
		
		hs.add(34);
		hs.add(34);
		hs.add(67);
		hs.add(89);
		
		System.out.println("HS:"+hs);
	}

}
