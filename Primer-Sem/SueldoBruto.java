package sueldobruto;

import java.util.Scanner;
 
public class SueldoBruto {

   
    public static void main(String[] args) {
        Scanner vacaciones = new Scanner(System.in);//OBJETO
        String nombre="";
        double horas=0;
        double a=.5;
        double cuota=0;
        double paga=0;
        double total=0;
        double total2=0;
        double total3=0;
        
        System.out.println("*******");
        System.out.println("Bienvenido trabajador al sistema de sueldo bruto de la empresa");
        System.out.println("*******");
        System.out.println("");
        
        System.out.println("¿Cuál es tu nombre registrado en la empresa?");
        nombre=vacaciones.nextLine();
        System.out.println("");
        
        System.out.println("¿Cuál es la cuota por hora que te pagan?");
        cuota=vacaciones.nextDouble();
        System.out.println("");
        
        System.out.println("¿Cuántas horas hiciste?");
        horas=vacaciones.nextDouble();
        System.out.println("");
        
        total=cuota*horas;
        
         if(horas<=40){
                System.out.println("El trabajador: "+ nombre+ " tiene derecho a una paga de: " + total + "Pesos");
                System.out.println("!MUY BIEN! A TRABAJAR MÁS!");
            }
            else
                if (horas>=41){
                    
                    total2=horas-40;
                    total3=total2*((a*+cuota)+cuota);
                    paga=total3+(40*cuota);
                    System.out.println("El trabajador: "+nombre+" Que trabajo: "+horas+" horas "+ " Tiene un sueldo bruto de "+ paga);
                    
                }//if antiguedad >2
        }//llave del if
    }
