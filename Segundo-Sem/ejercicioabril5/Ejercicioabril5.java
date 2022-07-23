package ejercicioabril5;

import java.util.Scanner;

public class Ejercicioabril5 {
    
    public static int salarioAlto(Empleados directivo[]){ //MÉTODO QUE NOS VA AYUDAR PARA COMPARAR NUESTO SALARIO
        float salario;
        int indice=0;
        
        salario=directivo[0].getSalario(); //SE TOMA EL MAYOR Y SE VA ALMACENANDO
        for( int i=1; i<directivo.length; i++){
            if(directivo[i].getSalario()>salario){ //COMPARANDO QUE ES MAYOR QUE EL ANTERIOR
                salario=directivo[i].getSalario(); //CHECA CUAL ES MAYOR Y LA ALMACENA
                indice=i;
            }
        }
        return indice;
    }
    
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
       String nombre, puesto;
       int clave;
       float salario;
       
       int numeroEmpleados;
       int SalarioAlto;
       
        System.out.println("Digita el número de empleados que vas a ingresar: ");
        numeroEmpleados = entrada.nextInt();
        
        Empleados directivo[]= new Empleados [numeroEmpleados];
        
        for(int i=0; i<directivo.length;i++){  //Para que se repita el que nos pida número de empleados
            entrada.nextLine();
            System.out.println("Ingresa la información del empleado: "+(i+1)+";"); //ingresa la info del empleado 1,2,3,4
            System.out.println("Ingresa el nombre del empleado: ");
            nombre= entrada.nextLine();//pq es string
            System.out.println("Ingresa la clave del empleado: ");
            clave = entrada.nextInt();
           
            System.out.println("Ingresa el puesto del empleado: ");
            puesto = entrada.nextLine();
             entrada.nextLine(); //checar pq no jala e imprime lo de empleados
            System.out.println("Ingresa el salario del empleado: ");
            salario = entrada.nextFloat();
            
            directivo[i] = new Empleados (nombre, clave, puesto, salario);
        }
        
            SalarioAlto = salarioAlto (directivo);
            System.out.println("\n El empleado con el salario más alto es: ");
            System.out.println(directivo[SalarioAlto].mostrarDatos());
        
           
    }
    
}
