package dia9act4;

import java.util.Scanner;

public class Dia9act4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int matriz[][] = new int [3][3];
        
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                matriz[i][j] = (int) Math.floor(Math.random()*9);
            }
        }
        
        System.out.println(" ");
        System.out.println("Matriz |A|");
        
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                
                System.out.print("["+matriz[i][j]+"]");
                
            }
            System.out.println("");
        }
        
        System.out.println(" ");
        System.out.println("Matriz |B|");
        
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                
                System.out.print("["+matriz[j][i]+"]");
                
            }
            System.out.println("");
        }
        System.out.println(" ");
    }
    
}
