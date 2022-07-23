package figuraarea;
//area = (b*h)/2
public class Triangulo extends Figura {
    
    public Triangulo(){
        super();
    } 
    
    
    @Override
    public void calcularArea(){
     this.setArea((this.getBase()*this.getAltura())/2);   
    }


}
