// Name:		Daniel Cutrara
// Class:		CST/105
// Date:		11/24/18
// Instructor:	Dennis Attawia
// This is my own work.

public class DefensePlayer extends NFLPlayer 
{	
	//Define Variables	
	private int gamesPlayed;		//Number of Games played this season 
	private int tackles;			//Total tackles this season
	private int sacks;				//Total Sacks for the season
	private int interceptions;		//Total interceptions for the season	
		
	//Constructors - No Arguments	
	public DefensePlayer() 
	{
		// Calls the constructor from the super class.
		super();
	}
	
	// Constructor - with Arguments				
	DefensePlayer(String name, String position, String playerType, String college, int yearsPro, int age, String height, 
			int weight, int gamesPlayed, int touchDowns, int tackles, int sacks, int interceptions)
	{
		super(name, position, playerType, college, yearsPro, age, height, weight, touchDowns);
		this.gamesPlayed = gamesPlayed;
		this.tackles = tackles;
		this.sacks = sacks;
		this.interceptions = interceptions;
	}

	//Get and Set number of games Played
	public int getGamesPlayed()
	{ return gamesPlayed; }
	public void setGamesPlayed(int _gamesPlayed)
	{ gamesPlayed = _gamesPlayed; }
		
	//Get and Set tackles
	public void setTackles(int _tackles)
	{ tackles = _tackles; }
	public int getTackles()
	{ return tackles; }

	//Get and Set sacks
	public void setSacks(int _sacks)
	{ sacks = _sacks; }
	public int getSacks()
	{ return sacks; }
	
	//Get and Set interceptions
	public void setInterceptions(int _interceptions)
	{ interceptions = _interceptions; }
	public int getinterceptions()
	{ return interceptions; }
	
	public void printDefensePlayer() 
	 {	     
	      System.out.println("Games Played:\t\t" + gamesPlayed );
	      System.out.println("Tackles:\t\t"+ tackles );
	      System.out.println("Sacks:\t\t\t" + sacks );
	      System.out.println("interceptions:\t\t" + interceptions );
	      System.out.println(" ");
	 }
	
	public void defenseTestDriver()
	 {	 	
		// Test create a Player of the DefensePlayer Class - No Arguments
		DefensePlayer player1  = new DefensePlayer();
		{		
			// Fill the properties of the Defense Player
			player1.setName("Mitchell Trubisky");
			player1.setPositon("QB");
			player1.setPlayerType("Offense");
			player1.setCollege("North Carolina"); 
			player1.setYearsPro(2);				
			player1.setAge(24); 
			player1.setHeight("6'3");	
			player1.setWeight(222);
			player1.setTouchDowns(22);			 
			player1.setGamesPlayed(9);
			player1.setGamesPlayed(9);
			player1.setTackles(14);
			player1.setSacks(8);
			player1.setInterceptions(5);
			 
			player1.printNFLPlayer();
			player1.printDefensePlayer();
		}
	}
}