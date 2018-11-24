// Name:		Daniel Cutrara
// Class:		CST/105
// Date:		11/24/18
// Instructor:	Dennis Attawia
// This is my own work.

public class OffensePlayer extends NFLPlayer 
{
	//Define Variables
	private int gamesPlayed;		//Number of Games played this season
	private int runningYards;		//Running Yards this season
	private int receivingYards;		//Receiving Yards this season
	private int passingYards;		//Total passing yards completed
	private int totalYards;			//Total Yards this season (Running Yards + Receiving Yards)
	private int carriesRushing;		//Total carries rushing
	private double carriesPerGame;	//Number of total carries per game (carriesRushing / gamesPlayed)
	private double yardsPerGame;	//Average Yards per game (Total Yards / Games)
	private double yardsPerCarry;	//Average Yards per carry per game (Yards per Game / Carry)
	private int completedPasses;	//Throws caught by receivers
	private int attemptedPasses;	//Total # of passes made
	private double yardsPerPass;	//Average Yards per each completed pass (passingYards / completedPasses)
	
	//Constructor - No Arguments
	public OffensePlayer() 
	{
		// Calls the constructor from the super class.
		super();
	}
		
	// Constructor - with Arguments
	OffensePlayer(String name, String position, String playerType, String college, int yearsPro, int age, String height, 
		int weight, int gamesPlayed, int runningYards, int recevingYards, int passingYards, int carriesRushing, 
		int completedPasses, int attemptedPasses, int touchDowns)
	{
		super(name, position, playerType, college, yearsPro, age, height, weight, touchDowns);
		this.gamesPlayed = gamesPlayed;
		this.runningYards = runningYards;
		this.receivingYards = recevingYards;
		this.passingYards = passingYards;
		this.carriesRushing = carriesRushing;
		this.completedPasses = completedPasses;
		this.attemptedPasses = attemptedPasses;
	}
	
	//Get and Set number of games Played
	public int getGamesPlayed()
	{ return gamesPlayed; }
	public void setGamesPlayed(int _gamesPlayed)
	{ gamesPlayed = _gamesPlayed; }
		
	//Get and set runningYards
	public int getRunningYards()
	{ return runningYards; }
	public void setRunningYards(int _runningYards)
	{ runningYards = _runningYards; }
	
	//Get and Set receivingYards
	public int getReceivingYards()
	{ return receivingYards; }
	public void setReceivingYards(int _receivingYards)
	{ receivingYards = _receivingYards; }
	
	//Get and Set Passing Yards	
	public int passingYards()	
	{ return passingYards; }
	public void setPassingYards(int _passingYards)
	{ passingYards = _passingYards; }	
	
	//Get and Set total Yards this season
	public int getTotalYards()
	{ return totalYards = runningYards + receivingYards; }
	public void setTotalYards(int _totalYards)
	{ totalYards = _totalYards; }
	
	//Get Carries for the season
	public int getCarriesRushing()
	{ return carriesRushing; }
	public void setCarriesRushing(int _carriesRushing)
	{ carriesRushing = _carriesRushing; }
	
	//Get and Set carries Per Game
	public double getCarriesPerGame()
	{ return carriesPerGame = carriesRushing / gamesPlayed; }	
	public void setCarriesPerGame(double _carriesPerGame)
	{ carriesPerGame = _carriesPerGame; }

	//Get and Set Yards per game
	public double getYardsPerGame()
	{ return yardsPerGame = totalYards / gamesPlayed; }
	public void setYardsPerGame(double _yardsPerGame)
	{ yardsPerGame = _yardsPerGame; }
	
	//Get and Set Yards Per Carry
	public double getYardsPerCarry()
	{ return yardsPerCarry = yardsPerGame / carriesPerGame; }
	public void setYardsPerCarry(double _yardsPerCarry)
	{ yardsPerCarry = _yardsPerCarry;}
	
	//Get and Set Completed Passes
	public int getCompletedPasses()
	{ return completedPasses; }
	public void setCompletedPasses(int _completedPasses)
	{ completedPasses = _completedPasses; }
	
	//Get and Set Attempted Passes
	public int getAttemptedPasses()
	{ return attemptedPasses; }
	public void setAttemptedPasses(int _attemptedPasses)
	{ attemptedPasses = _attemptedPasses; }
	
	//Get and Set yards Per Completed Pass
	public double getYardsPerPass()
	{ return yardsPerPass = passingYards / completedPasses; }
	public void setYardsPerPass(double _yardsPerPass)
	{ yardsPerPass = _yardsPerPass; }
	
	 public void printOffensePlayer() 
	 {	  
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
		 System.out.println(" ");	
	 }
	
	 public void offenseTestDriver()
	 {	 		
		 // Test create a Player of the OffensivePlayer Class - No Arguments
		 OffensePlayer player1  = new OffensePlayer();
		 {			
			 // Fill the properties of the Offense Player			
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
			 player1.setRunningYards(320);
			 player1.setReceivingYards(0);
			 player1.setPassingYards(2304);
			 player1.setCarriesRushing(41);
			 player1.setCompletedPasses(190);
			 player1.setAttemptedPasses(290);
			 player1.setTouchDowns(22);					
			 player1.getCarriesPerGame();
			 player1.getTotalYards();
			 player1.getYardsPerGame();
			 player1.getYardsPerCarry();
			 player1.getYardsPerPass();	
			 
			 player1.printNFLPlayer();
			 player1.printOffensePlayer();
		 }
	 } 
}