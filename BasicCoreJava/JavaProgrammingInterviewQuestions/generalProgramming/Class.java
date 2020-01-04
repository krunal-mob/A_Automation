package generalProgramming;

public class Class {

	public static void main(String[] args) {
		
		String s = "abcdAbce";
		
		char [] c= s.toLowerCase().toCharArray();
		
		for(int i = 0 ; i<c.length; i++) {
			
			
			for(int j =i+1 ; j<c.length;j++) {
				
				
				if(c[i]==c[j]) {
					
					
					System.out.println(c[i]);
					break;
					
				
				
			}
				
			}
			 
		}
		
		
		
		
		
		
		
	}

}
