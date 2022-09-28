package findNumber;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int keyNumber = 5;
		boolean isThere = false;
		for (int number : numbers) {
			if (number == keyNumber) {
				isThere = true;
				break;
			}
		}
		if (isThere) {
			System.out.println("Array  has the number");
		} else {
			System.out.println("Array doesnt has the number");
		}
	}

}
