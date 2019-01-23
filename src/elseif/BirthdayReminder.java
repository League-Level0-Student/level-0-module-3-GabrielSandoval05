
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 6th";
		String dadsBirthday = "August 26th";
		String myBirthday = "March 10th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday = JOptionPane.showInputDialog("Would you like to know about your dad's, mom's, or your birthday?");
		// 3. Print out what the user typed
		System.out.println(birthday); 
		// 4. if user asked for "mom"
			//print mom's birthday
		if(birthday.equalsIgnoreCase("Mom")) {
			System.out.println(momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else	if(birthday.equalsIgnoreCase("Dad")) {
			System.out.println(dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		else	if(birthday.equalsIgnoreCase("Mine")) {
			System.out.println(myBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			
			System.out.println("Sorry, i don't remember that person's birthday!");
		}
	} 
}
