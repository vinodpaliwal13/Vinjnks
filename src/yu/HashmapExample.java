package yu;

import java.util.HashMap;

public class HashmapExample {
	
	
	public static void main(String[] args) {
		
		
		HashMap <String , Integer> m=new HashMap<String, Integer>();
		
		m.put("vini1", 1);
		m.put("vini2", 2);
		m.put("vini3", 3);
		m.put("vini4", 4);
		
		System.out.println(m + "t" +m.size());
		
		if(m.containsKey("vini1")) {
			System.out.println("print" + m.get("vini1"));
		}
		
		
	}

}
