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
            System.out.println("2. Potencia");
            System.out.println("3. Temperatura");
            System.out.println("4. Salir");
 
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
                        System.out.println("Has seleccionado la opcion Potencia");
                            Potencia();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion Conversion Temperatura");
                            Temperatura();
                        break;
                    
                    case 4:
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
        System.out.println("Introduzca el numero a transformar: ");
        /**
         * @param numero unidad a convertir
         */
        int numero=leer.nextInt();
        /**
         * @return devuelve la longitud
         */
        return numero;
    }

    private static void lonxitude() {
        boolean comprobar=true;
        System.out.println("Seleccione la medida a convertir");
        System.out.println("1. Km");
        System.out.println("2. Metros");
        System.out.println("3. Cm");
        System.out.println("4. Pulgadas");
        System.out.println("5. Yardas");
        System.out.println("6. Pies");
        System.out.println("7. Millas");
        System.out.println("8. Millas nauticas");
        System.out.println("0. Salir");
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
                    
                break;
            case 2:
                b/=1000;
                break;
            case 3:
                b/=100000;
                break;
            case 4:
                b/=39370.1;
                break;
            case 5:
                b/=1093.61;
                break;
            case 6:
                 b/=3280.84;
                break;
            case 7:
                 b/=0.621371;
                break;
            case 8:
                 b/=0.539957;
                break;
            default:
                comprobar=false;
                break;
        }
        if (comprobar) {
            System.out.println("Seleccione la medida a la que convertir");
        System.out.println("1. Km");
        System.out.println("2. Metros");
        System.out.println("3. Cm");
        System.out.println("4. Pulgadas");
        System.out.println("5. Yardas");
        System.out.println("6. Pies");
        System.out.println("7. Millas");
        System.out.println("8. Millas nauticas");
        System.out.println("0. Salir");
            a= leer.nextInt();
        switch (a) {
         case 1:

             break;
         case 2:
             b*=1000;
             break;
         case 3:
             b*=100000;
             break;
         case 4:
             b*=39370.1;
             break;
         case 5:
             b*=1093.61;
             break;
         case 6:
             b*=3280.84;
             break;
         case 7:
             b*=0.621371;
             break;
         case 8:
             b*=0.539957;
             break;
         default:
             comprobar=false;
             break;
        }
            System.out.println("La Cantidad convertida es: "+b);
        }
        
    }
    
    private static void Potencia() {
            double c=insertarNumero();
            System.out.println("Seleccione un metodo de conversion");
            System.out.println("1. Transformar WK a CV");
            System.out.println("2. Transformar CV a KW");
            System.out.println("3. Transformar KW a Ft/Lb");
            System.out.println("4. Transformar Ft/lb a KW");  
            System.out.println("0. Volver ó menú anterior");
            int a= leer.nextInt();
            switch (a) {
                case 1:
                    System.out.println("A seleccionado: KW a CV");
                    c = c*1.34102;
                    System.out.println(c);
                    break;
                case 2:
                    System.out.println("A seleccionado: CV a KW");
                    c = c*0.7457;
                    System.out.println(c);
                    break;
                case 3:
                    System.out.println("A seleccionado: KW a Ft/Lb");
                    c = c*737.562149;
                    System.out.println(c);
                    break;
                case 4:
                    System.out.println("A seleccionado: Ft/Lb a KW");
                    c = c*0.0013558179;
                    System.out.println(c);
                    break;
                case 0:
                    System.out.println("A seleccionado: Volver al anterior menu");
                    break;
                default:
                    break;
            }
        }
        private static void Temperatura() {
            double d=insertarNumero();
            System.out.println("Seleccione un metodo de conversion");
            System.out.println("1. Transformar Celsius a Fahrenheit");
            System.out.println("2. Transformar Fahrenheit a Celsius");
            System.out.println("3. Transformar Celsius a Kelvin");
            System.out.println("4. Transformar Kelvin a Celsius");  
            System.out.println("0. Volver ó menú anterior");
            int a= leer.nextInt();
            switch (a) {
                case 1:
                    System.out.println("A seleccionado: Celsius a Fahrenheit");
                    d = (d*9 / 5) + 32;
                    System.out.println(d);
                    break;
                case 2:
                    System.out.println("A seleccionado: Fahrenheit a Celsius");
                    d = (d-32)*5 / 9 ;
                    System.out.println(d);
                    break;
                case 3:
                    System.out.println("A seleccionado:Celsius a Kelvin");
                    d = d+273.15;
                    System.out.println(d);
                    break;
                case 4:
                    System.out.println("A seleccionado: Kelvin a Celsius");
                    d = d-273.15;
                    System.out.println(d);
                    break;
                case 0:
                    System.out.println("A seleccionado: Volver al anterior menu");
                    break;
                default:
                    break;
            }
        }
}