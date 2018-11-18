import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

// Name: 		Daniel Cutrara
// Class:		CST-105
// Date:		11/11/2018
// Instructor:	Dennis Attawia

public class ProgrammingExercise5
{	
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException 
	{
		
		// The name of the file to open.
		File file = new File("file.txt");
		Scanner scanner = new Scanner(file);       
		
		String line = scanner.nextLine();			
		char[] let = line.toCharArray();
				
		final int row = 20;
		final int col = 45;
		
		// Create a 2 Dimensional Array
		char [][] grid = new char[row][col];
		
		for (int i = 0; i < row; i++) 
		{		
		    for (int j = 0; j < col; j++) 
		    {
		       grid[i][j] = let[j];
		    }
		}
		scanner.close();
		
		for (int i = 0; i < grid.length; i++)
		{
			for (int j = 0; j < grid[i].length; j++) 
			{ 
				System.out.print(grid[i][j]); 		
			} 
			System.out.println();
		}	

		
		// Print reverse string
		for (int j = 0; j < grid.length; j++)
		{
			for (int i = 0; i < grid[j].length; i++)
			{
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}
}