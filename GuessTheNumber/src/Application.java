import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		// Set Variables
		int min = 1;
		int max = 100;
		Scanner input = new Scanner(System.in);
		int guess = 0;
		boolean win = false;
		int tries = 0;
		
		// Find the Random Number
		int ans =min + (int)(Math.random()*((max - min) + 1));
		
		while (win == false) {
			// Prompt for User's Guess
			System.out.println("Enter You Guess (1-100): ");
			guess = input.nextInt();
			tries++;
			
			// Determine if Guessed Correctly
			if (guess > ans) {
				System.out.println("You are too high.\n");
			} else if (guess < ans) {
				System.out.println("You are too low.\n");
			} else {
				win = true;
			}			
		}
		
		// Output the Win and Close Input
		System.out.println("You Guessed Correctly!!!");
		System.out.println("The answer was " + ans + ".");
		System.out.println("It took you " + tries + " tries.");
		input.close();
		
	}

}
