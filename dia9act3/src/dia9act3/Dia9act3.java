package dia9act3;

import java.util.Scanner;

public class Dia9act3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int x = leer.nextInt();
        int vector[] = new int [x];
        
        for(int i = 0; i<x; i++){
            
            vector[i] = (int) Math.floor(Math.random() * 100000);
            
        }
        
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        
        for(int i = 0; i<x ; i++){
            if(vector[i]<9){
                a = a+1;
            }
            if(vector[i]<99 && vector[i]>10){
                b = b+1;
            }else if(vector[i]<999 && vector[i]>100){
                c = c+1;
            }else if(vector[i]<9999 && vector[i]>1000){
                d = d+1;
            }else if(vector[i]<99999 && vector[i]>10000){
                e = e+1;
            }
            
        }
        
        System.out.println("Hay " +a+ " numeros de 1 digito");
        System.out.println("Hay " +b+ " numeros de 2 digito");
        System.out.println("Hay " +c+ " numeros de 3 digito");
        System.out.println("Hay " +d+ " numeros de 4 digito");
        System.out.println("Hay " +e+ " numeros de 5 digito");
        
    }
    
}
