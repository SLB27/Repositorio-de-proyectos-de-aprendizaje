/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_3;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //variables
    Scanner sc=new Scanner(System.in);
    int resp;
    int participantes=0;
    int rondas=0;
    
        System.out.println("1.Teorema del mono 2.Salir");
        resp=sc.nextInt();
    switch(resp){
        case 1:
            System.out.println("TEOREMA DEL MONO");
            System.out.println("¿Cuantos monos quieres que participen?");
            participantes=sc.nextInt();
            for(int i=1;i<=participantes;i++){
            Mono m=new Mono(i);
            m.generarpalabra();
            m.mostrar();
            if(i==participantes){
            m.contvocales();
            }
            }
            
            break;
         
            
        case 2:
            System.out.println("Saliendo...");    
            break;
        
        default:
            System.out.println("Numero incorrecto   Cerrando Programa...");    
            break;
    }
    
}
}
