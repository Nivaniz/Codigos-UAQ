package vehiculoprueba;

public class notprincipal { //VEHICULO CLASE PADRE NO LA PRINCIPAL PERO LA MISS LE LLAMO VEHICULO
     
    public int numLlantas; //modificadores de acceso
    private int velMax, cilindros, tanqueGas;
    private String color ="ROJO", numSerie, placas;
    
    public int getVelMax(){ //get es para obtener, cargar y set para modificar
        return this.velMax; //tenemos que retornar siempre para considerar
    }
            
    public int getCilindros(){
        return this.cilindros;
    }
    
    public int tanqueGas(){
        return this.tanqueGas;
    }
    
    public String getColor(){
        return this.color;
    }
    
    
    //SET
    
    public void setVelMax(int n){ //para set ponemos el dato
        this.velMax = n; //se va cambiar por mi variable n y va dejar que entre con n    
    }
    
    public void setCilindros(int c){
        this.cilindros = c;
    }
    
    public void setTanqueGas(int g){
        this.tanqueGas = g;
    }
   
    public void setcolor(String cl){
        this.color = cl;
    }
    
    
    public String MostrarInformacion (String psw){ //si nuestro string password es igual a la contraseña va regresar
        if (psw == "contraseña"){
            return "Velocidad Maxima: "+this.getVelMax()+"La cantidad de cilindros es: "+this.getCilindros()+"El color de mi vehiculo es: "+ this.getCilindros(); //va regresar
        }
                else return "Incorrecto";
                }
    
     
    
    //metodos
    public void Enceder(){
        
    }
      
    public void Avanzar(){
        
    }
    
    public void Detener(){
        
    }
 
    public void Frenar(){
        
    }
    
    
    
}
