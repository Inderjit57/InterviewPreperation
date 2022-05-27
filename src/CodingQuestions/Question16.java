package CodingQuestions;
//Question: Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively
//by creating a class named 'Rectangle' with a method named 'Area' which returns the area and 
//length and breadth passed as parameters to its constructor.

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle1 = new Rectangle(4, 5);
		Rectangle rectangle2 = new Rectangle(5, 8);

		int area1 = rectangle1.Area();

		System.out.println("Area of Rectangle: " + area1);
		
		int area = rectangle2.Area();
		System.out.println(area);

	}

}
