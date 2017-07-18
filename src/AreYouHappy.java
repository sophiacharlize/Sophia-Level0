import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("are you happy?");
	if(answer.equals("yes")) {
		JOptionPane.showMessageDialog(null, "keep doing what you're doing");
	}
	else{
		String response = JOptionPane.showInputDialog("Do you want to be happy?");
		 if(response.equals("yes")) {
			 JOptionPane.showMessageDialog(null, "change something");
		 }
		 
		 else{
			 JOptionPane.showMessageDialog(null, "keep doing whatever you're doing");
		 }
	}
}
}
