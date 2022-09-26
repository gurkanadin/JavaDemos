package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String message = "Veli Gürkan Adin";
		
		System.out.println(message);
		
		System.out.println("Character count :"+ message.length());
		System.out.println("5. character : "+message.charAt(4));
		System.out.println(message.concat(" Wouw!"));
		System.out.println(message.startsWith("A"));
		System.out.println(message.endsWith("n"));
		char[] characters = new char[7];
		message.getChars(0, 7, characters, 0);
		System.out.println(characters);
		
		System.out.println(message.indexOf('i'));
		System.out.println(message.lastIndexOf('i'));
		
		
		String newMessage = message.replace(' ', '-');
		System.out.println(newMessage);
		System.out.println(message);
		System.out.println(message.substring(7,10));
		
		
		
		for(String word: message.split(" ")) {
			System.out.println(word);
		}
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());
	
	
	}
	

}
