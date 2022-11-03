package com.example.seguimiento13.Controllers;

import com.example.seguimiento13.HelloApplication;
import com.example.seguimiento13.model.FileUtil;
import com.example.seguimiento13.model.Password;
import com.example.seguimiento13.model.safeData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private Label cajaLBL;

    @FXML
    private TextField fifthTF;

    @FXML
    private TextField firstTF;

    @FXML
    private TextField fourthTF;

    @FXML
    private Label messageLBL;

    @FXML
    private Button openBTN;

    @FXML
    private TextField secondTF;

    @FXML
    private TextField sixthTF;

    @FXML
    private TextField thirdTF;

    @FXML
    void onKey(KeyEvent event1){
        if(event1.getSource().equals(firstTF)){
            secondTF.requestFocus();
        }
        if(event1.getSource().equals(secondTF)){
            thirdTF.requestFocus();
        }
        if(event1.getSource().equals(thirdTF)){
            fourthTF.requestFocus();
        }
        if(event1.getSource().equals(fourthTF)){
            fifthTF.requestFocus();
        }
        if(event1.getSource().equals(fifthTF)){
            sixthTF.requestFocus();
        }
    }

    @FXML
    void login(ActionEvent event) throws IOException {
        String password = "";
        password += firstTF.getText();
        password += secondTF.getText();
        password += thirdTF.getText();
        password += fourthTF.getText();
        password += fifthTF.getText();
        password += sixthTF.getText();

        /*if(safeData.getInstance().getPassword().getPassword().equals("")){
            safeData.getInstance().setPassword(new Password(password));
            HelloApplication.showWindow("SafeContent.fxml");
            Stage currentStage = (Stage) firstTF.getScene().getWindow();
            currentStage.hide();
        }else */
        String contra = FileUtil.readFile();
        if (password.equals(contra)){
            safeData.getInstance().setPassword( new Password(password));
            HelloApplication.showWindow("SafeContent.fxml");

            Stage currentStage = (Stage) firstTF.getScene().getWindow();
            currentStage.hide();
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("Pilas");
            alert.setContentText("CONTRASEÑA INCORRECTA");
            alert.showAndWait();
        }
    }
}
