/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_liga_fantasy;

/**
 *
 * @author MEDAC
 */
public class Jugador {
//atributos
    private String nombre;
    private String posicion;
    private double precio;
    private int pos;
    
//constructor
Jugador(int pos,String nombre,String posicion,int precio){
    this.pos=pos;
    this.nombre=nombre;
    this.posicion=posicion;
    this.precio=precio;
    
}

//metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    

    @Override
    public String toString() {
        return "Posicion="+pos+"."+" nombre=" + nombre + ", posicion=" + posicion + ", precio=" + precio;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
