import java.util.Random;
import java.util.Scanner;


public class GuessingGame 
{
	public static void main(String[] args) 
	{
		// Generate a random number between 0 and 10000 including 10000
		Random rand = new Random();
		int min = 1;							
		int max = 10000;			
				
		int number = rand.nextInt((max - min) + 1) + min;
	
		// Create a scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a guess between 1 and 10000: ");
		int guess = input.nextInt();
		
		// Create a variable to count guesses
		int guesses = 0;
		
		// Compare guess to number
		while (guess != number)
		{		
			if(guess < number)				
			{ 
			System.out.println("HIGHER");
			if(guess > min )
			{ min = guess + 1; }
			System.out.println("Enter a guess between " + min + " and " + max); 
			guess = input.nextInt();
			}
		
			else if (guess > number)
			{
			System.out.println("LOWER");
			if(guess < max)
			{max = guess - 1; }
			System.out.println("Enter a guess between " + min + " and " + max);	
			guess = input.nextInt();
			}
			guesses++;
		}
		
		// Let them know how many guesses it took to win. 
		System.out.println("You are right! It took you " + guesses + " guesses." ); 
		
		System.out.println(number);		
	}
}
