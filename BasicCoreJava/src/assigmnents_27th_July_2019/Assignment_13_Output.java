package assigmnents_27th_July_2019;

public class Assignment_13_Output { //Doubt

	public static void main(String[] args) {
		
		int i=2;
		while(makeDecision(i)){
			
		i=i*i;
		
		System.out.println(i);
		}
		}
	
	
	
	
		public static boolean makeDecision(int i)
		{
		if(i%3 != 0){
		return true;
		}else{
		return false;
		}

	}

}
