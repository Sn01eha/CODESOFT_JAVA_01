package numberGuessingGame;
import java.util.Scanner;
import java.util.Random;
public class numberGuess {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String play = "yes";
		while(play.equals("yes")) {
			Random rand = new Random();
			int randNum = rand.nextInt(100);
			int guess = -1;
			int tries = 0;
			while(guess!=randNum) {
				System.out.print("guess a number between 1 and 100:");
				guess = reader.nextInt();
				tries++;
				if(guess == randNum) {
					System.out.println("Awesome you guessed it right!!");
					System.out.println("It only took you "+tries+" nguesses");
					System.out.println("would you like to play the game again? yes or no:");
					play = reader.next().toLowerCase();
				}
				else if(guess>randNum) {
					System.out.println("Your guess is too high. Try again!");
					
				}
				else {
					System.out.println("Your guess is too low. Try again!");
				}
			}
		}
		reader.close();
	}

}
