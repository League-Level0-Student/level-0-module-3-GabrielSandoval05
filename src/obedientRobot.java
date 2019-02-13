import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientRobot {
	static Robot meme = new Robot();
	public static void main(String[] args) {
		
		meme.penDown();
		meme.setSpeed(10);
		for (int x = 0; x<6; x++) {
		String response = JOptionPane.showInputDialog("What color should the pen be? Magenta, Teal, or green?");
		if(response.equalsIgnoreCase("Teal")){
			meme.setPenColor(19, 232, 211);
		}
		else if(response.equalsIgnoreCase("Green")) {
			meme.setPenColor(21, 249, 21);
		}
		else if(response.equalsIgnoreCase("Magenta")) {
			meme.setPenColor(249, 21, 249);
		}
		else {
			JOptionPane.showMessageDialog(null, ("Sorry, i can't use that color!"));
		}
		String answer = JOptionPane.showInputDialog("What shape would you like to see, a square, triangle, or circle?");
		
	if(answer.equalsIgnoreCase("square")) {
		drawSquare();
	}
	else if(answer.equalsIgnoreCase("Circle")) {
		drawCircle();
	}
	else if(answer.equalsIgnoreCase("Triangle")) {
		drawTriangle();
	}
		}
		
		
}
public static void drawSquare() {
		
		for(int i = 0; i<5; i++) {
		meme.move(100);
		meme.turn(90);
		
		}
		}
public static void drawTriangle() {
	for(int i = 0; i<3; i++) {
		meme.move(100);
		meme.turn(360/3);
	}
}
public static void drawCircle() {
	for(int i =0; i<360; i++) {
	meme.move(2);
	meme.turn(360/360);
	}
}


}

