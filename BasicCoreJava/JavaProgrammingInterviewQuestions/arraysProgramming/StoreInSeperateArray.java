package arraysProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StoreInSeperateArray {

	//   1. Find the duplicates in the above array and store in to a separate array
	//   2. Find the non duplicates and store in another array.


	public static void main(String[] args) {


		int [] intArray = {1,1,2,3,4,4,5,6,6};

		System.out.println(intArray);

		Set<Integer> dupList = new HashSet<Integer>();
		Set<Integer> nonDupList = new HashSet<Integer>();


		for(int i = 0 ; i < intArray.length; i++) {
			int count=0;
			for(int j =0; j<intArray.length ; j++) {

				if(intArray[i]==intArray[j]) 
					count++;


			}	

			if(count>1){
				dupList.add(intArray[i]);
			}
			else {
				nonDupList.add(intArray[i]);
			}



		}

		Object[] arrDup = dupList.toArray();
		Object[] arrNonDup = dupList.toArray();
		


		System.out.println(arrDup);
		System.out.println(arrNonDup);
		dupList.clear();
		nonDupList.clear();
	}

}
