module mod {
    requires javafx.controls;

    requires spring.context;
    requires spring.beans;

    exports app;
    exports view.button;
    exports view.grid;
    exports view.label;

    opens wire to spring.core;
    exports wire to spring.beans, spring.context;
}