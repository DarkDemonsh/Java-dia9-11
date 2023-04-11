package dia11extra7;

import java.util.Scanner;

public class Dia11extra7 {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        
        System.out.println("escribe un numero");
        int num = leer.nextInt();
        
        int a = 0;
        int b = 1;
        int c = 0;
        
        if(num == 1){
            c = 1;
        }
        
        for(int i = 0; i<num; i++){
           c = a+b;
           a = b;
           b = c;
        }
        
        System.out.print("el numero es "+a);
        System.out.println("");
        
    }
    
}
