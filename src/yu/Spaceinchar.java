package yu;

public class Spaceinchar {
	
	public static void main(String[] args) {
		String s="new delhi east west";
		int count=0;
		char [] ch=s.toCharArray();
		
		for(char c: ch) {
			
			if(c==' ') {
				
				
				count++;
			}
			
		}
			
			
		System.out.println(count);
		
		
	}

}
