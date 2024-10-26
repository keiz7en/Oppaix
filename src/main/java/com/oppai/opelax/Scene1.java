package com.oppai.opelax;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.*;

public class Scene1 {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }



}