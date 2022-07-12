//SPATA, PABLO LEONARDO, Legajo: VINF10171, Fecha: 11/07/2021

package tp4.consigna1;

public class Tp4Consigna1 {

    public static void main(String[] args) {
            
        Equipo[] arrayEquipos = new Equipo[5];
        
        arrayEquipos[0] = new Equipo("River", 15);
        arrayEquipos[1] = new Equipo("Boca", 14);
        arrayEquipos[2] = new Equipo("Racing", 18);
        arrayEquipos[3] = new Equipo("Atenas", 11);
        arrayEquipos[4] = new Equipo("Alumni", 21);
        
        //Primero mostramos la tabla desordenada
        System.out.println("TABLA DESORDENADA");
        System.out.println("--- Equipo---      --- Puntos ---");
        for(int i = 0; i < arrayEquipos.length; i++)
            System.out.println(arrayEquipos[i].nombre + "\t\t\t" + arrayEquipos[i].puntos);
    
        //Llamamos al metodo de ordenamiento
        Quicksort.quicksort(arrayEquipos);
        
        //Mostramos la tabla ordenada
        System.out.println("\nTABLA ORDENADA");
        System.out.println("--- Equipo---      --- Puntos ---");
        for(int i = 0; i < arrayEquipos.length; i++)
            System.out.println(arrayEquipos[i].nombre + "\t\t\t" + arrayEquipos[i].puntos);
    
    }            
}