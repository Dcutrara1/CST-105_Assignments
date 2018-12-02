import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

//Name:		Daniel Cutrara
//Class:		CST/105
//Date:		12/02/18
//Instructor:	Dennis Attawia
//This is my own work.

public class DisplayThreeCards extends Application
{
	@Override // Override the start method in the Application class
	  public void start(Stage primaryStage) 
	  {
		  // Create an array of cards
		ArrayList<Integer> cards = getCards();		
		
		// Create a pane to hold the image views
		Pane pane = new HBox(5);
		pane.setPadding(new Insets(5, 5, 5, 5));
		
		for (int i = 0; i < 3; i++) 
		{		
			Image image1 = new Image(cards.get(i) + ".png");
		
			// Resize images due to large size file
			ImageView image1v = new ImageView(); 
			image1v.setImage(image1);
			image1v.setFitWidth(150);
			image1v.setPreserveRatio(true);
			
			// Add image to pane
			pane.getChildren().add((image1v));
		}	
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Display Three Cards"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	  }
	  
	
	private ArrayList<Integer> getCards() 
	
	{
		// Create an array of 52 cards
		ArrayList<Integer> cards = new ArrayList<>();
		for (int i = 0; i < 52; i++) 
		{ cards.add(i + 1);	}
		
		// Shuffle the cards in random order
		java.util.Collections.shuffle(cards);
		return cards; 
	}
	
	public static void main(String[] args) 
	{ launch(args); }
}