package application;

import javafx.application.Application;
import static javafx.application.Application.launch;



import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.util.*;

@SuppressWarnings("unused")
public class StartMenu extends Main
{

	@Override
	public void start(Stage stage)
	{
		//Creating Button
		Button btn = new Button();
		btn.setText("START GAME");
		btn.setOnAction(event -> startGame());

		Text text = new Text();
		text.setText("Dog Fight");
		text.setX(400);
		text.setY(100);


		GridPane grid = new GridPane();


		grid.setAlignment(Pos.CENTER);
		grid.setHgap(750);


		grid.setVgap(250);
		grid.setPadding(new Insets(100,100,200,100));

		//Placing the button on the grid
		grid.add(btn,0,2);

		//Setting the Background
		grid.setStyle("-fx-background-image: url('http://www.pngall.com/wp-content/uploads/2016/07/Space-PNG-Picture.png')");



		Scene scene = new Scene(grid, 600, 600);

		stage.setTitle("Dog Fight");
		stage.setScene(scene);
		stage.show();


	}


	public void startGame()
	{


	}
	public static void main(String[] args)
	{
		launch(args);
	}

}


