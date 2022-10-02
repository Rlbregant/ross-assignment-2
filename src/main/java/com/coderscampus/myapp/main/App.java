package com.coderscampus.myapp.main;

import java.util.Random;
import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		new App().execute();
	}

	private void execute() {

		System.out.println("Welcome to the Guessing Game!");

		System.out.println("Pick a number between 1 and 100.");

		Random random = new Random();
		int randomNumber = random.nextInt(101);

		Scanner scanner = new Scanner(System.in);
		int totalGuesses = 5;
		

		while (totalGuesses >= 0) {

			int userInput = scanner.nextInt();

			if (userInput <= 0 || userInput >= 101) {

				System.out.println("Your guess is not between 1 and 100, please try again.");

			} else if (totalGuesses == 1 && userInput != randomNumber) {

				System.out.println("You lose, the number to guess was " + randomNumber + ".");
				break;

			} else if (userInput > randomNumber) {

				System.out.println("Please pick a lower number.");
				totalGuesses--;
				System.out.println("You have " + totalGuesses + " guesses remaining.");

			}

			else if (userInput < randomNumber) {
				System.out.println("Please pick a higher number.");
				totalGuesses--;
				System.out.println("You have " + totalGuesses + " guesses remaining.");

			}

			else {

				System.out.println("You Win!");
				break;
			}
			
		}
		scanner.close();
	}
}
