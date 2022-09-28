package methodsOverloading;

public class Main {

	public static void main(String[] args) {
		Calculate calculate = new Calculate();
		System.out.println(calculate.plus(3, 4));
		System.out.println(calculate.plus(2, 3,4)); 
	}

}
