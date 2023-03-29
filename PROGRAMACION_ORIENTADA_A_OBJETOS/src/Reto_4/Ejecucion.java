package Reto_4;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        float lado,base,altura, radio;
        int elect, Rep;
        Scanner lect=new Scanner(System.in);
        do {
        System.out.println("Por favor seleccione la figura con el area que quiere saber\n1.Cuadrado\n2.Rectangulo\n3.Triangulo\n4.Circulo");
        elect=lect.nextInt();
        switch (elect) {
            case 1:
                
        System.out.println("Ingrese la medida  del lado del cuadrado");
        lado=lect.nextFloat();

        Cuadrado cuadrado1=new Cuadrado(lado);
        cuadrado1.calcularArea();
            break; 
            case 2:
        System.out.println("Ingrese la medida  de la base del reactángulo");
        base=lect.nextFloat();
        System.out.println("Ingrese la medida  de la altura del reactángulo");
        altura=lect.nextFloat();

        Rectangulo rectangulo1=new Rectangulo(base, altura);
        rectangulo1.calcularArea();
            break;
            case 3:
        System.out.println("Ingrese la medida  de la base del Triangulo");
        base=lect.nextFloat();
        System.out.println("Ingrese la medida  de la altura del Triangulo");
        altura=lect.nextFloat();

        Triangulo triangulo1=new Triangulo (base, altura);
        triangulo1.calcularArea();
        break;
        case 4:
        System.out.println("Ingrese la medida  del radio del circulo");
        radio=lect.nextFloat();

        Circulo circulo1=new Circulo (radio);
        circulo1.calcularArea(); 
        break;
        default:
        System.out.println("Esta opcion no existe");
        break;}
        System.out.println("Quiere volver a usar el sistema \n1.Si\n2.No");
        Rep=lect.nextInt();  
            } while (Rep==1);
        lect.close();


    }
}

