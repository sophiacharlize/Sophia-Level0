import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot izpoo = new Robot("batman");
	izpoo.move(300);
	izpoo.penDown();
	izpoo.turn(90);
	izpoo.move(-200);
	izpoo.turn(90);
	izpoo.move(200);
	izpoo.turn(-90);
	izpoo.move(200);
	izpoo.turn(90);
	izpoo.move(200);
	izpoo.turn(90);
	izpoo.move(200);
}
}
