package application;

import javafx.application.Application;
import javafx.application.Platform;

import static javafx.application.Application.launch;



import javafx.geometry.Insets;
import javafx.geometry.Pos;

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
	Scene s1, s2;

	@Override
	public void start(Stage stage)
	{
		window = stage;
		window.setTitle("Dog Fight");

		//Title Menu
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(750);
		grid.setVgap(250);
		grid.setPadding(new Insets(100,100,210,100));

		//Placing the button on the grid
		//Creating Button
		Button btn = new Button();
		btn.setText("START GAME");
		btn.setOnAction(event -> window.setScene(s2));
		GridPane.setConstraints(btn, 2, 0);
		grid.add(btn,0,2);


		//Setting the Background
		grid.setStyle("-fx-background-image: url('http://www.pngall.com/wp-content/uploads/2016/07/Space-PNG-Picture.png')");

		//Game Title
		//FontWeight fg = new FontWeight();
		Text text = new Text();
		text.setText("Dog Fight");
		text.setFont(Font.font("Arial", FontWeight.BOLD, 100));
		Color c = Color.BLUE;
		text.setFill(c);
		grid.add(text,0,1);


		//Game Scene
		GridPane grid2 = new GridPane();
		grid2.setAlignment(Pos.CENTER);
		grid2.setHgap(750);
		grid2.setVgap(250);
		grid2.setPadding(new Insets(100,100,210,100));

		Button btn2 = new Button();
		btn2.setText("EXIT");
		btn2.setOnAction(event -> Platform.exit());
		GridPane.setConstraints(btn2, 2, 0);

		grid2.add(btn2,0,2);








		 s1 = new Scene(grid, 600, 600);
		 s2 = new Scene(grid2, 600, 600);

		 window.setScene(s1);
		 window.show();




	}


	public static void main(String[] args)
	{
		launch(args);
	}

}


