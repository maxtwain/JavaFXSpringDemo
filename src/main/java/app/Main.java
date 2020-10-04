package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) { launch(args); }

    public void start(Stage stage) {
        view.button.Start startButton = new view.button.Start();
        view.button.Clear clearButton = new view.button.Clear();
        view.label.Result resultLabel = new view.label.Result();
        view.grid.Overlay overlayGrid = new view.grid.Overlay(startButton,
                clearButton, resultLabel);

        control.effect.label.Result resultLabelControl = new control.effect.label.Result();

        new control.trigger.button.Start().prime(startButton,
                resultLabelControl, resultLabel);
        new control.trigger.button.Clear().prime(clearButton,
                resultLabelControl, resultLabel);

        StackPane root = new StackPane();
        root.getChildren().add(overlayGrid);
        stage.setScene(new Scene(root, 300, 250));
        stage.show();
    }
}