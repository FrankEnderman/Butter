package pack;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("starting cooking nightmare 1.2 Alpha");
		int ChocoAmount;
		int ChocoMin = 3;
		int flourAmount;
		int flourMin = 30;
		int MilkMin = 10;
		int MilkAmount;
		
		System.out.println("how many grams of chocolate do you have?");
		Scanner userInput;
		userInput = new Scanner(System.in);
		ChocoAmount = userInput.nextInt();
		System.out.println("you have " + ChocoAmount + " grams of chocolate in your stash");
		System.out.println("how much milk do you have?");
		Scanner userInput1;
		userInput1 = new Scanner(System.in);
		MilkAmount = userInput1.nextInt();
		System.out.println("you have " + MilkAmount + " milk in your stash");
		System.out.println("how many flour do you have?");
		Scanner userInput11;
		userInput11 = new Scanner(System.in);
		flourAmount = userInput11.nextInt();
		System.out.println("you have " + flourAmount + " grams of flour in your stash");
		
		if (ChocoAmount < ChocoMin || flourAmount < flourMin || MilkAmount < MilkMin) {
			System.out.println("no cookies today :(");
		} else {
			System.out.println("Cookies!!! go make some! :D");
		}
	
		}
	}
