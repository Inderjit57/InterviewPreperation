package CodingQuestions;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to find the maximum number in an array.

		int[] num = { 10, 450, 12, 43, 56, 76, 34 };
		int max = num[0];

		for (int i = 1; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println(max);
	}

}
