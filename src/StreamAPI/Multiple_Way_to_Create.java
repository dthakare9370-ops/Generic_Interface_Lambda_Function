package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Multiple_Way_to_Create {
	public static void main(String args[]) {
		
		//First Way to Create the Stream APIS
//		Stream<Integer> s = Stream.of(1,2,3,4,5,6);
		
//		हे नाही use करू शकत 
//		for(int a : s) {
//			
//		}
		
//		s.forEach(i->System.out.println(i));
		
		
		
		
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,78);
//		Stream<List<Integer>> s = Stream.of(list);
//		s.forEach(i->System.out.println(i));
		
		
		
//		String str[] = new String[] {"Ram","Sham"};
//		Stream<String> stream = Stream.of(str);
//		stream.forEach(i->System.out.println(i.toUpperCase()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		//// 2nd Way To used the Stream APIS 
		/// Stream() Method Only Work on the collection not on the Array int , String 
		 
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,78);
		Stream<Integer> stream = list.stream();
		stream.forEach(i->System.out.println(i));
		list.stream().forEach(i->System.out.println(i));
		
		
		
//		String str[] = new String[] {"Ram","Sham"};
//		List<String> list = Arrays.asList(str);
//		list.stream().forEach(i->System.out.println(i));
		
	}
}
