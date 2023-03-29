package Reto_3.Principal;

import Reto_3.Salud.Empleado;
import Reto_3.Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Persona Paciente = new Persona();
        Paciente.pedirDatos();
        Paciente.mostrarPersona();
        Paciente.calcularlmc();
        Paciente.mayorEdad();
Empleado Usuario= new Empleado();
Usuario.horastrabajadas();
Usuario.imprimirDatos();


    }

}
