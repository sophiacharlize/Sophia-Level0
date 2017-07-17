
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChanger {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {

			// 3. ask the user what color they would like the tortoise to draw
			String answer = JOptionPane.showInputDialog("what color would you like the tortoise to draw: red, orange, yellow, green, blue, white, or black?");
			// 4. use an if/else statement to set the pen color that the user requested
			 if (answer.equals("red")) {
				Tortoise.setPenColor(Color.red);
			}

			else if (answer.equals("orange")) {
				Tortoise.setPenColor(Color.orange);
			}

			else if (answer.equals("yellow")) {
				Tortoise.setPenColor(Color.yellow);
			}

			else if (answer.equals("green")) {
				Tortoise.setPenColor(Color.green);
			}

			else if (answer.equals("blue")) {
				Tortoise.setPenColor(Color.blue);
			}

			else if (answer.equals("white")) {
				Tortoise.setPenColor(Color.white);
			}

			else if (answer.equals("black")) {
				Tortoise.setPenColor(Color.black);
			}
			// 5. if the user doesn’t enter anything, choose a random color
			else{ 
				Tortoise.setPenColor(PenColors.getRandomColor());
			}
		
		// 6. put a loop around your code so that you keep asking the user for more colors & drawing them

		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);
		// 1. make the tortoise draw a shape (this will take more than one line of code)

		Tortoise.penDown();
		Tortoise.setSpeed(10);
		for (int j = 0; j < 4; j++) {
			Tortoise.move(200);
			Tortoise.turn(90);
		}

	}}
}
