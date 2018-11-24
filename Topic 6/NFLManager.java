import java.util.ArrayList;
import java.util.Scanner;

// Name:		Daniel Cutrara
// Class:		CST/105
// Date:		11/24/18
// Instructor:	Dennis Attawia
// This is my own work.

public class NFLManager
{
	// Define variables 
	String teamName;
	int numberOffensePlayers = 0;
	int numberDefensePlayers = 0;
		
	// Create an array for the NFL Manager Team
	ArrayList<NFLPlayer> Manager = new ArrayList<>(10);
	
	// Create Constructor - No Arguments
	public NFLManager() 
	{
		System.out.println("No Player Name and Stats added");
	}
	
	// Create Constructor  with Arguments
	public NFLManager(String teamName)
	{
		this.teamName = teamName;	
	}
	
	public void createOffensePlayers()
	{
		System.out.println("Enter the number of Offense Players to add: ");
		Scanner input = new Scanner(System.in);
		numberOffensePlayers = input.nextInt();
						
		for (int i = 0; i <= numberOffensePlayers ; i++)		
		{ Manager.add(new OffensePlayer()); }	
		
		input.close();
	}
	
	public void createDefensePlayers()
	{			
		System.out.println("Enter the number of Defense Players to add: ");
		Scanner input2 = new Scanner(System.in);
		numberDefensePlayers = input2.nextInt();
		
		for (int i = 0; i <= numberDefensePlayers ; i++)
		{ Manager.add(new DefensePlayer()); }
		
		input2.close();
	}
	
	public void testOffenseDriverMethod()
	{
		// Create 2 NFL Manager teams
		NFLManager Bob = new NFLManager();	
				
		// Show no players have been added yet
		System.out.println(Bob.Manager.isEmpty()); 
		
		//Add Offense Players to Bob's team
		Bob.createOffensePlayers();
		System.out.println(Bob.Manager.isEmpty());	
	}
	
	public void testDefenseDriverMethod()
	{
		// Create 2 NFL Manager teams	
		NFLManager Mike = new NFLManager();

		// Show no players have been added yet		
		System.out.println(Mike.Manager.isEmpty()); 
				
		// Add Defense Players to Mike's team
		Mike.createDefensePlayers();
		System.out.println(Mike.Manager.isEmpty());
	}
}
