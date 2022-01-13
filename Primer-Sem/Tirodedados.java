
package tirodedados;
import java.util.Random;
        
public class Tirodedados {

    public static void main(String[] args) {
      
        Random numeroAleatorios = new Random(); // creación de objeto que hace el generador de números aleatorios
        int frecuencia []=new int[7]; //arreglo de contadores de frecuencia
        
        //Tire 600 veces; usando el valor dado como indice de frecuencia
        for(int tiros=1; tiros<=600; tiros++)
            ++frecuencia[1+numeroAleatorios.nextInt(6)];
        
        System.out.printf("%s%10s\n", "Cara", "Frecuencia");
        
        //Imprime el valor de cada elemento del arreglo
        for(int cara=1; cara<frecuencia.length; cara++)
            System.out.printf("%4d%10d\n", cara, frecuencia[cara]);
    }
    
}
