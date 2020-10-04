package view.button;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class Start extends Button {

    public Start(){
        setPadding(new Insets(5, 5, 5, 5));
        setText("Click Me!");
        GridPane.setHalignment(this, HPos.CENTER);
    }
}
