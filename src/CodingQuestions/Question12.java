package CodingQuestions;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then
		 * using following rules print their place of service. if employee is female,
		 * then she will work only in urban areas. if employee is a male and age is in
		 * between 20 to 40 then he may work in anywhere if employee is male and age is
		 * in between 40 t0 60 then he will work in urban areas only. And any other
		 * input of age should print "ERROR".
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();

		System.out.println("Enter gender");
		String gender = sc.next();

		if (gender.equalsIgnoreCase("F")) {
			System.out.println("she will work only in urban areas");
		} else if (gender.equalsIgnoreCase("M") && age >= 20 && age <= 40) {
			System.out.println("may work in anywhere");
		} else if (gender.equalsIgnoreCase("M") && age > 40 && age <= 60) {
			System.out.println("work in urban areas only");
		} else {
			System.out.println("ERROR");
		}
	}

}
