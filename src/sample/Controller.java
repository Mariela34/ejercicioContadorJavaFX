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
        startBtn.setDisable(true);

        Thread contadorAdelante = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=100; i++){
                    contPlus.setText(Integer.toString(i));
                    try {
                        Thread.sleep(250);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        contadorAdelante.start();

        Thread contadorAtras = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 100; i >= 0; i--){
                    contMinus.setText(Integer.toString(i));
                    try {
                        Thread.sleep(250);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        contadorAtras.start();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
