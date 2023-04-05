package dia9act1;

import java.util.Scanner;

public class Dia9act1 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int x = 101;
       int[]vector = new int[100];
       
       for(int i = 0; i<100; i++){
           x = x-1;
           vector[i] = x;
           
       }
       
       for(int i = 0; i<100; i++){
           System.out.println("[" + vector[i] + "]");
       }
       
    }
    
}
