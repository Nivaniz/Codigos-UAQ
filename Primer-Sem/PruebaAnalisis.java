
package analisisjava;
import java.util.Scanner;

public class PruebaAnalisis {
    public void procesoResultadosExamen(){
        Scanner entrada=new Scanner(System.in);
        
        //Inicialización de las variables en declaración
        int aprobados=0;
        int reprobados=0;
        int contadorEstudiantes=1;
        int resultado;
        
        while (contadorEstudiantes<11){
            //Solicitamos al usuario la entrada y obtener el valor
            System.out.print("Escriba el resultado (1=aprobado, 2=reprobado) : ");
            resultado=entrada.nextInt();
            
            if (resultado==1)
                aprobados=aprobados+1;
            else
                reprobados = reprobados +1;
            
            //incrementa contadorEstudiantes para que el ciclo termine en un momento dado
            contadorEstudiantes=contadorEstudiantes+1;
        }//while
        
        //fase de terminación
        System.out.printf("Aprobados: %d\n Reprobados: %d\n", aprobados, reprobados);
        
        if(aprobados>7)
           System.out.println("Aumenta colegeatura");
        
    }//fin del public void
}
