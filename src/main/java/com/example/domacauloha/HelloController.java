package com.example.domacauloha;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label label1;
    @FXML
    private TextField textField1;

    @FXML
    protected void convereteButton() {
        double mm = Double.parseDouble(textField1.getText()),cm = mm/10,dm = mm/100, m = mm/1000, km = m/1000;
        label1.setText("mm: " + mm + "\n" + "cm: " + cm + "\n" + "dm: " + dm + "\n" + "m: " + m + "\n" + "km: " + km);
    }
}
