
package capicula;
import java.util.Scanner;

public class Capicula {

    public static void main(String[] args) {
        int N, aux, inverso=0, cifra;
        
        Scanner sc=new Scanner (System.in);
        
       do{
           System.out.print("Introdue el número>=10: ");
           N=sc.nextInt();
       }while (N<10);
       
       //Leer de derecha a izquierda
       aux=N;
       while(aux!=0){
           cifra=aux%10;
           inverso=inverso*10+cifra;
           aux=aux/10;
       }
       if (N==inverso){
           System.out.println("Es capícula");
       }else{
           System.out.println("No es capícula");
       }
    }
    
}
