package generalplay;

public class arrays {
	public static void main(String[] args) {
		String[] cars = {"Camaro", "Corvette", "Tesla"};
		System.out.println(cars[0]);
		
		String[][] carss = 	{	
				{"Camaro","Corvette","Silverado"},
				{"Mustang","Ranger","F-150"},
				{"Ferrari","Lambo","Tesla"}
			};
		for(int i=0; i<carss.length; i++) {
			System.out.println();
			for(int j=0; j<carss[i].length; j++) {
			System.out.print(carss[i][j]+" ");
			}
		}
	}

}
