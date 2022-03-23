package CodingQuestions;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// Take 10 integers from keyboard using loop and print their average value on
		// the screen.
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter num: " + i);
			num = sc.nextInt();
			sum = sum + num;
		}
		System.out.println("Average of all : " + (sum / 5));
	}

}
