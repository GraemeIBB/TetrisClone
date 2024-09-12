package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;

public class MenuController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	
	public void goToSecondPage(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("game.fxml"));
		stage = (Stage)((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
