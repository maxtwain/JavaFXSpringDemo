package control.trigger.button;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Start {
    private final view.button.Start button;

    public Start(){
        try(AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(
                wire.OverlayConfig.class)) {
            button = ctx.getBean("bStartButton", view.button.Start.class);
        }
    }

    public void prime(){
        button.setOnAction(event -> {
            new control.effect.label.Result().sayHello();
        });
    }
}
