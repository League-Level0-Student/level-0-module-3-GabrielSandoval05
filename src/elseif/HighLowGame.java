//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(100) + 1;
		// ((high-low)+1)+low
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		for (int i = 0; i < 11; i++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response
			String response = JOptionPane.showInputDialog("What do you think my number is?");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int guess = Integer.parseInt(response);
			// 5. if the guess is correct
			if (guess== random) {
				JOptionPane.showMessageDialog(null, "You won!");

				// 6. Win
				System.exit(0);
			}
			// 12. Use "System.exit(0);" to quit the game if the user guessed the right
			// answer.
			
			// 7. if the guess is high
			// 8. Tell them it's too high
			if (guess > random) {
				JOptionPane.showMessageDialog(null, "Your guess is too high 420");
			}
			// 9. if the guess is low
			// 10. Tell them it's too low
			else if (guess < random) {
				JOptionPane.showMessageDialog(null, "Your guess is too low");
			}
			// 13. Tell them they lose
			JOptionPane.showMessageDialog(null, "R.I.P in the chat");
		}
	}

}
