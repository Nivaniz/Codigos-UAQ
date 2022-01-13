
package inicarreglodos;

public class Inicarreglodos {

    public static void main(String[] args) {
        //Lista inicializadora específica el valor para cada elemento
        int arreglo[]={32, 27, 64, 18, 95, 14, 90, 70 ,60, 37};
        
        System.out.printf("%s%8s\n","Indice", "Valor"); //Encabezado de las columnas
        
        //Imprimir el valor del arreglo
       for(int contador =0; contador<arreglo.length; contador++){
           System.out.printf("%5d%8d\n",contador, arreglo[contador]);
       }
    }
    
}
