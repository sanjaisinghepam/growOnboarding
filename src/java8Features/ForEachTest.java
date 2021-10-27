package java8Features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> gamesList = new ArrayList<String>();  
	     gamesList.add("Football");  
	     gamesList.add("Cricket");  
	     gamesList.add("Chess");  
	     gamesList.add("Hocky");  
	     System.out.println("------------Iterating by passing lambda expression--------------"); 
	     
	     gamesList.forEach(game -> System.out.println(game));
	     
	     Map<Integer, String> namesMap = new HashMap<>();
	     namesMap.put(1, "Larry");
	     namesMap.put(2, "Steve");
	     namesMap.put(3, "James");
	     
	     namesMap.forEach((key, value) -> System.out.println(key+" "+value));
	     
	     namesMap.keySet().forEach(key -> System.out.println(key));
	     
	     namesMap.entrySet().forEach(k ->  System.out.println(k.getKey()+" "+k.getValue()));
	     
	}

}
