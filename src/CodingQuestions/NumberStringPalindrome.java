package CodingQuestions;

public class NumberStringPalindrome {

	public static void main(String[] args) {

//		1 :Write a program to reverse a number and string and check if it is a palindrome.
//		Reversing a number:
		int num = 7569, rem, rev = 0;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println(rev);

		/*
		 * check to see if String is palindrome ; reverse of a word is same radar =
		 * radar Three methods have to be used; 1. string.length 2. string.charAt() 3.
		 * string.equals
		 */
		String word = "radar";
		String revWord = "";

		// Using .length method to start the for loop from last index
		// using .charAt method to print the character at an index value of i
		for (int i = word.length() - 1; i >= 0; i--) {
			revWord = revWord + word.charAt(i);
		}
		// Print reverse of a word. In case of palindrome, it will look same
		System.out.println(revWord);

		// to validate if the reversed string is palindrome
		if (revWord.equals(word)) {
			System.out.println("Word is palindrome");
		} else {
			System.out.println("word is  not palindrome");
		}

	}

}
