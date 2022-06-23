//Spata, Pablo Leonardo, Legajo: VINF10171, Fecha: 13/06/2022

package consigna2;

import java.util.Scanner; 

public class Exc2 { 
    public static void main(String[] args) { 
        int[] conteos = new int[26];
        Scanner teclado = new Scanner(System.in); 

        //Leer palabra del usuario

        System.out.print("Ingrese una palabra (por favor, sólo letras): "); 
        String palabra = teclado.nextLine(); 

        //Convierte a mayusc. 
        palabra = palabra.toUpperCase(); 

        //Cuenta la frecuencia de cada letra...
        for (int i=0; i < palabra.length(); i++)            
            /*
            Aca puede ocurrir que el usuario ingrese una caracter especial, y la
            operacion de ["palabra.charAt(i)-'A'], que se utiliza para calcular 
            el indice del Array conteo, de un numero fuera del rango del mismo.
            
            Por lo que intentamos capturar la excepcion y mostrar que caracter
            es.
            */            
            try {                
                conteos[palabra.charAt(i)-'A']++; 
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("El caracter especial '" + palabra.charAt(i) 
                                    + "' no es una letra");
            }
        
        //imprimir frecuencias...
        System.out.println(); 

        for (int i=0; i < conteos.length; i++) 
            if (conteos [i] != 0) 
                System.out.println((char)(i +'A') + ": " + conteos[i]); 
    } 
}