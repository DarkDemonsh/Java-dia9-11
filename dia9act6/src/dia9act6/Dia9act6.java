package dia9act6;

import java.util.Scanner;

public class Dia9act6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int matriz[][] = new int [3][3];
        
        for(int i = 0; i<3; i++){
        for(int j = 0; j<3; j++){
         
            System.out.println("Ingrese el valor de la fila "+j+" columna "+i);
            matriz[i][j] = leer.nextInt();
            
        }
        }
        
        System.out.println(" ");
        for(int i = 0; i<3; i++){
        for(int j = 0; j<3; j++){

         
            System.out.print("["+matriz[i][j]+"]");
            
        }
        System.out.println("");
        }
        System.out.println(" ");
        
        int b = matriz[2][0]+matriz[1][1]+matriz[0][2];
        int c = matriz[0][0]+matriz[1][0]+matriz[2][0];
        int a = matriz[0][0]+matriz[0][1]+matriz[0][2];
        
      if(a==b && b==c){
          System.out.println("la suma de la diagonal,la fila y la columna coincide");
      }else{
          System.out.println("la suma de la diagonal,la fila y la columna NO coincide");
      }
      
System.out.println("");

    }
    
}
