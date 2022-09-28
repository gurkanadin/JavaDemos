package methods;

public class Main {

	public static void main(String[] args) {
		findNumber();

	}

	public static void findNumber() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int keyNumber = 5;
		boolean isThere = false;
		for (int number : numbers) {
			if (number == keyNumber) {
				isThere = true;
				break;
			}
		}
		String message = "";
		if (isThere) {
			message = "Array has the number " + keyNumber;
			showMessage(message);
		} else {
			message ="Array doesnt has the number "+ keyNumber;
			showMessage(message);
		}
	}
	public static void showMessage(String message) {
		System.out.println(message);
		
	}

}
