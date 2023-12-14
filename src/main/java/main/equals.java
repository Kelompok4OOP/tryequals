package main;

import java.io.File;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import static javafx.application.Application.launch;

/**
 * JavaFX App
 */
public class equals extends Application {

    private static Scene scene;

   @Override
    public void start(Stage stage) throws Exception {
        URL url = new File("src/main/java/view/Homepage.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("equals");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}