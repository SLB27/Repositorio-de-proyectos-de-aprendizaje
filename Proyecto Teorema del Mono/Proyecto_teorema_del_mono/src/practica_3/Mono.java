/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_3;

/**
 *
 * @author MEDAC
 */
public class Mono {
//atributos
int numid;
String palabra;
int numplatanos;
int contvoc=0;

//constructor
Mono(int numid){
this.numid=numid;
palabra="";
}
Mono(int numid,int numplatanos){
this.numid=numid;
this.numplatanos=numplatanos;
}



//metodos
void generarpalabra(){
  int longi=(int)(Math.random()*20+1);
  for(int i=0;i<longi;i++){
    int codigoAscii = (int)Math.floor(Math.random()*(122-97)+97);
    char letra=(char) codigoAscii;
  
    if(letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'){
    contvoc++;    
    }

  palabra=palabra+letra;
}
    
}

void robarplat(){
   numplatanos=numplatanos-1;
}
void ganarplat(){
   numplatanos=numplatanos+1; 
}
int devolvernumplat(){
    System.out.println(numplatanos);
 return numplatanos;   
}





void mostrar(){
    System.out.println("El mono"+" "+numid+" "+"dice:"+palabra);
}

int contvocales(){
    System.out.println("El total de vocales de todas las palabras:"+contvoc);
return contvoc;       
}
    
    
    
    
    
    
    
    
    
    
    
    
    
}
