
package controlvacacional;
import java.util.Scanner;
        
public class Controlvacacional {

    public static void main(String[] args) {
        
        Scanner vacaciones = new Scanner(System.in);//OBJETO
        String nombre="";
        int clave=0;
        int antiguedad=0;
        
        System.out.println("*************************************************");
        System.out.println("Bienvenido trabajador al sistema vacacional de la empresa");
        System.out.println("*************************************************");
        System.out.println("");
        
        System.out.println("¿Cuál es tu nombre registrado en la empresa?");
        nombre=vacaciones.nextLine();
        System.out.println("");
        
        System.out.println("¿Cuánto tiempo llevas registrado en la empresa?");
        antiguedad=vacaciones.nextInt();
        System.out.println("");
        
        System.out.println("¿Cuál es la clave del trabajador");
        clave=vacaciones.nextInt();
        System.out.println("");
        
        if(clave ==1){
            if(antiguedad==1){
                System.out.println("El trabajador"+ nombre+ "tiene derecho a 7 días de vacaciones");
            }//if antiguedad==1 
            else
                if (antiguedad>=2 && antiguedad <=7){
                    System.out.println("El trabajador"+nombre+"Tiene derecho a 14 días de vacaciones");
                }//if antiguedad >2
            else
                    if(antiguedad>=8){
                        System.out.println("El trabajador"+nombre+"tiene derecho a 20 días de vacaciones");
                    }//IF ANTIGUEDAD 8 
        }//llave del if 
        else
            if(clave ==2){
                if(antiguedad==1){
                System.out.println("El trabajador"+ nombre+ "tiene derecho a 3 días de vacaciones");
            }//if antiguedad==1 
            else
                if (antiguedad>=2 && antiguedad <=9){
                    System.out.println("El trabajador"+nombre+"Tiene derecho a 16 días de vacaciones");
                }//if antiguedad >2
            else
                    if(antiguedad>=9){
                        System.out.println("El trabajador"+nombre+"tiene derecho a 23 días de vacaciones");
                    }//IF ANTIGUEDAD 8 
                
            }//llave del if ==2
        else
                if(clave == 3){
                    if(antiguedad==1){
                System.out.println("El trabajador"+ nombre+ "tiene derecho a 10 días de vacaciones");
            }//if antiguedad==1 
            else
                if (antiguedad>=2 && antiguedad <9){
                    System.out.println("El trabajador"+nombre+"Tiene derecho a 16 días de vacaciones");
                }//if antiguedad >2
            else
                    if(antiguedad>=10){
                        System.out.println("El trabajador"+nombre+"tiene derecho a 25 días de vacaciones");
                    }//IF ANTIGUEDAD 8 
                    
                }//llave del if ==3
                else{
                    System.out.println("!!Error!! Clave del departamento incorrecta");
                }//lave del else
    }
    
}
