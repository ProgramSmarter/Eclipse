package generalplay;
import javax.swing.JOptionPane;

public class simplegui {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name ");
		JOptionPane.showMessageDialog(null, "Hello " + name );
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you? "));
		JOptionPane.showMessageDialog(null, "Nice! You are " + age + " years old!");
		
		
	}

}
