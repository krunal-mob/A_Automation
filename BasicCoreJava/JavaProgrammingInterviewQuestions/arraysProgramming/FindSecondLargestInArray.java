package arraysProgramming;

public class FindSecondLargestInArray {

	public static void main(String[] args) {




		int [] arr = { 1, 2,3 ,900};

		int largest = arr[0];

		int secondLargest = arr[0];


		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {

				secondLargest = largest;

				largest = arr[i];

			} else if (arr[i] > secondLargest) {

				secondLargest = arr[i];

			}
		}

		System.out.println("Second largest number is : " + secondLargest);








	}

}

/*
 * Step 1:
 * 
 * Iterate the given array
 * 
 * Step 2 (first if condition arr[i] > largest):
 * 
 * If current array value is greater than largest value then
 * 
 * Move the largest value to secondLargest and make
 * 
 * current value as largest
 * 
 * Step 3 (second if condition arr[i] > secondLargest )
 * 
 * If the current value is smaller than largest and greater than secondLargest
 * then
 * 
 * the current value becomes secondLargest
 */

