package control.effect.label;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Result {
    view.label.Result label;

    public Result(){
        try(AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(
                wire.OverlayConfig.class)) {
            label = ctx.getBean("bResultLabel", view.label.Result.class);
        }
    }

    public void sayHello(){
        label.setText("Hello World!");
    }
    public void sayNothing(){
        label.setText("");
    }
}
