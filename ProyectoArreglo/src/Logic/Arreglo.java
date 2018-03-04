/*
Author: Juan David Bello.
4/03/2018
Version 4
*/
package Logic;
import java.util.Scanner;
public class Arreglo {
    private int size;
    private int datos[];
    private Scanner s = new Scanner(System.in);
    public Arreglo(int sizeTemp){
        crearArreglo(sizeTemp);  
    }
    public int getSize() {
        return size;
    }
    public int[] getDatos(){
        return datos;
    }
    public void crearArreglo(int sizeTemp){
        size=sizeTemp;
        datos = new int [size];
    }
    public void llenarArreglo(){
        for(int i=0 ; i<size; i++){
                System.out.println("\nIngrese el "+(i+1)+" dato del arreglo: \n");
                datos[i] = s.nextInt();
            }
    }
    public void mostrarArreglo(){
        System.out.print("Su arreglo es:\n"+"{");
        for(int i=0 ; i<size; i++){
            System.out.print(datos[i]+" ");
        }
        System.out.print("}\n");
   }
    //Operations
    /*Actually the three operations works in  similar way 
    The object's size is defined as the biggest one of 2 arrays
    The smallest size is defined as "pequenio"
    After that, we realize an iteration that fills the new array with the result of the operation
    */
    public void sumar (int[] o,int[] a){
        int suma[];
        int pequenio;
        if(a.length<o.length){
            suma= new int[o.length];   
            pequenio=a.length;
        } 
        else{
            suma= new int[a.length];
            pequenio=o.length;
        }
            
        for(int n=0 ; n<suma.length; n++){
            if (n<pequenio)
                suma[n] = a[n] + o[n];
            else
                suma[n]=0;
        }
            datos=suma;
    }
    public void restar (int[] o, int[] a){
        int resta[];
        int pequenio;
        if(a.length <o.length){
            resta= new int[o.length];   
            pequenio=a.length;
        } 
        else{
            resta= new int[a.length];
            pequenio=o.length;
        }  
        for(int n=0 ; n<resta.length; n++){
            if (n<pequenio)
                resta[n] = a[n] - o[n];
            else
                    resta[n]=0;
        }
        datos=resta;
    }
    public void multi (int[] o, int[] a){
        int multi[];
        int pequenio;
        if(a.length<o.length){
            multi= new int[o.length];   
            pequenio=a.length;
        } 
        else{
            multi= new int[a.length];
            pequenio=o.length;
        }
        for(int n=0 ; n<multi.length; n++){
            if (n<pequenio)
                multi[n] = a[n] * o[n];
            else
                multi[n]=0;
        }
            datos=multi;
}
    //We call the method "facto" so that it does the factorial of each index
    public void fact (int[] o){
        int fact[];
        fact = new int[o.length];  
        for(int n=0 ; n<o.length; n++){
            int m=o[n];
            fact[n]=facto(m);
    } 
    datos = fact;
    }
    //returns the factorial of a number
    public int facto(int m){
        int facto;
        facto = 1;
        if(facto==0)
            facto=0;
        else{
        for (int i = 1; i <= m; i++) {
            facto *= i;
            }
        }
        return facto;
    }
    //We call the method "fibon" so that it does the fbonacci of each index
    public void fibo (int[] o){
        int fibo[];
        fibo = new int[o.length];  
        for(int n=0 ; n<o.length; n++){
            int m=o[n];
            fibo[n]=fibon(m);
        }
    datos = fibo;    
    }
    //returns the n fibonacci term  
    public int fibon(int m){
        int fibon;
        fibon = 0;
        if (m>1)
            fibon = fibon(m-1) + fibon(m-2);
        else if (m==1) 
            fibon = 1;
        else if (m==0){
            fibon = 0;
        }
        return fibon;
    }
    /*deletes an index
    We run the array until the position is found, 
    after that we define the next indices as the position deleted +1   
    */
    public void eliminar(int o){
        int nuevo[];
        nuevo = new int[size-1];
        for (int i = 0; i < o-1; i++) {
            nuevo[i]=datos[i];
        }
        for(int i=o-1; i<size-1; i++){
            nuevo[i]=datos[i+1];
        }
        datos=nuevo;
        size=datos.length;
    } 
    /*adds an index
    We run the array until the position is found, 
    after that we define a new position and the next indices as the position addeed -1   
    */
    public void agregar(int o, int a){
        int nuevo[];
        nuevo = new int[size+1];
        for (int i = 0; i < o; i++) {
            nuevo[i]=datos[i];
        }
        nuevo[o]=a;
        for(int i=o+1; i<size+1; i++){
            nuevo[i]=datos[i-1];
        }
  
        datos = nuevo;
        size=datos.length;
    } 
}

