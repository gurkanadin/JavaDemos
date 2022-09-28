package methods2;

public class Main {

	public static void main(String[] args) {
		String message = "Good Job";
		System.out.println(insert(message));
		System.out.println(total(13, 7));

	}

	public static String insert(String text) {
		return text + " Well Done";
	}

	public static int total(int number1, int number2) {
		return number1 + number2;
	}

}
