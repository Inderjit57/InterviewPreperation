package CodingQuestions;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter a number");
		int num = sc.nextInt();
		int temp = 0;

		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp > 0) {
			System.out.println(num + " is not a prime number");
		} else {
			System.out.println(num + " is a prime number");
		}
	}

}
