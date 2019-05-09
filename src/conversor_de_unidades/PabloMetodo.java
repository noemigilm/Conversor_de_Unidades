/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor_de_unidades;

import java.util.Scanner;

/**
 *
 * @author DAM116
 */
public class PabloMetodo {
static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x = 3;
        lonxitude(x);
        
    }

    private static void lonxitude(double b) {
        System.out.println("Seleccione un metodo de conversion");
        System.out.println("1. Transformar Kms a Millas");
        System.out.println("2. Transformar Millas a Kms");
        System.out.println("3. Transformar Millas a Pulgadas");
        System.out.println("4. Transformar Pulgadas a Millas");
        System.out.println("0. Volver ó menú anterior");
        int a= leer.nextInt();
        switch (a) {
            case 1:
                System.out.println("A seleccionado: KM a Millas");
                b = b*0.621371;
                System.out.println(b);
                break;
            case 2:
                System.out.println("A seleccionado: Millas a KM");
                b = b*1.60934;
                System.out.println(b);
                break;
            case 3:
                System.out.println("A seleccionado: Millas a pulgadas");
                b = b*63360;
                System.out.println(b);
                break;
            case 4:
                System.out.println("A seleccionado: Pulgadas a Millas");
                b = b/63360;
                System.out.println(b);
                break;
            case 0:
                System.out.println("A seleccionado: Volver al anterior menu");
                break;
            default:
                break;
        }
    }
    
    
}
