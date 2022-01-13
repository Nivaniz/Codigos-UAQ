
package arregloscinco;

import java.util.Arrays;
import java.util.Scanner;

public class Arregloscinco {

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
        
        int Arreglo[] = {1,2,3,4,5};
        for (int j=0; j<Arreglo.length; j++){
            System.out.println(Arreglo[j]);
            
            /*
            1
            2
            3
            4
            5
            */
        }
    }
    
}
