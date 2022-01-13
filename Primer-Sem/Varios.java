//Retroalimentación de clase
package varios;

public class Varios {

    public static void main(String[] args) {
        //Operadores
        //variables
        int numero_uno=4;
        int numero_dos=5;
        int resultado=0;
        
        resultado=numero_uno+numero_dos;
        System.out.println("El resultado es:"+resultado);
        
         resultado=numero_uno-numero_dos;
        System.out.println("El resultado es:"+resultado);
        
         resultado=numero_uno*numero_dos;
        System.out.println("El resultado es:"+resultado);
        
         resultado=numero_uno/numero_dos;
        System.out.println("El resultado es:"+resultado);
        
         resultado=numero_uno%numero_dos;
        System.out.println("El resultado es:"+resultado);
        
        
        //Estructura condicional con if-else
        
        int programación = 8;
        int investigación = 7;
        int administración = 10;
        int promedio=0;
        
        promedio = (programación + investigación + administración)/3;
        
        if(promedio >=6){
            System.out.println("Alumno aprobado"+promedio);
        }//fin del if
        else
            System.out.println("Alumno reprobado"+promedio);
        
    }
    
}
