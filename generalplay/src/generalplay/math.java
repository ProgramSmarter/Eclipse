package generalplay;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class math {

	public static void main(String[] args) {
		double firstleg = Double.parseDouble(JOptionPane.showInputDialog("HYPOTENUSE CALCULATOR:\nEnter the value of the first leg."));
		double secondleg = Double.parseDouble(JOptionPane.showInputDialog("Now enter the value of the second leg."));
		double firstlegsquare = firstleg*firstleg;
		double secondlegsquare = secondleg*secondleg;
		double hypotenusesquare = secondlegsquare+firstlegsquare;
		hypotenusesquare = Math.sqrt(hypotenusesquare); //using math class to find square root
		JOptionPane.showMessageDialog(null, "The hypotenuse's value is " + hypotenusesquare);

	}
	


}
