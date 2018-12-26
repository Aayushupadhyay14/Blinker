package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{
	
	private Stage window;
	
	public static void main(String[]args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Blinker App");
		
		BorderPane root = new BorderPane();
		
		Text text = new Text();
		text.setId("font");
		text.setText("Blinker");
		root.setTop(text);
		
		
		Button button1 =new Button();
		button1.setText("Start");
		button1.setPrefSize(100, 100);
		
		Button button2 =new Button();
		button2.setText("Timer mode");
		button2.setPrefSize(120,100);
		
		FlowPane  flowPane  = new FlowPane(); 
		flowPane.setAlignment(Pos.CENTER);
		
		flowPane.setHgap(100);
		flowPane.setVgap(10);
		flowPane.setPrefWrapLength(10);
		flowPane.getChildren().addAll(button1, button2);
		
		
		root.setCenter(flowPane);
		
		
		
		
		
		
		Scene scene = new Scene(root,350,250);
		scene.getStylesheets().add("/application/application.css");
		window.setScene(scene);
		
		window.show();
		
		
		
		
		
		
	}
	
}