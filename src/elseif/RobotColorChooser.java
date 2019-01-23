//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot meme = new Robot();
		meme.setSpeed(10);
		for (int i = 0; i < 6; i++) {

			// 3. Ask the user what color they would like the robot to draw
			String response = JOptionPane.showInputDialog("What color would you like the robot to draw with?");
			// 5. Use an if/else statement to set the pen color that the user requested
			if (response.equalsIgnoreCase("red")) {
				meme.setPenColor(255, 0, 0);
			} else if (response.equalsIgnoreCase("blue")) {
				meme.setPenColor(0, 0, 255);
			} else if (response.equalsIgnoreCase("Teal")) {
				meme.setPenColor(0, 255, 188);
			} else if (response.equalsIgnoreCase("Magenta")) {
				meme.setPenColor(255, 0, 239);
			} else if (response.equalsIgnoreCase("green")) {
				meme.setPenColor(77, 255, 0);
			}
			else if (response.equalsIgnoreCase("random")) {
				meme.setRandomPenColor();
			}
			// 6. If the user doesn’t enter anything, choose a random color
			else if (response.equalsIgnoreCase("")) {
				meme.setRandomPenColor();
			}
			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 4. Set the pen width to 10
			meme.setPenWidth(10);
			// 2. Make the robot draw a shape (this will take more than one line of code)
			meme.penDown();
			meme.move(200);
			meme.turn(90);
			meme.move(200);
			meme.turn(90);
			meme.move(200);
			meme.turn(90);
			meme.move(200);
			meme.turn(90);
		}
	}
}
