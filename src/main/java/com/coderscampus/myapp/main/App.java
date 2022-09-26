package com.coderscampus.myapp.main;

import java.util.Random;
import java.util.Scanner;

import com.coderscampus.myapp.service.MyService;

public class App {
	
	private MyService myService = new MyService();
	
	public static void main(String[] args) {
		new App().execute();
	}

	private void execute() {
		
		System.out.println("Welcome to the Guessing Game!");
		
		System.out.println("Pick a number between 1 and 100.");
		
		Random random = new Random();
		random.nextInt(101);
		
		Scanner scanner = new Scanner(System.in);
		
		int userInput = scanner.nextInt();
		
		
		System.out.println(“You lose, the number to guess was " + random.nextInt(101));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scanner.close();
		// Your code goes here, not in the main() method
		// This removes any need to consume statics
		// The code below is to be deleted once you understand what it does
		System.out.println(AppConstants.EXAMPLE_CONSTANT);
		System.out.println(" 2 * 17 = " + myService.multiply(2, 17));
		System.out.println("Contents of the file at " + AppConstants.EXAMPLE_FILE_PATH);
		System.out.println(myService.fileContents(AppConstants.EXAMPLE_FILE_PATH));
	}

}
