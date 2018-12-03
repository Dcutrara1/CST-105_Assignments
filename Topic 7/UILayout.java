import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//Name:		Daniel Cutrara
//Class:		CST/105
//Date:		12/02/18
//Instructor:	Dennis Attawia
//This is my own work.

public class UILayout extends Application
{
	NFLPlayer player;	

	@Override // Override the start method in the Application class
	  public void start(Stage primaryStage) 
	  {
		HBox hBox1 = new HBox(25);
		VBox vBox1 = new VBox(10);
		VBox vBox2 = new VBox(10);
		HBox hBox2 = new HBox(10);
		StackPane stackPane = new StackPane();
		
		/*******************************************************************/
		Scene scene = new Scene(hBox1);
		/*******************************************************************/
		
		ListView listView = new ListView();
		listView.getItems().add("All Players");
		listView.getItems().add("Offense Players");
		listView.getItems().add("Defense Players");
		listView.setPrefWidth(100);
		listView.setPrefHeight(75);
		
		/*******************************************************************/
		
		ChoiceBox choiceBox = new ChoiceBox();
		choiceBox.getItems().add("Search by Player Name");
		choiceBox.getItems().add("Search by Position");
		choiceBox.getItems().add("Search by Player Type");
		choiceBox.getItems().add("Search by College");
		choiceBox.getItems().add("Search by Years Pro");
		
		/*******************************************************************/
				
		Label label = new Label("Enter Search Value");
		TextField textField = new TextField();
		
		/*******************************************************************/
				
		Image NFLimage = new Image("NFLlogo.png");
		ImageView imageView = new ImageView(NFLimage);
	
		/*******************************************************************/
				
		TableView<NFLPlayer>allPlayers = new TableView<>();
		TableColumn colPlayerName = new TableColumn("Player Name");
		TableColumn colPlayerPostion = new TableColumn("Position");
		TableColumn colPlayerType = new TableColumn("Player Type");
		TableColumn colCollege = new TableColumn("College");
		TableColumn colYearsPro = new TableColumn("Years Pro");
		TableColumn colPlayerAge = new TableColumn("Age");
		TableColumn colHeight = new TableColumn("Height");
		TableColumn colWeight = new TableColumn("Weight");
		allPlayers.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
			
		/*******************************************************************/
		TableView<NFLPlayer>offPlayers = new TableView<>();
		TableColumn colOffPlayerName = new TableColumn("Player Name");
		TableColumn colOffPlayerPostion = new TableColumn("Position");
		TableColumn colOffPlayerType = new TableColumn("Player Type");
		TableColumn colOffCollege = new TableColumn("College");
		TableColumn colOffYearsPro = new TableColumn("Years Pro");
		TableColumn colOffPlayerAge = new TableColumn("Age");
		TableColumn colOffHeight = new TableColumn("Height");
		TableColumn colOffWeight = new TableColumn("Weight");
				
		/*******************************************************************/
		TableView<NFLPlayer>defPlayers = new TableView<>();
		TableColumn colDefPlayerName = new TableColumn("Player Name");
		TableColumn colDefPlayerPostion = new TableColumn("Position");
		TableColumn colDefPlayerType = new TableColumn("Player Type");
		TableColumn colDefCollege = new TableColumn("College");
		TableColumn colDefYearsPro = new TableColumn("Years Pro");
		TableColumn colDefPlayerAge = new TableColumn("Age");
		TableColumn colDefHeight = new TableColumn("Height");
		TableColumn colDefWeight = new TableColumn("Weight");
		
		/*******************************************************************/
		
		allPlayers.getColumns().addAll(colPlayerName, colPlayerPostion, colPlayerType, colCollege, 
				colYearsPro, colPlayerAge, colHeight, colWeight);
		offPlayers.getColumns().addAll(colOffPlayerName, colOffPlayerPostion, colOffPlayerType, colOffCollege, 
				colOffYearsPro, colOffPlayerAge, colOffHeight, colOffWeight);
		defPlayers.getColumns().addAll(colDefPlayerName, colDefPlayerPostion, colDefPlayerType, colDefCollege, 
				colDefYearsPro , colDefPlayerAge, colDefHeight, colDefWeight);
		
		/*******************************************************************/
		
		NFLManager managerList = new NFLManager();
		ObservableList<NFLPlayer> playerObjs = FXCollections.observableArrayList(managerList.Manager);
		allPlayers.setItems(playerObjs);
		
		/*******************************************************************/
		
		colPlayerName.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("name"));
		colPlayerPostion.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("position"));
		colPlayerType.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("playerType"));
		colCollege.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("college"));
		colYearsPro.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("yearsPro"));
		colPlayerAge.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("age"));
		colHeight.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("height"));
		colWeight.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("weight"));
		
		
		colOffPlayerName.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("name"));
		colOffPlayerPostion.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("position"));
		colOffPlayerType.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("playerType"));	
		colOffCollege.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("college"));
		colOffYearsPro.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("yearsPro"));
		colOffPlayerAge.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("age"));
		colOffHeight.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("height"));
		colOffWeight.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("weight"));
		
		colDefPlayerName.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("name"));
		colDefPlayerPostion.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("position"));
		colDefPlayerType.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("playerType"));	
		colDefCollege.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("college"));
		colDefYearsPro.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("yearsPro"));
		colDefPlayerAge.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("age"));
		colDefHeight.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("height"));
		colDefWeight.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("weight"));
		
		/*******************************************************************/
		
		Button btnSearch = new Button("Search Players");
		Button btnAddOff = new Button("Add Offense Players");
		Button btnAddDef = new Button("Add Defense Players");
		Button btnRemove = new Button("Remove Player");
		
		/*******************************************************************/
		
		vBox1.getChildren().addAll(listView, choiceBox, label, textField, btnSearch, imageView);
		hBox2.getChildren().addAll(btnAddOff, btnAddDef, btnRemove);
		stackPane.getChildren().addAll(offPlayers, defPlayers, allPlayers);
		vBox2.getChildren().addAll(stackPane, hBox2);
		hBox1.getChildren().addAll(vBox1, vBox2);
		
		/*******************************************************************/
		
		primaryStage.setTitle("NFL Draft");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		/*******************************************************************/
		btnRemove.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent e) 
			{
				int index = listView.getSelectionModel().getSelectedIndex();
				
				if (index == 1) 
				{				
					player = offPlayers.getSelectionModel().getSelectedItem();
					offPlayers.getItems().remove(player);
				}
				
				else if(index == 2)
				{
				
					player = defPlayers.getSelectionModel().getSelectedItem();
					defPlayers.getItems().remove(player);
				}
			}
		}
		);
						
		btnAddOff.setOnAction(new EventHandler<ActionEvent>() 		
		{
			public void handle(ActionEvent e) 
			{
				player = allPlayers.getSelectionModel().getSelectedItem();
				offPlayers.getItems().add(player);
				allPlayers.getSelectionModel().clearSelection();
			}
		}
		);
		
		btnAddDef.setOnAction(new EventHandler<ActionEvent>() 		
		{
			public void handle(ActionEvent e) 
			{
				player = allPlayers.getSelectionModel().getSelectedItem();
				defPlayers.getItems().add(player);
				allPlayers.getSelectionModel().clearSelection();
			}
		}
		);
		
		listView.setOnMouseClicked(new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent e) 
			{
				int index = listView.getSelectionModel().getSelectedIndex();
				if (index ==0) 
				{
					allPlayers.setVisible(true);
					offPlayers.setVisible(false);
					defPlayers.setVisible(false);
				}
				
				else if (index == 1) 
				{					
					offPlayers.setVisible(true);
					defPlayers.setVisible(false);
					allPlayers.setVisible(false);	
				}
				else if (index == 2) 
				{					
					defPlayers.setVisible(true);
					offPlayers.setVisible(false);
					allPlayers.setVisible(false);	
				}
			}
		});
		
	  }				
						
	public static void main(String[] args) 
	{ launch(args); }

}
