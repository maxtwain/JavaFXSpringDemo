package control.effect.label;

public class Result {

    public void sayHello(view.label.Result resultLabel){
        resultLabel.setText("Hello World!");
    }
    public void sayNothing(view.label.Result resultLabel){
        resultLabel.setText("");
    }
}
