package control.trigger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class StartButton {
    private final view.button.Start button;

    public StartButton(){
        try(AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(
                wire.CustomViewConfig.class)) {
            button = ctx.getBean("bStartButton", view.button.Start.class);
        }
    }

    public void prime(){
        button.setOnAction(event -> {
            new control.effect.CustomLabel().sayHello();
        });
    }

    // more control functions
}
