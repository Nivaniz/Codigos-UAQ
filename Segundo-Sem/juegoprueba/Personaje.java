package juegoprueba;

public class Personaje {
    //atributos de personaje
    String nombre="nombre Default", clase="clase Default";
    int vidaTotal=100, vidaActual=vidaTotal, fuerza=9, stam=100, exp=0, nivel=1;
    float armadura;
    
    //metodos
    
    public Personaje(String nombre, String clase, int fuerza){ //creo un objeto que le va cambiar el nombre, clase y fuerza
        
        this.nombre=nombre; //nuestro nombre y sustituimos al nuevo
        this.clase=clase;
        this.fuerza=fuerza;
    }
    
    public void Respawn(){ //si ponemos Personaje p es que usamos otro
        this.vidaActual=this.vidaTotal; //this es cuando estamos usando nuestra clase personaje
        this.exp=this.exp-(int)Math.round(this.exp*.1);
        
    }
    
    public void Atacar(Personaje p){//luchamos con un externo y citamos personaje con p pero se puede cambiar
        int damage = this.fuerza-(int)Math.round(this.fuerza*p.armadura); //se va disminuir el daño y va depender de la fuerza y armadura
        p.vidaActual=p.vidaActual-damage; //la vida actual va a disminuir del personaje
        this.stam=this.stam-10; //va a restar la resistencia
        if(p.vidaActual<=0) p.Respawn();//en caso de que la vida llegue a 0 va a respawnear y morir     
    }
    
     public void Defender(Personaje p){
         int damage=p.fuerza-(int)Math.round(p.fuerza*(.5+this.armadura));//personaje externo y depende de la fuerza de nuestro personaje externo va a dar daño dependiendo de nuestra armadura
         this.vidaActual=this.vidaActual-damage;//y vamos a quitar nuestra vida
        
    }
     
    public void Avanzar(){
        
    }

   
    public void SubirNivel(){
        
    }
    
    
}
