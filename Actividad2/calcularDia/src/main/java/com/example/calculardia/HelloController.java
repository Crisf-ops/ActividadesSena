package com.example.calculardia;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class HelloController {

    @FXML
    Label text;

    @FXML
    Label hours;

    @FXML
    Label seconds;

    @FXML
    Label minutes;

    @FXML
    Spinner<Integer> spinner;


    public void initialize() {
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Integer.MAX_VALUE, 0);
        spinner.setValueFactory(valueFactory);
        spinner.valueProperty().addListener((observable, oldValue, newValue) -> calculate(newValue));
    }

    private void calculate ( int dias) {
        int calculeHoras = dias * 24;
        int calculeMinutos = calculeHoras * 60;
        int calculeSegundos = calculeMinutos * 60;

        hours.setText(String.valueOf(calculeHoras));
        minutes.setText(String.valueOf(calculeMinutos));
        seconds.setText(String.valueOf(calculeSegundos));
        text.setText(String.format("%s dias tienen %s horas - %s minutos - %s segundos", dias, calculeHoras, calculeMinutos, calculeSegundos));
    }
}