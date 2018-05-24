package application;

import javafx.application.Application;
import javafx.application.Platform;

import static javafx.application.Application.launch;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import java.util.*;

@SuppressWarnings("unused")
public class StartMenu extends Main
{
	Stage window;
	Scene s1, s2, s3;

	@Override
	public void start(Stage stage)
	{
		window = stage;
		window.setTitle("Dog Fight");

		//Title Menu
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER_RIGHT);
		grid.setHgap(800);
		grid.setVgap(200);

		grid.setPadding(new Insets(100,100,210,100));

		//Placing the button on the grid
		//Creating Button
		Button btn = new Button();
		btn.setText("START GAME");
		btn.setOnAction(event -> window.setScene(s3));
		GridPane.setConstraints(btn, 2, 1);
		grid.add(btn,0,2);

		/*Button btn2 = new Button();
		btn2.setText("HELP");
		btn2.setOnAction(event -> window.setScene(s2));
		GridPane.setConstraints(btn2, 2, 0);
		grid.add(btn2,1,2);*/


		//Setting the Background
		grid.setStyle("-fx-background-image: url('http://www.pngall.com/wp-content/uploads/2016/07/Space-PNG-Picture.png')");

		//Game Title
		Text text = new Text();
		text.setText("Dog \n   Fight");
		text.setFont(Font.loadFont("file:resources/fonts/Olga.ttf",  100));
		Color c = Color.CORNFLOWERBLUE;
		text.setFill(c);
		//Adding the title to the grid screen
		grid.add(text,0,1);


		//Game Scene
		GridPane grid3 = new GridPane();
		grid3.setAlignment(Pos.CENTER);
		grid3.setHgap(750);
		grid3.setVgap(250);
		grid3.setPadding(new Insets(100,100,210,100));

		Button btn3 = new Button();
		btn3.setText("EXIT");
		btn3.setOnAction(event -> Platform.exit());
		GridPane.setConstraints(btn3, 2, 0);

		grid3.add(btn3,0,2);

		grid3.setStyle("-fx-background-image: url(' https://data.whicdn.com/images/310430335/original.png?t=1523271564 ')");









		 s1 = new Scene(grid, 600, 600);
		 s3 = new Scene(grid3, 1000, 900);

		 window.setScene(s1);
		 window.show();




	}


	public static void main(String[] args)
	{
		launch(args);
	}

}


