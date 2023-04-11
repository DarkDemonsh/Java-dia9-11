package dia11extra5;

import java.util.Scanner;

public class Dia11extra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int matriz[][] = new int [3][3];
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                
                matriz[i][j] = (int) Math.floor(Math.random()*9+1);
                
            }
        }
        
        int s = 0;
        
        System.out.println(" ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                
                System.out.print("["+matriz[i][j]+"]");
                
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
        
                s = s + matriz[i][j];
            
            }
        }
        
        System.out.println("la suma de los elementos de la matriz es "+s);
        
    }
    
}
