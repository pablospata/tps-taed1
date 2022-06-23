package tp3.consigna1;

public class Tp3Consigna1 {

    public static void main(String[] args) {

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
    }    
}
