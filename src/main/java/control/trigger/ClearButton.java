package control.trigger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ClearButton {
    private final view.button.Start button;

    public ClearButton(){
        try(AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(
                wire.CustomViewConfig.class)) {
            button = ctx.getBean("bClearButton", view.button.Start.class);
        }
    }

    public void prime(){
        button.setOnAction(event -> {
            new control.effect.CustomLabel().sayNothing();
        });
    }

    // more control functions
}
