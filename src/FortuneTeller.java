import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		
		//Part 1
		//Ask the user for the user’s first name.
		//Ask the user for the user’s last name.
		//Ask the user for the user’s age.
		//Ask the user for the user’s birth month (as an ‘int’).
		//Ask the user for the user’s favorite ROYGBIV color.
		//If the user does not know what ROYGBIV is, ask the user to enter “Help” to get a list of the ROYGBIV colors.
		//Ask the user for the user’s number of siblings.
		
		Scanner input = new Scanner(System.in);

		
		System.out.println("Welcome to Fortune Teller! Answer the following questions to have your Fortune read.");
		System.out.println("What is your first name?");
		String firstname = input.nextLine();
		System.out.println("What is your last name?");
		String lastname = input.nextLine();
		System.out.println("How old are you?");
		int age = input.nextInt();
		System.out.println("What month were you born in?");
		input.nextLine();
		String month = input.nextLine();
		int monthNum;
		switch (month.toLowerCase()) {
		case "january": monthNum = 1; break;
		case "february": monthNum = 2; break;
		case "march": monthNum = 3; break;
		case "april": monthNum = 4; break;
		case "may": monthNum = 5; break;
		case "june": monthNum = 6; break;
		case "july": monthNum = 7; break;
		case "august": monthNum = 8; break;
		case "september": monthNum = 9; break;
		case "october": monthNum = 10; break;
		case "november": monthNum = 11; break;
		case "december": monthNum = 12; break;
		default: System.out.println("You must have mispelled! Guess you'll have to start over.");
		System.exit(0);
		}
		
		System.out.println("What's your favorite color of the rainbow?");
		System.out.println("If you do not know the colors of the rainbow, please enter \"help\"");
		String color = input.nextLine().toLowerCase();
		if (color.contains("help")) {
			System.out.println("The colors of the rainbow are easy! Just remember ROYGBIV.");
			System.out.println("ROYGBIV stands for: Red, Orange, Yellow, Green, Blue, Indigo, and Violet!");
			System.out.println("Which of those colors is your favorite?");
			color = input.nextLine();
		} else {
			color = input.nextLine();
		}
		
		System.out.println("How many siblings do you have?");
		int nightmares = input.nextInt();
		
		
		
			
		
 
		
	}

}
