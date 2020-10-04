package view.grid;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class Overlay extends GridPane {

    public Overlay(view.button.Start startButton, view.button.Clear clearButton,
                   view.label.Result label){
        setPickOnBounds(false);
        add(startButton, 1, 1);
        add(label, 1, 2);
        add(clearButton, 1, 3);
        ColumnConstraints col0 = new ColumnConstraints();
        RowConstraints row0 = new RowConstraints();
        RowConstraints row1 = new RowConstraints();
        RowConstraints row2 = new RowConstraints();
        col0.setPercentWidth(40);
        row0.setPercentHeight(30);
        row1.setPercentHeight(50);
        row1.setPercentHeight(70);
        getColumnConstraints().addAll(col0);
        getRowConstraints().addAll(row0, row1, row2);
    }
}
