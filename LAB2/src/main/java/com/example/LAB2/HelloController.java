package com.example.LAB2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public TextField wysokosc_ID;
    public TextField promien_ID;
    public TextField grubosc_ID;
    public Label wynik1;
    public Label  wynik2;

    public double truncate(double n){
        n = n*Math.pow(10,2);
        n = Math.floor(n);
        n = n / Math.pow(10,2);
        return n;
    }

    @FXML
    protected void oblicz () {
        wynik1.setText("");
        wynik2.setText("");
        double d_promien = Double.parseDouble(promien_ID.getText());
        double d_wysokosc = Double.parseDouble(wysokosc_ID.getText());
        double d_grubosc = Double.parseDouble(grubosc_ID.getText());

        double pole_b = 2*3.14*d_promien*d_wysokosc;
        double pole_p = 2*3.14*d_promien*d_promien;
        double pole_c = pole_b + pole_p;

        double ciezar = 7.85d;

        System.out.printf(Double.toString(ciezar*0.18));
        double ciezar_blachy = (pole_c/10000)*d_grubosc*ciezar;

        String temp = Double.toString(truncate(pole_c/10000));
        String temp2 = Double.toString(truncate(ciezar_blachy));
        String wynik = "Do wykonania walca, potrzebujesz: "+ temp + " metrów kwadratowych blachy.\n";
        String wynik22 = "Cięzar wynosi "+temp2+" kg.";
        wynik1.setText(wynik);
        wynik2.setText(wynik22);

    }

}