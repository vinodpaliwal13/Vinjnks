package yu;

import java.util.HashMap;

public class DuplicateCharcter {
	
	public static void main(String[] args) {
		
		
		
		String s="nitin";
		
		
		char[] val = s.toCharArray();
		
		
		HashMap<Character, Integer> m=new HashMap<Character, Integer>();
		
		for(char x: val) {
			
		if(	m.containsKey(x)) {
			
			int v=m.get(x);
			v++;
			
		
			
			m.put(x, v);
		}
		else
		{
			m.put(x, 1);
			
		}
			
		}
		
		
		System.out.println(m);
		
		
	}

}
