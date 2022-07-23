
package cajero;

public class Tarjeta {
    int numTarjeta, fechaCaducidad, cvv;
    float saldoActual;
    String nombreTitular="nombre default";
    
    
     public Tarjeta(String nombreTitular, float saldoActual, int numTarjeta){ //creo un objeto que le va cambiar 
        
        this.nombreTitular=nombreTitular; //nuestro nombre y sustituimos al nuevo
        this. saldoActual=saldoActual;
        this. numTarjeta=numTarjeta;
       
    }
    
}
