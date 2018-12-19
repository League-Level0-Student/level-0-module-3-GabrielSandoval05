//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String answer = JOptionPane.showInputDialog("Do you like the yellow/green products of a specific species of tree that conatins a lot of potassium?");
		//2. if they say no, 
		if(answer.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "You are a spawn of the darkest forces in thi multiverse");
			System.exit(0);
			//tell them they are crazy 
			//and end quiz
		}
		//3. if they say yes
		else if (answer.equalsIgnoreCase("yes")) {
			
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
		}
		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
	
	}

}
