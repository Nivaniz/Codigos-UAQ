
package operacion2;
//1,2,3,4,5,6,7,8,10
//1,99,2,98,3,97,4,96,5,95
//0,1,2,3,4,5,13,21,34

public class Operacion2 {

    
    public static void main(String[] args) {
         int i=0;
        System.out.println("Serie con for: ");
        for(i=1; i<=10; i++)
            if(i<10){
                System.out.print(i + ",");
            }else{
                System.out.print(i);
            }
        
    i=1;
    System.out.println("");
    
    System.out.println("Serie con while: ");
    while(i<=10){
    if(1<10){
        System.out.print(i + ", ");
    }else{
        System.out.print(i);
    }
    i++;
}
    i=1;
    System.out.println("");


    System.out.print("Serie con do-while: ");
    do{
    if(i<10){
         System.out.print(i + ",");
          }else{
            System.out.print(i);
         } 
              i++;
} while(i<=10);
    
    }
        
}

 /*int i = 1000; //valor a iniciar
        
        do{
            System.out.print(i+" , ");
            i-=200; //restando de 200 en 200
        }while(i>=0);//hasta cero */
//for(i=5000; i>=3000; i-200) si fuera con for 


    
       
    



    

