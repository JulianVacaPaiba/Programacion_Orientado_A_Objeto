package Reto_1.Principal;

import Reto_1.Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Persona Paciente = new Persona();
        Paciente.pedirDatos();
        Paciente.mostrarPersona();
        Paciente.calcularlmc();
        Paciente.mayorEdad();

    }
}
