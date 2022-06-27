/* INTEGRANTES DEL GRUPO:
Spata, Pablo Leonardo, Legajo: VINF10171
Castillo, Francisco, Legajo: VINF013417
Ruiz, Gonzalo Mario, Legajo: VINF011900
Paris, Bruno Jabie, Legajo: VINF012105
Maria Gabriela Mauri, Legajo: VINF011820

Fecha: 27/06/2022
*/
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
