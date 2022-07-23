package figuraarea;

public abstract class Figura {
    
    private double area, altura, lado, base;
    
    //Constructor
    public Figura (){
        
    }
    
    //gets y sets
    public void setArea(Double area){
        this.area=area; 
    }
    
    public double getArea(){
        return area;
    }
    
    public void setAltura(Double altura){
        this.altura=altura; 
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setBase(Double base){
        this.base=base; 
    }
    
    public double getBase(){
        return base;
    }
    
    public void setLado(Double lado){
        this.lado=lado; 
    }
    
    public double getLado(){
        return lado;
    }
    
    //MÉTODO
    public abstract void calcularArea();
}
