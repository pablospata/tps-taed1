package tp2.consigna2;

public class Nodo {

    public Nodo(Pedido elemento) {
        this.elemento = elemento;        
    }
    
    public Nodo(Pedido elemento, Nodo siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }
            
    public Pedido elemento;
    public Nodo siguiente;
}