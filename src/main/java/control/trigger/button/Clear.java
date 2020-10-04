package control.trigger.button;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Clear {
    private final view.button.Clear button;

    public Clear(){
        try(AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(
                wire.OverlayConfig.class)) {
            button = ctx.getBean("bClearButton", view.button.Clear.class);
        }
    }

    public void prime(){
        button.setOnAction(event -> {
            new control.effect.label.Result().sayNothing();
        });
    }
}
