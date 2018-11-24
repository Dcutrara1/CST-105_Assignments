import java.util.ArrayList;

// Name:		Daniel Cutrara
// Class:		CST/105
// Date:		11/18/18
// Instructor:	Dennis Attawia
// This is my own work.

public class NFLManager
{
	// Define variables 
	String teamName;
		
	// Create an array for the NFL Manager Team
	ArrayList<NFLPlayer> team = new ArrayList<>(10);
	
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
	
	public void createPlayers()
	{
		for (int i = 0; i <= 10 ; i++)
		{ team.add(new NFLPlayer()); }
	}
	
	public void printTeam()
	{
		for (int j = 0; j <= 10 ; j++)

		{ System.out.println(team.indexOf(j)); }		
	}
	
	public void testDriverMethod()
	{
		// Create 2 NFL Manager teams
		NFLManager Bob = new NFLManager();	
		NFLManager Mike = new NFLManager("Bears");
		
		// Show no players have been added yet
		System.out.println(Bob.team.isEmpty()); 
		
		// Add Players to both teams
		Bob.createPlayers();
		Mike.createPlayers();
		
		// Show the players have been added
		System.out.println(Bob.team.isEmpty());
		System.out.println(Mike.teamName);
		
	}
}
