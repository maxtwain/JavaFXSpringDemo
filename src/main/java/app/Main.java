package app;

import control.trigger.StartButton;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main extends Application {
    public static void main(String[] args) { launch(args); }

    public void start(Stage stage) {
        try(AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(
                wire.CustomViewConfig.class)) {

            view.grid.Overlay grid = ctx.getBean("bCustomGrid", view.grid.Overlay.class);

            StackPane root = new StackPane();
            root.getChildren().add(grid);
            stage.setScene(new Scene(root, 300, 250));

            new StartButton().prime();
            stage.show();
        }
    }
}