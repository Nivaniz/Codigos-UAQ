//Números romanos
package numerosromanos;
import java.util.Scanner;

public class Numerosromanos {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N;
       
       do{
          System.out.println("Dame un número entre 1 y 3999"); 
          N=sc.nextInt();
       } while(N<1 || N>3999);
               System.out.println(N+"En números romanos es: "+convertirANumerosRomanos(N));
    }
        
    //Método para pasar a números romanos
     public static String convertirANumerosRomanos(int numero){
         int i,miles, centenas, decenas, unidades;
         String romanos="";
         
         //obtener cada cifra
         miles=numero/1000;
         centenas=numero/100%10;
         decenas=numero/10%10;
         unidades=numero%10;
         
     //Millar
         for(i=1; i<miles; i++){
         romanos=romanos+"M";
     }
         
     //centenas
     if(centenas==9){
         romanos=romanos+"CM";
     }else if (centenas>=5){
         romanos=romanos+"D";
         for(i=6;i<=centenas;i++){
             romanos=romanos+"C";}
     }
             else if(centenas ==4){
                     romanos=romanos+"CD";
                     }else{
                     for (i=1; i<=centenas; i++){
                     romanos=romanos+"C";
                     }
               }
     //decenas
     if (decenas==9){
         romanos=romanos+"XC";
     }else if(decenas>=5){
         romanos=romanos+"L";
         for(i=6; i<=decenas; i++);{
         romanos=romanos+"X";
     }
     }else if (decenas==4){
         romanos=romanos+"XL";
     }else{
         for (i=1; i<=decenas; i++){
             romanos=romanos+"X";
         }
     }
     //unidades
     if(unidades==9){
         romanos=romanos+"IX";}
     else if(unidades>=5){
         romanos=romanos+"V";
         for (i=6; i<=unidades; i++){
             romanos=romanos+"I";
         }
     }else if(unidades==4){
         romanos=romanos+"IV";
     }else{
         for(i=1; i<=unidades; i++){
             romanos=romanos+"I";
         }
     }
     return romanos;
     }
}
