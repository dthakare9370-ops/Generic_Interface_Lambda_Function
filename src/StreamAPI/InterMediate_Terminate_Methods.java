package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class InterMediate_Terminate_Methods {
	public static void main(String args[]) {
		
//		String arr[] = new String[] {"Aadi", "Abhay" , "Tanmay", "Sahile"};
//		List<String> list = Arrays.asList(arr);
//		list.stream().filter((i) -> i.contains("A")).forEach(i -> System.out.println(i));
		
		Employee e1 = new Employee(1,"Ganesh","Satana",100203);
		Employee e2 = new Employee(2,"Tanmay","Pune",64334);
		Employee e3 = new Employee(3,"Onkar","Satana",2456);
		Employee e4 = new Employee(4,"Nikhil","Pune",17345);
		
		List<Employee> employees = Arrays.asList(e1,e2,e3,e4);
		
		//Filter work on the Predicate Interface which is boolean test(T t) method 
//		employees.stream().filter(i -> i.getName().startsWith("N")).forEach(i->System.out.println(i));
		
		
		
		
		//Map work on the Function interface which is R apply(T t) method 
//		employees.stream().map(i-> i.getName()).forEach(i->System.out.println(i));
		
		//Example - 2
//		List<Integer> data = Arrays.asList(1,2,3,4,5);
//		data.stream().map((i) -> i%2==0?i+5:i).forEach(i->System.out.println(i));
		
		
		
		
		
		
		
		
		
		
		//flatMap
		//The main used of Flat Map is to combile the collection 
		
		
//		List<String> backend = Arrays.asList("Core java","Advance Java","Spring Boot");
//		List<String> frontend = Arrays.asList("Html","Css", "JavaScript");
//		
//		List<List<String>> list = Arrays.asList(backend,frontend);
//		
//		list.stream()
//		.flatMap(i -> i.stream())
//		.forEach(i -> System.out.println(i));
		
		
		
		
		
		
		
		
		
		
		//Terminal Methods 
//		1) forEach(Consume)
		List<String> backend = Arrays.asList("Core java","Core java","Advance Java","Spring Boot");
//		backend.stream().forEach(i->System.out.println(i));
		
		
//		2) Collect
		Set<String> collect = backend.stream().collect(Collectors.toSet());
//		collect.forEach(i->System.out.println(i)); 
		
		
		
		
//		long count = backend.stream().distinct().count();
//		System.out.println(count);
		
		
		

		
//		 Any Match from pune - Puny cha ek tari employee aahe ka ?
//		boolean anyMatch = employees.stream().anyMatch(i->i.getAddress().equals("Pune"));
//		System.out.println("Any Match : "+anyMatch);
		
		
//		boolean allMatch = employees.stream().allMatch(i->i.getAddress().equals("Pune"));
//		System.out.println("Any Match : "+allMatch);
		
		
		
		boolean noneMatch = employees.stream().noneMatch(i->i.getAddress().equals("Pune"));
		System.out.println("Any Match : "+noneMatch);
	}
}
