package control.trigger.button;

public class Start {

    public void prime(view.button.Start startButton,
                      control.effect.label.Result resultLabelControl,
                      view.label.Result resultLabel){

        startButton.setOnAction(event ->
                resultLabelControl.sayHello(resultLabel)
        );
    }
}
