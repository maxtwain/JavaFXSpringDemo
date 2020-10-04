package wire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OverlayConfig {
    @Autowired private view.button.Start startButton;
    @Autowired private view.button.Clear clearButton;
    @Autowired private view.label.Result resultLabel;

    @Bean public view.button.Start bStartButton() {
        return new view.button.Start();
    }
    @Bean public view.button.Clear bClearButton() {
        return new view.button.Clear();
    }
    @Bean public view.label.Result bResultLabel() {
        return new view.label.Result();
    }
    @Bean public view.grid.Overlay bOverlayGrid() {
        return new view.grid.Overlay(startButton, clearButton, resultLabel);
    }
}
