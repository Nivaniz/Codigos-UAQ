//Calculo de la sumaa de los elementos de un arreglo
package sumaarreglo;

public class Sumaarreglo {

    public static void main(String[] args) {
        /*
        int arreglo[]={87,68,94,100,83,78,85,91,76,87};
        int total=0;
        
        //Suma del valor de cada elemento  al total en ciclo hasta que se acabe el arreglo
        for(int contador=0; contador<arreglo.length; contador++)
            total+=arreglo[contador];
        //+= incrementa el valor del contador al total de los valores que se establezcan guardados
        //contador va contando y guardando en su valor de =0 87,68 y el arreglo provee los numeros
        
        System.out.printf("El total de los elementos del arreglo: %d\n", total); */
                
        //Nuevo proyecto 2
        
        int arreglo[]={0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };
        
        System.out.println("Distribucción");
        
        //Para cada elemento del arreglo, imprime una barra de gráfico
        for (int contador=0; contador<arreglo.length; contador++)
        {
            //Imprime etiqueta de la barra ("00-09: ", ..." 90-99", "100:")
            if(contador==10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", contador*10, contador*10+9);
            
            //Imprime barra de asteriscos **
            for(int estrellas=0; estrellas<arreglo[contador]; estrellas++)
                System.out.print("*");
            
            System.out.println(); //iniciar una nueva salida
        }
    }
    
}
