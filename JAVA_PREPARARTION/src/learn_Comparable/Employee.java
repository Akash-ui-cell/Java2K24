package learn_Comparable;

public class Employee implements Comparable<Employee>{
	public String empName;
	public int empId;
	
	public Employee(String string, int i) {
		// TODO Auto-generated constructor stub
		this.empName=string;
		this.empId=i;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + "]";
	}

	@Override
	public int compareTo(Employee that) {
		// TODO Auto-generated method stub
		return this.empId-that.empId;
	}


}
