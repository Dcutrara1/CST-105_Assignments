// Name:		Daniel Cutrara
// Class:		CST/105
// Date:		11/18/18
// Instructor:	Dennis Attawia
// This is my own work.

public abstract class NFLPlayer
{	
	//Define Variables
	private String name; 			//Player Name
	private String position; 		//Position Played
	private String playerType;		//Offense, Defense, Special Teams
	private String college;			//College attended
	private int yearsPro;			//Number of Years in the Pro's
	private int age;				//Player Age
	private String height;			//Player Height
	private int weight;				//Player Weight
	private int touchDowns;			//Total TouchDowns this season
	
	//Constructor - No Arguments
	NFLPlayer() {}
	
	//Constructor - Argument for each of the properties	
	NFLPlayer(String name, String position, String playerType, String college, int yearsPro, int age, String height, 
			int weight, int touchDowns)
	{
		this.name = name;
		this.position = position;
		this.playerType = playerType;
		this.college = college;
		this.yearsPro = yearsPro;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.touchDowns = touchDowns;
	}
	
	//Methods	

	//Get and Set Name
	public String getName ()
	{ return name; }
	public void setName (String _name)
	{ name = _name; }
	
	//Get and Set Position
	public String getPosition ()
	{ return position; }
	public void setPositon (String _position)
	{ position = _position; }
	
	//Get and Set Player Type
	public String getPlayerType()
	{ return playerType; }
	public void setPlayerType(String _playerType)
	{ playerType = _playerType; }
	
	//Get and Set College
	public String getCollege()
	{ return college; }
	public void setCollege(String _college)
	{ college = _college; }
	
	//Get and set Year in the pro's
	public int getYearsPro()
	{ return yearsPro; }
	public void setYearsPro(int _yearsPro)
	{ yearsPro = _yearsPro; }
	
	//Get and Set Player Age
	public int getAge()
	{ return age; }
	public void setAge(int _age)
	{ age = _age; }
	
	//Get and Set player height
	public String getHeight()
	{ return height; }
	public void setHeight(String _height)
	{ height = _height; }
	
	//Get and Set player weight
	public int getWeight()
	{ return weight; }
	public void setWeight(int _weight)
	{ weight = _weight; }
	
	//Get and Set touchDowns
	public int getTouchDowns()
	{ return touchDowns; }
	public void setTouchDowns(int _touchDowns)
	{ touchDowns = _touchDowns; }
	
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
	      System.out.println("TouchDowns:\t\t" + touchDowns);
	 }
}
