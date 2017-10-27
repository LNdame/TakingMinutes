package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static Parent root;
    public static Stage stage;
    public static Scene scene;
    public static Page[] pages;

    @Override
    public void start(Stage primaryStage) throws Exception {
        pages = new Page[0];
        stage = primaryStage;
        root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setTitle("Minutes");
        stage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
