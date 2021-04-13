package sample;

public class ContadorAtras extends Thread {

    public ContadorAtras(String nombre) // constructor
    {
        if (nombre != null)
            setName(nombre);
       // start(); // el hilo ejecuta el método run de
    } // ContadorAtrás

    public ContadorAtras() {
        this(null);
    } // constructor

   public void run() {
        for (int i = 100; i > 0; i--) {
            System.out.print("\t\t" + getName() + " " + i + " \r");
            try {
                sleep(250);
            } catch (InterruptedException e) {
                ;
            }
        }
        System.out.println();
    }
}
