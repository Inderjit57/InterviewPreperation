package CodingQuestions;

public class Question14 {

	public static void main(String[] args) {
		String alpha = "Umbrella is for rain";

		if (alpha.contains("e")) {
			System.out.println(alpha.contains("e"));
		}

		// to print from index number and upto the end :
		// variableName.substring(<index>);
		System.out.println(alpha.substring(4));

		// to print from a word to the end:
		// variableName.substring(variable.indexOf("<StringValue>"))
		System.out.println(alpha.substring(alpha.indexOf("for")));

		String[] splitTheSentence = alpha.split("is");
		for (String s : splitTheSentence) {
			System.out.println(s);
		}

	}

}
