package com.example.lab2javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    int clickCounter = 0;
    public Button btnMain;
    @FXML

    protected void onBtnAction() {
        System.out.println("Kliknięcie nr" + ++clickCounter);
        if (clickCounter ==1 )
            btnMain.setText("I jeszcze raz");
    }
}