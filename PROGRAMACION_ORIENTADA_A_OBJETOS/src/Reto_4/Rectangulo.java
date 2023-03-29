package Reto_4;

public class Rectangulo extends Figura {
    
    private float base;
    private float altura;
    public Rectangulo (float base,float altura){
        this.altura=altura;
        this.base=base;
    }
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getLado() {
        return altura;
    }

    public void setLado(float lado) {
        this.altura=altura;
    }
    public void calcularArea() {
        double area=0;
       area=base*altura;
       System.out.println("la base del rectangulo "+base+" y su altura es de "+altura+" su area es de "+area);
    }

}
