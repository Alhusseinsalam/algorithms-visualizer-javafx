package dev.husein.algovisualizerjavafx.ui;

import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class App extends Application {
    private static TextField tfId;
    private static TextField tfName;
    private static TextField tfAge;

    @Override
    public void start(Stage mainStage) throws Exception {
        tfId = new TextField();
        tfName = new TextField();
        tfAge = new TextField();
        mainStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

