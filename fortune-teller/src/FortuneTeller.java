import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		// Part 1 - Gathering Info
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Fortune Teller! Answer the following questions to have your Fortune read.");
		System.out.println("If at any time you would prefer not to have your fortune read simply type \"Quit.\"\n");

		// First and Last Names
		System.out.println("What is your first name?");
		String firstName = input.nextLine().trim();
		if (firstName.toLowerCase().contains("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		System.out.println("What is your last name?");
		String lastName = input.nextLine().trim();
		if (lastName.toLowerCase().contains("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		String firstCap = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
		String lastCap = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

		// Age
		System.out.println("How old are you?");
		String ageLine = input.nextLine();
		if (ageLine.toLowerCase().contains("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		int age = Integer.parseInt(ageLine);
		// Birth Month
		System.out.println("What month were you born in?");
		// input.nextLine();// this is to clear out any floating /n. was temporarily
		// fixed by changing
		// month's input to next, but this would not solve the floating /n problem
		// for some reason this would prompt two inputs and only the second input would
		// go into month

		String month = input.nextLine();
		if (month.toLowerCase().contains("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		int monthNum;
		switch (month.trim().toLowerCase()) {
		case "january":
			monthNum = 1;
			break;
		case "february":
			monthNum = 2;
			break;
		case "march":
			monthNum = 3;
			break;
		case "april":
			monthNum = 4;
			break;
		case "may":
			monthNum = 5;
			break;
		case "june":
			monthNum = 6;
			break;
		case "july":
			monthNum = 7;
			break;
		case "august":
			monthNum = 8;
			break;
		case "september":
			monthNum = 9;
			break;
		case "october":
			monthNum = 10;
			break;
		case "november":
			monthNum = 11;
			break;
		case "december":
			monthNum = 12;
			break;
		default:
			monthNum = 0;
		}

		// Color
		System.out.println("What's your favorite color of the rainbow?");
		System.out.println("If you do not know the colors of the rainbow, please enter \"help\"");
		String color = input.nextLine();
		if (color.toLowerCase().contains("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		while (color.trim().contains("help")) {
			System.out.println("The colors of the rainbow are easy! Just remember ROYGBIV.");
			System.out.println("ROYGBIV stands for: Red, Orange, Yellow, Green, Blue, Indigo, and Violet!");
			System.out.println("Which of those colors is your favorite?");
			color = input.nextLine();
		}

		if (color.trim().toLowerCase().contains("red")) {
			color = "red";
		} else if (color.trim().toLowerCase().contains("orange")) {
			color = "orange";
		} else if (color.trim().toLowerCase().contains("yellow")) {
			color = "yellow";
		} else if (color.trim().toLowerCase().contains("green")) {
			color = "green";
		} else if (color.trim().toLowerCase().contains("blue")) {
			color = "blue";
		} else if (color.trim().toLowerCase().contains("indigo")) {
			color = "indigo";
		} else if (color.trim().toLowerCase().contains("violet")) {
			color = "violet";
		}

		// Number of Siblings
		System.out.println("How many siblings do you have?");
		String siblings = input.nextLine();
		if (siblings.toLowerCase().contains("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		int nightmares = Integer.parseInt(siblings);

		input.close();

		// Part 2 - Fortune Telling
		// Determining Years to Retirement
		int retire;
		if (age >= 65) {
			retire = 3;// if already of retirement age, they'll retire in 3 years
		} else if (age % 2 == 1) {
			retire = 65 - age;// if odd, they will retire at 65
		} else {
			retire = 65 - age - 10;// if even, they will retire at 55
		}

		// Determining Where They'll Live
		String vhome;
		if (nightmares == 0) {
			vhome = "a timeshare with Elon Musk on Mars";
		} else if (nightmares == 1) {
			vhome = "Frankfurt, Germany";
		} else if (nightmares == 2) {
			vhome = "a virtual reality simulation";
		} else if (nightmares == 3) {
			vhome = "the Deep South";
		} else if (nightmares > 3) {
			vhome = "the Swiss Alps";
		} else {
			vhome = "a blackhole (you just had to be a smartass didn't you. well now your vacations are going to suck!)";
		}

		// Determining Transportation
		String travel;
		if (color.trim().equals("red")) {
			travel = " in a firetruck! Hurray for no traffic!";
		} else if (color.trim().equals("orange")) {
			travel = " in a beaten-up gray 2002 Honda Accord with a bright green driver's-side door. The Fortune Teller doesn't like orange, bad pick. ";
		} else if (color.trim().equals("yellow")) {
			travel = " in style with Kanye's signatue Rocket Shoes that let you fly through the air!";
		} else if (color.trim().equals("green")) {
			travel = " on a giant crab. Bonus: he pinches peope you don't like.";
		} else if (color.trim().equals("blue")) {
			travel = " in a Tesla Roadster! Schnazzy.";
		} else if (color.trim().equals("indigo")) {
			travel = " by bicycle and you'll be that guy who shows up to work all sweaty.";
		} else if (color.trim().equals("violet")) {
			travel = " on an elk as long as you feed him yummy apples.";
		} else {
			travel = " in the back part of a garbage truck.";
		}

		// Determining Money in da Bank
		String money;
		if (monthNum > 0 && monthNum <= 4) {
			money = "5,776,093.14";
		} else if (monthNum >= 5 && monthNum <= 8) {
			money = "928,374.98";
		} else if (monthNum >= 9 && monthNum <= 12) {
			money = "75,013.62";
		} else {
			money = "00.00";
		}

		// Part Three - Layin' Down some Fortunes
		System.out.println(firstCap + " " + lastCap + ", you will retire in " + retire + " years with $" + money
				+ " in the bank,\na vacation home in " + vhome + ",\nand you will travel" + travel);

	}

}
