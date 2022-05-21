package generalplay;
import java.util.Scanner;

public class nestedloops {

	public static void main(String[] args) {
		Scanner yayscanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol;
		
		System.out.println("enter # of rows: ");
		rows = yayscanner.nextInt();
		System.out.println("enter # of columns: ");
		columns = yayscanner.nextInt();
		System.out.println("Enter symbol to use");
		symbol = yayscanner.next();
		
		for(int i = 1; i <=rows; i++) {
			System.out.println();
			for(int j = 1; j<=columns; j++) {
				System.out.print(symbol);
				
			}
			
		}
		
		

	}

}
