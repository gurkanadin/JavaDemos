package methods2;

public class Main {

	public static void main(String[] args) {
		String message = "Good Job";
		System.out.println(insert(message));
		System.out.println(total(13, 7));
		int number = totalNumber(2, 3, 4, 5, 6, 7, 8, 7, 8, 7, 8);
		System.out.println(number);

	}

	public static String insert(String text) {
		return text + " Well Done";
	}

	public static int total(int number1, int number2) {
		return number1 + number2;
	}

	public static int totalNumber(int... numbers) {
		int totalNumbers = 0;
		for (int number : numbers) {
			totalNumbers += number;
		}
		return totalNumbers;
	}

}
