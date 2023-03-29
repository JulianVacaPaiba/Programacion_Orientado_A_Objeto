package Reto_2.Principal;

import Reto_2.Salud.Persona;

public class Inicio {


    public static void main(String[] args) {   
        Double pesAct;
        float peso, Estatura;
        Persona Paciente = new Persona();
        Paciente.pedirDatos();
        Paciente.mostrarPersona();
        Paciente.mayorEdad();
        pesAct=Paciente.calcularlmc();
        System.out.println("su peso es "+pesAct);
        if (pesAct<20) {
            System.out.println("el peso está por debajo de lo ideal");
        }
        else{
            if (pesAct<=25) {
                System.out.println("el peso es ideal");
            }
            else{
                if (pesAct>25) {
                    System.out.println("Tienes sobrepeso");
                }
            }
        }
    }
}
