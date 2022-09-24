package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'D';

		switch (grade) {
		case 'A':
			System.out.println("Great : Pass");
			break;
		case 'B':
			System.out.println("Good : Pass");
			break;
		case 'C':
			System.out.println("Not Bad : Pass");
			break;
		case 'D':
			System.out.println("Bad : Didn't Pass");
			break;
		default:
			System.out.println("Invalid Grade");

		}

	}

}
