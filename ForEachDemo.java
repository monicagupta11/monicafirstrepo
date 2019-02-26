import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ForEachDemo {
	
	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(1 ,2,3,4,5);
		System.out.println("iterating list..");
		myList.forEach(System.out::println);
		System.out.println("stream...");
		myList.stream().forEach(System.out::println);
		System.out.println("strem filter..");
		myList.stream().filter(l -> l>3).forEach(System.out::println);
		
		 Set<Integer> numSet = new HashSet<Integer>();
	        numSet.add(1);
	        numSet.add(2);
	        System.out.println("Iterating set  ");
	        numSet.forEach(System.out::println);
	        
	     // Only even numbers
	        numSet.stream().filter(s -> s%2 == 0).forEach(System.out::println);
	        
	        Map<String, String> numMap = new HashMap<String, String>();
	        
	        numMap.put("1", "one");
	        numMap.put("2", "two");
	        // Directly using
	        System.out.println("Using MAP");
	        numMap.forEach((K,V)-> System.out.println("key " + K + "value is " + V));
	        System.out.println("using stream");
	        
	        numMap.entrySet().stream().forEach(System.out::println);
	}

}
