/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_4_samuel_sanchez;

/**
 *
 * @author MEDAC
 */
public class Personaje {
//atributos
    private String nombre;
    private String ubicacion;
    private boolean asesino;
    private boolean vivo;
    
//constructor
Personaje(String nombre,String ubicacion){
    this.nombre=nombre;
    this.ubicacion=ubicacion;
    asesino=false;
    vivo=true;
}

//metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isAsesino() {
        return asesino;
    }

    public void setAsesino(boolean asesino) {
        this.asesino = asesino;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    

    @Override
    public String toString() {
        return nombre;
    }
    
    public void asesino(){
        asesino=true;
        int resp=(int)(Math.random()*6+1);
        String ubi="h";
        
        switch(resp){
            case 1:
                ubi="Hall";
                break;
                
            case 2:
                ubi="Cocina";
                break;
                
            case 3:
                ubi="Terraza";
                break;
                
            case 4:
                ubi="Dormitorio";
                break;
                
            case 5:
                ubi="Despacho";
                break;
                
            case 6:
                ubi="Salon";
                break;
        }
        
        ubicacion=ubi;

    }
    
    public void matar(){
        vivo=false;
    }















    
    
    
    
    
    
    
    
    
    
    
    
    
}
