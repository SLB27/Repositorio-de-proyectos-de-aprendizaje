/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_4_samuel_sanchez;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class Practica_4_Samuel_Sanchez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    //personajes
    
    Personaje p1=new Personaje("Mayordomo","Hall");
    Personaje p2=new Personaje("Cocinero","Cocina");
    Personaje p3=new Personaje("Jardinero","Terraza");
    Personaje p4=new Personaje("Ama_de_llaves","Dormitorio");
    Personaje p5=new Personaje("Sir","Despacho");
    Personaje p6=new Personaje("Sra","Salon");
    
    //array con todos los personajes dentro
    Personaje []personajes={p1,p2,p3,p4,p5,p6};
    
    //se define de forma aleatoria al asesino
    int ran=(int)(Math.random()*6+1);
    switch(ran){
        case 1:
            p1.asesino();
            break;
            
        case 2:
            p2.asesino();
            break;
            
        case 3:
            p3.asesino();
            break;
            
        case 4:
            p4.asesino();
            break;
            
        case 5:
            p5.asesino();
            break;
            
        case 6:
            p6.asesino();
            break;
    }
    
    //empieza el juego
    int kills=0;
    int ganar=0;
    int turnos=0;
    String resp;
    
    
        System.out.println("Bienvenido al juego de los Diez Negritos");
        System.out.println("Eres el detective William Blore, adivina quien es el asesino.");
    do{
        turnos++;
        System.out.println("Turno:"+turnos);
        System.out.println("Detective William a quien quieres preguntar?");
        mostrar(personajes);
        System.out.println("Pregunta a:");
        resp=sc.next();
        for(int i=0;i<personajes.length;i++){
            if(personajes[i].getNombre().equals(resp)){
                System.out.println("Me encontraba durante el asesinato en "+personajes[i].getUbicacion());
            } 
                    
        }

        //se elige a quien matar    
        ran=(int)(Math.random()*6+1);
        int muerto=0;
        do{
        switch(ran){
          case 1:
              if(p1.isAsesino()!=true&&p1.isVivo()==true){
                 p1.matar(); 
                 muerto++;
                 kills++;
                 System.out.println("Ha muerto:"+p1.getNombre());
              }else{
                  muerto++;
                  System.out.println("No ha muerto nadie");
              }
              
            break;
            
          case 2:
            if(p2.isAsesino()!=true&&p2.isVivo()==true){
                 p2.matar(); 
                 muerto++;
                 kills++;
                 System.out.println("Ha muerto:"+p2.getNombre());
              }else{
                  muerto++;
                  System.out.println("No ha muerto nadie");
              }
            break;
            
          case 3:
            if(p3.isAsesino()!=true&&p3.isVivo()==true){
                 p3.matar(); 
                 muerto++;
                 kills++;
                 System.out.println("Ha muerto:"+p3.getNombre());
              }else{
                  muerto++;
                  System.out.println("No ha muerto nadie"); 
              }
            break;
            
          case 4:
            if(p4.isAsesino()!=true&&p4.isVivo()==true){
                 p4.matar(); 
                 muerto++;
                 kills++;
                 System.out.println("Ha muerto:"+p4.getNombre());
              }else{
                  muerto++;
                  System.out.println("No ha muerto nadie"); 
              }
            break;
            
          case 5:
            if(p5.isAsesino()!=true&&p5.isVivo()==true){
                 p5.matar(); 
                 muerto++;
                 kills++;
                 System.out.println("Ha muerto:"+p5.getNombre());
              }else{
                  muerto++;
                  System.out.println("No ha muerto nadie"); 
              }
            break;
            
          case 6:
            if(p6.isAsesino()!=true&&p6.isVivo()==true){
                 p6.matar(); 
                 muerto++;
                 kills++;
                 System.out.println("Ha muerto:"+p6.getNombre());
              }else{
                  muerto++;
                  System.out.println("No ha muerto nadie"); 
              }
            break;
        }
        }while(muerto==0);
        
        
        
        
        //respuesta del detective para saber si ya tiene al asesino
        System.out.println("Sabes quien es el asesino? 1.Si 2.No");
        int respu=sc.nextInt();
        String respuesta="h";
        switch(respu){
            case 1:
                System.out.println("Introduce el nombre");
                respuesta=sc.next();
                if(respuesta=="Mayordomo"){
                    respu=0;  
                }else{
                    if(respuesta=="Cocinero"){
                        respu=1;
                    
                }else{
                    if(respuesta=="Jardinero"){
                        respu=2;
                    
                }else{
                    if(respuesta=="Ama_de_llaves"){
                        respu=3;  
                        
                }else{
                    if(respuesta=="Sir"){
                        respu=4;     
                }else{
                    if(respuesta=="Sra"){
                        respu=5;     
                }
                }}}}}
                
                

                if(personajes[respu].isAsesino()==true){
                  System.out.println("Enhorabuena, lo has resuelto Detective");
                  ganar++;
                  }else{
                      System.out.println("Has perdido");
                      ganar++;
                  } 
              
                break;
                
            case 2:
                System.out.println("A veces es mejor esperar cuando tengas mas pruebas");
                
                break;
        }
           
    }while(kills!=6&&ganar==0);
    
    
    
    
    }

    private static void mostrar(Personaje[] personajes) {
        for(int i=0;i<personajes.length;i++){
            if(personajes[i].isVivo()==true){
               System.out.println(personajes[i]);    
            }
        }
        
    
    
    
    }
    
}
