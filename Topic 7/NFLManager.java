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
	ArrayList<NFLPlayer> Manager = new ArrayList<>(20);
	
	// Create Constructor - No Arguments
	public NFLManager() 
	{
		createPlayers();
	}
	
	// Create Constructor  with Arguments
	public NFLManager(String teamName)
	{
		this.teamName = teamName;	
		createPlayers();
	}
	
	public void createPlayers()
	{		
		Manager.add(new DefensePlayer("Xavien Howard", "CB", "Defense", "Baylor", 3, 25, "6'2", 192, 11,
				0, 22, 0, 5));
		Manager.add(new OffensePlayer("Matt Ryan", "QB", "Offense", "Boston College", 11, 33, "6'4", 
			217, 11, 97, 0, 3683, 22, 310, 434, 24));
		Manager.add(new DefensePlayer("Blake Martinez", "LB", "Defense", "Stanford", 3, 24, "6'2", 237, 11,
			0, 60, 4, 0));
		Manager.add(new DefensePlayer("Aaron Donald", "DT", "Defense", "Pittsburg", 5, 27, "6'1", 280, 11,
			0, 25, 14, 0));
		Manager.add(new OffensePlayer("Ezekiel Elliott", "RB", "Offense", "Ohio State", 3, 23, "6'0", 
			228, 12, 1150, 423, 0, 240, 0, 0, 0));
		Manager.add(new OffensePlayer("James Conner", "RB", "Offense", "Pittsburg", 2, 23, "6'1", 
			233, 11, 849, 453, 0, 218, 0, 0, 0));
		Manager.add(new OffensePlayer("Mitchell Trubisky", "QB", "Offense", "North Carolina", 2, 24, "6'3", 
			222, 10, 611, 0, 2469, 51, 210, 321, 3));
		Manager.add(new DefensePlayer("Kyle Fuller", "CB", "Defense", "Virgina Tech", 5, 26, "5'11", 190, 11,
			0, 35, 0, 5));
		Manager.add(new OffensePlayer("Julio Jones", "WR", "Offense", "Alabama", 8, 29, "6'3", 
			220, 11, 12, 1305, 0, 84, 0, 0, 0));
		Manager.add(new DefensePlayer("Darius Leonard", "LB", "Defense", "South Carolina State", 1, 23, "6'2", 234, 10,
			0, 77, 6, 1));
	}
}
