package figuraarea;

public class Cuadrado extends Figura {
   
    public Cuadrado(){
         super();
} 

    @Override
    public void calcularArea(){
    this.setArea(this.getLado()*this.getLado());
}

    
}
