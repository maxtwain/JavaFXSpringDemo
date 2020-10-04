package control.effect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import view.label.Result;

public class CustomLabel {
    Result label;

    public CustomLabel(){
        try(AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(
                wire.CustomViewConfig.class)) {
            label = ctx.getBean("bCustomLabel", Result.class);
        }
    }

    public void sayHello(){
        label.setText("Hello World!");
    }
    public void sayNothing(){
        label.setText("");
    }
}
