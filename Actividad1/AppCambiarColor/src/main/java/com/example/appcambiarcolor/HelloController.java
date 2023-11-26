package com.example.appcambiarcolor;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    protected void onChangeRedColorButtonClick () { welcomeText.setTextFill(Color.RED); }

    @FXML
    protected void onChangeGREENColorButtonClick () { welcomeText.setTextFill(Color.GREEN); }

    @FXML
    protected void onChangeYellowColorButtonClick () { welcomeText.setTextFill(Color.YELLOW); }
}