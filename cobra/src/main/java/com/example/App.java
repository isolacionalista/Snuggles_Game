package com.example;

import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
//import javafx.event.ActionEvent;
import javafx.scene.control.Button;

//import java.io.IOException;

public class App extends Application {
	Button button;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Snuggles");
		button = new Button();
		button.setText("woooooo");

		StackPane layout = new StackPane();
		layout.getChildren().add(button);

		Scene scene = new Scene(layout, 400, 350);
		primaryStage.setScene(scene);
		primaryStage.show();
		}
}