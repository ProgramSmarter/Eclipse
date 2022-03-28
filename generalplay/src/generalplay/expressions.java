package generalplay;

public class expressions {

	public static void main(String[] args) {
		int friends = 10;
		friends += 1; //add 1 to friends
		friends = friends + 1; //or you can use this equation to add 1 to friends
		friends++; //this is a shorthand way to add one, you can also do this with subtraction, but it only is increments/decrements of one.
		System.out.println(friends); //print out what friends is now
		
		friends = friends % 3; //modulus
		System.out.println(friends); //print out what friends is now
		
		friends = friends * 4; //multiplication
		System.out.println(friends); //print out what friends is now
		
		friends = friends / 3; //division
		System.out.println(friends); //print out what friends is now
		
		float siii = 10;
		siii = siii / 3; //if you divide an integer by a number, the remainder will be truncated. To solve this, use a float or double instead of an integer.
		System.out.println(siii);

	}

}
