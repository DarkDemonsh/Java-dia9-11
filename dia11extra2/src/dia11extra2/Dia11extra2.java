package dia11extra2;

import java.util.Scanner;

public class Dia11extra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del los vectores");
        int num1 = leer.nextInt();
        
        int vectorA[] = new int [num1];
        int vectorB[] = new int [num1];
        
        
        System.out.println("ingrese los valores del primer vector");
        for(int i = 0; i < num1; i++){
        vectorA[i] = leer.nextInt();
        }
        
        System.out.println("Ingrese los valores del segundo vector");
        for(int i = 0; i < num1; i++){
        vectorB[i] = leer.nextInt();
        }    
        
        int a = 1;
        for(int i = 0; i < num1; i++){
            if(vectorA[i] != vectorB[i]){
                a = 0;    
            }
        }
        if(a == 1){
            System.out.println("los vectores son iguales");
        }else{
            System.out.println("los vectores no son iguales");
        }
        
    }
    
}
