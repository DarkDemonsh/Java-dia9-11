package dia11extra6;

import java.util.Scanner;

public class Dia11extra6 {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        String[][] matriz=new String[20][20];

        for(int i =0; i<20; i++){
            for(int j =0; j<20; j++){ 
                matriz[i][j] = "/";  
            }
        }
        
        for (int i=0;i<matriz.length;i++){
                for (int j=0;j<matriz.length;j++){
                 matriz[i][j]=Integer.toString((int)Math.random()*10);
            }

         for(i=0; i<5; i++){
                System.out.println("Ingrese palabra n° "+(i+1));
            String frase=leer.nextLine();
            int num = (int)(Math.random()*20);

            while(frase.length()<3 || frase.length()>5){
                System.out.println("La frase debe tener un mínimo de 3 caracteres y un máximo de 5. Vuelva a ingresar la palabra n° "+i);
                frase=leer.nextLine();
            }
                for (int j=0;j<frase.length();j++){
                    matriz[num][j]=frase.substring(j, j+1);
                }
         }
         System.out.println(" ");
         for( i=0;i<matriz.length;i++){
                for (int j=0;j<matriz.length;j++){
                    System.out.print("["+matriz[i][j]+"]");
                }
                System.out.println(" ");
            }
         System.out.println(" ");
    }
}}

