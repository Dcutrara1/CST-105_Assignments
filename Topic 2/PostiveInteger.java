import java.util.Scanner;

// Name:`		Daniel Cutrara
// Class:		CST-105
// Instructor:	Dennis Attawia
// Date:		10/28/2018
// This is my own work.

public class PostiveInteger 
{
	public static void main(String[] args) 
	{	
		// Create scanner for input
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a 5 digit positive number
		System.out.print("Enter a 5 digit positive number: ");
		int positiveNumber = input.nextInt();
		
		// Compute each Digit		
		// Divide by 10,000 to get 1st digit
		int firstDigit = positiveNumber / 10000;
		
		// Compute remaining 4 digits
		int thousands = positiveNumber % 10000;	
		
		// Divide by 1,000 to get 2nd Digit
		int secondDigit = thousands / 1000;
				
		// Compute 3 remaining digits
		int hundreds = thousands % 1000;		
		
		// Divide by 100 to get 3rd Digit.
		int thirdDigit = hundreds / 100;
		
		// Compute 2 remaining digits
		int tens = hundreds % 100;
		
		// Divide by 10 to get 4th Digit
		int fourthDigit = tens / 10;
				
		// Compute last remaining digit
		int fifthDigit = tens % 10;
				
		int sum = firstDigit + secondDigit + thirdDigit + 
				fourthDigit + fifthDigit;
		
		System.out.print("The sum of the 5 digits is " + sum);			
		
		input.close();
	}
}