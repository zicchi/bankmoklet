/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class FXMLDocumentController {
    
    String pin ="";
    String PIN="1234";
    int kesempatan=3;
    int tmp;

    @FXML
    private JFXButton bt1;

    @FXML
    private JFXButton bt2;

    @FXML
    private JFXButton bt3;

    @FXML
    private JFXButton bt4;

    @FXML
    private JFXButton bt5;

    @FXML
    private JFXButton bt6;

    @FXML
    private JFXButton bt7;

    @FXML
    private JFXButton bt8;

    @FXML
    private JFXButton bt9;

    @FXML
    private JFXButton clear;

    @FXML
    private JFXButton bt0;

    @FXML
    private JFXButton oke;
    @FXML
    private JFXPasswordField editpin;
    
     @FXML
    void tekan0(ActionEvent event) {
        pin+="0";
        editpin.setText(pin);
    }

    @FXML
    void tekan1(ActionEvent event) {
        pin+="1";
        editpin.setText(pin);
        
    }

    @FXML
    void tekan2(ActionEvent event) {
        pin+="2";
        editpin.setText(pin);
    }

    @FXML
    void tekan3(ActionEvent event) {
        pin+="3";
        editpin.setText(pin);
    }

    @FXML
    void tekan4(ActionEvent event) {
        pin+="4";
        editpin.setText(pin);
    }

    @FXML
    void tekan5(ActionEvent event) {
        pin+="5";
        editpin.setText(pin);
    }

    @FXML
    void tekan6(ActionEvent event) {
        pin+="6";
        editpin.setText(pin);
    }

    @FXML
    void tekan7(ActionEvent event) {
        pin+="7";
        editpin.setText(pin);
    }

    @FXML
    void tekan8(ActionEvent event) {
        pin+="8";
        editpin.setText(pin);
    }

    @FXML
    void tekan9(ActionEvent event) {
        pin+="9";
        editpin.setText(pin);
    }

    @FXML
    void tekanclear(ActionEvent event) {
        pin ="";
        editpin.setText(pin);
    }

    @FXML
    void tekanok(ActionEvent event) {
        if(pin.equals(PIN)){
        try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLMainBank.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Bank");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        } 
        }else {
                kesempatan -=1;
                JOptionPane.showMessageDialog(null,"PIN Salah \nTersisa "+kesempatan+" kesempatan lagi");
                editpin.setText("");
                pin="";
                if(kesempatan==0){
                    System.exit(0);
                }
                }
        
        
//        if(username.equalsIgnoreCase("tomboluwe") && password.equalsIgnoreCase("mangan")){
//          Parent Home = FXMLLoader.load(getClass().getResource("FXMLHome.fxml"));
//          Scene homescene = new Scene(Home);
//          Stage on = (Stage)((Node)event.getSource()).getScene().getWindow();
//          on.setScene(homescene);
//            on.show();
//        }
    }
    }

