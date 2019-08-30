package mutableStrings;

public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
		
		
		StringBuffer sb = new StringBuffer("Abhishek");
		
		
		System.out.println(sb.capacity());
		
		sb.append("  Sarkar");
		
		//sb.reverse();
		
		sb.deleteCharAt(8);
		
		
		System.out.println(sb);
	}

}
