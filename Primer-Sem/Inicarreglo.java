//Crear arreglo sin un objeto
package inicarreglo;

public class Inicarreglo {

    public static void main(String[] args) {
       int arreglo[]; //[] Declarando un arreglo con el mismo nombre
       
       arreglo = new int[10]; //Crea el espacio para el arreglo
       
       System.out.printf("%s%8s\n","Indice", "Valor"); //Encabezado de las columnas
       
       //Imprimir el valor del arreglo
       for(int contador =0; contador<arreglo.length; contador++){
           System.out.printf("%5d%8d\n",contador, arreglo[contador]);
       }
       
    }
    
}
