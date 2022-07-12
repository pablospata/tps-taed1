//SPATA, PABLO LEONARDO, Legajo: VINF10171, Fecha: 11/07/2021

package tp4.consigna1;

public class Quicksort {
    
    //Metodo publico para llamar el ordenamiento
    public static void quicksort(Equipo a[]) {
        quicksort(a, 0, a.length - 1);
    }
    
    //Metodo privado sobrecargado donde se realizara la recursividad
    private static void quicksort(Equipo a[], int primero, int ultimo) {
        int i, j, central;
        int pivote;
        central = (primero + ultimo) / 2;
        pivote = a[central].puntos;
        i = primero;
        j = ultimo;
        do {
            while (a[i].puntos > pivote) {
                i++;
            }
            while (a[j].puntos < pivote) {
                j--;
            }
            if (i <= j) {
                intercambiar(a, i, j);
                i++;
                j--;
            }
        } while (i <= j);
        
        if (primero < j)
            quicksort(a, primero, j); // Repetimos el proceso con sublista izqda
        
        if (i < ultimo)
            quicksort(a, i, ultimo); // Repetimos el proceso con sublista drcha
        
    }
    
    //Metodo privado para intercambiar elementos de un array
    private static void intercambiar(Equipo[] a, int i, int j) {
        Equipo aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }
}