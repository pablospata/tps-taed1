package tp2.consigna1;

import java.util.Scanner;

public class Tp2Consigna1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        PilaArray pilaTest = new PilaArray();
        
        int opcion = 0;        
        do {
            System.out.println("\n\tElija una opcion: ");
            System.out.println("1. Apilar elemento");
            System.out.println("2. Retirar elemento");
            System.out.println("3. Ver si esta vacia");
            System.out.println("4. Salir");            
            System.out.print("Opcion: ");
            
            boolean banderaMenu = true;
            while (banderaMenu) {
                String entrada = teclado.nextLine();            
                try {
                    opcion = Integer.parseInt(entrada);
                } 
                catch (NumberFormatException e) {
                    System.out.print("Por favor, digite un número entero: ");
                    continue;
                }

                if (opcion > 0 && opcion < 5)
                    banderaMenu = false;            
                else
                    System.out.print("Ingrese 1, 2, 3 o 4: ");
            }
            
            switch (opcion) {

                case 1: System.out.print("Digite un numero entero: ");
                        Integer n = 0;
                        boolean bandera = true;                        
                        while (bandera) {
                            String entrada = teclado.nextLine();            
                            try {
                                n = Integer.parseInt(entrada);
                            } 
                            catch (NumberFormatException e) {
                                System.out.print("Por favor, digite un número entero: ");
                                continue;
                            }

                            bandera = false;                                        
                        }
                        
                        pilaTest.apilarElemento(n);
                        System.out.println("\nApilando el elemento: " + n);
                    
                        break;

                case 2: if(pilaTest.estaVacia())
                            System.out.println("\nPila vacia. No se puede retirar");
                        else
                            System.out.print("\nRetirando ultimo elemento: " + 
                                    pilaTest.retirarElemento() + "\n");
                        break;

                case 3: System.out.println("\nPila vacia: " + pilaTest.estaVacia());
                        break;
                
                case 4: System.out.println("\nTerminando programa");
                        break;
            }
        } while (opcion != 4);    
    }    
}
