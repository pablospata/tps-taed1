//Spata, Pablo Leonardo, Legajo: VINF10171, Fecha: 13/06/2022

package consigna3;

import java.util.Scanner;

public class Contador {    
    
    //Esta clase solo tiene un método estático que se utilizará en el método 
    //main de la clase Princial.
    //Tiene como parametro la palabra que se solicita contar.
    public static void contarLetras(String palabraContar) {
        
        String palabra = palabraContar;
        int[] conteos = new int[26];
    
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

        for (int i=0; i < conteos.length; i++) {            
            if (conteos [i] != 0) 
                System.out.println((char)(i +'A') + ": " + conteos[i]); 
        }
    }
}