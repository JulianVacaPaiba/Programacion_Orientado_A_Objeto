package Reto_4;

public class Circulo extends Figura {

    private float radio;
    public Circulo (float radio){
        this.radio=radio;
    }
    
    public float getRadio() {
        return radio;
    }


    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void calcularArea() {
        double area=0;
        area= 3.1416 * (radio*radio) ;
        System.out.println("el radio del circulo es de "+radio+" y su area es de "+area);
    }

}
