package input.controller;

import java.util.Scanner;

public class InputController
{
	private Scanner myInput;
	
	public InputController()
	{
		myInput = new Scanner(System.in);
	}
	
	public void start()
	{
		questions();
		questions();
		questions();
	}
	
	private void questions()
	{
		System.out.println("What is your name bro?");
		String input;
		input = myInput.next();
		myInput.nextLine();
		System.out.println("Your name is " + input);
		System.out.println("I didn't hear your godly last name man, please type it again.");
		String fullName = myInput.nextLine();
		System.out.println("You're such a slayer " + fullName);
		System.out.println("How old are you man?");
		int myAge = myInput.nextInt();
		System.out.println("That's killer " + input + " you look much older than " + myAge);
	}
}

