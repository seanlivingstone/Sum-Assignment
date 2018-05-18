package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Timer;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;


public class Main extends Application implements EventHandler<KeyEvent>
{
	Pane pane = new Pane();
	Scene scene = new Scene(pane,1600,1000);
	Rectangle rect = new Rectangle();
	public void start(Stage primaryStage) throws FileNotFoundException
	{
		Image image = new Image(new FileInputStream("C:\\Users\\na384344\\Downloads\\background.png"));
		Image image1 = new Image(new FileInputStream("C:\\Users\\na384344\\Downloads\\ship.png"));
		ImageView imageView = new ImageView(image);
		ImageView imageView1 = new ImageView(image1);
		imageView.setX(0);
		imageView.setY(0);
		pane.getChildren().add(imageView);

		rect.setX(300);rect.setY(300);
		rect.setWidth(100);rect.setHeight(100);
		rect.setFill(Color.RED);
		rect.setFill(new ImagePattern(image1));
		pane.getChildren().add(rect);

		scene.setOnKeyPressed(this);


		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("DogFight");
	}

	public void handle(KeyEvent event)
	{
		double x = 0, y = 0;
		if(event.getCode() == KeyCode.RIGHT)
		{
			x=5.0;
			rect.getTransforms().add(new Rotate(20,rect.getX() + rect.getWidth()/2,rect.getY() + rect.getHeight()/2));
		}
		if(event.getCode() == KeyCode.LEFT)
		{
			rect.getTransforms().add(new Rotate(-20,rect.getX() + rect.getWidth()/2,rect.getY() + rect.getHeight()/2));
		}
		if(event.getCode() == KeyCode.UP)
		{
			y=5.0;
			rect.setY(rect.getY()-y);
		}
		if(event.getCode() == KeyCode.DOWN)
		{
			y=5.0;
			rect.setY(rect.getY()+y);
		}
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}

