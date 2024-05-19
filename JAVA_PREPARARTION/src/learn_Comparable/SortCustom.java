package learn_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCustom {
	public static void main(String arg[]) {
		
		List<Employee> eLi=new ArrayList<>();
		eLi.add(new Employee("Akash Hivare",1287625) );
		eLi.add(new Employee("Swapnil Gole",1287626) );
		eLi.add(new Employee("Shreays Salunkhe",1287624) );
		
		System.out.println("Not Sorted Employee List:"+eLi);
		
		//implemented comparable*********************************************
		Collections.sort(eLi);
		System.out.println("Sorted Employee List:"+eLi);
		
		//using comparator***************************************************
		Collections.sort(eLi,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.empId-o2.empId;
			}
			
		});
		
		//using lambda expression*********************************************
		Collections.sort(eLi,(o1,o2)->o1.empId-o2.empId);
	}

}
