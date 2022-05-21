package generalplay;
import java.util.Scanner;
public class doloops {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		do {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}while(name.isBlank());
		System.out.println("Welcome "+name);
		
	}
}