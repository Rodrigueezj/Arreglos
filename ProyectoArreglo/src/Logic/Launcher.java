package Logic;
import java.util.Scanner;
public class Launcher
{
   //First menu is in main
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int op;
        System.out.println("Ingrese '1' para acceder al arreglo 1 \n"
                         + "Ingrese '2' para acceder al arreglo 2 \n"
                         + "Ingrese '3' para acceder a operaciones \n");
        op = s.nextInt();
        Menu miMenu = new Menu();
        miMenu.menu1(op);
    }
}