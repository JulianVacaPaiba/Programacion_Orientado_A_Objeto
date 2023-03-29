package Juegos;

public class Ejecucion {
    public static void main(String[] args) {
        Cara_Sello juego1=new Cara_Sello();
        juego1.iniciar();
        juego1.jugar();
        juego1.finalizar();
        Pie_Pap_Tij juego2= new Pie_Pap_Tij();
        juego2.iniciar();
        juego2.jugar();
        juego2.finalizar();
    }

}
