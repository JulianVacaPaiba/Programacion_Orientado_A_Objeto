package Reto_3.Salud;

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
//constructor
    public Persona() {
    }
    public Persona(String tipoDoc2, String cargo, String departamento, int valorhora, int horastrabajadas,
            String nombre2, String apellido2, String sexo2, int documento2, int edad2, float peso2, float estatura2,
            double pesAct2) {
    } 
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
    public String getTipoDoc() {
        return TipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        TipoDoc = tipoDoc;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getEstatura() {
        return Estatura;
    }
    public void setEstatura(float estatura) {
        Estatura = estatura;
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
    public void calcularlmc(){
        double pesAct;
        pesAct=peso/(Estatura*Estatura);
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
