package dev.husein.algovisualizerjavafx.ui;

import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage mainStage) throws Exception {
        mainStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

