/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor_de_unidades;


import java.util.InputMismatchException;
import java.util.Scanner;

/** 
 * @autor Pablo
 * @autor Miguel
 * @author Noemi
 * @autor Ignacio
 */
public class Conversor_de_Unidades {
static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       Scanner sn = new Scanner(System.in);
       /**
        *@param salir salir del menú
        */
        boolean salir = false;
        /**
        *@param opcion escoger opción del menú
        */
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
            System.out.println("Elige el tipo de conversion:");
            System.out.println("1. lonxitude.");
            System.out.println("2. Proximamente");
            System.out.println("3. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion Conversion de Longitud");
                        System.out.println("introduce los datos:");
                        lonxitude();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        
                        break;
                    
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 
    
        
    }
    private static int insertarNumero(){
        System.out.println("Introduzca la longitud a transformar: ");
        /**
         * @param longitud unidad a convertir
         */
        int longitud=leer.nextInt();
        /**
         * @return devuelve la longitud
         */
        return longitud;
    }
    
    
     private static void lonxitude() {
        System.out.println("Seleccione un metodo de conversion");
        System.out.println("1. Transformar Kms a Millas");
        System.out.println("2. Transformar Millas a Kms");
        System.out.println("3. Transformar Millas a Pulgadas");
        System.out.println("4. Transformar Pulgadas a Millas");
        System.out.println("0. Volver ó menú anterior");
        /**
        * @param a opción del submenú
        */
        int a= leer.nextInt();
        /**
        * @param resultado resultado de la conversión
        */
        double resultado;
        /**
        * @param b unidad a convertir
        */
        double b=insertarNumero();
        switch (a) {
            case 1:
                System.out.println("A seleccionado: KM a Millas");
                resultado = b*0.621371;
                System.out.println(resultado);
                break;
            case 2:
                System.out.println("A seleccionado: Millas a KM");
                resultado = b*1.60934;
                System.out.println(resultado);
                break;
            case 3:
                System.out.println("A seleccionado: Millas a pulgadas");
                resultado = b*63360;
                System.out.println(resultado);
                break;
            case 4:
                System.out.println("A seleccionado: Pulgadas a Millas");
                resultado = b/63360;
                System.out.println(resultado);
                break;
            case 0:
                System.out.println("A seleccionado: Volver al anterior menu");
                break;
            default:
                break;
        }
    }
}
