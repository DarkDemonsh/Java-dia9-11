package dia11extra1;

import java.util.Scanner;

public class Dia11extra1 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int s = 0;
       
       
       System.out.println("Ingrese un numero");
       int num = leer.nextInt();
       int vector[] = new int[num];
       
       System.out.println("Ingrese "+num+" numeros");
       for(int i = 0; i < num; i++){
           vector[i] = leer.nextInt();
           
           s = s+vector[i];
           
       }
       
       System.out.println("La suma de los numeros es "+s);
       
    }
    
}
