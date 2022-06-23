package tp3.consigna1;

public class ListaDobleEnlazada {
    
    Nodo cabeza;
    Nodo cola;

    public ListaDobleEnlazada() {
        cabeza = new Nodo(null);
        cola = new Nodo(null);        
    }
    
    public void insertarOrdenado(Producto p) {
        Nodo nuevo = new Nodo(p);
        
        if(cabeza.siguiente == null) {
            
            cabeza.siguiente = nuevo;            
            cola.anterior = nuevo;
            nuevo.siguiente = cola;
            nuevo.anterior = cabeza;
        }
        else {
            
            Nodo aux = cabeza.siguiente;
            while(nuevo.elemento.codigo > aux.elemento.codigo && aux.siguiente.elemento != null) {
                
                aux = aux.siguiente;
            }
            
            if(nuevo.elemento.codigo == aux.elemento.codigo) {
                
                System.out.println("\nYa existe un producto con el mismo codigo");                
            }
            else if(nuevo.elemento.codigo > aux.elemento.codigo) { 
                
                nuevo.siguiente = cola;
                nuevo.anterior = aux;
                
                aux.siguiente = nuevo;                
            }
            else {
                
                nuevo.siguiente = aux;
                nuevo.anterior = aux.anterior;
                
                aux.anterior.siguiente = nuevo;
                aux.anterior = nuevo;                                
            }
        }
    }
    
    public void imprimirLista() {
        
        Nodo aux = cabeza.siguiente;
        
        System.out.println("\n\n--- Imprimiendo elementos ---");        
        while(aux.elemento != null)
        {            
            System.out.println("\nCodigo: " + aux.elemento.codigo);
            System.out.println("Descripcion: " + aux.elemento.descripcion);
            System.out.println("Precio: " + aux.elemento.precio);
            aux = aux.siguiente;
        }
    }
}