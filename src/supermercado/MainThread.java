package supermercado;

import java.util.ArrayList;



public class MainThread {
    

   
    public static void main(String[] args) {
        
        ArrayList<Cliente> clientesCaja1 = new ArrayList<Cliente>();
        ArrayList<Cliente> clientesCaja2 = new ArrayList<Cliente>();
        ArrayList<Cliente> clientesCaja3 = new ArrayList<Cliente>();
        
        Cliente cliente1 = new Cliente("Cliente1", new int[] {2,2,1,5,2,3});
        Cliente cliente2 = new Cliente("Cliente2", new int[]{1,3,5,1,1});
        Cliente cliente3 = new Cliente("Cliente3", new int[]{2,3,1,2});
        Cliente cliente4 = new Cliente("Cliente4", new int[] {2,2,2,2,2});
        Cliente cliente5 = new Cliente("Cliente5", new int[] {1,2,3,4,5,6,7});
        Cliente cliente6 = new Cliente("Cliente6", new int[] {1,2,3,2,5,3,5});
        Cliente cliente7 = new Cliente("Cliente7", new int[] {4,5,2,6,3});
                
        
        clientesCaja1.add(cliente1);
        clientesCaja1.add(cliente3);
        clientesCaja2.add(cliente2);
        clientesCaja2.add(cliente4);
        clientesCaja3.add(cliente5);
        clientesCaja3.add(cliente6);
        clientesCaja3.add(cliente7);
        
        long initialTime = System.currentTimeMillis();
        CajeraThread cajera1 = new CajeraThread("Betiana", clientesCaja1, initialTime);
        CajeraThread cajera2 = new CajeraThread("Yanina", clientesCaja2, initialTime);
        CajeraThread cajera3 = new CajeraThread("Florencia", clientesCaja3, initialTime);
        
        
        cajera1.start();
        cajera2.start();
        cajera3.start();
        
    }
    
}
