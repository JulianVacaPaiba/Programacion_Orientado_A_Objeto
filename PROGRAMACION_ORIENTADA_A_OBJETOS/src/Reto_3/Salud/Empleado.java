package Reto_3.Salud;

import java.util.Scanner;

public class Empleado extends Persona {
    double tot;
    private String Cargo;
    private String departamento;
    private int valorhora; 
    private int horastrabajadas;
    public Empleado(String TipoDoc,String nombre,String apellido,String sexo,int documento,int edad, float peso,float Estatura,double pesAct, String Cargo,String departamento,int valorhora,int horastrabajadas){
        super(TipoDoc,Cargo,departamento, valorhora,horastrabajadas, nombre,apellido,sexo,documento, edad,peso,Estatura,pesAct);
        this.Cargo=Cargo;
        this.departamento=departamento;
        this.valorhora=valorhora;
        this.horastrabajadas=horastrabajadas;
    }
    public Empleado() {
    }
    public void horastrabajadas(){
        Scanner lect=new Scanner(System.in);
        System.out.println("Por favor digite lo que gana por hora");
        valorhora=lect.nextInt();
        System.out.println("Por favor ingrese la cantidad de horas que trabaja");
        horastrabajadas=lect.nextInt();
        System.out.println("Por favor ingrese el cargo en el que trabaja");
        Cargo=lect.next();
        tot=(valorhora*horastrabajadas)*(1-0.966) ;
    }
    public void imprimirDatos(){
        System.out.println("su cargo es "+Cargo+" su tipo de documento es de "+getTipoDoc()+ " su numero de documento es "+getDocumento()+ "\n Su nombre y apellido son "+getNombre()+" "+getApellido()+"\n Trabaja "+horastrabajadas+ " Horas y gana "+valorhora+" por hora y su total a pagar es de "+tot);
    }
}
