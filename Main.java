package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


public class Main extends Application
{
	Pane pane = new Pane();
	Scene scene = new Scene(pane,1600,1000);
	public void start(Stage primaryStage) throws FileNotFoundException
	{
		Image image = new Image(new FileInputStream("C:\\Users\\na384344\\Downloads\\background.png"));
		ImageView imageView = new ImageView(image);
		imageView.setX(0);
		imageView.setY(0);
		pane.getChildren().add(imageView);

		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("DogFight");
	}

	public void takeInput()
	{

	}

	public static void main(String[] args)
	{
		launch(args);
	}
}
