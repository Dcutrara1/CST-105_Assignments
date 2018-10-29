import java.util.*;
// Name:		Daniel Cutrara
// Class:		CST-105
// Instructor:	Dennis Atawia
// Date:		10/28/2018
// This is my own work.

public class TemperatureConversion
{
	public static void main(String[] args)
	{
		// Scanner for user input. 
		Scanner input = new Scanner(System.in);
		
		// Prompt user for Degrees Fahrenheit. 
		System.out.print("Enter the degrees in Fahrenheit: ");
		int fahrenheit = input.nextInt();
		
		// Convert the temperature to degrees Celsius. 
		double celsius = (fahrenheit - 32) * (5.0 / 9);

		System.out.println(fahrenheit + "F is equivalent to " + celsius + "C");	
		System.out.println(" ");	
		
				
		// Prompt user for Degrees Fahrenheit. 		
		
		System.out.print("Enter the degrees in Celsius: ");		
		double celsius2  = input.nextDouble();
		
		// Convert the temperature to degrees Fahrenheit.
		int fahrenheit2 = (int) (celsius2 * (9.0 / 5) + 32);
		
		System.out.println(celsius2 + "C is equivalent to " + fahrenheit2 +"F");
		
		input.close();		
	}
}