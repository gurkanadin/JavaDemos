package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int number1 = 20;
		int number2 = 25;
		int number3 = 2;
		
		int  highest = number1;
		
		if(highest< number2) {
			highest = number2;
		}
		if(highest< number3) {
			highest = number3;
		}
		
		System.out.println("Highest number is " +highest);
		
	}

}
