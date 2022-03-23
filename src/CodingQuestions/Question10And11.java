package CodingQuestions;

import java.util.Arrays;

public class Question10And11 {

	public static void main(String[] args) {
		// Write a program to change all letter form small case to capital case in a
		// string.
		String word = "smallletters";

		System.out.println(word.toUpperCase());

//		Write a program to sort an array of number.

		int[] num = { 12, 3, 41, 3, 4, 3, 2, 4, 5 };
		System.out.println(num.length);

		// to sort an array. import import java.util.Arrays;
		Arrays.sort(num); // USe the sort method first
		System.out.println(Arrays.toString(num));
	}

}
