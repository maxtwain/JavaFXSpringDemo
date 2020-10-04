package control.trigger.button;

public class Clear {

    public void prime(view.button.Clear clearButton,
                      control.effect.label.Result resultLabelControl,
                      view.label.Result resultLabel){

        clearButton.setOnAction(event ->
                resultLabelControl.sayNothing(resultLabel)
        );
    }
}
