package generalplay;
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		Random random = new Random(); //creating random object
		int x = random.nextInt(6)+1; //assigning random value to x
		System.out.println(x); //printing x
	}

}
