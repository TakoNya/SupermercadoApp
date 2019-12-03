package supermercado;

import java.util.ArrayList;

public class CajeraThread extends Thread {

    private String nombre;
    private ArrayList<Cliente> clientes;
    private long initialTime;

    public CajeraThread(String nombre, ArrayList<Cliente> clientes, long initialTime) {
        this.nombre = nombre;
        this.clientes = clientes;
        this.initialTime = initialTime;
    }

    @Override
    public void run() {


        for (Cliente cliente : this.clientes) {    
            System.out.println("La cajera " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE "
                + cliente.getNombre() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + "seg");
            for (int i = 0; i < cliente.getCarroCompra().length; i++) {
                this.esperarXsegundos(cliente.getCarroCompra()[i]);
                System.out.println("Cajera " + this.nombre + "procesado el producto " + (i + 1)
                        + " del cliente " + cliente.getNombre() + " -> Tiempo: "
                        + (System.currentTimeMillis() - this.initialTime) / 1000
                        + " seg");

            }
            System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR "
                    + cliente.getNombre() + " EN EL TIEMPO: "
                    + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
        }
    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
