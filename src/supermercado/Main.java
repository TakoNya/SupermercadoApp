package supermercado;


public class Main {

    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente1", new int[] {2,2,1,5,2,3});
        Cliente cliente2 = new Cliente("Cliente2", new int[]{1,3,5,1,1});
        Cliente cliente3 = new Cliente("Cliente3", new int[]{2,3,1,2});
        Cajera cajera1 = new Cajera("Betiana");
        
        long initialTime = System.currentTimeMillis();
        
        cajera1.procesarCompra(cliente1,initialTime);
        cajera1.procesarCompra(cliente2, initialTime);
        cajera1.procesarCompra(cliente3, initialTime);
        
    }
    
}
