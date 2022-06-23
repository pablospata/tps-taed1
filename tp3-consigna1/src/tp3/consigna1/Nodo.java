package tp3.consigna1;

public class Nodo {
    
    public Producto elemento;
    public Nodo siguiente;
    public Nodo anterior;
   
    public Nodo(Producto elemento) {
        this.elemento = elemento;        
        this.siguiente = this.anterior = null;        
    }
    
    public Nodo(Producto elemento, Nodo siguiente, Nodo anterior) {
        this.elemento = elemento;
        this.siguiente = siguiente;
        this.anterior = anterior;        
    }                    
}
