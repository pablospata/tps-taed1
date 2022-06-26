package tp3.consigna1;

public class ListaDobleEnlazada {
    
    /*    
    Estos nodos representan el head y el tail de la lista.
    Y el atributo longitud se incrementa o decrece a medida que se insertan o
    eliminan elementos
    */
    Nodo cabeza;
    Nodo cola;
    private int longitud;

    /**
     * Construir lista doblemente enlazada
     */
    public ListaDobleEnlazada() {
        cabeza = new Nodo(null);
        cola = new Nodo(null);        
    }
    
    /**
     * Insertar producto en forma ordenada
     * @param p Producto que se desea insertar   
     */
    public void insertarOrdenado(Producto p) {
        Nodo nuevo = new Nodo(p);        
        
        /*                
        NOTA SOBRE LA IMPLEMENTACION:
        Seguimos las indicaciones del libro "Estructuras de datos en Java" de 
        Mark A. Weiss que recomienda crear un nodo extra Head y otro Tail que no almacenen
        ningun dato, pero que sirven para apuntar a los nodos, de modo que todo nodo tiene
        uno que lo apunte y no hacerle tratamientos especiales a estos (Pag. 609, Seccion
        17.1.1 'Nodos de cabecera')         
        
        */
        if(cabeza.siguiente == null) {
        //Primer comprobacion para ver si la lista esta vacia, si true asignamos directamente el primer
        //nodo
            
            cabeza.siguiente = nuevo;            
            cola.anterior = nuevo;
            nuevo.siguiente = cola;
            nuevo.anterior = cabeza;
            
            longitud++;
        }
        else {
            
            //Como ya existen nodos en la lista utilizamos un bucle para recorrerla.
            //Recorremos la lista mientras el codigo a ingresar sea mayor a cada uno
            //de los nodos y no se llegue al final de la lista.
            Nodo aux = cabeza.siguiente;
            while(nuevo.elemento.codigo > aux.elemento.codigo && aux.siguiente.elemento != null) {
                
                aux = aux.siguiente;                                
            }
            
            //Una vez que se sale del bucle si ya existe nodo con el mismo codigo
            //No se inserta y se lanza un mensaje de error.
            if(nuevo.elemento.codigo == aux.elemento.codigo) {
                
                System.out.println("\nERROR. Ya existe un producto con el mismo codigo");                
            }
            else if(nuevo.elemento.codigo > aux.elemento.codigo) { 
                
                //Aca el codigo es mayor al ultimo codigo de la lista, por lo tanto se agrega 
                //como ultimo nodo.
                
                cola.anterior.siguiente = nuevo;
                nuevo.anterior = cola.anterior;
                nuevo.siguiente = cola;
                cola.anterior = nuevo;        

                longitud++;
            }
            else {
                
                //En este caso el codigo quedo entre medio, por lo que se hace las correspondientes
                // asignaciones
                
                nuevo.siguiente = aux;
                nuevo.anterior = aux.anterior;
                
                aux.anterior.siguiente = nuevo;
                aux.anterior = nuevo;                                
                
                longitud++;
            }
        }
    }
    
    /**
     * Insertar producto al principio de la lista
     * @param p Producto que se desea insertar        
     */
    public void insertarInicio(Producto p) {
        Nodo nuevo = new Nodo(p);
        
        cabeza.siguiente.anterior = nuevo;
        nuevo.siguiente = cabeza.siguiente;
        nuevo.anterior = cabeza;
        cabeza.siguiente = nuevo;
        
        longitud++;
    }
    
    /**
     * Insertar producto al final de la lista
     * @param p Producto que se desea insertar        
     */    
    public void insertarFin(Producto p) {
        Nodo nuevo = new Nodo(p);
        
        cola.anterior.siguiente = nuevo;
        nuevo.anterior = cola.anterior;
        nuevo.siguiente = cola;
        cola.anterior = nuevo;        
        
        longitud++;
    }
    
    /**
     * Insertar producto N posicion de la lista
     * @param p Producto que se desea insertar        
     * @param n Posicion de la lista donde se insertara p        
     */    
    public void insertarPosicion(Producto p, int n) {
        
        if(n < longitud) {
            
            Nodo nuevo = new Nodo(p);        
            Nodo aux = cabeza.siguiente;

            for(int i = 0; i < n; i++)    
                aux = aux.siguiente;                    

            aux.anterior.siguiente = nuevo;
            nuevo.anterior = aux.anterior;
            nuevo.siguiente = aux;
            aux.anterior = nuevo;
            
            longitud++;
        }
        else
            System.out.println("\nLa lista no posee la posicion indicada.");
    }
    
    /**
     * Eliminar producto del principio de la lista  
     */    
    public void eliminarInicio() {
        if(!estaVacia()) {
            cabeza.siguiente.siguiente.anterior = cabeza;
            cabeza.siguiente = cabeza.siguiente.siguiente;

            longitud--;
        }
        else
            System.out.println("\nNo se puede eliminar. La lista esta vacia.");
    }
    
    /**
     * Eliminar producto del final de la lista  
     */        
    public void eliminarFin() {
        if(!estaVacia()) {            
            cola.anterior.anterior.siguiente = cola;
            cola.anterior = cola.anterior.anterior;
            
            longitud--;
        }
        else
            System.out.println("\nNo se puede eliminar. La lista esta vacia.");
    }
    
    /**
     * Eliminar producto de la N posicion de la lista
     * @param n Posicion de la lista donde se eliminara p        
     */
    public void eliminarPosicion(int n) {
        
        if(!estaVacia()) {            
            
            if(n < longitud) {

                Nodo aux = cabeza.siguiente;

                for(int i = 0; i < n; i++)    
                    aux = aux.siguiente;                    

                aux.anterior.siguiente = aux.siguiente;
                aux.siguiente.anterior = aux.anterior;
                                
                longitud--;
            }
            else
                System.out.println("\nLa lista no posee la posicion indicada.");
        }
        else
            System.out.println("\nNo se puede eliminar. La lista esta vacia.");
    }
    
    /**
    * Comprobar si la lista esta logicamente vacia.
    * @return true si esta vacia, false en caso contrario
    */
    public boolean estaVacia() {
        return cabeza.siguiente == null;
    }
    
    /**
    * Hacer que la lista este logicamente vacia.
    */
    public void vaciar() {
        cabeza.siguiente = null;
        cola.anterior = null;
        longitud = 0;
    }
    
    /**
     * Devuele el la logitud actual de la lista.
     */
    public int obtenerLongitud() {
        return longitud;
    }
        
    /**
     * Metodo para imprimir todos los elementos de la lista.
     */
    public void imprimirLista() {
        
        Nodo aux = cabeza.siguiente;
        
        if(!estaVacia()) {
            System.out.println("\n\n--- Imprimiendo elementos ---");        
            while(aux.elemento != null)
            {            
                System.out.println("\nCodigo: " + aux.elemento.codigo);
                System.out.println("Descripcion: " + aux.elemento.descripcion);
                System.out.println("Precio: " + aux.elemento.precio);
                aux = aux.siguiente;
            }
        }
        else    
            System.out.println("\n\n--- No hay elementos para imprimir---");        
    }
}