package dia11extra3;

import java.util.Scanner;

public class Dia11extra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese el tamaño del vector");
        int t = leer.nextInt();
        
        int vector[] = new int [t];
        
        for(int i = 0; i < t; i++){
            vector[i] = (int) Math.floor(Math.random()*9+1);
        }
        
        System.out.println(" ");
        for(int i = 0; i < t; i++){
            System.out.println(vector[i]);
        }
        System.out.println(" ");
    }
    
}
