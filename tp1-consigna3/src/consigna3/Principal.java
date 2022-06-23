//Spata, Pablo Leonardo, Legajo: VINF10171, Fecha: 13/06/2022

package consigna3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        //Declaramos un array para almacenar las palabras del usuario
        String[] palabras;        
        Scanner teclado = new Scanner(System.in);        
        int cantidad = 0;
                
        
        //Desplegamos un menu para que el usuario digite la cantidad palabras
        //a utilizar y asi poder darle un tamaño al array.
        System.out.print("Digite la cantidad de palabras que desea ingresar: ");
        
        //Utilizamos un bucle while hasta que el usuario introduzca un entero 
        //positivo
        boolean bandera = true;
        while (bandera) {
            String entrada = teclado.nextLine();     
            
            //Intentamos convertir a entero lo ingresado por el usuario
            //caso contrario capturamos la excepcion
            try {
                cantidad = Integer.parseInt(entrada);
            } 
            catch (NumberFormatException e) {
                System.out.print("Por favor, digite un número entero: ");
                continue;
            }
            
            //Si el numero es un entero positivo podemos dar tamaño al array
            //y colocamos la bandera en false para salir del ciclo
            if (cantidad > 0)
                bandera = false;            
            else
                System.out.print("Ingrese un numero mayor a 0: ");
        }
                
        //Creamos el objeto array con el tamaño que nos indico el usurio
        palabras = new String[cantidad];
        
        //Recorrermos el array para llenarlo con las palabras a ingresar
        for(int i = 0; i < palabras.length; i++)
        {
            System.out.print("Ingrese la palabra[" + i + "]: ");            
            palabras[i] = teclado.nextLine();            
        }
        
        //Desplegamos el menu principal con bucle Do-While con las opciones 
        //de la consigna
        int opcion = 0;        
        do {
            System.out.println("\n\tElija una opcion: ");
            System.out.println("1. Listar palabras");
            System.out.println("2. Realizar conteo");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");

            //Como en el caso anterior, nos aseguramos que el usuario ingrese
            //una opcion correcta
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

                if (opcion > 0 && opcion < 4)
                    banderaMenu = false;            
                else
                    System.out.print("Ingrese 1, 2 o 3: ");
            }

            //Utilizamos Switch-Case para acceder a los distintos metodos.
            switch (opcion) {

                case 1: mostrarPalabras(palabras);
                        break;

                case 2: System.out.print("\nElija una posicion entre 0 y " + (cantidad - 1) + ": ");                    

                        int posicion = 0;
                        boolean banderaPos = true;
                        while (banderaPos) {
                            String entrada = teclado.nextLine();            
                            try {
                                posicion = Integer.parseInt(entrada);
                            } 
                            catch (NumberFormatException e) {
                                System.out.print("Por favor, digite un número entero: ");
                                continue;
                            }

                            if (posicion > 0 && posicion < cantidad)
                                banderaPos = false;            
                            else
                                System.out.print("Digite un numero dentro del array: ");
                        }
                        Contador.contarLetras(palabras[posicion]);
                        break;

                case 3: System.out.println("Terminando el programa.");
            }
        } while (opcion != 3);
    }
    
    //Implementamos un metodo para mostrar todas las palabras.
    public static void mostrarPalabras(String[] arr) {
        
        System.out.println("\nListando palabras almacenadas...");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("\nLa palabra[" + i +"]: " + arr[i]);
        }
        
        System.out.println("");
    }           
}