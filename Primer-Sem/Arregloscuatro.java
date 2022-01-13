
package arregloscuatro;

import java.util.Arrays;
import java.util.Scanner;

public class Arregloscuatro {


    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        int lista[]=new int[6]; //espacios del arreglo
        
        // |_|_|_|_|_|
        
        int lim;
        
        System.out.println("Ingrese el límite del arreglo");
        lim=scan.nextInt();
        
        for(int i=0; i<lim; i++){
            System.out.println("Caja #" + i);
            lista[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(lista));
        
        /* Ingrese el límite del arreglo 5
           Caja #0
           1
           Caja #1
           58
           Caja #2
           54
           Caja #3
           552
           Caja #4
           55
           [1, 58, 54, 552, 55, 0]
        */
    }
    
}
