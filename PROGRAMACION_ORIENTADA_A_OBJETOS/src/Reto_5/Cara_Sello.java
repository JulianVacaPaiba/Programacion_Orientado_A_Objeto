package Juegos;

import java.util.Random;
import java.util.Scanner;

public class Cara_Sello implements Juego {
 private int moneda;
 private int elec;
 private String Nom;
 Scanner lect=new Scanner(System.in);
    public void iniciar() {
        System.out.println("Por favor ingrese el nombre del jugador");
        Nom=lect.next();
    }
    public void jugar() {
        System.out.println(Nom+"Realice su elección \n1.Cara \n2. Sello");
        elec=lect.nextInt();
        Random aleatorio=new Random();
        moneda=aleatorio.nextInt(2)+1;
        System.out.println("Ha lanzado la moneda, Moneda girando");
    }
    public void finalizar() {
        if(moneda==1 && elec==1){
        System.out.println("Cayó cara, Ganaste "+Nom);
        }else 
        if(moneda==2 && elec==2){
            System.out.println("Cayó sello, Ganaste "+Nom);
        }else 
        if(moneda==1 && elec==2){
            System.out.println("Cayó cara, Perdiste "+Nom);
        }else 
        if(moneda==2 && elec==1){
            System.out.println("Cayó sello, Perdiste "+Nom);        
            lect.close();
        }

    }

    
}
