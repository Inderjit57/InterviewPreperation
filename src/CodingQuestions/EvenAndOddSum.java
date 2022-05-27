package CodingQuestions;

public class EvenAndOddSum {

	public static void main(String[] args) {
		/*
		 * Find the sum of all even numbers(2,4,6,8...) between 0-100 
		 * Find the sum of all odd numbers (1,3,5,...) between 0-100
		 */

		int sumOfEvenNum = 0;
		int sumOfOddNum = 0;

		// Iterating through for loop to find even numbers
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sumOfEvenNum += i;
			}
		}

		// Iterating through for loop to find odd numbers
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				sumOfOddNum += i;
			}
		}

		System.out.println("Sum of all the even numbers between 0 to 100 : " + sumOfEvenNum);
		System.out.println("Sum of all the odd numbers between 0 to 100 : " + sumOfOddNum);
	}

}
