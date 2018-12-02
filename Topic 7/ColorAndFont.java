import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

//Name:		Daniel Cutrara
//Class:		CST/105
//Date:		12/02/18
//Instructor:	Dennis Attawia
//This is my own work.

public class ColorAndFont extends Application 
{
	 @Override // Override the start method in the Application class
	  public void start(Stage primaryStage) 
	 {    
		// Create a pane to hold the labels 
		 Pane pane = new HBox(20);
			pane.setPadding(new Insets(15, 15, 15, 15));
			
			for (int i = 0; i < 5; i++) 
			{		 
				// Create a label and set its properties
		    
				Label label = new Label(" Java ");
				label.setRotate(90);
				label.setTextFill(randomColor());
				label.setFont(Font.font("Times New Roman", 
						FontWeight.BOLD, FontPosture.ITALIC, 22));
				pane.getChildren().add(label);
			}
			
			// Create a scene and place it in the stage
			Scene scene = new Scene(pane);
			primaryStage.setTitle("Color and Font"); // Set the stage title
			primaryStage.setScene(scene); // Place the scene in the stage
			primaryStage.show(); // Display the stage
	 }
	 
	 public Color randomColor() 
	 {
		 // Generate random colors using RGBA
		 Random random = new Random();
		 int red = random.nextInt(255);   
		 int green = random.nextInt(255);
		 int blue = random.nextInt(255);
		 double opacity = random.nextDouble();
		 return Color.rgb(red, green, blue, opacity);
	 }
	 
	 public static void main(String[] args)
	 { launch(args); }

}
