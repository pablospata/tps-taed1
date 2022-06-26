package tp3.consigna1;

public class Tp3Consigna1 {

    public static void main(String[] args) {

        //Probando clase Lista y los metodos solicitados en la consigna.
        ListaDobleEnlazada listaTest = new ListaDobleEnlazada();        
        Producto p;
        
        p = new Producto(10, "Silla", 40.5);        
        listaTest.insertarOrdenado(p);        
        listaTest.imprimirLista();        
        
        p = new Producto(2, "Mesa", 300);                
        listaTest.insertarOrdenado(p);
        listaTest.imprimirLista();  
                        
        p = new Producto(5, "Heladera", 550);                
        listaTest.insertarOrdenado(p);
        listaTest.imprimirLista();
        
        p = new Producto(5, "Sillon", 300);                
        listaTest.insertarOrdenado(p);
        listaTest.imprimirLista();        
                       
        p = new Producto(15, "Televisor", 500);                
        listaTest.insertarOrdenado(p);
        listaTest.imprimirLista();        
        
        System.out.println("\nLongitud actual de la Lista: " + listaTest.obtenerLongitud());               
    }    
}

/*
    CODIGO PARA PROBAR EL RESTO DE METODOS DE LA LISTA DOBLEMENTE ENLAZADA:

        //Probando metodos extras
        p = new Producto(13, "Cuadro", 33);                
        listaTest.insertarInicio(p);
        listaTest.imprimirLista();
                
        p = new Producto(7, "Plato", 8);                
        listaTest.insertarFin(p);
        listaTest.imprimirLista();
        
        p = new Producto(123, "Cuchara", 4);                
        listaTest.insertarFin(p);
        listaTest.imprimirLista();
        
        p = new Producto(23, "Vaso", 4);                
        listaTest.insertarPosicion(p, 4);
        listaTest.imprimirLista();
        
        System.out.println("\nLongitud actual de la Lista: " + listaTest.obtenerLongitud());
        
        listaTest.eliminarInicio();        
        listaTest.imprimirLista();
        
        System.out.println("\nLongitud actual de la Lista: " + listaTest.obtenerLongitud());
        
        listaTest.eliminarFin();        
        listaTest.imprimirLista();
        
        System.out.println("\nLongitud actual de la Lista: " + listaTest.obtenerLongitud());
        
        listaTest.eliminarPosicion(4);                
        listaTest.eliminarPosicion(2);        
        listaTest.imprimirLista();
        
        System.out.println("\nLongitud actual de la Lista: " + listaTest.obtenerLongitud());
        
        System.out.println("\nEsta vacia: " + listaTest.estaVacia());        
        
        System.out.println("\nLongitud actual de la Lista: " + listaTest.obtenerLongitud());
        System.out.println("\n\nVaciando lista...");
        listaTest.vaciar();
        
        listaTest.imprimirLista();
        System.out.println("\nLongitud actual de la Lista: " + listaTest.obtenerLongitud());
        
        System.out.println("\nEsta vacia: " + listaTest.estaVacia());        
*/