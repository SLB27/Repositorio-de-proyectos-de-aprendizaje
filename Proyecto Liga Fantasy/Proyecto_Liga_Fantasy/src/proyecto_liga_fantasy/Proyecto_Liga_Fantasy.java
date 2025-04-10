/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_liga_fantasy;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class Proyecto_Liga_Fantasy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Jugador j1=new Jugador(0,"Kroos","Centrocampista",370000);
    Jugador j2=new Jugador(1,"sergio","defensa",270000);
    Jugador j3=new Jugador(2,"alvaro","delantero",390000);
    Jugador j4=new Jugador(3,"massimo","delantero",550000);
    Jugador j5=new Jugador(4,"nestor","portero",3700);
    Jugador j6=new Jugador(5,"dario","Centrocampista",30000);
    Jugador j7=new Jugador(6,"mario","Centrocampista",320000);
    Jugador j8=new Jugador(7,"assad","delantero",350000);
    Jugador j9=new Jugador(8,"felix","delantero",270000);
    Jugador j10=new Jugador(9,"federico","defensa",378000);
    Jugador j11=new Jugador(10,"pablo","portero",30000);
    Jugador j12=new Jugador(11,"carlos","portero",70000);
    Jugador j13=new Jugador(12,"oscar","Centrocampista",370000);
    Jugador j14=new Jugador(13,"Khalid","delantero",870000);
    Jugador j15=new Jugador(14,"lorenzo","Centrocampista",340000);
    Jugador j16=new Jugador(15,"pelocho","defensa",870000);
    Jugador j17=new Jugador(16,"Messi","defensa",300000);
    Jugador j18=new Jugador(17,"Juan","portero",309000);
    Jugador j19=new Jugador(18,"Alberto","portero",70000);
    Jugador j20=new Jugador(19,"Kiko","Centrocampista",470000);
    Jugador j21=new Jugador(20,"Dani","defensa",770000);
    Jugador j22=new Jugador(21,"Ernesto","Centrocampista",3780000);
    
    Jugador[]jugadores={j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11,j12,j13,j14,j15,j16,j17,j18,j19,j20,j21,j22};
    Jugador[]equipo=new Jugador[11];
    rellenar(jugadores,equipo);
 
    int resp;
    do{
        System.out.println("1.Mostrar plantilla 2.Cambiar jugador 3.Valor del Equipo 4.Salir");
        resp=sc.nextInt();
        switch(resp){
            case 1:
            mostrarEquipo(equipo);
                
                break;
                
            case 2:
                System.out.println("Todos los jugadores de tu plantilla");
                mostrarEquipo(equipo);
                System.out.println("Todos los jugadores disponibles:");
                mostrarJugadores(jugadores);
                
                System.out.println("Elige la posicion del jugador que quieres cambiar de la lista");
                int resp1=sc.nextInt();
                System.out.println("Elige la posicion del jugador que quieres cambiar de tu plantilla");
                int resp2=sc.nextInt();
                
                Jugador jugador1=jugadores[resp1];
                Jugador jugador2=equipo[resp2];
                jugadores[resp1]=jugador2;
                equipo[resp2]=jugador1;
                
                int pos1=jugador1.getPos();
                int pos2=jugador2.getPos();
                jugadores[resp1].setPos(pos1);
                equipo[resp2].setPos(pos2);
                
                System.out.println("Tu plantilla:");
                
                mostrarEquipo(equipo);
                
                
                break;
                
            case 3:
                System.out.println("La suma de todos tus jugadores es:");
                double aux=0;
                for(int i=0;i<equipo.length;i++){
                    aux=aux+equipo[i].getPrecio();
                }
                System.out.println(aux);
                
                break;
                
            case 4:
                System.out.println("Saliendo...");    
                break;
        }
        
    }while(resp!=4);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
        
        
        
        
    }

    private static void rellenar(Jugador[]jugadores,Jugador[]equipo) {
        for(int i=0;i<11;i++){
        int ran=(int)(Math.random()*22);
        if(jugadores[ran]!=null){
            equipo[i]=jugadores[ran];
            equipo[i].setPos(i);
            jugadores[ran]=null;
            
        }else{
            i--;
        }
            
        }
        
    
    
    
    
    }

    private static void mostrarEquipo(Jugador[] equipo) {
    
    for(int i=0;i<equipo.length;i++){
        if(equipo[i]!=null){
        System.out.println(equipo[i]);    
        }else{
            i--;
        }

    }
        
    }
    
    private static void mostrarJugadores(Jugador[] jugadores) {
    
    for(int i=0;i<jugadores.length;i++){
        if(jugadores[i]!=null){
        System.out.println(jugadores[i]);    
        }

    }
        
    }
                
                
                
                
                
    }
    

