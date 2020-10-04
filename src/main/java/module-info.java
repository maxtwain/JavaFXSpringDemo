module mod {
    requires javafx.controls;
    requires org.controlsfx.controls;

    requires spring.beans;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;

    requires jasypt;
    requires java.sql;
    requires java.naming;

    exports app;
    exports view.button;
    exports view.grid;
    exports view.label;

    opens wire to spring.core;
    exports wire to spring.beans, spring.context;
}