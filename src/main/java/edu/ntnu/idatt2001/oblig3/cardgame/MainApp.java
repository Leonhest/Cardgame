package edu.ntnu.idatt2001.oblig3.cardgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application{

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/edu/ntnu/idatt2001/oblig3/cardgame/cardGUI.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Card game");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void init() throws Exception{
        super.init();
    }

    @Override
    public void stop() throws Exception{
        super.stop();
    }
}
