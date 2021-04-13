package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
     Button startBtn;

    @FXML
    TextField contPlus;

    @FXML
    TextField contMinus;


    public void startCont(ActionEvent event){
        ContadorAdelante ca = new ContadorAdelante("Contador +");
        ca.start();
        contPlus.setText("3");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void setNumero(int i){
        contPlus.setText("4");
    }
}
