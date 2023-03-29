package Juegos;

import java.util.Random;
import java.util.Scanner;

public class Pie_Pap_Tij implements Juego {
    private int elect;
    private int Jue;
    private String Nom;
    Scanner lect=new Scanner(System.in);
    
    public void iniciar() {
        System.out.println("Por favor ingrese el nombre del jugador");
        Nom=lect.next();
    } 

    public void jugar() {
        Random Juego=new Random();

            Jue=Juego.nextInt(3)+1;
            System.out.println("Por favor elija entre \n1.Piedra\n2.Papel\n3.Tijera");
            elect=lect.nextInt();

    }
    public void finalizar() {

            if (Jue==elect) {
                System.out.println("Fue empate");
            } else {
                if(Jue==1 && elect==2){
                    System.out.println("La maquina saco piedra");
                    System.out.println("Has ganado "+Nom );
                }
                else{
                    if(Jue==1 && elect==3){
                        System.out.println("La maquina saco piedra");
                        System.out.println("Has Perdido "+Nom );        
                    }
                    else{
                        if(Jue==2 && elect==1){
                            System.out.println("La maquina saco Papel");
                            System.out.println("Has perdido "+Nom );
                        }
                        else{
                            if(Jue==2 && elect==3){
                                System.out.println("La maquina saco papel");
                                System.out.println("Has ganado "+Nom );
                            }
                            else{
                                if(Jue==3 && elect==1){
                                    System.out.println("La maquina saco tijeras");
                                    System.out.println("Has ganado "+Nom );
                                }
                                else{
                                    if(Jue==3 && elect==2){
                                        System.out.println("La maquina saco tijeras");
                                        System.out.println("Has perdido "+Nom );
                                    }
                                }
                            }
                        }
                    }
                }
            }  
    }

}
