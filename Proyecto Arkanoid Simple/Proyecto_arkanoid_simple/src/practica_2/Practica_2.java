/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class Practica_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    char[][]tablero=new char[10][10];
    int mov=0;
    int pos1=9;
    int pos2=4;
    int pospel=0;
    int pospel2=4;
    int ganar;
    int perder;
    int cont=0;
    Scanner sc=new Scanner(System.in);
    rellenar(tablero);
    mostrar(tablero);
    
    while(cont<9){
        cont++;
    System.out.println("Mueve: 1.Izquierda 2.Derecha");
        mov=sc.nextInt();
        int newpos1=pos1;
        int newpos2=pos2;
    switch(mov){
        case 1:
        newpos2--;    
            break;
            
        case 2:
        newpos2++;    
            break;
            
        default:
            System.out.println("Movimiento invalido");    
            break;
    }
    tablero[pos1][pos2]=' '; 
    pos1=newpos1;
    pos2=newpos2;
    tablero[pos1][pos2]='_';
    
    int movpelota=(int)(Math.random()*3+1);
    int newpospel=pospel;
    int newpospel2=pospel2;
    switch(movpelota){
        case 1:
        newpospel++;
        newpospel2--;
            break;
        case 2:
        newpospel++;    
            break;
            
        case 3:
        newpospel++;
        newpospel2++;
            break;
        
        
    }
    tablero[pospel][pospel2]=' '; 
    pospel=newpospel;
    pospel2=newpospel2;
    tablero[pospel][pospel2]='O';
    mostrar(tablero);
    
    
    
    
    
    
    
    }
    if(tablero[pos1][pos2]==tablero[pospel][pospel2]){
        System.out.println("Has ganado");    
    }else{
        System.out.println("Has perdido");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }


    private static void mostrar(char[][] tablero) {
    for(int i=0;i<tablero.length;i++){  
    System.out.print(i+".");System.out.println(Arrays.toString(tablero[i]));
    }
    
    System.out.println("____________________________________");
    
    
    
    
    
    }

    private static void rellenar(char[][] tablero) {
    for(int i=0;i<tablero.length;i++){
        Arrays.fill(tablero[i], ' ');
    }
    tablero[0][4]='O';
    tablero[9][4]='_';
    
    
    
    
    }
    
}
