package com.example.seguimiento13.Controllers;

import com.example.seguimiento13.HelloApplication;
import com.example.seguimiento13.model.FileUtil;
import com.example.seguimiento13.model.SafeData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label cajaLBL;

    @FXML
    private Button changeBTN;

    @FXML
    private Button closeBTN;

    @FXML
    private TextArea infoTA;

    @FXML
    private Label messageLBL;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        //Los fxml estan diferentes de nulo
        String current = SafeData.getInstance().getInfo().getInformation();
        //String current = FileUtil.readFileTA();
        infoTA.setText(current);
    }


    @FXML
    void Change(ActionEvent event){
        String info = infoTA.getText();
        FileUtil.fillTA(info);
        SafeData.getInstance().getInfo().setInformation(info);
        HelloApplication.showWindow("newPass.fxml");
        Stage currentStage = (Stage) infoTA.getScene().getWindow();
        currentStage.hide();
    }

    @FXML
    void Close(){
        String info = infoTA.getText();
        FileUtil.fillTA(info);
        SafeData.getInstance().getInfo().setInformation(info);
        HelloApplication.showWindow("Login.fxml");
        Stage currentStage = (Stage) infoTA.getScene().getWindow();
        currentStage.hide();
    }
}