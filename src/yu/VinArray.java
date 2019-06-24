package yu;

public class VinArray {

	public static void main(String[] args) {
	
		
		
//		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
//		
//		int l = intArray.length;
//		char ch;
//		int sum=0;
//		
//		
//		for(int i=0; i<l; i++) {
//			    System.out.println(intArray[i]);
//		}
//		 System.out.println(intArray[3]);
		
		
		
		
    // String s ="new charcter";
  // char [] ch=  s.toCharArray();
   
    // int l=s.length();
     
		
		//int l = ch.length;
		
		
		
//		for(int i=0; i<l; i++) {
//			    char c=s.charAt(i);
//			    
//			    System.out.println(c);
//		}
		 
		
		
		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		
		int  [] [] vin= { {1,2,3}, {4,5,6} , {7,6,9}  };
		
		
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				
				System.out.print(vin[i] [j]);
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
for(int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				
				if(vin[i]==vin[j]) {
					
					System.out.println(vin[i][j]);
				}
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
