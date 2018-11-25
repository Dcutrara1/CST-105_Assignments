// Name:		Daniel Cutrara
// Class:		CST-105
// Date:		11/24/2018
// Instructor:	Dennis Attawia
// This is my own work.

public class ProgrammingExercise7 
{
	public static void main(String[] args) 
	{		
		int count = 0;
		System.out.println("The palindromic prime numbers up to 100,000 are: ");
		
		for(int i = 2; i <= 100000; i++)
		{	
			isPrime(i);
			isPalindrome(i);
			
			if(isPrime(i)==true && isPalindrome(i)==true)
			{ 				
				if (count == 10)
				{
					System.out.printf("%-10s\n", i);
					count = 0;
				}
				else
				{
					count++;
					System.out.printf("%-10s", i);
				}
			}
		}
	}

	
	public static Boolean isPrime(int integer)
	{		
		// Loop created from 2 to half the original integer
		 for(int i = 2; i <= integer/2; ++i)
		 {	
			 if(integer % i == 0) 
			 {		 			
				return false;
				
			 }			
		 }
		 return true;	 
	}
	
	public static Boolean isPalindrome(int integer)
	{
		int num = integer;
		int originalInteger = num;
		int reversedInteger = 0;	
		int remainder = 0;

		 // reversed integer is stored in variable
        for( ;num != 0; num /= 10 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
        { 
        	return true;	
        }          
        return false;
	}
}
	
	