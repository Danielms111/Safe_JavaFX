package com.example.seguimiento13.Controllers;

import com.example.seguimiento13.HelloApplication;
import com.example.seguimiento13.model.FileUtil;
import com.example.seguimiento13.model.Password;
import com.example.seguimiento13.model.safeData;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class NewPassController {
    @FXML
    private Label cajaLBL;

    @FXML
    private Button changeBTN;

    @FXML
    private Button closeBTN;

    @FXML
    private
    TextField fifthActualTF;

    @FXML
    private TextField fifthNewTF;

    @FXML
    private TextField firstActualTF;

    @FXML
    private Label firstLBL;

    @FXML
    private TextField firstNewTF;

    @FXML
    private TextField fourthActualTF;

    @FXML
    private TextField fourthNewTF;

    @FXML
    private TextField seconNewTF;

    @FXML
    private TextField secondActualTF;

    @FXML
    private Label secondLBL;

    @FXML
    private TextField sixthNewTF;

    @FXML
    private TextField thirdActualTF;

    @FXML
    private TextField sixthActualTF;

    @FXML
    private TextField thirdNewTF;

    @FXML
    void onKey1(KeyEvent event1){
        if(event1.getSource().equals(firstActualTF)){
            secondActualTF.requestFocus();
        }
        if(event1.getSource().equals(secondActualTF)){
            thirdActualTF.requestFocus();
        }
        if(event1.getSource().equals(thirdActualTF)){
            fourthActualTF.requestFocus();
        }
        if(event1.getSource().equals(fourthActualTF)){
            fifthActualTF.requestFocus();
        }
        if(event1.getSource().equals(fifthActualTF)){
            sixthActualTF.requestFocus();
        }
    }

    @FXML
    void onKey2(KeyEvent event1){
        if(event1.getSource().equals(firstNewTF)){
            seconNewTF.requestFocus();
        }
        if(event1.getSource().equals(seconNewTF)){
            thirdNewTF.requestFocus();
        }
        if(event1.getSource().equals(thirdNewTF)){
            fourthNewTF.requestFocus();
        }
        if(event1.getSource().equals(fourthNewTF)){
            fifthNewTF.requestFocus();
        }
        if(event1.getSource().equals(fifthNewTF)){
            sixthNewTF.requestFocus();
        }
    }
    @FXML
    void close(){
        HelloApplication.showWindow("Login.fxml");


        Stage currentStage = (Stage) firstNewTF.getScene().getWindow();
        currentStage.hide();
    }

    @FXML
    void change (){
        String password = "";
        password += firstActualTF.getText();
        password += secondActualTF.getText();
        password += thirdActualTF.getText();
        password += fourthActualTF.getText();
        password += fifthActualTF.getText();
        password += sixthActualTF.getText();

        /*if(safeData.getInstance().getPassword().getPassword().equals("")){
            safeData.getInstance().setPassword(new Password(password));
            HelloApplication.showWindow("SafeContent.fxml");
            Stage currentStage = (Stage) firstTF.getScene().getWindow();
            currentStage.hide();
        }else */
        String contra = FileUtil.readFile();
        if (password.equals(contra)){
            String newPass ="";
            newPass += firstNewTF.getText();
            newPass += seconNewTF.getText();
            newPass += thirdNewTF.getText();
            newPass += fourthNewTF.getText();
            newPass += fifthNewTF.getText();
            newPass += sixthNewTF.getText();
            if(newPass.length()>5){
                FileUtil.fillPassword(newPass);
            }else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("ERROR");
                alert.setHeaderText("Pilas");
                alert.setContentText("LA CONTRASEÑA NUEVA ES INVALIDA");
                alert.showAndWait();
            }
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("Pilas");
            alert.setContentText("LA CONTRASEÑA ACTUAL ES INCORRECTA");
            alert.showAndWait();
        }
    }
}
