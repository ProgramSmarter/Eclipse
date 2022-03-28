package generalplay;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		//Scanners
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's your name? "); //name scanner prompt
		String name = scanner.nextLine(); //name scanner
		System.out.println("How old are you? "); //age scanner prompt
		int age = scanner.nextInt(); //age scanner
		System.out.println("What's your favorite food? ");
		scanner.nextLine();
		String food = scanner.nextLine();
		System.out.print("Hi " + name + "! Nice to meet you! "); //prints out response
		System.out.print("Wow! You are " + age + " years old! " + "Nice! I like "+food+" as well!"); // more response
		// End of scanners
		
		
	}

}
