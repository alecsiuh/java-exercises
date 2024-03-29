package com.example.calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculatorMain extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Calculator model = new Calculator();
        CalculatorPane view = new CalculatorPane();
        Presenter presenter = new Presenter(model, view);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(view));
        primaryStage.show();
    }
}
