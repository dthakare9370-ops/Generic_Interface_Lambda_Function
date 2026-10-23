package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Even_No {

	public static void main(String args[]) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,6,4,63,23);
		
		
		//Without Stream Api 
//		for(int num : numbers) {
//			if(num % 2 != 0) {
//				System.out.println(num);
//			}
//		}
		
		
		//With Stream API
		numbers.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
		
		
		
	}
}
