package CodingQuestions;

public class question1 {

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

	}

}
