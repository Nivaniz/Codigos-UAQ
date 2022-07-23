package ciclos;

import java.util.Scanner;


public class Ciclos {

    public static void main(String[] args) {
        
        /* INICIO
        //PROGRAMA QUE IMPRIMA LOS NÚMEROS QUE PIDA EL USUARIO
        
        Scanner entrada = new Scanner(System.in);
        int contador;
        
        System.out.println("Digite la cantidad de terminos a imprimir: ");
        contador = entrada.nextInt();
        
        for(int i=1; i<=contador; i++){
            System.out.println(i);
        }
         FINAL */   
        
       
        
        /* INICIO
        //PROGRAMA QUE SAQUE EL CUADRADO DE UN NÚMERO PERO QUE NO TOME NUMEROS NEGATIVOS HASTA QUE SALGA UNO POSITIVO
        Scanner entrada = new Scanner(System.in);
        int numero, cuadrado;
        
        System.out.println("Digite el número para sacar su cuadrado: ");
        numero = entrada.nextInt();
        
        while (numero >=0){ //debe ser positivo para seguir preguntando el numero
            cuadrado = (int)Math.pow(numero,2);
            System.out.println("El resultado es de: \n"+cuadrado);
            
              System.out.println("Digite el número para sacar su cuadrado: ");
               numero = entrada.nextInt();
        }
        
        FINAL */
        
        
         /* INICIO
        //PROGRAMA QUE LEE UN NÚMERO Y DICE SI ES POSITIVO O NEGATIVO HASTA QUE ESCRIBAN 0
        Scanner entrada = new Scanner(System.in);
        int numero, cuadrado;
        
        System.out.println("Digite el número para saber si es positivo o negativo: ");
        numero = entrada.nextInt();
        
        while (numero != 0){
            if (numero > 1){
                System.out.println("El número es positivo");   
            }//llave del if mayor a 1
            if (numero < -1){
                System.out.println("El número es negativo");
            }//llave del if menor a -1
            
            System.out.println("Digite el número para saber si es positivo o negativo\n"+
                    "(o 0 para salir): ");
            numero = entrada.nextInt();
        }
         FINAL */
        
         
          /* INICIO
         //PROGRAMA QUE LEE UN NÚMERO Y DICE SI ES PAR O IMPAR HASTA QUE ESCRIBAN 0
        Scanner entrada = new Scanner(System.in);
        int numero, parimpar = 0;
        
        System.out.println("Digite el número para saber si es par o impar: ");
        numero = entrada.nextInt();
        
        while (numero != 0){
          parimpar = numero%2; 
            if(parimpar == 0){
                System.out.println("El número: "+numero+" Es par");
            }
            if(parimpar !=0){
                 System.out.println("El número: "+numero+" Es impar: ");    
            }
             System.out.println("Digite el número para saber si es par o impar (o cero para salir): ");
             numero = entrada.nextInt();
        }
        FINAL */
        
            /* INICIO
        //PROGRAMA QUE PIDE NÚMEROS HASTA QUE UNO SEA NEGATIVO Y MOSTRAR CUANTOS NÚMEROS SE HAN METIDO 
        Scanner entrad = new Scanner(System.in);
        int contador=0,numero;
        
        System.out.println("Digite un numero (si pone uno negativo se va salir): ");
        numero = entrad.nextInt();
        
        while (numero>=0){
            System.out.println("Escribe otro");
            numero = entrad.nextInt();
            contador++;
        }
         System.out.println("El numero total de numeros positivos escritos son: "+contador); 
   FINAL */
            
             /* INICIO
            //ADIVINAR UN NUMERO 
           Scanner entrada = new Scanner(System.in);
           int numero,aleatorio, contador =0;
           
           
           // LA CLASE SOLA MATH.RANDOM() CREA NUMEROS ENTRE 0 Y 1 DECIMALES
           aleatorio = (int)(Math.random()*100); //PARA QUE SEA INT YA QUE PIDE DOUBLE
           //genera un numero aleatorio entre 1 y 100
           
           do{
               System.out.println("Digite un número");  
                numero = entrada.nextInt();
               
               if(aleatorio > numero){
                   System.out.println("Digite un número mayor");    
               } 
               else{
                   System.out.println("Digite un número menor");
               }
               
             contador++; //aumentamos en uno el contador
                   
           }while(numero != aleatorio);
            
            System.out.println("Adivinaste el número en: "+contador+"\n intentos");
      
            FINAL */
              
             /* INICIO
          // PEDIR NUMEROS HASTA QUE SE INTRODUZCA 0 Y SUMAR TODOS LOS INTRODUCIDOS
          
            Scanner entrada = new Scanner(System.in);
           int numero, contador =0;
           
           do{
               System.out.println("Digite un número");  
                numero = entrada.nextInt();
               
             contador+=numero;  //GUARDAR EL NUMERO Y SUMARLO EN CADA CICLO A CONTADOR      
             
           }while(numero!=0); //hasta que se introduzca 0
           
           System.out.println("La suma de los números es: "+contador);
           FINAL */
             
              /* INICIO
             //PIDE NÚMEROS HASTA UNO NEGATIVO Y CALCULA LA MEDIA
             Scanner entrada = new Scanner(System.in);
           int numero, elementos = 0, suma=0;
           float media =0;
           
            System.out.println("Digite un número y para salir digite uno negativo");  
            numero = entrada.nextInt();
            
            while(numero>=0){ //hasta que se introduzca 0
            suma = suma + numero; // otra forma de poner suma+=numero (suma iterativa)    
            elementos++; //aumentamos 1 a elementos
            
            System.out.println("Digite un número y para salir digite uno negativo");  
                numero = entrada.nextInt(); 
           }
           
           if(elementos == 0){ //si desde el principio es un numero 0
               System.out.println("La media con 0 no se puede hacer");
               System.out.println("Error");
           }
           else{
               media =(float) suma/elementos;
               System.out.println("La media de los números es: "+media);
           }
            
             FINAL */
              
                /* INICIO
           //PEDIR UN NUMERO N Y MOSTRAR TODOS LOS NÚMEROS DEL 1 AL N
           Scanner entrada = new Scanner(System.in);
           int numero, elementos = 0;
           
            System.out.println("Digite un número");  
            numero = entrada.nextInt();
            
            while(numero != elementos){
                elementos++; //BUCLE INFINITO
                System.out.println(elementos);
            }
           FINAL */
            
                /* INICIO
           //ESCRIBIR TODOS LOS NUMEROS DEL 100 AL 0 DE 7 EN 7
           
           for(int i=100; i>=0; i-=7){
               System.out.println(i);
           }
            FINAL */
           
                /* INICIO
          //PEDIR 10 NUMEROS Y SUMARLOS
          Scanner entrada = new Scanner(System.in);
           int numero, suma = 0;
           
           for(int i = 1; i<=10; i++){
           System.out.println("Digite un numero");  
           numero=entrada.nextInt();
           
           suma+=numero; //aumentar iteración
           }
            System.out.println("La suma es: "+suma);
             FINAL */
                
             /* INICIO    
          //PROGRAMA QUE MUESTRE EL PRODUCTO DE LOS 10 PRIMEROS NUMEROS IMPARES
          long producto = 1;
          
          for(int i =1; i<=20; i+=2){//por que los 10 primeros llega a 20
              producto = producto * i;
          }
          
          System.out.println("El producto es: "+producto);
          FINAL */
             
         //PROGRAMA QUE PIDA UN NUMERO Y CALCULAMOS SU FACTORIAL
          Scanner entrada = new Scanner(System.in);
           int numero;
           int factorial=1;
           
           System.out.println("Digite un numero");  
           numero=entrada.nextInt();
           
           for(int i=1; i<=numero; i++){ //si el numero es menor o igual que i
               factorial*=i;
           }
           
           System.out.println("El factorial es: "+factorial);
         
         
    }
    
}
