package org.alfalfa.fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @Author : Val
 * @Created : 2016-01-12
 * @E-mail : valer@126.com
 * @Version : 1.0
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {

		FXMLLoader loader = new FXMLLoader(Main.class.getResource("main.fxml"));
		loader.load();

		primaryStage.setScene(new Scene(loader.getRoot(), 800, 600));

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
