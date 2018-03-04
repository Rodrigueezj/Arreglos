package Logic;
import java.util.Arrays;
import java.util.Scanner;
public class Menu {
    private Scanner s = new Scanner(System.in);
    private int op;
    private Arreglo array1;
    private Arreglo array2;
    private Arreglo suma;
    private Arreglo resta;
    private Arreglo multi;
    private Arreglo fact; 
    private Arreglo fibo;
     //Switch for first menu   
    public void menu1(int a){
    switch ( a ) {
        case 1:
           menu2();
           break;
        case 2:
           menu22();
           break;
         case 3:
           menu3();
           break;
        default :
          menu1(a);
           break;
      }     
    }
    // Switch for first array     
    private void menu2(){
        System.out.println("\nIngrese '1' para definir el tamaño del arreglo 1 \n"
                        + "Ingrese '2' para agregar datos al arreglo 1 \n"
                        + "Ingrese '3' para eliminar un campo del arreglo 1 \n"
                        + "Ingrese '4' para agregar un campo al arreglo 1 \n"
                        + "Ingrese '5' para volver \n");
    op = s.nextInt();
    switch ( op ) {
        case 1:
            System.out.println("\nIngrese el tamaño del arreglo: \n");
            array1= new Arreglo(s.nextInt());
            menu2();
        break;
        case 2:
            array1.llenarArreglo();
            array1.mostrarArreglo();
            menu2();
        break;
        case 3:
            System.out.println("\nIngrese la posición que desea eliminar: \n");
            array1.eliminar(s.nextInt());
            array1.mostrarArreglo();
            menu2();
            break;
        case 4:
            System.out.println("\nIngrese la posición después de la cual desea agregar: \n");
            int pos=s.nextInt();
            System.out.println("\n¿Con qué la quiere llenar?: \n");
            int num=s.nextInt();
            array1.agregar(pos,num); 
            array1.mostrarArreglo();
            menu2();
            break;
        case 5: //gets back to first menu
        System.out.println("Ingrese '1' para acceder al arreglo 1 \n"
                         + "Ingrese '2' para acceder al arreglo 2 \n"
                         + "Ingrese '3' para acceder a operaciones \n");
        op = s.nextInt();
        menu1(op);
        break;
        default :
          System.out.println("INGRESE UN VALOR VÁLIDO\n");
            op = s.nextInt();
            menu1(op);
        break;
      }
} 
    // Switch for second array
    private void menu22(){
     System.out.println("\nIngrese '1' para definir el tamaño del arreglo 2 \n"
                        + "Ingrese '2' para agregar datos al arreglo 2 \n"
                        + "Ingrese '3' para eliminar un campo del arreglo 2 \n"
                        + "Ingrese '4' para agregar un campo al arreglo 2 \n"
                        + "Ingrese '5' para volver \n");
    op = s.nextInt();
    switch ( op ) {
        case 1:
            System.out.println("\nIngrese ingrese el tamaño del arreglo: \n");
            array2 = new Arreglo(s.nextInt());
            menu22();
        break;
        case 2:
            array2.llenarArreglo();
            array2.mostrarArreglo();
            menu22();
        break;
        case 3:
            System.out.println("\nIngrese la posición que desea eliminar: \n");
            array2.eliminar(s.nextInt());
            array2.mostrarArreglo();
            menu2();
            break;
        case 4:
            System.out.println("\nIngrese la posición después de la cual desea agregar: \n");
            int pos=s.nextInt();
            System.out.println("\n¿Con qué la quiere llenar?: \n");
            int num=s.nextInt();
            array2.agregar(pos,num); 
            array2.mostrarArreglo();
            menu2();
            break;
        case 5: //gets back to first menu
        System.out.println("Ingrese '1' para acceder al arreglo 1 \n"
                         + "Ingrese '2' para acceder al arreglo 2 \n"
                         + "Ingrese '3' para acceder a operaciones \n");
        op = s.nextInt();
        menu1(op);
        break;
        default :
          System.out.println("INGRESE UN VALOR VÁLIDO\n");
            op = s.nextInt();
            menu1(op);
        break;
      }
} 
    // Switch for operations
    private void menu3(){
     System.out.println("Ingrese '1' para sumar los arreglos \n"
                      + "Ingrese '2' para restar los arreglos \n"
                      + "Ingrese '3' para multiplicar los arreglos \n"
                      + "Ingrese '4' para realizar el factorial de los indices del arreglo \n"
                      + "Ingrese '5' para realizar la enesima iteracion de la serie de fibonacci \n"
                      + "Ingrese '6' para volver \n");
    op = s.nextInt();
    switch ( op ) {
        case 1:
            System.out.println("la suma de"+Arrays.toString(array1.getDatos())+" y "+Arrays.toString(array2.getDatos())+"es: \n");
            suma = new Arreglo(array1.getSize());
            suma.sumar(array2.getDatos(),array1.getDatos());
            System.out.println(Arrays.toString(suma.getDatos()));
            menu3();
           break;
        case 2:
            System.out.println("¿Cuál minuendo quiere escoger?\n Presione 1 para seleccionar el primer arrelgo o 2 para seleccionar el segundo arrelgo");
            switch(op){
                case 1:
                    System.out.println("la resta de "+Arrays.toString(array1.getDatos())+" y "+Arrays.toString(array2.getDatos())+" es: \n");
                    resta= new Arreglo(array1.getSize());
                    resta.restar(array2.getDatos(),array1.getDatos());
                    System.out.println(Arrays.toString(resta.getDatos()));
                    menu3();
                    break;
                case 2:
                    System.out.println("la resta de "+Arrays.toString(array2.getDatos())+" y "+Arrays.toString(array1.getDatos())+" es: \n");
                    resta= new Arreglo(array2.getSize());
                    resta.restar(array1.getDatos(),array2.getDatos());
                    System.out.println(Arrays.toString(resta.getDatos()));
                    menu3();
                    break;
                default:
                    System.out.println("INGRESE UN VALOR VÁLIDO");
                    menu3();
                    break;
            }
            break;
        case 3:
            System.out.println("la multiplicación entre "+Arrays.toString(array1.getDatos())+" y "+Arrays.toString(array2.getDatos())+" es: \n");
            multi= new Arreglo(array1.getSize());
            multi.multi(array2.getDatos(),array1.getDatos());
            multi.mostrarArreglo();
            menu3();
            break;
        case 4: //factorial
            System.out.println("¿Cuál arreglo quiere escoger?\n Presione 1 para seleccionar el primer arrelgo o 2 para seleccionar el segundo arrelgo");
            switch(op){
                case 1:
                    System.out.println("En esta opción se realizará el factorial del elemento de cada casilla en el arreglo");
                    fact = new Arreglo(array1.getSize());
                    fact.fact(array1.getDatos());
                    fact.mostrarArreglo();
                    menu3();
                    break;
                case 2:
                    System.out.println("En esta opción se realizará el factorial del elemento de cada casilla en el arreglo");
                    fact = new Arreglo(array2.getSize());
                    fact.fact(array2.getDatos());
                    fact.mostrarArreglo();
                    menu3();
                    break;
                default:
                    System.out.println("INGRESE UN VALOR VÁLIDO");
                    menu3();
                    break;
            }
            break;
        case 5://fibonacci
            System.out.println("¿Cuál arreglo quiere escoger?\n Presione 1 para seleccionar el primer arrelgo o 2 para seleccionar el segundo arrelgo");
            switch(op){
                case 1:
                    System.out.println("En esta opción se obtiene el enésimo término de la serie fibonacci siendo n el elemento del arreglo");
                    fibo= new Arreglo(array1.getSize());
                    fibo.fibo(array1.getDatos());
                    fibo.mostrarArreglo(); 
                    menu3();
                    break;
                case 2:
                    System.out.println("En esta opción se obtiene el enésimo término de la serie fibonacci siendo n el elemento del arreglo");
                    fibo= new Arreglo(array1.getSize());
                    fibo.fibo(array1.getDatos());
                    fibo.mostrarArreglo(); 
                    menu3();
                    break;
                default:
                    System.out.println("INGRESE UN VALOR VÁLIDO");
                    menu3();
                    break;
            }
            break;
        case 6: //gets back to first menu
            System.out.println("\nIngrese '1' para acceder al arreglo 1 \n"
                               + "Ingrese '2' para acceder al arreglo 2 \n"
                               + "Ingrese '3' para acceder a operaciones \n");
            op = s.nextInt();
            menu1(op);
            break;
        default :
            System.out.println("INGRESE UN VALOR VÁLIDO");
            op = s.nextInt();
            menu1(op);
            break;
      }
}
}

