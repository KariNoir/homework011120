package loops;

import java.util.Scanner;

public class WhileLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a message.");
		String message = input.nextLine();
		
		int count = 1;
		
		while (count <=5) {
				System.out.println(message);
				count ++;
		}
	}

}
