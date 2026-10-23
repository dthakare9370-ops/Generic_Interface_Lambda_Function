package StreamAPI;

import java.util.*;

public class EmployeeFilter {
	public static void main(String args[]) {
		
		Employee e1 = new Employee(1,"Ganesh","Satana",100203);
		Employee e2 = new Employee(2,"Tanmay","Pune",64334);
		Employee e3 = new Employee(3,"Onkar","Satana",2456);
		Employee e4 = new Employee(4,"Nikhil","Pune",17345);
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		//Display Those Student Name Who is belong to the Pune Location
		//Without Stream APIS
		for(Employee e : employees) {
			if(e.getAddress().equals("Pune")) {
				System.out.println(e.getName()+ " = " +e.getName().length() );
			}
		}
		
		System.out.println();
		
		
		//Stream Apis 
		employees.stream().filter(i->i.getAddress().equals("Pune")).forEach(i->System.out.println(i));
		
	}
}
