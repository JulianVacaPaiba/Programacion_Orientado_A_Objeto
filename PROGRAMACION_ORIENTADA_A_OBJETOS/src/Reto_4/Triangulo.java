package Reto_4;

public class Triangulo extends Figura {
    private float base;
    private float altura;

public Triangulo (float base,float altura){
    this.altura=altura;
    this.base=base;
}
    public float getBase() {
    return base;
}
public void setBase(float base) {
    this.base = base;
}
public float getAltura() {
    return altura;
}
public void setAltura(float altura) {
    this.altura = altura;
}

    public void calcularArea() {
        double area=0;
        area=2/(base*altura);
        System.out.println("la base del triangulo es de "+base+" y su altura es de "+altura+" su area es de "+area);
    }
    
}
