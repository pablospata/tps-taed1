package tp2.consigna2;

public class Tp2Consigna2 {
    
    public static void main(String[] args) {

        ColaLista colaTest = new ColaLista();        
        Pedido pedidoTest;
        
        //Probando metodo para ver si la cola esta vacia. Debe dar true.
        System.out.println("Ver si la cola esta vacia: " + colaTest.estaVacia());
                
        int codigo = 12345;
                
        //Encolando 1er pedido
        System.out.println("\nProcesando 1er pedido");
        pedidoTest = new Pedido(codigo++, "Pedro Perez", 350);                        
        colaTest.encolar(pedidoTest);        
        
        //Probando metodo para ver si la cola esta vacia. Ahora debe dar false.
        System.out.println("\nVer si la cola esta vacia: " + colaTest.estaVacia());

        //Encolando el resto de pedidos
        System.out.println("\nProcesando el resto de pedidos");
        pedidoTest = new Pedido(codigo++, "Juan Fernandez", 100);
        colaTest.encolar(pedidoTest);        
        pedidoTest = new Pedido(codigo++, "Pablo Gomez", 50);
        colaTest.encolar(pedidoTest);        
        pedidoTest = new Pedido(codigo++, "Maria Martinez", 200);
        colaTest.encolar(pedidoTest);
        pedidoTest = new Pedido(codigo++, "Daniela Gonzalez", 400);
        colaTest.encolar(pedidoTest);
        pedidoTest = new Pedido(codigo++, "Jose Rodriguez", 1400);
        colaTest.encolar(pedidoTest);                
        
        System.out.println("\nTodos los pedidos se han encolando");
        
        System.out.println("Desencolando y mostrando pedidos");
        Pedido pedidoVer;        
        
        for(int i = 0; i < 6; i++) {
            System.out.println("\nPedido Nro.: " + (i + 1));
            pedidoVer = colaTest.desencolar();
            
            System.out.println("Codigo: " + pedidoVer.codigo);
            System.out.println("Nombre: " + pedidoVer.nombre);
            System.out.println("Cantidad de ladrillos: " + pedidoVer.cantidadLadrillos);
        }                
        
        System.out.println("Ver si la cola esta vacia: " + colaTest.estaVacia());
    }    
}
