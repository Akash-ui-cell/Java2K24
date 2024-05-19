package collectionFramework.Learn_Map;

import java.util.HashMap;
import java.util.Map;


//Key will be in insertion order
public class Learn_HashMap {
	
	public static void main(String atrg[]) {
		
		Map<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(10, "Four");
		hm.put(1, "one");
		hm.put(1, "ONE");//same key values will override
		hm.put(2, "Two");
		hm.put(4, "Four");
		
		//put only if key is not present
		hm.putIfAbsent(2, "Nine");
		
		
		//Iterate the HashMap
		
		for(Map.Entry<Integer, String> ele: hm.entrySet()) {
			System.out.println("("+ele+")");
			System.out.println("Key"+ele.getKey()+"Value:"+ele.getValue());
		}
		
		//Iterate the Keys
		System.out.println("---------Keys-------------");
		for(Integer it:hm.keySet()) {
			System.out.println(it);
		}
		
		//Iterate the Values
				System.out.println("---------Values-------------");
				for(String its:hm.values()) {
					System.out.println(its);
		}
		System.out.println("ContainsKey:"+hm.containsKey(5));
		System.out.println("ContainsValue:"+hm.containsValue("ONE"));
	}

}
