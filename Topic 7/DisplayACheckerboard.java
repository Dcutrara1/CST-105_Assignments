import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

//Name:		Daniel Cutrara
//Class:		CST/105
//Date:		12/02/18
//Instructor:	Dennis Attawia
//This is my own work.

public class DisplayACheckerboard extends Application 
{ 
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) 
	{ 			
		// Create a pane and set its properties
	    GridPane pane = new GridPane();
	    pane.setAlignment(Pos.CENTER);
	    
	    // Add rectangles to GridPane
	    int count = 0;
	    for (int row = 0; row < 8; row++) 
	    {
	    	count++;
	    	for (int col = 0; col < 8; col++)
	    	{
	    		Rectangle rectangle = new Rectangle(50,50,50,50);
				if (count % 2 == 0)	
				{ rectangle.setFill(Color.WHITE); }
				pane.add(rectangle, row, col);
				count++;
	    	}	    		
	    }	    

	 // Create a scene and place it in the stage
	    Scene scene = new Scene(pane);
	    primaryStage.setTitle("Checkerboard"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	  }

	public static void main(String[] args) 
	{ launch(args); }
}
