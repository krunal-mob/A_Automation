package java_ProgrammingInterview_Questions;

public class SmallestAndLargestNumberInArray {

	public static void main(String[] args) {




		int numbers[] = {1,-1000 ,20 , -90 , 100};

		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i =1 ; i<numbers.length; i++)
		{
			if (numbers[i] > largest) {
				largest = numbers[i];

			}

			else if (numbers[i] < smallest){
				smallest = numbers[i];

			}



		}

		System.out.println("The largest Number is  "+ largest );
		System.out.println("The smallest Number is  "+ smallest);



	}

}
