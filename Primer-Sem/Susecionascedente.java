//Crear una suceción que vaya de 1,99,2,98,3,97,4,96
package susecionascedente;

public class Susecionascedente {

   
    public static void main(String[] args) {
        
       int i=0;
        int Cien=100;
       System.out.println("Serie con for: ");
       for(i=1; i<=5; i++){
           if(i<6){
               Cien = Cien- 1;
               System.out.print(i + " ,"+Cien+" ,");
           }else{
               System.out.print(i);
           }}
       i=1;
       Cien=100;
       System.out.println("");
       
       System.out.println("Serie con while: ");
       while(i<=5){
           if(1<5){
               Cien = Cien- 1;
               System.out.print(i + " ,"+Cien+" ,");
           }else{
               System.out.print(i);
           }
           i++;
       }
           i=1;
           Cien=100;
       System.out.println("");
       
    System.out.println("Serie don do-while: ");
    do{
    if(i<6){
        Cien = Cien- 1;
               System.out.print(i + " ,"+Cien+" ,");
           }else{
               System.out.print(i);
    }
               i++;
    } while(i<=5);
    
    }
    
}
