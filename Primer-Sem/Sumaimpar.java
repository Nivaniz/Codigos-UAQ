
package sumaimpar;
import java.util.Scanner;

public class Sumaimpar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int num;
        int supar=0;
        int suimpar=0;
        
        System.out.println("Dame el numero a calcular");
        num=teclado.nextInt();
        
        for(int ind=1; ind<num; ind++){
            if(ind%2==0){
                supar+=ind;
            }//cierra if
            else{
                suimpar+=ind;
            }//cierra else
        }//cierra for
        System.out.println("La suma de los pares es "+supar);
        System.out.println("La suma de los impares es "+suimpar);
    }//Cierra main
    
}//Cierra class
