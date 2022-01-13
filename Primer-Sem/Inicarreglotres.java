
package inicarreglotres;

public class Inicarreglotres {

    public static void main(String[] args) {
        final int LONGITUD_ARREGLO=10; //Declaración de constante
        int arreglo[]=new int[LONGITUD_ARREGLO];//Crear arreglo
        
        //calcular el valor para cada elemento del arreglo
        for(int contador=0; contador<arreglo.length; contador++)
            arreglo[contador]=2+2*contador;
        
        System.out.printf("%s%8s\n", "Indice","Valor"); //Encaezador de columnas
        
        /*
        * Pequeña explicación del formato utilizado:
        * %s  <---- Impresión de String, sin formato extra.
        * %8s <---- Impresión de String, de 8 caracteres, como la palabra 'Value' tiene 5 caracteres,
        *           se aplica una sangría de 3 caracteres. Si la palabra tuviese más caracteres, aparecería cortada.
        * \n  <---- Salto de línea.
        * */
        
        //imprime el valor de cada elemento del arreglo
        for(int contador=0; contador<arreglo.length; contador++)
        System.out.printf("%5d%8d\n",contador, arreglo[contador]);
    }
    
}
