package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = {1.2,1.3,8.3,1.6};
		double total = 0;
		double max = myList[0];
		for(double number:myList) {
			if(max < number) {
				max = number;
			}
			total += number;
			System.out.println(number);
		}
		System.out.println("Total = " + total);
		System.out.println("Highest number is =  " + max);

	}

}