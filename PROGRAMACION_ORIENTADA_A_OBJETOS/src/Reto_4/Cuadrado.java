package Reto_4;

public class Cuadrado extends Figura {

private float lado;

public Cuadrado (float lado){
    this.lado=lado;
}

    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }
    public void calcularArea() {
        double area=0;
        area=lado*lado;
        System.out.println(" los lados del cuadrado son de "+lado+" y su area es de: "+area);
    }
    
}
