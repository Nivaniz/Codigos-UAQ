/*
Sinatxis
for(inicio, terino, iteración){ sentencia_1, sentenia_2, sentencia_3}

[Inicialización;]
while(expresionLogica){
sentencias;
{iteración]
}

do{
sentencias;
[iteraiones;]
}while(expresionlogica);

si n=0 entonces 0!=1
si n>0 entonces
n! = *(2-1)*(n-2)* ...* 3*2*1
por ejemplo n=5 entonces
5! = 5*4*3*2*1 =120
*/
package ejecicioclase;
import java.util.Scanner;

public class EjecicioClase {

    
    public static void main(String[] args) {
      double suma=0;
      int N;
      double total = 0;
      double factorial;
      Scanner fac = new Scanner (System.in);
      
      //leer un número entero >=0 mayor o gual a cero
      do{
          System.out.print("Introduce un número >0: ");
          N=fac.nextInt();
      }while (N<0);
      
      for(int i=0; i<=N; i++){ //Para cada número desde 1 hasta N
          //se calcula el factorial
          factorial=1;
          for(int j=1; j<=i; j++){
              factorial=factorial*j;
          }
  
          //Muestre el factorial
          System.out.printf("%2d!=%.0f %n", i, factorial);
          
        suma=suma+factorial;
           System.out.println("La suma es: "+suma);  
      }
    }
}
