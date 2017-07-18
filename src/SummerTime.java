import javax.swing.JOptionPane;

public class SummerTime {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("what is your name?");
	String grade = JOptionPane.showInputDialog("what grade are you going into?");
	String activity = JOptionPane.showInputDialog("what is your favorite thing you are doing this summer?");
	
	JOptionPane.showMessageDialog(null, "Hello " + name + "! You are going into grade "
	+ grade + ". \n That's a fun one! Have fun " + activity + "!" );
	
}
}
