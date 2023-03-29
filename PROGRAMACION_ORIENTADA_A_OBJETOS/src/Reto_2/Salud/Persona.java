package Reto_2.Salud;

import java.util.Scanner;

public class Persona {


    // Atributos
    private String TipoDoc;
    private String nombre;
    private String apellido;
    private String sexo;
    private int documento;
    private int edad;
    private float peso;
    private float Estatura;


    //Metodos

    public void pedirDatos(){
        Scanner lect =new Scanner(System.in);
        System.out.println("Por favor ingrese su tipo de documento");
        TipoDoc=lect.next();
        System.out.println("Por favor ingrese su documento");
        documento=lect.nextInt();
        System.out.println("Por favor ingrese su nombre");
        nombre=lect.next();
        System.out.println("Por favor ingrese su apellido");
        apellido=lect.next();
        System.out.println("Por favor ingrese su peso en kg");
        peso=lect.nextFloat();
        System.out.println("Por favor ingrese su estatura en m");
        Estatura=lect.nextFloat();
        System.out.println("Por favor ingrese su edad");
        edad=lect.nextInt();
        System.out.println("Por favor ingrese su sexo");
        sexo=lect.next();
    }
    public void mostrarPersona(){
        System.out.println("su tipo de documento es "+TipoDoc);
        System.out.println("su documento es "+documento);
        System.out.println("su nombre es "+nombre );
        System.out.println("su apellido es "+apellido);
        System.out.println("su peso es "+peso);
        System.out.println("su estatura es "+Estatura);
        System.out.println("su edad es "+edad);
        System.out.println("su sexo es "+sexo);
    }
    public double calcularlmc(){
        double pesAct;
        pesAct=peso/(Estatura*Estatura);
        return pesAct;
    }
    public void mayorEdad(){
        if (edad<18) {
           System.out.println("Es menor de edad"); 
        } else {
            if (edad>18) {
                System.out.println("Es mayor de edad");
            }
        }
    }



    
}
