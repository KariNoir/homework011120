package loops;

import java.util.Scanner;

public class WhileLoopPractice {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt user for message to display 5 times.
//		System.out.println("Enter a message.");
//		String message = input.nextLine();
//		
//		int count = 1;
//		
//		while (count <=5) {
//				System.out.println(message);
//				count ++;
//		}

		// create a simple number program

		int secretNumber = (int)(Math.random() * 10 + 1);
		System.out.println(secretNumber);
		
//		System.out.println ("Guess the number.");
//		System.out.println("Enter your guess: ");
//		int guess = input.nextInt();
//
//		while (guess != secretNumber) {
//			System.out.println("Incorrect...guess again ");
//			guess = input.nextInt();
//		}
//
//		System.out.println("You guessed it...great job");
//
	}
}