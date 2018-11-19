// Name:		Daniel Cutrara
// Class:		CST/105
// Date:		11/18/18
// Instructor:	Dennis Attawia
// This is my own work.

public class NFLPlayer
{
	public static void main(String[] args) 
	{
		// Test create a Player of the NFLPlayer Class - No Arguments
		NFLPlayer player1 = new NFLPlayer();
		
		// Fill the properties of the player
		player1.name = "Mitchell Trubisky";
		player1.position = "QB";
		player1.playerType = "Offense";
		player1.college = "North Carolina";
		player1.yearsPro = 2;
		player1.age = 24;
		player1.height = "6'3";		
		player1.weight = 222;
		player1.gamesPlayed = 9;
		player1.runningYards = 320;
		player1.receivingYards = 0;
		player1.carriesRushing = 41;
		player1.completedPasses = 190;
		player1.attemptedPasses = 290;
		player1.passingYards = 2304;
		player1.touchDowns = 22;
		player1.tackles = 0;
		player1.sacks = 18;
		player1.interceptions = 7;
		
		player1.getCarriesPerGame();
		player1.getTotalYards();
		player1.getYardsPerGame();
		player1.getYardsPerCarry();
		player1.getYardsPerPass();	
		
		player1.printNFLPlayer();{}
					
	// Test create a player of the NFLPlayer Class using the arguments for each of the properties		
		NFLPlayer player2 = new NFLPlayer("Tre Boston", "DB", "Defense", "North Carolina", 5, 26, "6'1", 
				205, 8, 100, 20, 5, 25, 15, 2, 10, 41, 7, 3) {};				
		
		player2.printNFLPlayer();
	}
	
	//Define Variables
	
	String name; 			//Player Name
	String position; 		//Position Played
	String playerType;		//Offense, Defense, Special Teams
	String college;			//College attended
	int yearsPro;			//Number of Years in the Pro's
	int age;				//Player Age
	String height;			//Player Height
	int weight;				//Player Weight
	int gamesPlayed;		//Number of Games played this season
	int runningYards;		//Running Yards this season
	int receivingYards;		//Receiving Yards this season
	int passingYards;		//Total passing yards completed
	int totalYards;			//Total Yards this season (Running Yards + Receiving Yards)
	int carriesRushing;		//Total carries rushing
	double carriesPerGame;	//Number of total carries per game (carriesRushing / gamesPlayed)
	double yardsPerGame;	//Average Yards per game (Total Yards / Games)
	double yardsPerCarry;	//Average Yards per carry per game (Yards per Game / Carry)
	int completedPasses;	//Throws caught by receivers
	int attemptedPasses;	//Total # of passes made
	double yardsPerPass;	//Average Yards per each completed pass (passingYards / completedPasses)
	int touchDowns;			//Total TouchDowns this season
	int tackles;			//Total tackles this season
	int sacks;				//Total Sacks for the season
	int interceptions;		//Total interceptions for the season
	
	//Constructors
	
	//No Arguments
	NFLPlayer() {}
	
	//Argument for each of the properties	
	NFLPlayer(String name, String position, String playerType, String college, int yearsPro, int age, String height, 
			int weight, int gamesPlayed, int runningYards, int recevingYards, int passingYards, int carriesRushing, 
			int completedPasses, int attemptedPasses, int touchDowns, int tackles, int sacks, int interceptions) {}
	
	//Methods	

	//Get and Set Name
	public void setName (String _name)
	{ name = _name; }
	public String getName ()
	{ return name; }
	
	//Get and Set Position
	public void setPositon (String _position)
	{ position = _position; }
	public String getPosition ()
	{ return position; }
	
	//Get and Set Player Type
	public void setPlayerType(String _playerType)
	{ playerType = _playerType; }
	public String getPlayerType()
	{ return playerType; }
	
	//Get and Set College
	public void setCollege(String _college)
	{ college = _college; }
	public String getCollege()
	{ return college; }
	
	//Get and set Year in the pro's
	public void setYearsPro(int _yearsPro)
	{ yearsPro = _yearsPro; }
	public int getYearsPro()
	{ return yearsPro; }
	
	//Get and Set Player Age
	public void setAge(int _age)
	{ age = _age; }
	public int getAge()
	{ return age; }
	
	//Get and Set player height
	public void setHeight(String _height)
	{ height = _height; }
	public String getHeight()
	{ return height; }
	
	//Get and Set player weight
	public void setWeight(int _weight)
	{ weight = _weight; }
	public int getWeight()
	{ return weight; }
	
	//Get and Set number of games Played
	public void setGamesPlayed(int _gamesPlayed)
	{ gamesPlayed = _gamesPlayed; }
	public int getGamesPlayed()
	{ return gamesPlayed; }
	
	//Get and set runningYards
	public void setRunningYards(int _runningYards)
	{ runningYards = _runningYards; }
	public int getRunningYards()
	{ return runningYards; }
	
	//Get and Set receivingYards
	public void setReceivingYards(int _receivingYards)
	{ receivingYards = _receivingYards; }
	public int getReceivingYards()
	{ return receivingYards; }
	
	//Get and Set Passing Yards	
	public void setPassingYards(int _passingYards)
	{ passingYards = _passingYards; }	
	public int passingYards()	
	{ return passingYards; }
	
	//Get and Set total Yards this season
	public void setTotalYards(int _totalYards)
	{ totalYards = _totalYards; }
	public int getTotalYards()
	{ return totalYards = runningYards + receivingYards; }
	
	//Get Carries for the season
	public void setCarriesRushing(int _carriesRushing)
	{ carriesRushing = _carriesRushing; }
	public int getCarriesRushing()
	{ return carriesRushing; }
	
	//Get and Set carries Per Game
	public void setCarriesPerGame(double _carriesPerGame)
	{ carriesPerGame = _carriesPerGame; }
	public double getCarriesPerGame()
	{ return carriesPerGame = carriesRushing / gamesPlayed; }	

	//Get and Set Yards per game
	public void setYardsPerGame(double _yardsPerGame)
	{ yardsPerGame = _yardsPerGame; }
	public double getYardsPerGame()
	{ return yardsPerGame = totalYards / gamesPlayed; }
	
	//Get and Set Yards Per Carry
	public void setYardsPerCarry(double _yardsPerCarry)
	{ yardsPerCarry = _yardsPerCarry;}
	public double getYardsPerCarry()
	{ return yardsPerCarry = yardsPerGame / carriesPerGame; }
	
	//Get and Set Completed Passes
	public void setCompletedPasses(int _completedPasses)
	{ completedPasses = _completedPasses; }
	public int getCompletedPasses()
	{ return completedPasses; }
	
	//Get and Set Attemped Passes
	public void setIncompletePasses(int _attemptedPasses)
	{ attemptedPasses = _attemptedPasses; }
	public int getIncompletePasses()
	{ return attemptedPasses; }
	
	//Get and Set yards Per Completed Pass
	public void setYardsPerPass(double _yardsPerPass)
	{ yardsPerPass = _yardsPerPass; }
	public double getYardsPerPass()
	{ return yardsPerPass = passingYards / completedPasses; }
	
	//Get and Set touchDowns
	public void setTouchDowns(int _touchDowns)
	{ touchDowns = _touchDowns; }
	public int getTouchDowns()
	{ return touchDowns; }
	
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
	
	 public void printNFLPlayer() 
	 {
	      System.out.println("Name:\t\t\t" + name );
	      System.out.println("Position:\t\t" + position );
	      System.out.println("PlayerType:\t\t" + playerType );
	      System.out.println("College:\t\t" + college);
	      System.out.println("Years in Pro's:\t\t"+ yearsPro );
	      System.out.println("Age:\t\t\t" + age );
	      System.out.println("Height:\t\t\t" + height );
	      System.out.println("Weight:\t\t\t" + weight);
	      System.out.println("Games Played:\t\t" + gamesPlayed );
	      System.out.println("Running Yards:  \t" + runningYards );
	      System.out.println("Receiving Yards: \t" + receivingYards );
	      System.out.println("Passing Yards:\t\t" + passingYards );
	      System.out.println("Total Yards:\t\t" + totalYards);
	      System.out.println("Rushing Carries:\t" + carriesRushing);
	      System.out.println("Carries a Game: \t" + Math.round(carriesPerGame*100)/100.0 );
	      System.out.println("Yards a Game:\t\t" + Math.round(yardsPerGame*100.0)/100.0 );
	      System.out.println("Yards a Carry:\t\t" + Math.round(yardsPerCarry*100)/100.0 );
	      System.out.println("Completed Pass:\t\t" + completedPasses);
	      System.out.println("Attempted Pass:\t\t" + attemptedPasses);	      
	      System.out.println("Yards per Pass:\t\t" + Math.round(yardsPerPass*100.0)/100.0 );
	      System.out.println("TouchDowns:\t\t" + touchDowns);
	      System.out.println("Tackles:\t\t"+ tackles );
	      System.out.println("Sacks:\t\t\t" + sacks );
	      System.out.println("interceptions:\t\t" + interceptions );
	      System.out.println(" ");
	 }
}
