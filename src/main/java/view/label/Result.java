package view.label;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class Result extends Label {

    public Result(){
        setText("");
        setPadding(new Insets(5, 5, 5, 5));
        GridPane.setHalignment(this, HPos.CENTER);
    }
}
