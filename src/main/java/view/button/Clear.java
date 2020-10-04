package view.button;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class Clear extends Button {

    public Clear(){
        setPadding(new Insets(5, 5, 5, 5));
        setText("Clear Text");
        GridPane.setHalignment(this, HPos.CENTER);
    }
}
