package dia9extra4;

import java.util.Scanner;

public class Dia9extra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int apro = 0;
        int desap = 0;
        int a = 0;
        
        int vector[] = new int [10];
        
        for(int i = 0; i < 10; i++){
            
            a = a + 1;
            System.out.println("Ingrese las notas de los trabajos del °"+a+" alumno");
            
            int t1 = leer.nextInt();
            int t2 = leer.nextInt();
            
            System.out.println("Ingrese las notas de los parciales del °"+a+" alumno");
            int p1 = leer.nextInt();
            int p2 = leer.nextInt();
            
            float prom = ((10 * t1) /100)+((15*t2)/100)+((25*p1)/100)+((50*p2)/100);
            
            if(prom < 7){
               apro = apro +1; 
            }else{
               desap = desap +1;
            }
            
            }
        
        System.out.println("");
        System.out.println("La cantidad de aprobados es "+apro);
        System.out.println("");
        System.out.println("La cantidad de desaprobados es "+desap);
        
        
    }
    
}
