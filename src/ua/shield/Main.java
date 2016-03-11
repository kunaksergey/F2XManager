package ua.shield;

import javafx.application.Application;
import javafx.stage.Stage;
import ua.shield.view.MainWindow;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        new MainWindow().start(primaryStage);
    }
    public static void main(String[] args) {
        launch(args);
    }
}
