package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String[] students = new String[4];
		students[0] = "Engin";
		students[1]= "Veli";
		students[2] = "Burak";
		students[3] = "Gürkan";
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		for(String student:students) {
			System.out.println(student);
		}

	}

}
