package yu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateString {

	
	public static void main(String[] args) {
		


String s="I love my my india";
List<String> dupl=Arrays.asList(s.split(" "));
Map<String,Integer> m=new HashMap<>();
for(String x:dupl) {
	
	System.out.println("value of x"+ x );
	System.out.println(dupl);
	System.out.println(m);
	
	
if(m.containsKey(x)) {
int v=m.get(x);
v++;
m.put(x, v);
}else
m.put(x, 1);
}

    System.out.println("final result" +m );
    
}}