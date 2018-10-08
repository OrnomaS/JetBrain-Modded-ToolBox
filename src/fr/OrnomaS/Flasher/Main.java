package fr.OrnomaS.Flasher;

import com.jfoenix.controls.JFXProgressBar;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application
{
    static JFXProgressBar bar;
    static JFXProgressBar progressBar_install;
    private double xOffset = 0;
    private double yOffset = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ui.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Flasher");
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.getIcons().add(new Image("file:assets/Flasher.ico"));
        root.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        root.setOnMouseDragged(event -> {
            primaryStage.setX(event.getScreenX() - xOffset);
            primaryStage.setY(event.getScreenY() - yOffset);
        });
        Scene scene = new Scene(root, 230, 270);
        bar = (JFXProgressBar) loader.getNamespace().get("progressBar");
        progressBar_install = (JFXProgressBar) loader.getNamespace().get("progressBar_install");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }

    static void exitFlasher()
    {
        Platform.exit();
    }
}
