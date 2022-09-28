package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		Calculate calculate = new Calculate();
		int answer = calculate.Plus(9, 12);
		System.out.println(answer);
		answer = calculate.Divide(24, 6);
		System.out.println(answer);
		System.out.println(calculate.Minus(18, 9));
		System.out.println(calculate.Times(19, 9));

	}

}
