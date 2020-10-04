package view.grid;

import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

public class Overlay extends GridPane {

    public Overlay(view.button.Start startButton, view.button.Clear clearButton,
                   view.label.Result label){
        setPickOnBounds(false);
        setAlignment(Pos.CENTER);
        add(startButton, 0, 1);
        add(label, 0, 2);
        add(clearButton, 0, 3);
    }
}
