package CodingQuestions;

public class Question9 {

	public static void main(String[] args) {
		// Write a program to find the length of a string, Number array and populating an array.

		String[] str = new String[4];
		str[0] = "Inder";
		str[1] = "Car";

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println(str[0]);

		String[] str2 = { "Cat", "Dog", "Tree", "Human" };
		System.out.println(str2.length);

		int[] num = { 12, 3, 41, 3, 4, 3, 2, 4, 5 };
		System.out.println(num.length);

	}

}
