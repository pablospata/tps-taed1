package tp2.consigna2;

public class Pedido {    
    public Pedido(int codigo, String nombre, int cantidadLadrillos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidadLadrillos = cantidadLadrillos;
    }   
    
    public int codigo;
    public String nombre;
    public int cantidadLadrillos;    
}
