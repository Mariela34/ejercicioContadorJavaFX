package sample;

import javafx.scene.control.Control;
import javafx.scene.control.TextField;

public class ContadorAdelante extends Thread{

    // constructor
    public ContadorAdelante(String nombre)
    {
        if (nombre != null)
        setName(nombre);
        //start(); // el hilo ejecuta su propio método run
    }

    // constructor
    public ContadorAdelante() {
        this(null);
    }

    public void run()
    {
        for (int i = 1; i <= 100; i++) {
            System.out.print(getName() + " " + i + "\r");
            try{
                sleep(250);
            }
            catch ( InterruptedException e ) {
                ;}
        }
        System.out.println();
    }

}
