package tp2.consigna2;

public class ColaLista {
    
    public ColaLista() {
        front = back = null;
    }
    
    public void vaciarCola() {
        front = null;
        back = null;
    }
    
    public boolean estaVacia() {
        return front == null;
    }
    
    void encolar(Pedido x) {
        if(estaVacia())
            back = front = new Nodo(x);
        else
            back = back.siguiente = new Nodo(x);
    }
    
    public Pedido desencolar(){
        Pedido retorno = front.elemento;
        front = front.siguiente;
        return retorno;
    }
    
    private Nodo front;
    private Nodo back;
}